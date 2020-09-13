package com.study.sprpetclinic.service;

import com.study.sprpetclinic.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl {
    @Autowired
    private PersonService personService;

    public List<Person> listAll() {
        return personService.findAll();
    }

    public void save(Person person) {
        personService.save(person);
    }

    public Person get(long id) {
        return personService.findById(id).get();
    }

    public void delete(long id) {
        personService.deleteById(id);
    }
}
