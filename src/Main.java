import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Do you want to run Tab or DataTypes or create a Student? (T/D/C)");
        Scanner scanner = new Scanner(System.in);
        //Wczytywanie znaku aby wybrac opcje
        char input = scanner.next().charAt(0);
        //Jesli wybrano opcje T to zostanie wykonany kod ponizej
        if (input == 'T' || input == 't')
        {
            Tab.main(args);
        }
        //Jesli wybrano opcje D to zostanie wykonany kod ponizej
        else if (input == 'D' || input == 'd')
        {
            DataTypes.main(args);
        }
        //Jesli wybrano opcje C to zostanie wykonany kod ponizej
        else if(input == 'C' || input == 'c')
        {
            //Tworzenie obiektu klasy Student
            Student student1 = new Student("Jan Kowalski", 20, "Computer Science", "WSB-NLU");
            Student student2 = new Student("Adam Nowak", 21, "Computer Science", "WSB-NLU");
            //Wywołanie metody display wyświetlającej dane studenta
            System.out.println("Student 1:");
            student1.display();
            //Wywolanie metody setFullName (setter) zmieniajacej imie i nazwisko studenta
            student1.setFullName("Zmienione Dane!!");
            student1.setAge(30);
            student1.setMajor("Zmieniony Kierunek!!");
            //Brak potrzeby tworzenia i wywoływania settera dla zmiennej publicznej
            student1.university = "Zmieniona Uczelnia!!";
            System.out.println("Student 1 po zmianie danych:");
            student1.display();

            System.out.println("Student 2:");
            student2.display();

            //Przypisanie wartosci do zmiennej za pomocą gettera
            String student2Name = student2.getFullName();
            int student2Age = student2.getAge();
            String student2Major = student2.getMajor();
            //Przypisanie wartosci publicznej zmiennej
            student2.university = "WSB-NLU";

            System.out.println("Student 2 name: " + student2Name + "\nUniversity: " + student2.university);
        }
        //Obslugiwanie blednego inputu
        else
        {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}