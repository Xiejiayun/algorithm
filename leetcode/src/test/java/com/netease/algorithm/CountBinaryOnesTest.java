package com.netease.algorithm;

import com.netease.algorithm.bit.CountBinaryOnes;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by hzxiejiayun on 2018/3/13
 */
public class CountBinaryOnesTest extends TestCase{

    @Test
    public void testCountBinaryOnes() {
        CountBinaryOnes one = new CountBinaryOnes();
        int countZero = one.countBinaryOnes(0);
        assertEquals(countZero, 0);

        int countMaxInteger = one.countBinaryOnes(Integer.MAX_VALUE);
        assertEquals(countMaxInteger, 31);

        int countMinInteger = one.countBinaryOnes(Integer.MIN_VALUE);
        assertEquals(countMinInteger, 1);

        int countSeven = one.countBinaryOnes(7);
        assertEquals(countSeven, 3);

        int countMinusOne = one.countBinaryOnes(-1);
        assertEquals(countMinusOne, 32);

    }
}
