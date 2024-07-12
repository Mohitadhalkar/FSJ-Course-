import java.util.Scanner;

public class P71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store employee information
        String employeeName;
        double basicSalary;
        double deductions;

        // Prompt user for employee name and basic salary
        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextDouble();

        System.out.print("Enter total deductions: ");
        deductions = scanner.nextDouble();

        // Calculate gross and net salary
        double grossSalary = basicSalary; // Assuming gross salary is the same as basic for simplicity
        double netSalary = grossSalary - deductions;

        // Display employee information
        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Deductions: " + deductions);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

       
    }
}
