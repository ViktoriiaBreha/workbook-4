
package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    float payRate;
    float hoursWorked;
    double punchInTime;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = 0;
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

    public void punchIn(double time) {
        punchInTime = time;
        System.out.println(name + " started at: " + punchInTime);
    }

    public void punchOut(double time) {
        double hoursWor = time - punchInTime;
        hoursWorked += hoursWor;
        System.out.printf("Employee: %s finished at: %.2f and worked: %.2f hours\n", name, time, hoursWor);


    }

}



