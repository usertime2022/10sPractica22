package com.company;

public class Main {

    public static void main(String[] args) {
	calculator(new int[] {1,2,3,4,5});
    }
    static void calculator(int[] values){
        int counter = 0;
        for (int i =0; i<values.length; i++){
            counter += values[i];
        }
        System.out.println(counter);
    }
}
