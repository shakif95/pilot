package com.newton.pilot.entity;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES")
public class Country {

    @Id
    @Column(name = "COUNTRY_ID")
    private String countryID;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @ManyToOne
    @JoinColumn(name="REGION_ID")
    private Region region;

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }


}
