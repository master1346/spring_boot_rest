package com.example.spring_rest.Repository;

import com.example.spring_rest.Authorities;
import com.example.spring_rest.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final List<Person> personList = Arrays.asList(new Person("jon","qwerty1", Arrays.asList(Authorities.DELETE, Authorities.WRITE)),
            new Person("Ben","abcd1", Collections.singletonList(Authorities.WRITE)),
            new Person("Mike","123E", Arrays.asList(Authorities.DELETE, Authorities.WRITE, Authorities.READ))
    );
    public List<Authorities> getUserAuthorities(String user, String password) {
        for(Person person : personList) {
            if((person.getUser().equals(user)) && (person.getPassword().equals(password))){
                return person.getAuthoritiesList();
            }
        }

        return Collections.emptyList();
    }
}