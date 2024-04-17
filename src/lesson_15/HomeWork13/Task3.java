package lesson_15.HomeWork13;

import java.util.Scanner;

public class Task3 {

    public static int readNumber(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float toMeters(int cm) {
        return cm / 100f;
    }

    public static float calculateBMI(float height, int weight) {
        return (float)(weight / Math.pow(height, 2));
    }

    public static void printResult(float bmi) {
        System.out.println("BMI: " + bmi + ", you are ");

        if (bmi < 15) {
            System.out.println("Anorexic");
        } else if (bmi < 20) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }


    public static void main(String[] args) {
        int weight = readNumber("Enter your weight in kg");
        float height = toMeters(readNumber("Enter your height in cm"));

        float bmi = calculateBMI(height, weight);
        printResult(bmi);

    }
}