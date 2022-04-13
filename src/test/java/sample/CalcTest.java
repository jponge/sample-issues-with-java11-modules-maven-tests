package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testAdd() {
        assertEquals(5, Calc.add(2, 3));
    }
}