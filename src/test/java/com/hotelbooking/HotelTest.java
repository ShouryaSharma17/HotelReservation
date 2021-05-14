package com.hotelbooking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelTest {
    @Test
    public void givenLakewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Lakewood", 110, 90);
        boolean result = (hotel.getWeekdayRate() == 110) && (hotel.getWeekendRate() == 90);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBridgewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Bridgewood", 150, 50);
        boolean result = (hotel.getWeekdayRate() == 150) && (hotel.getWeekendRate() == 50);
        Assert.assertTrue(result);
    }

    @Test
    public void givenRidgewoodRateDetailsWhenAddedShouldReturnTrue() {
        Hotel hotel = new Hotel("Ridgewood", 220, 150);
        boolean result = (hotel.getWeekdayRate() == 220) && (hotel.getWeekendRate() == 150);
        Assert.assertTrue(result);
    }
}
