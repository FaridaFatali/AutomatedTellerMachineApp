package org.example;

import java.util.Scanner;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=yhhX9pqf7u0">...</a>
 * @author Farida Fatali
 * Name: "ATM App"
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String options = """
                Balance -> 1
                Withdraw -> 2
                Deposit into different account -> 3
                To exit press -> *""";

        double enriqueBalance = 2450;
        String enriqueIBAN = "DE91 1111 1111 01234567 89";
        String enriqueUserName = "enrique1990";
        String enriquePassword = "12345";

        double jenniferBalance = 5700;
        String jenniferIBAN = "AB91 5432 5643 38738793 33";
        String jenniferUserName = "jennifer1985";
        String jenniferPassword = "98765";

        System.out.println("Welcome!");
        System.out.println("Please enter your information");

        System.out.print("User Name: ");
        String userName = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (userName.equals("enrique1990") && password.equals("12345")) {
            System.out.println("Enrique Gonzales logged in...");
            System.out.println(options);
            System.out.println();
            System.out.print("Press select an option: ");
            String select = scanner.nextLine();

            switch (select) {
                case "1" -> System.out.print("Your balance: " + enriqueBalance);
                case "2" -> {
                    System.out.print("Enter the amount : ");
                    int withdrawAmount = scanner.nextInt();
                    if (enriqueBalance >= withdrawAmount) {
                        enriqueBalance -= withdrawAmount;
                        System.out.println("The operation completed successfully!");
                        System.out.println("Your remaining balance: " + enriqueBalance);
                    } else {
                        System.out.println("You can't withdraw more than the balance!");
                    }
                }
                case "3" -> {
                    System.out.print("How much do you want to deposit: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= enriqueBalance) {
                        System.out.print("Enter the IBAN: ");
                        scanner.nextLine();
                        String depositIban = scanner.nextLine();
                        if (depositIban.equals(jenniferIBAN)) {
                            System.out.println("The money is deposited with a person named Jennifer Houston...");
                            enriqueBalance -= depositAmount;

                            System.out.println("Your remaining balance: " + enriqueBalance);
                        } else {
                            System.out.println("The IBAN is wrong! ");
                        }
                    } else {
                        System.out.println("You don't have enough money!");
                    }
                }
                case "*" -> System.out.println("You exited.");
            }
        } else if (userName.equals("jennifer1985") && password.equals("98765")) {
            System.out.println("Jennifer Houston logged in...");
            System.out.println(options);
            System.out.println();
            System.out.print("Press select an option: ");
            String select = scanner.nextLine();

            switch (select) {
                case "1" -> System.out.print("Your balance: " + jenniferBalance);
                case "2" -> {
                    System.out.print("Enter the amount : ");
                    int withdrawAmount = scanner.nextInt();
                    if (jenniferBalance >= withdrawAmount) {
                        jenniferBalance -= withdrawAmount;
                        System.out.println("The operation completed successfully!");
                        System.out.println("Your remaining balance: " + jenniferBalance);
                    } else {
                        System.out.println("You can't withdraw more than the balance!");
                    }
                }
                case "3" -> {
                    System.out.print("How much do you want to deposit: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= jenniferBalance) {
                        System.out.print("Enter the IBAN: ");
                        scanner.nextLine();
                        String depositIban = scanner.nextLine();
                        if (depositIban.equals(enriqueIBAN)) {
                            System.out.println("The money is deposited with a person named Enrique Gonzales...");
                            jenniferBalance -= depositAmount;

                            System.out.println("Your remaining balance: " + jenniferBalance);
                        } else {
                            System.out.println("The IBAN is wrong! ");
                        }
                    } else {
                        System.out.println("You don't have enough money!");
                    }
                }
                case "*" -> System.out.println("You exited.");
            }
        } else {
            System.out.println("User name or password is wrong!");
        }

    }
}