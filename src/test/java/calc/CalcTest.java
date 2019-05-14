package calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class CalcTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}
