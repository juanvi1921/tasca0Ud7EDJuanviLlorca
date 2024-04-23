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

    @Test
    void testFizzBuzz4() {
        assertEquals("4", Fizzbuzz.fizzBuzzMetodo(4));
    }

    @Test
    void testFizzBuzz5() {
        assertEquals("Buzz", Fizzbuzz.fizzBuzzMetodo(5));
    }

    @Test
    void testFizzBuzz6() {
        assertEquals("Fizz", Fizzbuzz.fizzBuzzMetodo(6));
    }

    @Test
    void testFizzBuzz7() {
        assertEquals("7", Fizzbuzz.fizzBuzzMetodo(7));
    }

    @Test
    void testFizzBuzz8() {
        assertEquals("8", Fizzbuzz.fizzBuzzMetodo(8));
    }

    @Test
    void testFizzBuzz9() {
        assertEquals("Fizz", Fizzbuzz.fizzBuzzMetodo(9));
    }

    @Test
    void testFizzBuzz10() {
        assertEquals("Buzz", Fizzbuzz.fizzBuzzMetodo(10));
    }
}