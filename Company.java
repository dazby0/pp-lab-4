public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 4500.00);
        employees[1] = new Employee("Anna Nowak", 3800.00);
        employees[2] = new Employee("Piotr Zieliński", 5200.00);
        employees[3] = new Employee("Marta Wiśniewska", 4100.00);
        employees[4] = new Employee("Krzysztof Lewandowski", 4900.00);

        System.out.println("Employee data with index 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(5500.00);

        System.out.println("\nData of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
