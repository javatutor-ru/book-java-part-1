package ru.javatutor.book;

import ru.javatutor.book.classes.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Пример Arrays.toString()
        String[] sArr = {"cat", "dog"};
        System.out.println(Arrays.toString(sArr)); // [cat, dog]

        // Копирование массива
        Person[] people = {
                new Person(1, "Anna"),
                new Person(2, "Oleg")
        };

        Person[] cloned = people.clone();

        // значение в первом массиве
        System.out.println(people[0].name); // Anna

        // изменим значение одного объекта во втором массиве
        cloned[0].name = "Alexander";

        // это отразится на первом массиве
        System.out.println(people[0].name); // Alex

    }

    public Integer[] remove(Integer[] arr, int index) {
        if (arr == null || arr.length == 0 || index < 0 || index >= arr.length)
            return arr;

        Integer[] res = new Integer[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                res[count++] = arr[i];
            }
        }

        return res;
    }

    public int[] removeLastElement(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        return Arrays.copyOf(arr, arr.length - 1);
    }


}