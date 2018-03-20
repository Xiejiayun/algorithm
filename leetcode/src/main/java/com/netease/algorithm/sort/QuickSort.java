package com.netease.algorithm.sort;

/**
 * Created by hzxiejiayun on 2018/3/20
 * <p>
 * 快速排序
 */
public class QuickSort {

    public <T extends Comparable<T>> void quickSort(T[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    private <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        if (low >= high) {
            return low;
        }

        int index = low;
        T pivot = arr[low++];
        while (low < high) {
            if (arr[low].compareTo(pivot) <= 0) {
                low++;
                continue;
            }
            if (arr[high].compareTo(pivot) >= 0) {
                high--;
                continue;
            }
            exchange(arr, low, high);
        }
        exchange(arr, index, low - 1);
        return low - 1;
    }

    private <T extends Comparable<T>> void exchange(T[] arr, int low, int high) {
        T tmp = arr[low];
        arr[low] = arr[high];
        arr[high] = tmp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Integer[] arr = new Integer[]{1, 2, 4, 3, 6, 5, 7, 8};
        quickSort.quickSort(arr);
        for (Integer i : arr) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        String[] strs = new String[]{"abdc", "abcd", "bacd", "acbd", "cbad"};
        quickSort.quickSort(strs);
        for (String s : strs) {
            System.out.print(s);
            System.out.print(",");
        }
        System.out.println();
    }
}