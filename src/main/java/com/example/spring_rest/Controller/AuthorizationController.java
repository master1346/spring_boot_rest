package com.example.spring_rest.Controller;

import com.example.spring_rest.Authorities;
import com.example.spring_rest.Person;
import com.example.spring_rest.Service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
    @GetMapping("/authorize1")
    public List<Authorities> getAuthorities1(@RequestBody @Valid Person person) {
        return service.getAuthorities(person.getUser(), person.getPassword());
    }
}
