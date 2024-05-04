import employees.*;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 4500.00, 0);
        employees[1] = new Worker("Anna Nowak", 3800.00, "Software Engineer");
        employees[2] = new Employee("Piotr Zieliński", 5200.00);
        employees[3] = new Employee("Marta Wiśniewska", 4100.00);
        employees[4] = new Worker("Krzysztof Lewandowski", 4900.00, "Data Analyst");

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
