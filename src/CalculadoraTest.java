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
}