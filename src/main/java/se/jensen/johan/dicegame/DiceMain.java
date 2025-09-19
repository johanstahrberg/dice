package se.jensen.johan.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tärningsduellen !!");
        System.out.println("Två spelare, två tärningar var där högst sammanlagda poäng vinner !");
        System.out.println("-------------------------------------------------------");
        System.out.println("Player1, skriv in ditt förnamn: ");
        String firstname1 = scanner.nextLine();


        System.out.println("Player1, skriv in ditt efternamn: ");
        String lasttname1 = scanner.nextLine();

        Player player1 = new Player(firstname1, lasttname1);

        System.out.println("Player2, skriv in ditt förnamn: ");
        String firstname2 = scanner.nextLine();


        System.out.println("Player2, skriv in ditt efternamn: ");
        String lastname2 = scanner.nextLine();

        Player player2 = new Player(firstname2, lastname2);

        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("För att spela, skriv: play");
        System.out.println();
        System.out.println("För att avsluta, skriv: quit");

        String val = scanner.nextLine();
        if (val.equals("quit")) {
            System.out.println("Programmet avlutas !");
            scanner.close();

        }

        if (val.equals("play")) {
            int roll1 = random.nextInt(1, 7);
            player1.addScore(roll1);
            int roll2 = random.nextInt(1, 7);
            player1.addScore(roll2);
            int roll3 = random.nextInt(1, 7);
            player2.addScore(roll3);
            int roll4 = random.nextInt(1, 7);
            player2.addScore(roll4);

            System.out.println();
            player1.getFullName();
            System.out.println("slog: " + roll1 + " och " + roll2);

            System.out.println("--------------------------------");

            player2.getFullName();
            System.out.println("slog: " + roll3 + " och " + roll4);

            System.out.println("--------------------------------");
        }
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Vinnare är:");
            player1.getFullName();
        }
        if (player1.getScore() < player2.getScore()) {
            System.out.println("Vinnare är:");
            player2.getFullName();

        }

        if (player1.getScore() == player2.getScore() && player1.getScore() > 0) {
            System.out.println("Det blev lika !");
        }
        if (!val.equals("quit") && !val.equals("play")) {
            System.out.println("Du gav fel input !");
        }

    }

}



