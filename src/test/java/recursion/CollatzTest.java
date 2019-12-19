package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollatzTest {

    private Collatz collatz;

    @Before
    public void setup(){
        collatz = new Collatz();
    }

    @Test
    public void compute_returnOneGivenOne() {
        collatz.compute(1);
        assertEquals(1, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTime() {
        collatz.compute(2);
        assertEquals(2, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven3() {
        collatz.compute(3);
        assertEquals(8, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven4() {
        collatz.compute(4);
        assertEquals(3, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven5() {
        collatz.compute(5);
        assertEquals(6, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven101() {
        collatz.compute(101);
        assertEquals(26, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven1001() {
        collatz.compute(1001);
        assertEquals(143, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven10001() {
        collatz.compute(10001);
        assertEquals(180, collatz.getStoppingTime());
    }

    @Test
    public void compute_returnsCorrectNumberOfStoppingTimeGiven2147483647() {
        collatz.compute(1122107374);
        assertEquals(255, collatz.getStoppingTime());
    }
}