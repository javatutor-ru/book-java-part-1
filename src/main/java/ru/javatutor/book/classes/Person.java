package ru.javatutor.book.classes;

public class Person {
    // поля класса
    public int id;
    public int age;
    public String name;

    // конструктор
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // методы класса
    public void printName() {
        System.out.println(name);
    }

}