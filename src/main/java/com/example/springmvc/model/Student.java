package com.example.springmvc.model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private LinkedHashMap<String,String> country;


    public Student(){
        country=new LinkedHashMap<>();

        country.put("BR","Brazil");
        country.put("GEO","Georgia");
        country.put("FR","France");
        country.put("IN","India");
        country.put("US","United States of America");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountry() {
        return country;
    }
}
