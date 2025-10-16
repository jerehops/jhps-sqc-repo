package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  void testGreet() {
    String result = Main.greet("Alice");
    assertEquals("Hello, Alice!", result);
  }

  @Test
  void testGoodbye() {
    String result = Main.goodbye("Jeremy");
    assertEquals("Goodbye, Jeremy!", result);
  }

  @Test
  void testhelloworld() {
    String result = Main.helloworld("Jeremy");
    assertEquals("helloworld, Jeremy!", result);
  }

  @Test
  void testsomerandomfunction() {
    String result = Main.somerandomfunction("Jeremy");
    assertEquals("random, Jeremy!", result);
  }
}
