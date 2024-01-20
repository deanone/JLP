package main.java;

import main.java.MathUtil;

public class NewArrayImpl {

    private int[] arr;

    public NewArrayImpl() {
        arr = new int[10];
    }

    public NewArrayImpl(int N) {
        arr = new int[N];
    }

    public void add(int index, int val) {
        if (index >=0 && index < arr.length) {
            arr[index] = val;	
        }
    }

    public int[] toArray() {
        return arr;
    }

    public int length() {
        return arr.length;
    }

    public Integer getElement(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            return null;
        }
    }

    public void set(int[] arr) {
        this.arr = arr;
    }

    public boolean exists(int key) {
        int[] arrCopy = arr.clone();
        return MathUtil.binarySearch(arrCopy, key, 0, arr.length - 1);
    }	

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (i < arr.length - 1) {
                sb.append(elem + " ");	
            } else {
                sb.append(elem);
            }
        }
        sb.append("]");
        return sb.toString();
    }	
}
