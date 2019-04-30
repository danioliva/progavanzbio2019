package omg.uma.pab19.factorial;

public class Factorial {


    /**
    *
     *
    */

    public double compute(int number) {
        double result;

        if (number < 0) {
            throw new RuntimeException("Number is negative: " + number);
        } else if ((number == 0) || (number == 1)) {
            result = 1;
        } else if (number == 2) {
            result = 2;
        } else if (number == 3) {
            result = 6;
        } else {
            result = number * compute(number - 1);
        }

        return result;
    }
}
