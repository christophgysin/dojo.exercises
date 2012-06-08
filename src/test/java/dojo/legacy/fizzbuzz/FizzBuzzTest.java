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
    public void testFirstSeven()
    {
        assertArrayEquals(fizzBuzz.play(1, 7),
                new String[]{
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
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
                    "3",
                    "4",
                    "5",
                    "6",
                    "Flipp",
                    "8",
                    "9",
                    "10",
                    "Flopp"
                    });
    }

    @Test
    public void testFirstSeventySeven()
    {
        assertArrayEquals(fizzBuzz.play(1, 77),
                new String[]{
                    "1", "2", "3", "4", "5", "6", "Flipp", "8", "9", "10", "Flopp",
                    "12", "13", "Flipp", "15", "16", "17", "18", "19", "20", "Flipp", "Flopp",
                    "23", "24", "25", "26", "27", "Flipp", "29", "30", "31", "32", "Flopp",
                    "34", "Flipp", "36", "37", "38", "39", "40", "41", "Flipp", "43", "Flopp",
                    "45", "46", "47", "48", "Flipp", "50", "51", "52", "53", "54", "Flopp",
                    "Flipp", "57", "58", "59", "60", "61", "62", "Flipp", "64", "65", "Flopp",
                    "67", "68", "69", "Flipp", "71", "72", "73", "74", "75", "76", "FlippFlopp"
                    });
    }
}
