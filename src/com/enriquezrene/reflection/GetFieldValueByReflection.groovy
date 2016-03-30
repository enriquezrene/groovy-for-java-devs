package com.enriquezrene.reflection

import java.lang.reflect.Field

/**
 * Created by rene on 30/03/16.
 */
public class GetFieldValueByReflection {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("Rene");
        person.setLastName("Enriquez");

        System.out.println(getFieldValueJavaStyle(person, "name"));
        System.out.println(getFieldValueJavaStyle(person, "lastName"));

        Person person2 = new Person(name: "Rene", lastName: "Enriquez")
        println(getFieldValueGroovyStyle(person2, "name"))
        println(getFieldValueGroovyStyle(person2, "lastName"))

    }

    public static Object getFieldValueJavaStyle(Object instance, String fieldName) throws Exception {
        Field field = instance.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(instance);
    }

    public static Object getFieldValueGroovyStyle(Object instance, String fieldName) {
        instance[fieldName]
    }
}
