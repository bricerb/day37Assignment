/**
 * Created by Brice on 9/27/16.
 */
public class SelectionSorter extends BaseSorter {

    public void sort(int[] arrayToSort) {

        int smallestNumber = 0;
        int smallestNumberIndex = 0;
        int temporaryInt = 0;

        for (int currentIndex = 0; currentIndex < arrayToSort.length; currentIndex++) {
            smallestNumber = arrayToSort[currentIndex];
            for (int counter = 0 + currentIndex; counter < arrayToSort.length; counter++) {
                if (arrayToSort[counter] < arrayToSort[currentIndex]) {
                    temporaryInt = arrayToSort[currentIndex];
                    smallestNumber = arrayToSort[counter];
                    arrayToSort[currentIndex] = smallestNumber;
                    arrayToSort[counter] = temporaryInt;
                }
            }
        }
    }
}
