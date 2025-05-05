
package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    float payRate;
    float hoursWorked;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public float getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5f;

    }

    public float getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public float getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

}

