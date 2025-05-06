package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Test Room
        Room r1 = new Room(2, 100, false, false);
        System.out.println("Room: ");
        r1.checkIn();
        r1.checkOut();
        r1.cleanroom();

        System.out.println(" ");

        //Test Reservation
        Reservation res1 = new Reservation("king", 2, true);
        System.out.printf("Your total: $%.2f \n", res1.getReservationTotal());

        System.out.println(" ");

        //Test Employee
        Employee em1 = new Employee(4672, "Vika", "Manager", 24, 0);
        em1.punchIn(8.0);
        em1.punchOut(19.0);
        System.out.printf("Your salary: $%.2f", em1.getTotalPay());
    }
}
