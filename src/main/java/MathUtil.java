package main.java;

import java.util.Arrays;

class MathUtil {

    public static boolean linearSearch(int[] arr, int key) {
        boolean found = false;
        for (int elem : arr) {
            if (key == elem) {
                found = true;
                break;
            }
        } 
        return found;
    }

    public static boolean binarySearch(int[] arr, int key, int start, int end) {
        Arrays.sort(arr);

        if (key < arr[start] || key > arr[end]) {
            return false;
        }

        int mid = (start + end) / 2;
        if (key == arr[mid]) {
            return true;
        } else if (key < arr[mid]) {
            return binarySearch(arr, key, start, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, end);
        }
    }
}