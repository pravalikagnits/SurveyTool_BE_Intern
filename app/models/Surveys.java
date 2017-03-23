package models;
import javax.persistence.*;
import java.util.List;

/**
 * Created by welcome on 1/4/2017.
 */
@Entity
public class Surveys {
    @Id
    @GeneratedValue
    @Column(name="sid")
    private int sid;

    @Basic
    private String sname;

    @Basic
    private String sdescription;

    @Basic
    private String date;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="sid", referencedColumnName = "sid")
    private List<Features> features;



//    @Basic
//    private Integer uid;


//    @OneToMany
//    @JoinColumn(name ="u_id",referencedColumnName = "uid")
//    private  List<Users> users1;
//



    public Surveys() {
    }

    public Surveys(int sid, String sname, String sdescription, String date) {
        this.sid = sid;
        this.sname = sname;
        this.sdescription= sdescription;
        this.date = date;
    }

    public int getSid() {

        return sid;
    }

    public void setSid(int sid) {

        this.sid = sid;
    }

    public String getSname() {

        return sname;
    }

    public void setSname(String sname) {

        this.sname = sname;
    }

    public String getSdescription() {

        return sdescription;
    }

    public void setSdescription(String sdescription) {

        this.sdescription= sdescription;
    }
//    public int getUid() {
//
//        return uid;
//    }
//
//    public void setUid(int uid) {
//
//        this.uid = uid;
//    }


    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

//    public List<Users> getUsers1() {
//        return users1;
//    }
//
//    public void setUsers1(List<Users> users) {
//        this.users1 = users;
//    }
}
