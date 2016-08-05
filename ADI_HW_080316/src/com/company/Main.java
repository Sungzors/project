package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] project = new int[7];

        project[2] = 10;
        project[4] = 5;

        System.out.println(project.length);

        ArrayList<String> concreteJungle = new ArrayList<>();

        concreteJungle.add("Jay Z");
        concreteJungle.add("Phife Dog");
        concreteJungle.add("Mos Def");
        Scanner input = new Scanner(System.in);
        String startGame = input.nextLine();
        String startGameclean = startGame.toUpperCase();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

            while (startGameclean.equals("shit")) {
                continue;

            }
            while (startGameclean.equals("not shit")) {
                break;

            }
        }

        for (int i = 0; i < concreteJungle.size(); i++) {
            System.out.println("Today, I spotted " + concreteJungle.get(i) + " in the concrete jungle!");

        }

        double[] sums = new double[4];
        sums[0] = Math.round((Math.random() * 5d));
        sums[1] = Math.round((Math.random() * 2d));

        if (sums.length > 1) {
            System.out.println(sums[0] + sums[1]);
        } else if (sums.length == 1) {
            System.out.println(sums[0]);
        } else {
            System.out.println(0);
        }

        ArrayList<String> pigLatin = new ArrayList<>();
        pigLatin.add("bug");
        pigLatin.add("dorky");
        pigLatin.add("numby");
        pigLatin.add("asshole");
        for (int i = 0; i < pigLatin.size() ; i++) {
            System.out.println(pigLatinizer(pigLatin.get(i)));
        }

    }

    public static String pigLatinizer(String word){
        String[] wordStorage = word.split("");
        String pigged = "";
        String[] vowel = new String[5];
        vowel[0] = "a";
        vowel[1] = "e";
        vowel[2] = "i";
        vowel[3] = "o";
        vowel[4] = "u";
        if (wordStorage[0].equals(vowel[0]) || wordStorage[0].equals(vowel[1]) || wordStorage[0].equals(vowel[2]) || wordStorage[0].equals(vowel[3]) || wordStorage[0].equals(vowel[4])){
            for (int i = 1; i < word.length(); i++) {
                pigged = pigged + wordStorage[i];
            }
            pigged = pigged + "way";
        } else {
            for (int i = 1; i < word.length(); i++) {
                pigged = pigged + wordStorage[i];
            }
            pigged = pigged + wordStorage[0]+ "ay";
        }
        return pigged;
    }
}
