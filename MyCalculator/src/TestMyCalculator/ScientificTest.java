package TestMyCalculator;

import static org.junit.Assert.*;
import ie.gcd.maths.ScientificCalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScientificTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		ScientificCalc c = new ScientificCalc();
		assertEquals(5,c.add(2, 3));
		//fail("Not yet implemented");
	}

}
