import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTests {
    @Test
    public void test1() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void test2() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void test3() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void test4() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(8, stringCalculator.add("2,2,2,2"));
    }

    @Test
    public void test5() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void test6() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("1\n2\n3\n4"));
    }

    @Test
    public void test7() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    public void throwsException() {
        StringCalculator stringCalculator = new StringCalculator();

        NegativeNumberException exception = assertThrows(NegativeNumberException.class, () -> {
            stringCalculator.add("-5, 2, 3, 4, -8, 10");
        });

        assertEquals("Negatives not allowed: -5 -8 ", exception.getMessage());
    }

}
