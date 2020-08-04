package lesson5;

import java.util.LinkedList;

public class BackPack {

    public static void main(String[] args) {
        backPack(bag[0],weight,0);
    }

    static int weight = 23;
    static int[] bag = {3,2,3,5,8,10,23,20,18};
    static LinkedList<Integer> list = new LinkedList<>();

    static void backPack (int item, int partBag, int start) {
        if (partBag == 0) {
            list.addFirst(item);
            for (Object i : list.toArray()) {
                System.out.print(i + " ");
            }
            list.removeFirst();
            System.out.println();
            return;
        }
        if (partBag < 0) {
            return;
        }
        for (int i = start + 1; i <= bag.length; i++) {
            if (start > 0) {
                list.addFirst(item);
            }
            backPack(bag[i-1],partBag - bag[i-1], i);
            if (start > 0) {
                list.removeFirst();
            }
        }
    }

}
