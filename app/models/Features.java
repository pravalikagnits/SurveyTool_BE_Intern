package models;

import javax.persistence.*;


@Entity
public class Features {




    @Column(name="uname")
    private String uname;

    @Column(name="sid")
    private Integer sid;


    @Id
    @GeneratedValue
    private int fid;
    @Basic
    private String name;

    @Basic
    private double latitude;
    @Basic
    private double longitude;
    @Basic
    private String country;

    @Basic
    private String state;
    @Basic
    private String district;
    @Basic
    private String landmark;

    @Basic
    private String image;

    @Basic
    private String others;

    public Features() {
    }

    public Features(int fid,String uname, String name, double latitude, double longitude, String country,String landmark, String image, String state, String district,  String others) {
        this.fid = fid;
        this.name = name;
        this.uname=uname;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.state = state;
        this.district = district;
        this.landmark= landmark;

        this.image = image;
        this.others = others;
    }


    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
