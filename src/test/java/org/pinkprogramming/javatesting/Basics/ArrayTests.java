package org.pinkprogramming.javatesting.Basics;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayTests {

    List<String> helloWords;

    @BeforeEach
    void setup() {
        helloWords = List.of("hej", "hallå", "tjena", "tja", "hejsan");
    }

    @Test
    @DisplayName("Should be a common Swedish greeting.")
    void shouldContainACommonSwedishGreeting() {
        assertTrue(helloWords.contains("hej"));
        assertTrue(helloWords.contains("hejsan"));
    }

    @Test
    @DisplayName("Should not be an english greeting.")
    void shouldNotContainAnEnglishGreeting() {
        assertFalse(helloWords.contains("hello"));
    }

    @Test
    @DisplayName("Should not be a goodbye greeting.")
    void shouldNotContainAGoodbyeGreeting() {
        assertFalse(helloWords.contains("hejdå"));
    }

}
