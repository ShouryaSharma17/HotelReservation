package com.hotelbooking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelsWhenAddedShouldReturnTheCheapestBestRatedHotel() {
        Hotel firstHotel = new Hotel("Lakewood", 110, 90, 3, "11Sep2020", "12Sep2020");
        Hotel secondHotel = new Hotel("Bridgewood", 150, 50, 4, "11Sep2020", "12Sep2020");
        Hotel thirdHotel = new Hotel("Ridgewood", 220, 150, 5, "11Sep2020", "12Sep2020");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelToHotelReservation(firstHotel);
        hotelReservation.addHotelToHotelReservation(secondHotel);
        hotelReservation.addHotelToHotelReservation(thirdHotel);
        String hotelName = hotelReservation.findTheCheapestBestRatedHotel();
        Assert.assertEquals("Bridgewood", hotelName);
    }


    @Test
    public void givenHotelsWhenAddedShouldReturnTheBestRatedHotel() {
        Hotel firstHotel = new Hotel("Lakewood", 110, 90, 3, "11Sep2020", "12Sep2020");
        Hotel secondHotel = new Hotel("Bridgewood", 150, 50, 4, "11Sep2020", "12Sep2020");
        Hotel thirdHotel = new Hotel("Ridgewood", 220, 150, 5, "11Sep2020", "12Sep2020");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelToHotelReservation(firstHotel);
        hotelReservation.addHotelToHotelReservation(secondHotel);
        hotelReservation.addHotelToHotelReservation(thirdHotel);
        String hotelName = hotelReservation.findBestRatedHotel();
        Assert.assertEquals("Ridgewood", hotelName);
    }
}
