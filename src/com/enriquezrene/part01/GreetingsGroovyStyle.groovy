package com.enriquezrene.part01

/**
 * Created by rene on 07/03/16.
 */
class GreetingsGroovyStyle {

    public static void main(String[] args) {
        // using for
        for (i in 0..2) {
            print 'hello '
        }
        println 'world'

        // using upto groovy feature
        0.upto(2) {
            print("hello ");
        }
        println("world");

        // using times groovy feature
        3.times {
            print("hello ");
        }
        println("world");
    }

}
