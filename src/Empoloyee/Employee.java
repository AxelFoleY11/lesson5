package Empoloyee;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;


    Employee(int id2, String surname2, int age2, double salary2, String departament2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;


    }

    double uvilichenieZP() {
        salary *= 2;
        return salary;
    }


    }


class EmployeeTest {
    public static void main(String[] args) {
        Employee t = new Employee(1, "Beglov" ,30, 35000, "IT");
        Employee v = new Employee(2, "Vetrov", 35, 75000, "HR");

        t.uvilichenieZP();
        System.out.println("ZP Rabotnika" + t.surname + ": " + t.salary);


        double newSalary = t.uvilichenieZP();
        System.out.println("ZP Rabotnika" + v.surname + ": " + newSalary);


    }
}



