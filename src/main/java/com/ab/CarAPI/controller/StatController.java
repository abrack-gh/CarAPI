package com.ab.CarAPI.controller;

import com.ab.CarAPI.model.FleetAge;
import com.ab.CarAPI.service.FleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stats")
public class StatController {

    @Autowired
    FleetService fleetService;

    @GetMapping("/{age}")
    public FleetAge getCarByAge(){
        return fleetService.fleetAge();
    }

}
