package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> player = new ArrayList<>();
    static ArrayList<String> computer  = new ArrayList<>();
    static ArrayList<String> winnerHistory  = new ArrayList<>();

    public static void main(String[] args) {



        winnerHistory.add(0, "nothing");
        computer.add(0,"'Ultra Computer'");
        System.out.println("Welcome challenger! State your name!");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        player.add(0, playerName);
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
            System.out.println("It is time!");

            for (int i = player.size(); i < 500; i++) {
                System.out.println("Round " + i);
                System.out.println("Choose between 'rock', 'scissor', 'paper'");
                rockPaperScissor(i);
                computerRPS(i);
                System.out.println(player.get(0)+" has weakly shot forth a " + player.get(i) + "!" + computer.get(0) + " mightily fires a giant " + computer.get(i));
                winnerHistory.add(i, winner(player.get(i), computer.get(i)));
                System.out.println("To play again, press 'Y', if not, scream anything"+"\n");
                startGame = input.nextLine();
                startGameclean = startGame.trim().toUpperCase();
                if (startGameclean.equals("Y")) {
                    continue;
                } else {
                    break;
                }


            }

        } else if (startGameclean.equals("H")){
            System.out.println("\n"+"Hall of Fame?:");
            for (int i = 1; i < player.size() ; i++) {
                System.out.println(winnerHistory.get(i) + ": Player: " + player.get(i) + " vs. Computer: " + computer.get(i)+ "\n");
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



            System.out.println("Choose your weapon!");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            String inClean = in.trim().toLowerCase();
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




            double result = Math.floor((Math.random() * 2.99d));

            if (result == 0) {
                computer.add(g, "rock");
            } else if (result == 1) {
                computer.add(g, "scissor");
            } else if (result == 2) {
                computer.add(g, "paper");
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
                }
                break;
        }

        return winnar;
    }



}
