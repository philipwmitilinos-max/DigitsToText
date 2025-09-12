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
        System.out.println(" ");
        divedInput(input);
    }

    public static void divedInput(int input) {
        int single = input % 10;
        int decimal = (input % 100) / 10;
        int centimal = input / 100;
        int millimal = input / 1000;
        int miljon = input / 1000000;
        int miljard = input / 1000000000;
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
