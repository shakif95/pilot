package com.newton.pilot.repository;

import com.newton.pilot.entity.Country;
import com.newton.pilot.entity.Region;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryRepositoryTest extends AbstractRepositoryTest {

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testUpdateCountry() {

        Region region = this.getRegion();
        this.regionRepository.save(region);

        Country country = this.getCountry();
        country.setRegion(this.regionRepository.findOne(1L));
        this.countryRepository.save(country);

        Country updatedCountry = this.countryRepository.findOne("BN");
        Assert.assertNotNull(updatedCountry);
        Assert.assertTrue(updatedCountry.getRegion().getRegionID() == 1L);

    }

}
