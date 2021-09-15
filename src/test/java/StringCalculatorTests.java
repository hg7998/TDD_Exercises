import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTests {
    @Test
    public void test1() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void test2() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void test3() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void test4() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(8, stringCalculator.add("2,2,2,2"));
    }

    @Test
    public void test5() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void test6() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("1\n2\n3\n4"));
    }

    @Test
    public void test7() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

}
