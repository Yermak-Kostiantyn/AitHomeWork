package lesson_05.classwork1503;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age <13) {
            System.out.println("You are too young! Return later when you are over 13");
        } else {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();

            System.out.println("Successfully registered user!");
            System.out.println("Login: " + login);
            // Доп задача на дом: сделать так, что бы вместо букв пароля выводились звездочки
            // Колличество звездочек должно совпадать с колличеством символов пароля
            System.out.println("Password: " + password);
            String maskedPassword = password.replaceAll(".", "*");
            System.out.println("Password: " + maskedPassword);
        }
    }
}
