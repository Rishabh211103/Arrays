package datastructures.arrays;

import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,11};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 10;
    }
}
