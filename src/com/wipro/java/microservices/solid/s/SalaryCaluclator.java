package com.wipro.java.microservices.solid.s;

public class SalaryCaluclator {
    private static final double HOURLY_RATE = 500;

    public double calculateTotalSalary(Employee employee, int extraHours) {
        double extraPay = extraHours * HOURLY_RATE;
        return employee.getSalary() + extraPay; // Corrected: Regular space here
    }
}