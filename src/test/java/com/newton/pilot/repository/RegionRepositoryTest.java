package com.newton.pilot.repository;

import com.newton.pilot.entity.Region;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RegionRepositoryTest extends AbstractRepositoryTest {

    @Autowired
    private RegionRepository regionRepository;

    @Test
    public void testUpdateRegion() {
        Region region = this.getRegion();
        this.regionRepository.save(region);
        Region updatedRegion = Lists.newArrayList(this.regionRepository.findAll()).get(0);
        Assert.assertTrue(updatedRegion.getRegionName().equalsIgnoreCase("Dhaka North"));
        Assert.assertTrue("BN".equalsIgnoreCase(updatedRegion.getCountries().get(0).getCountryID()));
    }

}
