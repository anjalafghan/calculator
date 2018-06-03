package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class calculationsTest {
    private float a = 10, b = 15, c,d ;
    @Test
    public void add() {
        a = a + b;
        assertEquals(a, 25.0,0.3);
    }

    @Test
    public void sub() {
        c = a - b;
        d = b -a;
        assertEquals(c, -5.0,0.3);
        assertEquals(d,5.0,0.3);
    }

    @Test
    public void div() {
        a = a / b;
        assertEquals(a, 0.66,0.3);
    }

    @Test
    public void mul() {
        a = a * b;
        assertEquals(a, 150.0,0.3);
    }
}