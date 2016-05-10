package com.enriquezrene.pojosandpogos.javastyle;

/**
 * Created by rene on 10/05/16.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("rene", "enriquez");
        System.out.println(person.getName() + " " + person.getLastname());
    }
}
