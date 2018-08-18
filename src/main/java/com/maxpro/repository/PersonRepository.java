package com.maxpro.repository;

import com.maxpro.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends CrudRepository<Person,Long> {
}
