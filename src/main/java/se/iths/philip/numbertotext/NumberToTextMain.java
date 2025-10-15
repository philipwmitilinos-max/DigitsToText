package se.iths.philip.numbertotext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToTextMain {
    static Scanner scanner = new Scanner(System.in);
    private static final String[] ENKELTAL = {
            "", "ett", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio",
            "tio", "elva", "tolv", "tretton", "fjorton", "femton", "sexton", "sjutton", "arton", "nitton"
    };
    private static final String[] TIOTAL = {
            "", "", "tjugo", "trettio", "fyrtio", "femtio", "sextio", "sjuttio", "åttio", "nittio"
    };

    public static void main(String[] args) {
        inputDigit();
    }

    public static void inputDigit() {
        try {
            System.out.print("Skriv in ett heltal på max nio siffror: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input < 0) {
                System.out.println("minus " + convertToText(-input));
            } else {
                System.out.println(input + " = " + convertToText(input));
            }

        } catch (InputMismatchException e) {
            System.err.println("Fel input " + e.getMessage());
        }

    }

    public static String convertToText(int tal) {
        if (tal == 0) return "noll";
        if (tal < 20) return ENKELTAL[tal];
        if (tal < 100) {
            int tiotal = tal / 10;
            int enheter = tal % 10;
            return TIOTAL[tiotal] + (enheter > 0 ? ENKELTAL[enheter] : "");
        }
        if (tal < 1000) {
            int hundratal = tal / 100;
            int rest = tal % 100;
            String resultat = (hundratal == 1 ? "etthundra" : ENKELTAL[hundratal] + "hundra");
            if (rest > 0) resultat += convertToText(rest);
            return resultat;
        }
        if (tal < 1_000_000) {
            int tusental = tal / 1000;
            int rest = tal % 1000;
            String resultat = (tusental == 1 ? "ettusen" : convertToText(tusental) + "tusen");
            if (rest > 0) resultat += convertToText(rest);
            return resultat;
        }
        if (tal < 1_000_000_000) {
            int miljon = tal / 1_000_000;
            int rest = tal % 1_000_000;
            String resultat = (miljon == 1 ? "enmiljon" : convertToText(miljon) + "miljoner");
            if (rest > 0) resultat += convertToText(rest);
            return resultat;
        }
        return "Tal för stort (max 999 999 999 i denna version)";
    }
}
