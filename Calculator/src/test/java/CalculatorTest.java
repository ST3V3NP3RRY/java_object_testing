import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(10, 6, 20.0, 5.0);
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(16, calculator.addNumbers());
    }

    @Test
    public void subtractTwoNumbers() {
        assertEquals(4, calculator.subtractNumbers());
    }

    @Test
    public void multiplyTwoNumbers() {
        assertEquals(60, calculator.multiplyNumbers());
    }

    @Test
    public void divideTwoNumbers() {
        assertEquals(4.0, calculator.divideNumbers(), 0.0);
    }

}
