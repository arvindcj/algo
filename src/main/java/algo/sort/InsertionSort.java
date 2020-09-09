package algo.sort;

import org.apache.logging.log4j;

public class InsertionSort {

    Integer[] array;
    private static final Logger LOGGER = LogManager.getLogger();

    public InsertionSort(Integer[] a) {

      array = a;
    }

    public Integer[] sort() {
        for(int i=0; i < array.length; i++)
          insert(i);
        return array;
    }

    private void insert(int index){
        int tracked = index + 1;
        int value;
        while(array[index] > array[tracked]) {
            value = array[tracked];
            array[tracked] = array[index];
            tracked = index;
            index -= 1;
        }
    }
}
