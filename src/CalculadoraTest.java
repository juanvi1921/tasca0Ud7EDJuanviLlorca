import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void calculadoraTest1() {
        assertEquals(0, Calculadora.suma(""));
    }

    @Test
    void calculadoraTest2() {
        assertEquals(1, Calculadora.suma("1"));
    }

    @Test
    void calculadoraTest3() {
        assertEquals(3, Calculadora.suma("1,2"));
    }

    @Test
    void calculadoraTest4() {
        assertEquals(4, Calculadora.suma("1,1,2"));
    }

    @Test
    void calculadoraTest5() {
        assertEquals(-1, Calculadora.suma("1,2,"));
    }

    @Test
    void calculadoraTest6() {
        assertEquals(-1, Calculadora.suma("1,2,-2"));
    }

    @Test
    void calculadoraTest7() {
        assertEquals(5, Calculadora.suma("5,1002"));
    }
}