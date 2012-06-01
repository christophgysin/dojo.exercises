package dojo.legacy;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;


public class FizzBuzzTest {
	
	@Test
	public void testZero()
	{
		try {
			new FizzBuzz().play(0, 1);
			fail();
		} catch(IllegalArgumentException e) {
			/* success(); */
		} catch(Exception e) {
			fail("wrong exception thrown:" + e.getClass().toString());
		}
	}
	@Test
	public void testNegative()
	{
		try {
			new FizzBuzz().play(-1, 1);
			fail();
		} catch(IllegalArgumentException e) {
			/* success(); */
		} catch(Exception e) {
			fail("wrong exception thrown:" + e.getClass().toString());
		}
	}
	@Test
	public void testFirstThree()
	{
		assertArrayEquals(new FizzBuzz().play(1, 3),
				new String[]{
					"1",
					"2",
					"Fizz"
					});
	}
	@Test
	public void testFirstFive()
	{
		assertArrayEquals(new FizzBuzz().play(1, 5),
				new String[]{
					"1",
					"2",
					"Fizz",
					"4",
					"Buzz"
					});
	}
	@Test
	public void testFirstFifteen()
	{
		assertArrayEquals(new FizzBuzz().play(1, 15),
				new String[]{
					"1",
					"2",
					"Fizz",
					"4",
					"Buzz",
					"Fizz",
					"7",
					"8",
					"Fizz",
					"Buzz",
					"11",
					"Fizz",
					"13",
					"14",
					"Fizzbuzz"
					});
	}
}