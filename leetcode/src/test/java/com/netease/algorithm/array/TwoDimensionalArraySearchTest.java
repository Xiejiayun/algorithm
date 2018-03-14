package com.netease.algorithm.array;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by hzxiejiayun on 2018/3/14
 */
public class TwoDimensionalArraySearchTest extends TestCase {

    private static int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    @Test
    public void testSearchElement() {
        TwoDimensionalArraySearch one = new TwoDimensionalArraySearch();
        assertTrue(one.searchElement(arr, 1));
        assertTrue(one.searchElement(arr, 2));
        assertTrue(one.searchElement(arr, 4));
        assertTrue(one.searchElement(arr, 6));
        assertTrue(one.searchElement(arr, 7));
        assertTrue(one.searchElement(arr, 8));
        assertTrue(one.searchElement(arr, 9));
        assertTrue(one.searchElement(arr, 10));
        assertTrue(one.searchElement(arr, 11));
        assertTrue(one.searchElement(arr, 12));
        assertTrue(one.searchElement(arr, 13));
        assertTrue(one.searchElement(arr, 15));
        assertFalse(one.searchElement(arr, 14));
        assertFalse(one.searchElement(arr, 16));
        assertFalse(one.searchElement(arr, 0));
        assertFalse(one.searchElement(arr, 100));
    }
}
