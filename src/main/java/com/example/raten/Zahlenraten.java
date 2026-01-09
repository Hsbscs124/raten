package com.example.raten;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int geheimeZahl = random.nextInt(100) + 1;
        int geraten;

        System.out.println("Willkommen zum Zahlenraten!");

        do {
            System.out.print("Zahl raten zwischen 1 und 100: ");
            geraten = scanner.nextInt();

            if (geraten < geheimeZahl) {
                System.out.println("Zu niedrig! Versuchen Sie es erneut:");
            } else if (geraten > geheimeZahl) {
                System.out.println("Zu hoch! Versuchen Sie es erneut:");
            } else {
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl erraten.");
            }

        } while (geraten != geheimeZahl);

        scanner.close();
    }
}
