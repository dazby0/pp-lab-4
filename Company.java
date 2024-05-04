import employees.*;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Kowalski", 4500.00, 0);
        employees[1] = new Worker("Anna Nowak", 3800.00, "Software Engineer");
        employees[2] = new Employee("Piotr Zieliński", 5200.00);
        employees[3] = new Employee("Marta Wiśniewska", 4100.00);
        employees[4] = new Worker("Krzysztof Lewandowski", 4900.00, "Data Analyst"); 
        employees[5] = new Manager("Katarzyna Sikora", 6000.00, 0);
        employees[6] = new Worker("Grzegorz Dąbrowski", 4300.00, "Web Developer");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
        }

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        for (Employee employee : employees) { 
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(nonManagerCount);
                ((Manager) employee).setSalary(7500.00);
            }
        }

        System.out.println("\nData of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}