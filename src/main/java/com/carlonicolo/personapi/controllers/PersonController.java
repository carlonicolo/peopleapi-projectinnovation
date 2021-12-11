package com.carlonicolo.personapi.controllers;


import com.carlonicolo.personapi.dto.response.MessageResponseDTO;
import com.carlonicolo.personapi.entities.Person;
import com.carlonicolo.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping
    public String getBook(){
        return "Api Test!";
    }


    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person ID " + savedPerson.getId())
                .build();
    }


}
