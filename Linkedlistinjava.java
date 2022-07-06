package advancedjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlistinjava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
//        l1.ensureCapacity(30);
        l2.add(56);
        l2.add(57);
        l2.add(58);
        l2.add(59);
        l2.add(60);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(89);
        l1.add(0,5);
        l1.add(0,57);
        l1.addLast(5758);

        System.out.println(l1.contains(25));
        System.out.println(l1.indexOf(5));
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+ ", ");
        }

    }
}
