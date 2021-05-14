package com.hotelbooking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelTest {
    @Test
    public void givenLakewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Lakewood", 110);
        boolean result = (hotel.getRate() == 110);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBridgewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Bridgewood", 160);
        boolean result = (hotel.getRate() == 160);
        Assert.assertTrue(result);
    }

    @Test
    public void givenRidgewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Ridgewood", 220);
        boolean result = (hotel.getRate() == 220);
        Assert.assertTrue(result);
    }
}
