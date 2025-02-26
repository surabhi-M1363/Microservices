package com.wipro.java.microservices.solid.s;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        SalaryCaluclator calculator = new SalaryCaluclator();

        List<Employee> employees = repository.getEmployees();
        int[] extraHoursWorked = {5, 8, 2, 10, 6};

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            int extraHours = extraHoursWorked[i];
            double totalSalary = calculator.calculateTotalSalary(emp, extraHours);

            System.out.println("\nEmployee: " + emp.getName());
            System.out.println("Base Salary: " + emp.getSalary());
            System.out.println("Extra Hours Worked: " + extraHours);
            System.out.println("Total Salary (Including Extra Hours): " + totalSalary);
        } // Corrected: Regular space here
    } // Corrected: Regular space here
}