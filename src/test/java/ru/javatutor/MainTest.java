package ru.javatutor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    @DisplayName("Удаление первого элемента")
    void remove_1() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 0);
        assertArrayEquals(new Integer[]{2, 3, 4, 5}, res);
    }

    @Test
    @DisplayName("Удаление последнего элемента")
    void remove_2() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, res);
    }

    @Test
    void remove_3() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] res = main.remove(arr, 1);
        assertArrayEquals(new Integer[]{1, 3, 4, 5}, res);
    }

    @Test
    void removeLastElement_SeveralElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, res);
    }

    @Test
    void removeLastElement_OneElement() {
        int[] arr = {1};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void removeLastElement_EmptyArray() {
        int[] arr = {};
        int[] res = main.removeLastElement(arr);
        assertArrayEquals(new int[]{}, res);
    }
}