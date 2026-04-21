import java.util.*;

interface Workable {
    void performDuty();
    String getInfo();
}

abstract class Person implements Workable {
    String name;
    int id;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void role();

    @Override
    public String getInfo() {
        return id + ": " + name;
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    @Override
    void role() {
        System.out.println(name + " is a Doctor");
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is treating patients in " + specialization);
    }
}

class Patient extends Person {
    String disease;

    Patient(int id, String name, String disease) {
        super(id, name);
        this.disease = disease;
    }

    @Override
    void role() {
        System.out.println(name + " is a Patient");
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is receiving treatment for " + disease);
    }
}

public class project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[10]; // Fixed array
        int count = 0;

        while (true) {
            System.out.println("1.Add Doctor");
            System.out.println("2.Add Patient");
            System.out.println("3.Show All");
            System.out.println("4.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt(); sc.nextLine();

            if (ch == 4) break;

            switch (ch) {
                case 1, 2 -> {
                    if (count >= people.length) {
                        System.out.println("Cannot add more people.");
                        continue;
                    }   System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print(ch == 1 ? "Specialization: " : "Disease: ");
                    String detail = sc.nextLine();
                    if (ch == 1) people[count++] = new Doctor(id, name, detail);
                    else people[count++] = new Patient(id, name, detail);
                }
                case 3 -> {
                    for (int i = 0; i < count; i++) {
                        people[i].role();
                        people[i].performDuty();
                        System.out.println(people[i].getInfo() + "\n");
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}