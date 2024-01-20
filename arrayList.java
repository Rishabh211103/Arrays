package datastructures.arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        //Syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(34);
//        list.add(56);
//        list.add(23);
//        list.add(54);
//        list.add(2);
//        list.add(67);
//        list.add(345);
//        System.out.println(list.contains(65));
//        list.set(2,45);
//        list.remove(4);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " "); //pass index here, list [index] syntax will not work here
        }
//        System.out.println(list);
    }
}
