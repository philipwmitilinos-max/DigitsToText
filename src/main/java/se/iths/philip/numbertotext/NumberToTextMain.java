package se.iths.philip.numbertotext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToTextMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputDigit();
    }

    public static void inputDigit() {
        try {
            System.out.print("Skriv in ett heltal på max nio siffror: ");
            int input = scanner.nextInt();
            String result = Integer.toString(input);
            int inputLength = String.valueOf(input).length();
            System.out.println(result);
            System.out.println("Längden är " + inputLength);

            inputArray(input);
            System.out.println(" ");
            divedInput(input);
        } catch (InputMismatchException e) {
            System.out.println("Fel input");
        }

    }

    public static void divedInput(int input) {
        int miljard = (input % 1000000000) / 100000000;
        int miljon = (input % 100000000) / 100000;
        int millimal = (input % 100000) / 1000;
        int centimal = (input % 1000) / 100;
        int decimal = (input % 100) / 10;
        int single = input % 10;
        System.out.println("Miljard tal: " + miljard);
        System.out.println("Miljon tal: " + miljon);
        System.out.println("Tusen tal: " + millimal);
        System.out.println("Hundra tal: " + centimal);
        System.out.println("Tio tal: " + decimal);
        System.out.println("En tal: " + single);
    }

    public static void inputArray(int input) {
        String numderAsString = String.valueOf(input);
        int[] digits = new int[numderAsString.length()];
        for (int i = 0; i < numderAsString.length(); i++) {
            digits[i] = Character.getNumericValue(numderAsString.charAt(i));
        }
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
