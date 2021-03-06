package chengweiou.universe.canismajor.data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import chengweiou.universe.canismajor.model.SearchCondition;
import chengweiou.universe.canismajor.model.entity.person.Person;
import chengweiou.universe.canismajor.model.entity.pet.Pet;
import chengweiou.universe.canismajor.service.person.PersonDio;
import chengweiou.universe.canismajor.service.pet.PetDio;

@Component
public class Data {
    @Autowired
    private PersonDio personDio;
    public List<Person> personList;

    @Autowired
    private PetDio petDio;
    public List<Pet> petList;

    public void init() {
        personList = personDio.find(new SearchCondition(), null).stream().sorted(Comparator.comparingLong(Person::getId)).collect(Collectors.toList());
        petList = petDio.find(new SearchCondition(), null).stream().sorted(Comparator.comparingLong(Pet::getId)).collect(Collectors.toList());
    }
}
