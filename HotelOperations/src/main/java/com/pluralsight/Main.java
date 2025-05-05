package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Test Room
        Room r1 = new Room(2, 100, false, false);
        System.out.println("Room is: " + (r1.isAvailable() ? "available" : "not available"));

        //Test Reservation
        Reservation res1 = new Reservation("king", 2, true);
        System.out.printf("Your total: $%.2f \n", res1.getReservationTotal());

        //Test Employee
        Employee em1 = new Employee(4672, "Vika", "Manager", 24, 54);
        System.out.printf("Your salary: $%.2f", em1.getTotalPay());
    }
}
