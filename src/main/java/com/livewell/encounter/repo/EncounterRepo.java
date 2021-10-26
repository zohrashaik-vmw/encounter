package com.livewell.encounter.repo;

import com.livewell.encounter.model.Encounter;
import org.springframework.data.repository.CrudRepository;

public interface EncounterRepo extends CrudRepository<Encounter, Integer> {
}
