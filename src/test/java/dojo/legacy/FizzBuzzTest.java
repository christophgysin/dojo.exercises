package dojo.legacy;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;


public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp()
    {
        fizzBuzz = new FizzBuzz();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testStartIsZero()
    {
        fizzBuzz.play(0, 1);
        fail();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testStopIsSmallerThanStart()
    {
        fizzBuzz.play(1, 0);
        fail();
    }

    @Test
    public void testFirstThree()
    {
        assertArrayEquals(fizzBuzz.play(1, 3),
                new String[]{
                    "1",
                    "2",
                    "Fizz"
                    });
    }

    @Test
    public void testFirstFive()
    {
        assertArrayEquals(fizzBuzz.play(1, 5),
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
        assertArrayEquals(fizzBuzz.play(1, 15),
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
