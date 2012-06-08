package dojo.legacy.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String[] play(int start, int stop) {

        if (argumentsValid(start, stop)) {
            List<String> values = calculateValues(start, stop);
            return values.toArray(new String[values.size()]);
        } else {
            throw new IllegalArgumentException();
        }
     }

    private List<String> calculateValues(int start, int stop) {
        
        int length = stop - start + 1;
        List<String> values = new ArrayList<String>(length);

        for (int value = start; value <= stop; value++) {

            if (isFizzBuzz(value)) {
                values.add("Fizzbuzz");
            } else if (isFizz(value)) {
                values.add("Fizz");
            } else if (isBuzz(value)) {
                values.add("Buzz");
            } else {
                values.add(Integer.toString(value));
            }
        }
        return values;
    }

    private boolean isFizz(int value) {
        return value % 3 == 0;
    }

    private boolean isBuzz(int value) {
        return value % 5 == 0;
    }

    private boolean isFizzBuzz(int value) {
        return isFizz(value) && isBuzz(value);
    }

    private boolean argumentsValid(int start, int stop) {
        return start > 0 && start < stop;
    }
}