
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

        if(expectedValue == actualResult){
        System.out.println("Test Passed");
        }
        else if (expectedValue !=actualResult){
        System.out.println("Test Failed");
        }

        System.out.println("Oh Great Calculator App is working well...");
        }
@Test()
public void deductTest(){
        // Reassigning the value to the actual variable  after calling deduct()
        String a = "2";
        String b = "2";
        int expectedValue = -1;
        int actualResult  =  Calculator.deduct();

        if(expectedValue == actualResult){
        System.out.println("Test Passed");
        }
        else if (expectedValue !=actualResult){
        System.out.println("Test Failed");
        }
        }
}
