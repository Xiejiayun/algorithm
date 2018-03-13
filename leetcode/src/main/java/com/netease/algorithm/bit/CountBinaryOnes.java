package com.netease.algorithm.bit;

/**
 * Created by hzxiejiayun on 2018/3/13
 */
public class CountBinaryOnes {

    public int countBinaryOnes(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        while (num != 0) {
            num = num & (num-1);
            count++;
        }
        return count;
    }
}
