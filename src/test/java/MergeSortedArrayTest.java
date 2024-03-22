import com.lamvt03.MergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    public void test1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};

        Assertions.assertArrayEquals(expected, nums1);
    }
    @Test
    public void test2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {0};
        int n = 0;

        MergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, nums1);
    }
    @Test
    public void test3(){
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        MergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, nums1);
    }
}
