package Spil;

import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

public class ThrowCube {
    public static void main(String[] args) {

        System.out.println("The game has begun!");

        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();

        int player1rolledNumber1 = 0;
        int player1rolledNumber2 = 0;

        int player2rolledNumber1 = 0;
        int player2rolledNumber2 = 0;

        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;
        int round = 1;

        boolean gameEnded = false;


        Person player1 = new Person("Player1");
        Person player2 = new Person("Player2");
        Person opponent;


        while (true) {
            if(gameEnded) {
                if (pointsPlayer1 >= 40) {
                    System.out.println(player1.name + " har vundet! ");
                } else {
                    System.out.println(player2.name + " har vundet! ");
                }
                break;
            }
            
            int num = round;
            if (num % 2 == 1) {
                if (pointsPlayer1 < 40) {
                    System.out.println(player1.name + "'s tur, kast med terningen. ");
                    sc.nextLine();

                    player1rolledNumber1 = randomNumber.nextInt(1, 7);
                    player1rolledNumber2 = randomNumber.nextInt(1, 7);

                    System.out.println("Your first dice landed on: ");
                    System.out.println(player1rolledNumber1);

                    System.out.println("Your second dice landed on: ");
                    System.out.println(player1rolledNumber2);

                    System.out.println("Total Points: ");

                    pointsPlayer1 += player1rolledNumber1 + player1rolledNumber2;
                    if(pointsPlayer1 > 40) pointsPlayer1 = 40;

                    System.out.println(pointsPlayer1);
                    System.out.println("\n\n");


                } if (pointsPlayer1 >= 40) {
                    pointsPlayer2 = 40;
                    gameEnded = true;
                    System.out.println("The game is finished!");
                    continue;
                }
            } else if (pointsPlayer2 < 40) {
                System.out.println(player2.name + "'s tur, kast med terningen. ");
                sc.nextLine();

                player2rolledNumber1 = randomNumber.nextInt(1, 6);
                player2rolledNumber2 = randomNumber.nextInt(1, 6);

                System.out.println("Your first dice landed on: ");
                System.out.println(player2rolledNumber1);

                System.out.println("Your second dice landen on: ");
                System.out.println(player2rolledNumber2);


                System.out.println("Total points: ");

                pointsPlayer2 += player2rolledNumber1 + player2rolledNumber2;
                if(pointsPlayer2 > 40) pointsPlayer2 = 40;
                System.out.println(pointsPlayer2);
            } if (pointsPlayer2 >= 40){

                gameEnded = true;
                System.out.println("The game is finished");
                continue;

            }
            round++;
        }
    }
}






