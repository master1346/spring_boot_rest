package com.example.spring_rest.Repository;

import com.example.spring_rest.Authorities;
import com.example.spring_rest.Person;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final List<Person> personList = Arrays.asList(
            new Person("jon","qwerty1", Arrays.asList(Authorities.DELETE, Authorities.WRITE)),
            new Person("Ben","abcd1", Collections.singletonList(Authorities.WRITE)),
            new Person("Mike","123E", Arrays.asList(Authorities.DELETE, Authorities.WRITE, Authorities.READ))
    );
    public List<Authorities> getUserAuthorities(String user, String password) {
        if((user.equals("jon")) && (password.equals("qwerty1"))){
             return new ArrayList<Authorities>(Collections.singleton(Authorities.READ));
        }
        if((user.equals("Ben")) && (password.equals("abcd"))){
            return  new ArrayList<Authorities>(Collections.singleton(Authorities.WRITE));
        }

        return Collections.emptyList();
    }
}