package dojo.legacy.fizzbuzz;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

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
    }

    @Test(expected=IllegalArgumentException.class)
    public void testStopIsSmallerThanStart()
    {
        fizzBuzz.play(1, 0);
    }

    @Test
    public void testFirstTwo()
    {
        assertArrayEquals(fizzBuzz.play(1, 2),
                new String[]{
                    "1",
                    "2"
                    });
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
    public void testFirstSeven()
    {
        assertArrayEquals(fizzBuzz.play(1, 7),
                new String[]{
                    "1",
                    "2",
                    "Fizz",
                    "4",
                    "Buzz",
                    "Fizz",
                    "Flipp"
                    });
    }

    @Test
    public void testFirstEleven()
    {
        assertArrayEquals(fizzBuzz.play(1, 11),
                new String[]{
                    "1",
                    "2",
                    "Fizz",
                    "4",
                    "Buzz",
                    "Fizz",
                    "Flipp",
                    "8",
                    "Fizz",
                    "Buzz",
                    "Flopp"
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
                    "Flipp",
                    "8",
                    "Fizz",
                    "Buzz",
                    "Flopp",
                    "Fizz",
                    "13",
                    "Flipp",
                    "FizzBuzz"
                    });
    }

    @Test
    public void testFirstSeventySeven()
    {
        assertArrayEquals(fizzBuzz.play(1, 77),
                new String[]{
                    "1", "2", "Fizz", "4", "Buzz", "Fizz", "Flipp", "8", "Fizz", "Buzz", "Flopp",
                    "Fizz", "13", "Flipp", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "FizzFlipp", "Flopp",
                    "23", "Fizz", "Buzz", "26", "Fizz", "Flipp", "29", "FizzBuzz", "31", "32", "FizzFlopp",
                    "34", "BuzzFlipp", "Fizz", "37", "38", "Fizz", "Buzz", "41", "FizzFlipp", "43", "Flopp",
                    "FizzBuzz", "46", "47", "Fizz", "Flipp", "Buzz", "Fizz", "52", "53", "Fizz", "BuzzFlopp",
                    "Flipp", "Fizz", "58", "59", "FizzBuzz", "61", "62", "FizzFlipp", "64", "Buzz", "FizzFlopp",
                    "67", "68", "Fizz", "BuzzFlipp", "71", "Fizz", "73", "74", "FizzBuzz", "76", "FlippFlopp"
                    });
    }

    @Test
    public void testFizzBuzzFlippFlopp()
    {
        assertArrayEquals(fizzBuzz.play(1150 , 1160),
                new String[]{
                    "Buzz",
                    "1151",
                    "Fizz",
                    "1153",
                    "1154",
                    "FizzBuzzFlippFlopp",
                    "1156",
                    "1157",
                    "Fizz",
                    "1159",
                    "Buzz"
                    });
    }

}
