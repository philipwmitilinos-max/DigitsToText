package se.iths.philip.numbertotext;

public class NumberToText {
    public static void main(String[] args) {
        inputDigit();
    }

    public static void inputDigit() {
        int input = 1234;
        String result = Integer.toString(input);
        int inputLength = String.valueOf(input).length();
        System.out.println(result);
        System.out.println("Längden är " + inputLength);
    }

    static void numberZero() {
        //0
        String numberZero = "Noll";
    }

    static void singelNumber() {
        //0
        String[] singleNumber = {"Ett", "Tre", "Fyra", "Fem", "Sex", "Sju", "Åtta", "Nio"};
    }

    static void decimalNumberSet1() {
        //00
        String[] decimalNumberSet1 = {"Elva", "Tolv", "Tretton", "Fjorton", "Femton", "Sexton", "Sjutton", "Arton", "Niton"};
    }

    static void decimalNumberSet2() {
        //00
        String[] decimalNumberSet2 = {"Tio", "Tjugo", "Trettio", "Fyrtio", "Femtio", "Sextio", "Sjuttio", "Åttio", "Nittio"};
    }

    static void centimalNumber() {
        //000
        String centimalNumber = "Hundra";
    }

    static void millimalNumber() {
        //0000
        String millimalNumber = "Tusen";
    }

    static void miljonNumber() {
        //0000000
        String miljonNumber = "Miljon";
    }

    static void miljardNumber() {
        //000000000
        String miljardNumber = "Miljard";
    }
}
