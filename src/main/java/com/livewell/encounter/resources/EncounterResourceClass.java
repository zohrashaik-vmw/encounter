package com.livewell.encounter.resources;

import com.livewell.encounter.model.Encounter;
import com.livewell.encounter.repo.EncounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/encounter")

public class EncounterResourceClass {

     @Autowired
    private EncounterRepo encounterRepository;

    public EncounterResourceClass(EncounterRepo encounterRepository) {
        this.encounterRepository = encounterRepository;
       }

    @PostMapping("/create")
    public int createEncounter(@RequestBody Encounter newEncounter) {
        return encounterRepository.save(newEncounter).getId();
    }

    @RequestMapping("/list")
    public @ResponseBody Iterable<Encounter> listEncounters(){
        return encounterRepository.findAll();
    }

}
