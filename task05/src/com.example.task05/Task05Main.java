package com.example.task05;

import java.util.Arrays;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5, 4, 3));
    }

    static int getMin(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[0];
    }
}