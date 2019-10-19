package org.pinkprogramming.javatesting.Basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTests {

    @Test
    @DisplayName("The vehicle should be affordable")
    void vehicleShouldBeAffordable() {
        int maxCost = 20;
        int fuel = 5;
        int hullRepairs = 9;

        assertTrue((fuel + hullRepairs) < maxCost);
    }

    @Test
    @DisplayName("Should end with a period.")
    void sentenceEndsWithAPeriod() {
        String example = "Hi, my name is Polly.";

        assertTrue(example.endsWith("."));
    }

}
