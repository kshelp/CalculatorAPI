package Pranodayd.CalculatorAPI;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestSubtractionFunctionality {
	
	Calculator cal;
	int result;
	
	@BeforeClass
	public void init() {
		cal = new Calculator();
	}
	
	//@BeforeMethod
	public void reInitialise() {
		result = 0;
	}
	
	//@Test(priority=1,groups= {"RegressionTest"})
	@Test
	public void TestSubtractionWithPositiveNumbers() {
		result = cal.subtraction(50, 10);
		//Assert.assertEquals(result, 40, "Subtraction does not work with Positive Numbers");
	}
	
	

}
