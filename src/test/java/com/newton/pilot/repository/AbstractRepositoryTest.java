package com.newton.pilot.repository;

import com.newton.pilot.Application;
import com.newton.pilot.entity.Country;
import com.newton.pilot.entity.Region;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest(classes = AbstractRepositoryTest.IntegrationTest.class)
public abstract class AbstractRepositoryTest {

    @Configuration
    @EntityScan( basePackages = {"com.newton.pilot.entity"} )
    @EnableAutoConfiguration(exclude = {WebMvcAutoConfiguration.class})
    protected static class IntegrationTest {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }

    public Region getRegion() {
        Country country = new Country();
        country.setCountryID("BN");
        country.setCountryName("Bangladesh");
        List<Country> countries = new ArrayList<>();
        countries.add(country);

        Region region = new Region();
        region.setRegionID(1L);
        region.setRegionName("Dhaka North");
        region.setCountries(countries);
        return region;
    }

    public Country getCountry() {
        Region region = new Region();
        region.setRegionID(1L);
        region.setRegionName("Dhaka North");

        Country country = new Country();
        country.setCountryID("BN");
        country.setCountryName("Bangladesh");
        country.setRegion(region);
        return country;
    }

}
