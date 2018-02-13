package com.newton.pilot.controller;

import com.newton.pilot.service.RegionService;
import com.newton.pilot.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shakif on 2/14/2018.
 */
@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    RegionService regionService;

    @GetMapping("/all")
    public List<Region> findAllRegions(){
        List<Region> regions = new ArrayList<Region>();
        this.regionService.findAllRegions().forEach(regions :: add);
        return regions;
    }
}
