package com.netease.algorithm.array;

/**
 * Created by hzxiejiayun on 2018/3/14
 * <p>
 * 二维数组元素查询，其中每行从左至右都是升序，
 * 每列从上至下也是升序
 */
public class TwoDimensionalArraySearch {

    /**
     * 查询数组中是否包含元素，如果包含，返回对应元素，
     * 如果不包含，返回-1
     *
     * @param arr     需要查询的数组
     * @param element 需要查询的元素
     * @return
     */
    public boolean searchElement(int[][] arr, int element) {
        if (arr == null) {
            return false;
        }
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int i = 0, j = colLength - 1;
        while (i < rowLength && j >= 0) {
            if (arr[i][j] == element) {
                System.out.println("find success, element:" + element);
                return true;
            }
            if (arr[i][j] > element) {
                j--;
                continue;
            }
            if (arr[i][j] < element) {
                i++;
                continue;
            }
        }
        return false;
    }

}

