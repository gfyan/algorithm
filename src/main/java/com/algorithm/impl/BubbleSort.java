package com.algorithm.impl;

import com.algorithm.ISort;

/**
 * @author luojie
 * @date Create in 10:48 on 2020-11-17.
 */
public class BubbleSort implements ISort {

    /**
     * 冒泡排序（时间复杂度最坏O(n^2)、最好O(n) 、且是稳定排序算法（是否稳定看相同的两个数字是否会发生位置变化））
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

        if (sourceArray.length == 0) {
            return sourceArray;
        }


        for (int i = 0; i < sourceArray.length; i++) {

            //标志位（如果本身就是顺序递增则无需遍历完所有数据）
            boolean t = true;

            //遍历数组，分别于数组下标i进行对比，如果大于进行替换操作。
            for (int j = i + 1; j < sourceArray.length; j++) {
                if (sourceArray[i] > sourceArray[j]) {
                    int temp = sourceArray[i];
                    sourceArray[i] = sourceArray[j];
                    sourceArray[j] = temp;
                    t = false;
                }
            }


            if (t) {
                return sourceArray;
            }

        }


        return sourceArray;
    }

}
