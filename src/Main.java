import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int integer;
        double floating;
        char character;
        boolean bool;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        integer = scanner.nextInt();
        System.out.print("Enter a floating point number: ");
        floating = scanner.nextDouble();
        System.out.print("Enter a character: ");
        character = scanner.next().charAt(0);
        System.out.print("Enter a boolean: ");
        bool = scanner.nextBoolean();

        //convert double to integer
        int doubleToInteger = (int) floating;
        //convert integer to double
        double integerToDouble = integer;
        //convert character to integer
        int characterToInt = Character.getNumericValue(character);
        //convert boolean to string
        String boolToString = String.valueOf(bool);

        System.out.println("doubleToInteger: " + doubleToInteger);
        System.out.println("integerToDouble: " + integerToDouble);
        System.out.println("characterToInt: " + characterToInt);
        System.out.println("boolToString: " + boolToString);
        }

}