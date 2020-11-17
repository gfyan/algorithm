package blogger.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author luojie
 * @date Create in 10:46 on 2020-11-17.
 */
public class SortTestMain {


    public static void main(String[] args) {
        ISort sort = new SelectionSort();

        int[] ints = new int[10000];

        ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 10000; i++) {
            ints[i] = current.nextInt(10000);
        }
        System.out.println(Arrays.toString(ints));

        long start = System.currentTimeMillis();
        int[] sort1 = sort.sort(ints);
        System.out.println("冒泡排序耗时：" + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(sort1));

    }


}
