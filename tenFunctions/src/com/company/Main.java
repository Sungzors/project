package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isSame("farts", "forts"));
        wEliminator("tawrt");
        System.out.println(randomizer());
        System.out.println(nextDayTeller(31, 12, 2016));
        wSkipper("BAannaannna");
        fiveTypeOutMan(7);

    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean isSame(String word1, String word2) {
        boolean wordSame = true;


        for (int i = 0; i < word1.length(); i++) {
            if (wordSame) {

                wordSame = word1.charAt(i) == word2.charAt(i);

            }
        }
        return wordSame;
    }

    public static void wEliminator(String word) {
        String[] wordStorage = word.split("");
        String[] wordStorageUpper = word.toUpperCase().split("");
        for (int i = 0; i < word.length(); i++) {

            if (wordStorageUpper[i].equals("W")) {
                break;
            } else {
                System.out.println(wordStorage[i]);
            }
        }
    }

    public static double randomizer() {
        double randomN = Math.floor((Math.random() * 100d));
        if (randomN > 50) {
            return randomN;
        } else {
            return -1;
        }

    }

    public static String nextDayTeller(int day, int month, int year) {
        String nextDay = "";
        Calendar galendar = Calendar.getInstance();

        galendar.set(year, month, day + 1);
        nextDay = "day:" + galendar.get(Calendar.DATE) + " month:" + galendar.get(Calendar.MONTH) + " year:" + galendar.get(Calendar.YEAR);

        return nextDay;
    }

    public static void wSkipper(String word) {
        String[] wordStorage = word.split("");
        for (int i = 0; i < word.length(); i+=2) {

            System.out.println(wordStorage[i]);
        }
    }

    public static void fiveTypeOutMan(int num){
        int[] boobs = new int [num];
        int k = 0;
        for (int j = 0; j < num  ; j++) {
            boobs[j] = j+1;

        }
        while (num>5 && k<num){
            System.out.println(boobs[k]);
            while (boobs[k]==3){
                k++;
            }
            k++;
        }
    }

    public static int sameDiffNum(int num1, int num2){
        if (num1 == num2){
            num1 = num1+2;
            num2 = num2+2;
        } else {
            num1 = num1+1;
            num2 = num2+1;
        }
        return num1 + num2;

    }


}



