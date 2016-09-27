import java.util.ArrayList;

/**
 * Created by Brice on 9/27/16.
 */
public class FibNumberSolver {

//    long trackerNumber = 0;
//    long[] myFibNumbers;

    /*
    public long getFib(long fibSequenceNumber) {
        trackerNumber++;

        if (fibSequenceNumber == 0 || fibSequenceNumber == 1) {
            return fibSequenceNumber;
        }

        return getFib(fibSequenceNumber - 1) + getFib(fibSequenceNumber - 2);
    } */

    public long getFib(long fibSequenceNumber) {
        return fastFib(0, 1, fibSequenceNumber);
    }

    public long fastFib(long firstFib, long secondFib, long fibTracker) {
        if (fibTracker == 1) {
            return secondFib;
        }

        long currentFibNumber = firstFib + secondFib;
        fibTracker--;
        return fastFib(secondFib, currentFibNumber, fibTracker);
    }
}
