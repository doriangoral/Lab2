public class Student {
    //Deklaracja zmiennych prywatnych (nie mozna ich zmienic z innych klas
    private String fullName;
    private int age;
    private String major;

    //Deklaracja zmiennej publicznej (mozna ja zmienic z innych klas)
    public String university;

    public Student(String fullName, int age, String major, String university)
    {
        this.fullName = fullName;
        this.age = age;
        this.major = major;
        this.university = university;
    }

    //Metoda wyswietlajaca dane studenta
    public void display()
    {
        System.out.println("Full Name : " + fullName);
        System.out.println("Age : " + age);
        System.out.println("Major : " + major);
        System.out.println("University : " + university);
        System.out.println();
    }

    //Metoda (getter) zwracajaca tylko imie i nazwisko
    public String getFullName()
    {
        return fullName;
    }
    public int getAge()
    {
        return age;
    }
    public String getMajor()
    {
        return major;
    }
    //Metoda (setter) ustawiajaca imie i nazwisko
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
}
