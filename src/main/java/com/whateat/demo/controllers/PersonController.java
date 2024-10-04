package com.whateat.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.whateat.demo.model.Person;
import com.whateat.demo.servicesImpl.PersonServicesImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonServicesImpl personServicesImpl;

    @PostMapping("/create")
    public void createPerson(@RequestBody Person person) {
        personServicesImpl.createPerson(person);
    }
}
