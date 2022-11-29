package com.peaksoft.dao;

import com.peaksoft.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Nurs"));
        people.add(new Person(++PEOPLE_COUNT, "Aiba"));
        people.add(new Person(++PEOPLE_COUNT, "Beka"));
        people.add(new Person(++PEOPLE_COUNT, "Turar"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
