package se.iths.philip.numbertotext;

public class NumberToTextMain {
    public static void main(String[] args) {
        inputDigit();
    }

    public static void inputDigit() {
        int input = 1234;
        String result = Integer.toString(input);
        int inputLength = String.valueOf(input).length();
        System.out.println(result);
        System.out.println("Längden är " + inputLength);

        inputArray(input);
        /*int single = input % 10;
        int decimal = (input % 100) / 10;
        int centimal = input / 100;
        int millimal = input / 1000;
        //int miljon = input / 1000000;
        //int miljard = input / 1000000000;*/
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
        //0_000 - 00_000
        String millimalNumber = "Tusen";
    }

    static void miljonNumber() {
        //0_000_000 - 000_000_000
        String miljonNumber = "Miljon";
    }

    static void miljardNumber() {
        //0_000_000_000 - 000_000_000_000
        String miljardNumber = "Miljard";
    }
}
