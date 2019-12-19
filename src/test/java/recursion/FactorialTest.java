package recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void compute_returnsOneWhenComputeIsOne() {
        assertEquals(1, factorial.compute(1));
    }

    @Test
    public void compute_returnsTwoWhenGivenTwo() {
        assertEquals(2, factorial.compute(2));
    }

    @Test
    public void compute_returns6WhenGiven3() {
        assertEquals(6, factorial.compute(3));
    }

    @Test
    public void compute_returns24WhenGiven4() {
        assertEquals(24, factorial.compute(4));
    }

    @Test
    public void compute_returnsWhenGiven10() {
        assertEquals(2004310016, factorial.compute(15));
    }
}