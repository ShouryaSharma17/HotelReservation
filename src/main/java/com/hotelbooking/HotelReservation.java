package com.hotelbooking;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    public List<Hotel> hotelList = new ArrayList<>();

    public void addHotelToHotelReservation(Hotel hotel) {
        hotelList.add(hotel);
    }

    public int findMinimumPrice() {
        int minPrice = hotelList.get(0).calculatePrice();
        for (Hotel hotel : hotelList) {
            int price = hotel.calculatePrice();
            if (price < minPrice)
                minPrice = price;
        }
        return minPrice;
    }

    public String findTheCheapestHotel() {
        for (Hotel hotel : hotelList) {
            if (findMinimumPrice() == hotel.calculatePrice())
                return hotel.getHotelName();
        }
        return null;
    }

    public void printWelcome() {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}