package com.study.sprpetclinic.service;

import com.study.sprpetclinic.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonService extends JpaRepository<Person,Long> {

}
