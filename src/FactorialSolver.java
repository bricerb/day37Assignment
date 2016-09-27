/**
 * Created by Brice on 9/27/16.
 */
public class FactorialSolver {

    public long factorialMath(long numberToFactor) {

        long initialNumber = numberToFactor;

        if (numberToFactor == 1) {
            return numberToFactor;
        }
        return numberToFactor*(factorialMath((initialNumber-1)));
    }

}
