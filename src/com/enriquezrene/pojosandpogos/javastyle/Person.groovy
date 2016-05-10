package com.enriquezrene.pojosandpogos.javastyle

/**
 * Created by rene on 10/05/16.
 */
public class Person {

    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name
        this.lastname = lastname
    }

    public String getLastname() {
        return lastname
    }

    public void setLastname(String lastname) {
        this.lastname = lastname
    }

    public String getName() {
        return name
    }

    public void setName(String name) {
        this.name = name
    }
}
