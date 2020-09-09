package algo.sort;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test public void testNullInput() {
        InsertionSort classUnderTest = new InsertionSort(new Integer[] {1,2,3});
        assertArrayEquals(new Integer[] {1,2,3}, classUnderTest.sort());
    }
}
