package com.hotelbooking;

public class Hotel {
    private String hotelName;
    private int rate;

    public Hotel(String hotelName, int rate) {
        this.hotelName = hotelName;
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
