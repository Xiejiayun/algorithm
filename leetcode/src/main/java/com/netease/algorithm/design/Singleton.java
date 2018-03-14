package com.netease.algorithm.design;

/**
 * Created by hzxiejiayun on 2018/3/14
 */
public class Singleton {

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
