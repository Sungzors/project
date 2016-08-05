package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> player = new ArrayList<>();
    static ArrayList<String> computer  = new ArrayList<>();
    static ArrayList<String> winnerHistory  = new ArrayList<>();

    public static void main(String[] args) {



        winnerHistory.add(0, "History");
        computer.add(0,"'Ultra Computer'");
        System.out.println("Welcome challenger! State your name!");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        player.add(0, playerName);
        System.out.println("What a stupid name! \n \n \n \n");
        System.out.println("You've stepped into the wrong place... You must play Rock, Paper, Scissor to succeed!");
        System.out.println("Your opponent is " + computer.get(0) + "!! 'BZZT BZZT PUNY HUMAN CANNOT WIN'" + "\n");

        System.out.println("Main Menu" + "\n" + "===========");
        System.out.println("Will you enter?  Y/N");
        System.out.println("To view history, type 'H'"); //not yet implemented
        System.out.println("To run away, scream literally anything");
        for (int j = 0; j < 1000 ; j++) {


        String startGame = input.nextLine();
        String startGameclean = startGame.trim().toUpperCase();
        if (startGameclean.equals("Y")) {
            System.out.println("It is time!\n");

            for (int i = player.size(); i < 500; i++) {
                System.out.println("\nRound " + i);
                double windRate = Math.floor((Math.random() * 3.5d));
                if (windRate == 3) {
                    System.out.println("\nThe wind is fiercely blowing...\n");
                } else if (windRate == 2) {
                    System.out.println("\nSweat drips down your forehead...\n");
                }else {
                    System.out.println("\nThe field is oddly calm...\n");
                }
                rockPaperScissor(i);
                computerRPS(i);
                System.out.println(player.get(0)+" has weakly shot forth a stupid and tiny " + player.get(i) + "! " + computer.get(0) + " mightily fires a giant " + computer.get(i));
                winnerHistory.add(i, winner(player.get(i), computer.get(i)));
                System.out.println("\nTo play again, press 'Y', if not, scream anything"+"\n");
                startGame = input.nextLine();
                startGameclean = startGame.trim().toUpperCase();
                if (startGameclean.equals("Y")) {
                    continue;
                } else {
                    break;
                }


            }

        } else if (startGameclean.equals("H")){
            System.out.println("\n"+"===\nHall of Fame?:\n===\n");
            for (int i = 1; i < player.size() ; i++) {
                System.out.println(winnerHistory.get(i) + ": Player: " + player.get(i) + " vs. Computer: " + computer.get(i)+ "!!!\n");
            }

        } else {
            System.out.println("'FOOLISH ANSWER.' You are dead!");
            System.exit(0);
        }
        System.out.println("Main Menu" + "\n" + "===========");
        System.out.println("Will you enter?  Y/N");
        System.out.println("To view history, type 'H'"); //not yet implemented
        System.out.println("To run away, scream literally anything");


        }
    }

    public static void rockPaperScissor(int g){



            System.out.println("Choose between 'rock'(r), 'scissor'(s), 'paper'(p)!!!");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            String inClean = in.trim().toLowerCase();
            if (inClean.equals("p")){
                inClean = "paper";
            } else if (inClean.equals("s") || inClean.equals("scissors")){
                inClean = "scissor";
            } else if (inClean.equals("r")){
                inClean = "rock";
            }
            if (inClean.equals("rock")) {
                player.add(g, "rock");
            } else if (inClean.equals("scissor")){
                player.add(g, "scissor");
            } else if (inClean.equals("paper")){
                player.add(g, "paper");
            } else {
                System.out.println("Hey, that's not one of the choices! You knucklehead!");
                System.out.println("Ultra Computer: 'BZZT HUMAN BRAIN TINY. EASY WIN FOR ROBOT'");
                System.out.println("You lose an arm, a leg, and your tonsils! You are probably dead!!!");
                System.exit(0);
            }



    }

    public static void computerRPS(int g){




            double result = Math.floor((Math.random() * 3.3d));

            if (result == 0) {
                computer.add(g, "rock");
            } else if (result == 1) {
                computer.add(g, "scissor");
            } else if (result == 2) {
                computer.add(g, "paper");
            } else {
                computer.add(g, "laser beam");
            }

    }

    public static String winner(String s, String t){
        String winnar = "";
        switch(s){
            case "rock":
                switch (t) {
                    case "rock":
                        System.out.println("A tie!");
                        winnar = "Tie";
                        break;
                    case "paper":
                        System.out.println("YOU LOSE!! YOUR LIFE IS FORFEIT");
                        winnar = "Lose";
                        break;
                    case "scissor":
                        System.out.println("You win! But " + computer.get(0) + " is unfazed!");
                        winnar = "Win";
                        break;
                    case "laser beam":
                        System.out.println("==========================O\n\n*--------------------------\n\n==========================O\nYou have been annihilated. \n \n The End.");
                        System.exit(0);
                }
                break;
            case "paper":
                switch (t){
                    case "paper":
                        System.out.println("A tie!");
                        winnar = "Tie";
                        break;
                    case "scissor":
                        System.out.println("YOU LOSE!! YOUR LIFE IS FORFEIT");
                        winnar = "Lose";
                        break;
                    case "rock":
                        System.out.println("You win! But " + computer.get(0)+" is unfazed!");
                        winnar = "Win";
                        break;
                    case "laser beam":
                        System.out.println("==========================O\n\n*--------------------------\n\n==========================O\nYou have been annihilated. \n \n The End.");
                        System.exit(0);
                }
                break;
            case "scissor":
                switch (t){
                    case "scissor":
                        System.out.println("A tie!");
                        winnar = "Tie";
                        break;
                    case "rock":
                        System.out.println("YOU LOSE!! YOUR LIFE IS FORFEIT");
                        winnar = "Lose";
                        break;
                    case "paper":
                        System.out.println("You win! But " + computer.get(0)+" is unfazed!");
                        winnar = "Win";
                        break;
                    case "laser beam":
                        System.out.println("==========================O\n\n*--------------------------\n\n==========================O\nYou have been annihilated. \n \n The End.");
                        System.exit(0);
                }
                break;
        }

        return winnar;
    }



}
