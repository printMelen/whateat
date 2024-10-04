package com.whateat.demo.services;


import java.util.List;

import com.whateat.demo.model.Person;

public interface PersonServices {

    public List<Person> getPersons();
    public void createPerson(Person person);
}
