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
            scanner.nextLine();
//            String result = Integer.toString(input);
//            int inputLength = String.valueOf(input).length();
//            System.out.println(result);
            System.out.println("Längden är " + input);

            inputArray(input);
            System.out.println(" ");
            divedInput(input);
        } catch (InputMismatchException e) {
            System.err.println("Fel input " + e.getMessage());
        }

    }

    public static void divedInput(int input) {
        //int miljard = (input % 1_000_000_000) / 100_000_000;
        int miljon = (input % 1_000_000_000) / 1_000_000;
        int millimal = (input % 1_000_000) / 1_000;
        int centimal = (input % 1_000) / 100;
        int decimal = (input % 100) / 10;
        int single = input % 10;
        //System.out.println("Miljard tal: " + miljard);
        System.out.println("Miljon tal: " + miljon);
        System.out.println("Tusen tal: " + millimal);
        System.out.println("Hundra tal: " + centimal);
        System.out.println("Tio tal: " + decimal);
        System.out.println("En tal: " + single);
        divedMiljon(miljon);
        divedMilli(millimal);
    }

    public static void divedMiljon(int miljon) {
        int centiMiljon = (miljon % 1000) / 100;
        int deciMiljon = (miljon % 100) / 10;
        int singleMiljon = miljon % 10;
        System.out.println("Hundra miljoner: " + centiMiljon * 100_000_000);
        System.out.println("Tio miljoner: " + deciMiljon * 10_000_000);
        System.out.println("Miljon: " + singleMiljon * 1_000_000);
    }

    public static void divedMilli(int millimal) {
        int centMillimal = (millimal % 1000) / 100;
        int deciMillimal = (millimal % 100) / 10;
        int singleMillimal = millimal % 10;
        System.out.println("Hundra tusen: " + centMillimal * 100_000);
        System.out.println("Tio tusen: " + deciMillimal * 10_000);
        System.out.println("Tusen: " + singleMillimal * 1_000);
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
