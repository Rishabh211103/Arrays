package datastructures.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        int[] arr2 = {2, 5, 6, 7, 8};
//        System.out.println(arr2[3]);
//        System.out.println(arr2[1]);

//        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 1; i++) {
//            System.out.println(Arrays.toString(arr));
//        }

        // Array of objects
        String [] str = new String[5];

        for (int i = 0; i < str.length; i++ ){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Rishabh";

        System.out.println(Arrays.toString(str));
    }

}
