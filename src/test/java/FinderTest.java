import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findMax1() {
        Finder f1 = new Finder();
        int[] intArray1 = new int[]{3,0,12,6};
        Integer a = 12;
        assertEquals(a, f1.findMax(intArray1));
    }

    @Test
    public void findMaxNull() {
        Finder f2 = new Finder();
        int[] intArray1 = null;
        assertEquals(null, f2.findMax(intArray1));
    }

    @Test
    public void findMaxZero() {
        Finder f3 = new Finder();
        int[] intArray1 = new int[]{};
        assertEquals(null, f3.findMax(intArray1));
    }

    @Test
    public void findMin1() {
        Finder f4 = new Finder();
        int[] intArray1 = new int[]{3,0,12,6};
        Integer a = 0;
        assertEquals(a, f4.findMin(intArray1));
    }

    @Test
    public void findMinull() {
        Finder f5 = new Finder();
        int[] intArray1 = null;
        assertEquals(null, f5.findMin(intArray1));
    }

    @Test
    public void findMinZero() {
        Finder f6 = new Finder();
        int[] intArray1 = new int[]{};
        assertEquals(null, f6.findMin(intArray1));
    }
}