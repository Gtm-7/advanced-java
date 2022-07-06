package advancedjava;

import java.util.HashSet;

public class Hashsetinjava {
    public static void main(String[] args) {
        HashSet<Integer> hst = new HashSet<>(10,0.5f);
        hst.add(5);
        hst.add(6);
        hst.add(7);
        hst.add(8);
        hst.add(9);
        hst.add(10);
        System.out.println(hst);
    }
}
