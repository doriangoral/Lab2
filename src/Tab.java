import java.util.Arrays;
public class Tab {
    public static void main(String[] args)
    {
        //Deklaracja tablicy intArray i przypisanie jej wartości, i deklaracja tablicy intArray2 i przypisanie jej wartości
        int[] intArray = {11,12,13,14,15};
        int[] intArray2 = {1,2,3,4,5};

        //Znajdowanie największej wartości w tablicy intArray za pomocą metody max()
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("Max of intArray: " + max);

        //Znajdowanie najmniejszej wartości w tablicy intArray za pomocą metody min()
        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println("Min of intArray: " + min);

        //Zamiana tabeli intArray na strumień za pomocą metody Arrays.stream(), a następnie suma jego elementów za pomocą metody sum()
        int sum = Arrays.stream(intArray).sum();
        System.out.println("Sum of intArray: " + sum);

        //Zamiana tabeli intArray2 na strumień za pomocą metody Arrays.stream(), a następnie suma jego elementów za pomocą metody sum()
        int sum2 = Arrays.stream(intArray2).sum();
        System.out.println("Sum of intArray2: " + sum2);

        //Średnia z elementów tablicy intArray za pomocą wcześniej wykorzystanej metody sum() i metody zwracającej długość tablicy
        int average = Arrays.stream(intArray).sum() / intArray.length;
        System.out.println("Average of intArray: " + average);

        //Kopia tablicy intArray za pomocą metody copyOf()
        printTable(intArray);
        int[] IntArray3 = Arrays.copyOf(intArray, intArray.length);
        printTable(IntArray3);

        //Znajdowanie elementow spelaniajacych warunek w tablicy intArray za pomocą metody filter()
        int value = 2;
        int[] filteredIntArray = Arrays.stream(intArray2).filter(x -> x > value).toArray();
        printTable(filteredIntArray);

        //Usuwanie elementu wskazanego przez uzytkownika i tworzenie nowej tablicy bez tego elementu
        int[] intArray4 = {1,2,3,4,5};
        System.out.println("What value do you want to remove from the following array? ");
        printTable(intArray4);
        //wartość do usunięcia
        int valueToRemove = 3;
        System.out.println("Removing " + valueToRemove + " from the array");
        //Filtrowanie strumienia i zapisanie wyniku w nowej tablicy
        int[] deletedIntArray = Arrays.stream(intArray4).filter(x -> x != valueToRemove).toArray();
        printTable(deletedIntArray);

        //Połączenie dwóch tablic intArray i intArray2 za pomocą metody concat() i zapisanie wyniku w nowej tablicy
        //utworzenie nowej tablicy o długości sumy długości obu tablic
        int[] combinedIntArray = new int[intArray.length + intArray2.length];
        //Kopia elementow z tablic intArray i intArray2 do nowej tablicy
        System.arraycopy(intArray, 0, combinedIntArray, 0, intArray.length);
        System.arraycopy(intArray2, 0, combinedIntArray, intArray.length, intArray2.length);
        System.out.println("Combined intArray and intArray2: ");
        printTable(combinedIntArray);

        //Krótsze rozwiązanie łączenia dwóch tablic, przy tworzeniu nowej tablicy od razu kopiujemy elementy z pierwszej tablicy i deklarujemy jej długość jako sumę długości obu tablic
        int[] combinedIntArray2 = Arrays.copyOf(intArray, intArray.length + intArray2.length);
        //Kopia pozostalych elementow z intArray2
        System.arraycopy(intArray2, 0, combinedIntArray2, intArray.length, intArray2.length);
        System.out.println("Combined intArray and intArray2 using shorter method: ");
        printTable(combinedIntArray2);

        //Znajdywanie liczby wystąpień elementu w tablicy za pomocą metody filter() i metody count() zwracającej liczbę elementów w przefiltrowanym wcześniej strumieniu
        int[] intArray5 = {1,2,3,4,5,1,2,3,4,5,2};
        //Wartość do znalezienia
        int valueToFind = 2;
        System.out.println("Finding number of occurrences of " + valueToFind + " in the following array: ");
        printTable(intArray5);
        //Filtrowanie strumienia i zliczanie elementów
        int numberOfOccurrences = (int) Arrays.stream(intArray5).filter(x -> x == valueToFind).count();
        System.out.println("Number of occurrences of " + valueToFind + " in array: " + numberOfOccurrences);
    }
    //Metoda do wyświetlania tablicy za pomocą pętli "for each"
    public static void printTable(int[] table) {
        for (int j : table) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
