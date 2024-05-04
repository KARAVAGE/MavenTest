package badia;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 7;
        int expectedSum = 12;

        int actualSum = AddTwoNumbers.add(num1, num2);

        assertEquals(expectedSum, actualSum, "Sum of " + num1 + " and " + num2 + " should be " + expectedSum);
    }
}
