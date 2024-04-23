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
}