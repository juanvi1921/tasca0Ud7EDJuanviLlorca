import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    @Test
    void testFizzbuzz1() {
        assertEquals("1", Fizzbuzz.fizzBuzzMetodo(1));
    }

    @Test
    void testFizzBuzz2() {
        assertEquals("2", Fizzbuzz.fizzBuzzMetodo(2));
    }

    @Test
    void testFizzBuzz3() {
        assertEquals("Fizz", Fizzbuzz.fizzBuzzMetodo(3));
    }

}