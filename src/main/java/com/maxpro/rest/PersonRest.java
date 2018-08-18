package com.maxpro.rest;

import com.maxpro.models.Person;
import com.maxpro.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/person")
public class PersonRest {

    @Autowired private PersonRepository repository;

    @RequestMapping(value = "/all")
    public Iterable<Person> getAll(){
        return repository.findAll();
    }
}
