package ru.javatutor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    @DisplayName("Удаление первого элемента")
    void remove_firstElement() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 0);
        assertArrayEquals(new Integer[]{2, 3, 4, 5}, res);
    }

    @Test
    @DisplayName("Удаление последнего элемента")
    void remove_lastElement() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, res);
    }

    @Test
    void remove_any() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 1);
        assertArrayEquals(new Integer[]{1, 3, 4, 5}, res);
    }

    @Test
    void remove_emptyArray() {
        Integer[] arr = {};
        Integer[] res = main.remove(arr, 1);
        assertArrayEquals(new Integer[]{}, res);
    }

    @Test
    void remove_invalidIndex() {
        Integer[] arr = {1, 2, 3};
        Integer[] res = main.remove(arr, -1);
        assertArrayEquals(new Integer[]{1, 2, 3}, res);
    }

    @Test
    void removeLastElement_severalElementsInArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, res);
    }

    @Test
    void removeLastElement_oneElementInArray() {
        int[] arr = {1};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void removeLastElement_emptyArray() {
        int[] arr = {};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{}, res);
    }
}