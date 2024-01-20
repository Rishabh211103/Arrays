package datastructures.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
//        int [][] arr2D = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
     //   int [][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr [row] [col] = sc.nextInt();
//                System.out.println(arr[row][col] + " ");
            }
        }
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
