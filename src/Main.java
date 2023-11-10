import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Do you want to run Tab or DataTypes?");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        if (input == 'T' || input == 't')
        {
            Tab.main(args);
        }
        else if (input == 'D' || input == 'd')
        {
            DataTypes.main(args);
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}