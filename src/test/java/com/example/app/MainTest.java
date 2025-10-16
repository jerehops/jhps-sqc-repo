package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testGreet() {
        String result = Main.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }
}
