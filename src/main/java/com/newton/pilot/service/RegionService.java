package com.newton.pilot.service;

import com.newton.pilot.entity.Region;
import com.newton.pilot.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService implements IRegionService {

    @Autowired
    private RegionRepository regionRepository;


    @Override
    public List<Region> findAllRegions() {
        List<Region> regions = new ArrayList<Region>();
        this.regionRepository.findAll().forEach(regions :: add);
        return regions;
    }

}
