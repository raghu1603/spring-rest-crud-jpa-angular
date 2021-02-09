package com.cleancode.person.cruddemo.repositories;

import com.cleancode.person.cruddemo.entities.Person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    @Override
    List<Person> findAll();
    
}
