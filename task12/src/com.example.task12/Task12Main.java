package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int index = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[index] >= arr[j]) index = j;
            }

            int min = arr[index];
            arr[index] = first;
            arr[i] = min;
        }
    }

}