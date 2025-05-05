package com.pluralsight;

public class Reservation {
    String roomType;
    int numberOfNights;
    boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public float getPrice() {
        float origPrice = 0;
        if (roomType.equalsIgnoreCase("king")) {
            origPrice = 139f;
        } else {
            origPrice = 124f;
        }
        if (weekend) {
            origPrice = origPrice * 1.10f;
        }
        return origPrice;

    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public float getReservationTotal() {
        return getPrice() * getNumberOfNights();
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
