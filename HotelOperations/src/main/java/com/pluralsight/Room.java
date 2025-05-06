package com.pluralsight;

public class Room {
    int numberOfBeds;
    float price;
    boolean occupied;
    boolean dirty;

    public Room(int numberOfBeds, float price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;

    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("This room is not available");
        } else {
            occupied = false;
            dirty = false;
            System.out.println("This room is available");
        }
    }

    public void checkOut() {
        if (!occupied && !dirty) {
            System.out.println("Room is ready to be checked in");
        } else if (!occupied && dirty) {
            System.out.println("Need housekeeper's service");
        }

    }

    public void cleanroom() {
        if (!dirty) {
            System.out.println("Room is cleaned");
        } else {
            dirty = true;
            System.out.println("Need to be cleaned");

        }
    }
}

