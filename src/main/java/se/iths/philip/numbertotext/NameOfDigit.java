package se.iths.philip.numbertotext;

public class NameOfDigit {
    public void input() {
//        System.out.println("Längden är " + input);
//
//        inputArray(input);
//        System.out.println(" ");
//        divedInput(input);
    }

    public static void divedInput(int input) {
        System.out.println("############################################################");
        int miljon = (input % 1_000_000_000) / 1_000_000;
        int millimal = (input % 1_000_000) / 1_000;
        int centimal = (input % 1_000) / 100;
        int decimal = (input % 100) / 10;
        int single = input % 10;
        System.out.println("Miljon tal:          " + miljon);
        System.out.println("Tusen tal:           " + millimal);
        System.out.println("Hundra tal:          " + centimal);
        System.out.println("Tio tal:             " + decimal);
        System.out.println("En tal:              " + single);
        divedMiljon(miljon);
        divedMilli(millimal);
        realMiljon(miljon);
        realMillimal(millimal);
        realCentimal(centimal);
        realDecimal(decimal, single);
    }

    public static void divedMiljon(int miljon) {
        System.out.println("############################################################");
        int centiMiljon = (miljon % 1000) / 100;
        int deciMiljon = (miljon % 100) / 10;
        int singleMiljon = miljon % 10;
        int sumCentiMiljon = centiMiljon * 100_000_000;
        int sumDeciMiljon = deciMiljon * 10_000_000;
        int sumSingleMiljon = singleMiljon * 1_000_000;
        System.out.println("Hundra miljoner:     " + sumCentiMiljon);
        System.out.println("Tio miljoner:        " + sumDeciMiljon);
        System.out.println("Miljon:              " + sumSingleMiljon);
    }

    public static void divedMilli(int millimal) {
        System.out.println("############################################################");
        int centiMillimal = (millimal % 1000) / 100;
        int deciMillimal = (millimal % 100) / 10;
        int singleMillimal = millimal % 10;
        int sumCentiMillimal = centiMillimal * 100_000;
        int sumDeciMillimal = deciMillimal * 10_000;
        int sumSingleMillimal = singleMillimal * 1_000;
        System.out.println("Hundra tusen:        " + sumCentiMillimal);
        System.out.println("Tio tusen:           " + sumDeciMillimal);
        System.out.println("Tusen:               " + sumSingleMillimal);
    }

    public static void realMiljon(int miljon) {
        System.out.println("============================================================");
        int sum = miljon * 1_000_000;
        System.out.println("Hela miljontal:      " + sum);
    }

    public static void realMillimal(int millimal) {
        System.out.println("============================================================");
        int sum = millimal * 1_000;
        System.out.println("Hela tusental:       " + sum);
    }

    public static void realCentimal(int centimal) {
        System.out.println("============================================================");
        int sum = centimal * 100;
        System.out.println("Hela hundratal:      " + sum);
    }

    public static void realDecimal(int decimal, int single) {
        System.out.println("============================================================");
        if (decimal == 0) {
            System.out.println("Sanna heltal:        " + single);
        } else {
            int realDecimal = decimal * 10;
            int sum = realDecimal + single;
            System.out.println("Sanna decimaltal:    " + sum);
        }
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

    public static void numberZero() {
        //0
        String numberZero = "Noll";
    }

    public static void singelNumber() {
        //0
        String[] singleNumber = {"Ett", "Två", "Tre", "Fyra", "Fem", "Sex", "Sju", "Åtta", "Nio"};
    }

    public static void decimalNumberSet1() {
        //00
        String[] decimalNumberSet1 = {"Elva", "Tolv", "Tretton", "Fjorton", "Femton", "Sexton", "Sjutton", "Arton", "Niton"};
    }

    public static void decimalNumberSet2() {
        //00
        String[] decimalNumberSet2 = {"Tio", "Tjugo", "Trettio", "Fyrtio", "Femtio", "Sextio", "Sjuttio", "Åttio", "Nittio"};
    }

    public static void centimalNumber() {
        //000
        String centimalNumber = "Hundra";
    }

    public static void millimalNumber() {
        //0_000 - 00_000
        String millimalNumber = "Tusen";
    }

    public static void miljonNumber() {
        //0_000_000 - 000_000_000
        String miljonNumber = "Miljon";
    }
}
