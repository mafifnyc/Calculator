
import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {
@Test()
public void addTest(){
        String a = "2";
        String b = "2";
        int expectedValue = 4;
        int actualResult = Calculator.add(a, b);
        Assert.assertEquals(expectedValue, actualResult);
        }
@Test()
public void deductTest(){
        String a = "2";
        String b = "2";
        int expectedValue = 0;
        int actualResult  =  Calculator.deduct(a,b);
        Assert.assertEquals(expectedValue, actualResult);
        }
}
