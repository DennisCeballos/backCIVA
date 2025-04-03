package com.example.pruebasCIVA.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pruebasCIVA.Models.BusModel;
import com.example.pruebasCIVA.Repositories.IBusRepository;

@Service
public class BusService {

    @Autowired
    IBusRepository busRepository;

    public ArrayList<BusModel> getBuses(){
        return (ArrayList<BusModel>) busRepository.findAll();
    }
    
    public BusModel nuevoBus(BusModel bus){
        return busRepository.save(bus);
    }

    public Optional<BusModel> getBusById(Long id){
        return busRepository.findById(id);
    }
}
