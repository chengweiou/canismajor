package chengweiou.universe.canismajor.service.pet;


import chengweiou.universe.blackhole.exception.FailException;
import chengweiou.universe.canismajor.model.SearchCondition;
import chengweiou.universe.canismajor.model.entity.pet.Pet;

import java.util.List;

public interface PetService {
    void save(Pet e) throws FailException;

    void delete(Pet e) throws FailException;

    long update(Pet e);

    Pet findById(Pet e);

    long count(SearchCondition searchCondition, Pet sample);
    List<Pet> find(SearchCondition searchCondition, Pet sample);
}
