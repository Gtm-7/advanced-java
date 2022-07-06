package advancedjava;
import java.util.*;

public class CollectionsFrameWork {
    public static void main(String[] args) {
        /*
        1. Collection used to Resize array
        2. insert element in- between
        3. Delete an element in array
        4. apply certain operations
         collection are available as classes and interfaces */
        /*
        collection are in java.util.collections
        ArrayList --> for variable size collections
        set --> for distinct collection
        stack --> A LIFO data structure
        HashMap --> for storing key-value pairs
         */
        // Array list
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
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
        l1.addAll(l2);
        System.out.println(l1.contains(25));
        System.out.println(l1.indexOf(5));
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+ ", ");
        }



    }
}
