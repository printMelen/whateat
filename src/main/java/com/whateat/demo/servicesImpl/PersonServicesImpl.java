package com.whateat.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.whateat.demo.model.Person;
import com.whateat.demo.repository.PersonRepository;
import com.whateat.demo.services.PersonServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class PersonServicesImpl implements PersonServices {

    private final PersonRepository personRepository;

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }
}
