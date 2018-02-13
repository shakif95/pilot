package com.newton.pilot.repository;

import com.newton.pilot.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, String> {
}
