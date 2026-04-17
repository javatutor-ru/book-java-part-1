package ru.javatutor.book.classes;

public class Example {
    public static Integer number;
    public String value;

    public static void main(String[] args) {
        System.out.println(Example.number); // null

        Example ex = new Example();
        System.out.println(ex.value); // null
    }
}
