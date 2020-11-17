package blogger.sort;

/**
 * @author luojie
 * @date Create in 10:48 on 2020-11-17.
 */
public class BubbleSort implements ISort {

    /**
     * 冒泡排序
     *
     * @param sourceArray 原数组
     * @return
     */
    @Override
    public int[] sort(int[] sourceArray) {

        if (sourceArray.length == 0) {
            return sourceArray;
        }


        for (int i = 0; i < sourceArray.length; i++) {
            boolean t = true;
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
