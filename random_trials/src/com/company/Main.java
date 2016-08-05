package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i<500; i++) {

            double m = Math.floor(Math.random() * 3.2d);
            System.out.println(m);
            if (m == 3){
                break;
            }
        }
    }
}
