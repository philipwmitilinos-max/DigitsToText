package se.iths.philip.numbertotext;

public class NameOfDigit {
    private int nameOfDigit;

    public static void numberZero() {
        //0
        String numberZero = "Noll";
    }

    public static void singelNumber() {
        //0
        String[] singleNumber = {"Ett", "Tre", "Fyra", "Fem", "Sex", "Sju", "Åtta", "Nio"};
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

    public static void miljardNumber() {
        //0_000_000_000 - 000_000_000_000
        String miljardNumber = "Miljard";
    }
}
