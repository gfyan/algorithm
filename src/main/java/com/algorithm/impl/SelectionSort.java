package com.algorithm.impl;

import com.algorithm.ISort;

/**
 * @author luojie
 * @date Create in 11:36 on 2020-11-17.
 */
public class SelectionSort implements ISort {


    /**
     * 选择排序（时间复杂度最坏O(n^2)、最好O(n) 、且是不稳定排序算法（是否稳定看相同的两个数字是否会发生位置变化））
     * <p>
     * 5，3，4，5，2，8
     * <p>
     * 排序完毕后会变为
     * 2、3、4、5、5、8 其中第一个5会移动到第二个5后面去
     *
     * @param sourceArray 待排序数组
     * @return 顺序递增数组
     */
    @Override
    public int[] sort(int[] sourceArray) {

        for (int i = 0; i < sourceArray.length - 1; i++) {

            int min = i;

            //执行n-1轮选择，每轮选择出最小的值
            for (int j = i + 1; j < sourceArray.length; j++) {
                if (sourceArray[min] > sourceArray[j]) {
                    min = j;
                }
            }

            //如果最小的值不是起始位置进行替换
            if (min != i) {
                int temp = sourceArray[i];
                sourceArray[i] = sourceArray[min];
                sourceArray[min] = temp;
            }

        }

        return sourceArray;
    }

}
