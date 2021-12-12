package com.example.spring_rest;

import java.util.List;

public class Person {
    private String user;
    private String password;
    private List<Authorities> authoritiesList;

    public Person(String user, String password, List<Authorities> list) {
        this.password = password;
        this.user = user;
        this.authoritiesList = list;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }

    public void setAuthoritiesList(List<Authorities> authoritiesList) {
        this.authoritiesList = authoritiesList;
    }
}
