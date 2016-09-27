import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brice on 9/27/16.
 */
public class SortingRunnerTest {
//    BaseSorter sortingRunner = new BubbleSorter();
    BaseSorter sortingRunner = new SelectionSorter();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }

    private void assert2ElementOrder(int[] numArray) {
        assertEquals(6, numArray[0]);
        assertEquals(99, numArray[1]);
    }

    private void assert4ElementOrder(int[] numArray) {
        assertEquals(-2, numArray[0]);
        assertEquals(0, numArray[1]);
        assertEquals(12, numArray[2]);
        assertEquals(20, numArray[3]);
    }

    public void assert6ElementOrder(int[] numArray) {
        assertEquals(-10, numArray[0]);
        assertEquals(5, numArray[1]);
        assertEquals(17, numArray[2]);
        assertEquals(17, numArray[3]);
        assertEquals(20, numArray[4]);
        assertEquals(26, numArray[5]);
    }


    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        sortingRunner.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        sortingRunner.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        sortingRunner.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        sortingRunner.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        sortingRunner.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        sortingRunner.sort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);
    }

    @Test
    public void bubbleSort2ElementArray() throws Exception {
        int[] orderedArray = {6, 99};
        sortingRunner.sort(orderedArray);
        assert2ElementOrder(orderedArray);

        int[] scrambledArray = {99, 6};
        sortingRunner.sort(scrambledArray);
        assert2ElementOrder(scrambledArray);
    }

    @Test
    public void bubbleSort4ElementArray() throws Exception {
        int[] orderedArray = {-2, 0 ,12, 20};
        sortingRunner.sort(orderedArray);
        assert4ElementOrder(orderedArray);

        int[] scrambledArray1 = {0,12,-2,20};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {12, 20, -2, 0};
        sortingRunner.sort(scrambledArray2);
        assert4ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {20, -2, 0, 12};
        sortingRunner.sort(scrambledArray3);
        assert4ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {12, -2, 0, 20};
        sortingRunner.sort(scrambledArray4);
        assert4ElementOrder(scrambledArray4);
    }

    @Test
    public void bubbleSort6ElementArraySameValues() throws Exception {
        int[] orderedArray = {-10, 5, 17, 17, 20, 26};
        sortingRunner.sort(orderedArray);
        assert6ElementOrder(orderedArray);

        int[] scrambledArray1 = {17, 20, -10, 5, 17, 26};
        sortingRunner.sort(scrambledArray1);
        assert6ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {26, 5, 17, -10, 17, 20};
        sortingRunner.sort(scrambledArray2);
        assert6ElementOrder(scrambledArray2);
    }


}