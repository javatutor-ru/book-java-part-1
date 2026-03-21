package ru.javatutor.classes;

public class Example {
    static Integer number;
    String value;

    public static void main(String[] args) {
        System.out.println(Example.number); // null

        Example ex = new Example();
        System.out.println(ex.value); // null
    }
}
