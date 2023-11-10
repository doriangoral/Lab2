import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        //Deklaracja zmiennych
        int integer;
        double floating;
        char character;
        boolean bool;

        //Wczytywanie danych
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        //Int
        integer = scanner.nextInt();
        System.out.print("Enter a floating point number: ");
        //zmienno przecinkowa
        floating = scanner.nextDouble();
        System.out.print("Enter a character: ");
        //znak
        character = scanner.next().charAt(0);
        System.out.print("Enter a boolean: ");
        //boolean
        bool = scanner.nextBoolean();

        //Konwersja double na integer
        int doubleToInteger = (int) floating;
        //Konwersja integer na double
        double integerToDouble = integer;
        //Konwersja character na integer
        int characterToInt = Character.getNumericValue(character);
        //Konwersja boolean na String
        String boolToString = String.valueOf(bool);

        //Wyswietlanie danych
        System.out.println("doubleToInteger: " + doubleToInteger);
        System.out.println("integerToDouble: " + integerToDouble);
        System.out.println("characterToInt: " + characterToInt);
        System.out.println("boolToString: " + boolToString);
    }
}
