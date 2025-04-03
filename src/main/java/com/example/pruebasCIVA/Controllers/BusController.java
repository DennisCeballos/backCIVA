package com.example.pruebasCIVA.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebasCIVA.Models.BusModel;
import com.example.pruebasCIVA.Services.BusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public ArrayList<BusModel> getBuses(){
        return this.busService.getBuses();
    }

    @PostMapping
    public BusModel nuevoBus(@RequestBody BusModel bus) {
        return this.busService.nuevoBus(bus);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<BusModel> getBusById(@PathVariable Long id) {
        return this.busService.getBusById(id);
    }

}
