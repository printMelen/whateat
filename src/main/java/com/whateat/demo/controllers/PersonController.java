package com.whateat.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.whateat.demo.model.Person;
import com.whateat.demo.servicesImpl.PersonServicesImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonServicesImpl personServicesImpl;

    @GetMapping
    public List<Person> getPersons() {
        return personServicesImpl.getPersons();
    }
    

    @PostMapping("/create")
    public void createPerson(@RequestBody Person person) {
        personServicesImpl.createPerson(person);
    }
}
