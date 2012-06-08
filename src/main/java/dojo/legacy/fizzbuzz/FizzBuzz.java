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

            if (isFlippFlopp(value)) {
                values.add("FlippFlopp");
            } else if (isFlipp(value)) {
                values.add("Flipp");
            } else if (isFlopp(value)) {
                values.add("Flopp");
            } else {
                values.add(Integer.toString(value));
            }
        }
        return values;
    }

    private boolean isFlipp(int value) {
        return value % 7 == 0;
    }

    private boolean isFlopp(int value) {
        return value % 11 == 0;
    }

    private boolean isFlippFlopp(int value) {
        return isFlipp(value) && isFlopp(value);
    }

    private boolean argumentsValid(int start, int stop) {
        return start > 0 && start < stop;
    }
}