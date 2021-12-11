package com.carlonicolo.personapi.repositories;

import com.carlonicolo.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
