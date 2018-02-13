package com.newton.pilot.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "REGIONS")
public class Region {

    @Id
    @Column(name = "REGION_ID")
    private long regionID;

    @Column(name = "REGION_NAME")
    private String regionName;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="REGION_ID")
    private List<Country> countries;

    public long getRegionID() {
        return regionID;
    }

    public void setRegionID(long regionID) {
        this.regionID = regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

}
