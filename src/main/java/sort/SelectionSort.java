package blogger.sort;

/**
 * @author luojie
 * @date Create in 11:36 on 2020-11-17.
 */
public class SelectionSort implements ISort {


    /**
     * 选择排序
     *
     * @param sourceArray 原数组
     * @return
     */
    @Override
    public int[] sort(int[] sourceArray) {

        for (int i = 0; i < sourceArray.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < sourceArray.length; j++) {
                if (sourceArray[min] > sourceArray[j]) {
                    min = j;
                }
            }

            int temp = sourceArray[i];
            sourceArray[i] = sourceArray[min];
            sourceArray[min] = temp;
        }


        return sourceArray;
    }

}
