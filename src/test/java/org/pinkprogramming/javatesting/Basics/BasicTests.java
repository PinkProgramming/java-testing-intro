package org.pinkprogramming.javatesting.Basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.pinkprogramming.javatesting.util.SentenceUtil;

public class BasicTests {

    // Test 1. Numerical comparisons
    @Test
    @DisplayName("The vehicle should be affordable")
    void vehicleShouldBeAffordable() {
        int maxCost = 20;
        int fuel = 5;
        int hullRepairs = 9;

        assertTrue((fuel + hullRepairs) < maxCost);
    }

    // Test 2. String comparisons
    @Test
    @DisplayName("Should end with a period.")
    void sentenceEndsWithAPeriod() {
        String example = "Hi, my name is Polly.";

        assertTrue(example.endsWith("."));
    }

    // Test 2 b. Revisit test2
    // this time testing a method
    // that accepts a string and returns last character
    @Test
    @DisplayName("Method should return true when sentence ends with period")
    void shouldReturnTrueWhenSentenceEndsWithPeriod() {
        String example = "Hi, my name is Polly.";
        assertTrue(SentenceUtil.isEndWithPeriodString(example));
    }

    @Test
    @DisplayName("Method should return false when sentence does not end with period")
    void shouldReturnFalseWhenSentenceDoesNotEndWithPeriod() {
        String example = "Hi";
        assertTrue(SentenceUtil.isEndWithPeriodString(example));
    }

}
