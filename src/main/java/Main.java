package main.java;

public class Main {
	public static void main(String[] args) {
        int N = 3;
        NewArrayImpl nArr = new NewArrayImpl(N);
        nArr.add(0, 2);
        nArr.add(1, 0);
        nArr.add(2, 1);
        String nArrStr = nArr.toString();
        System.out.println("String representation: " + nArrStr);
        
        int key = 1;
        boolean found = nArr.exists(key);
        if (found) {
		    System.out.println("Key exists.");
        } else {
            System.out.println("Key does not exist.");
        }
    }
}