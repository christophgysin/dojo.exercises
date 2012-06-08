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

            String s = "";

            if (!isFizz(value) && !isBuzz(value) && !isFlipp(value) && !isFlopp(value)) {
                s = Integer.toString(value);
            } else {
                if (isFizz(value)) {
                    s += "Fizz";
                }
                if (isBuzz(value)) {
                    s += "Buzz";
                }
                if (isFlipp(value)) {
                    s += "Flipp";
                }
                if (isFlopp(value)) {
                    s += "Flopp";
                }
            }
            values.add(s);
        }
        return values;
    }

    private boolean isFizz(int value) {
        return value % 3 == 0;
    }

    private boolean isBuzz(int value) {
        return value % 5 == 0;
    }

    private boolean isFlipp(int value) {
        return value % 7 == 0;
    }

    private boolean isFlopp(int value) {
        return value % 11 == 0;
    }

    private boolean argumentsValid(int start, int stop) {
        return start > 0 && start < stop;
    }
}