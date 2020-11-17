package com.algorithm.impl;

import com.algorithm.ISort;

import java.util.Arrays;

/**
 * @author luojie
 * @date Create in 14:49 on 2020-11-17.
 */
public class MergeSort implements ISort {


    /**
     * 归并排序（时间复杂度为O(nlogn)、且是稳定排序算法（是否稳定看相同的两个数字是否会发生位置变化））不过归并空间复杂度为O(n)
     *
     * @param sourceArray 待排序数组
     * @return 顺序递增数组
     */
    @Override
    public int[] sort(int[] sourceArray) {

        if (sourceArray.length < 2) {
            return sourceArray;
        }

        int mid = (int) Math.floor(sourceArray.length / 2);

        int[] left = Arrays.copyOfRange(sourceArray, 0, mid);
        int[] right = Arrays.copyOfRange(sourceArray, mid, sourceArray.length);


        return merge(sort(left), sort(right));
    }

    private int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int i = 0;

        //左边数组即将比对位置
        int leftStart = 0;
        //右边数组即将比对位置
        int rightStart = 0;

        //左边数组待比对数据量
        int leftSize = left.length;
        //右边数组待比对数据量
        int rightSize = right.length;

        //因为左右两个数组都是有序数组，所以直接进行对比然后将数组放入result中
        while (leftSize > 0 && rightSize > 0) {
            if (left[leftStart] <= right[rightStart]) {
                result[i++] = left[leftStart];
                leftStart++;
                leftSize--;
            } else {
                result[i++] = right[rightStart];
                rightStart++;
                rightSize--;
            }
        }

        //左边数组剩余数据
        if (leftSize > 0) {
            for (int j = leftStart; j < left.length; j++) {
                result[i++] = left[j];
            }
        }

        //右边数组剩余数据
        if (rightSize > 0) {
            for (int j = rightStart; j < right.length; j++) {
                result[i++] = right[j];
            }
        }

        return result;
    }

}
