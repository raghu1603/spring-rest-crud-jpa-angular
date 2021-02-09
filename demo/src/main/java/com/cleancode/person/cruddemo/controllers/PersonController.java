package com.cleancode.person.cruddemo.controllers;

import com.cleancode.person.cruddemo.repositories.PersonRepository;
import com.cleancode.person.cruddemo.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(value = "/persons")
public class PersonController {
    
    private final com.cleancode.person.cruddemo.repositories.PersonRepository PersonRepository;

    @Autowired
    public PersonController(PersonRepository PersonRepository) {
        this.PersonRepository = PersonRepository;
    }

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
    public  @ResponseBody
    List<Person> listPersons() {
       return PersonRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = {"application/json"})
    public @ResponseBody void addPerson(@RequestBody Person person) {
        PersonRepository.save(person);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = {"application/json"})
    public @ResponseBody void updatePerson(@RequestBody Person person) {
        PersonRepository.save(person);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody void deletePerson(@RequestParam("id") Long id) {
        PersonRepository.deleteById(id);

    }


}
