package com.pluralsight;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        em1.punchIn();
        Thread.sleep(2000);
        em1.punchOut();

        System.out.printf("Your salary: $%.2f\n", em1.getTotalPay());

        //Test Hotel
      Hotel h1 = new Hotel("Hotel", 15, 45);
        System.out.println(" ");
        System.out.println("Available suites: " + h1.getAvailableSuites());
        System.out.println("Available rooms: " + h1.getAvailableRooms());

        System.out.println(" ");

        boolean booked = h1.bookRoom(4,true);
        System.out.println("Number of rooms that you want to book: " + h1.getBookedSuites() + " , operation is: " + (booked? "successful" : "not successful"));
        booked = h1.bookRoom(3,false);
        System.out.println("Number of rooms: " + h1.getBookedBasicRooms() + " , operation is: " + (booked? "successful" : "not successful"));

        System.out.println(" ");

        System.out.println("Suites left: "+ h1.getAvailableSuites());
        System.out.println("Basic rooms left: " + h1.getAvailableRooms());
    }
}
