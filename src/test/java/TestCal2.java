import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCal2 {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(3, 4), 7);
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(4, 3), 1);
    }
}
