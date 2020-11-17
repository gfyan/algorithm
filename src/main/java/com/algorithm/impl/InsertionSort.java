package com.algorithm.impl;

import com.algorithm.ISort;

/**
 * @author luojie
 * @date Create in 14:17 on 2020-11-17.
 */
public class InsertionSort implements ISort {


    /**
     * 插入排序（时间复杂度最坏O(n^2)、最好O(n) 、且是稳定排序算法（是否稳定看相同的两个数字是否会发生位置变化））
     * <p>
     * 5，3，4，5，2，8
     * <p>
     * 排序完毕后会变为
     * 2、3、4、5、5、8 两个5的位置不会改变
     *
     * @param sourceArray 待排序数组
     * @return 顺序递增数组
     */
    @Override
    public int[] sort(int[] sourceArray) {

        int length = sourceArray.length;

        //进行n-1次循环，每次循环都将之前的数据视为排序列表
        for (int i = 1; i < length; i++) {

            //保存移动的数据
            int value = sourceArray[i];

            //开始位置
            int j = i - 1;

            for (; j >= 0; j--) {
                //用即将插入的数据和之前的数组进行对比，如果小于则将对应的数据进行移动。
                if (value < sourceArray[j]) {
                    sourceArray[j + 1] = sourceArray[j];
                } else {
                    break;
                }
            }

            //插入数据
            if (j + 1 != i) {
                sourceArray[j + 1] = value;
            }
        }


        return sourceArray;
    }

}
