import java.util.HashSet;
import java.util.*;

public class Set {
    public static void main(String[] args) {

        Collection<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(3);
        nums.add(55);
        nums.add(65);
        nums.add(55);

        // for (int n : nums) {
        //     System.out.println(n);
        // }
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        Collection<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(3);
        nums2.add(55);
        nums2.add(65);
        nums2.add(55);

        for (int n : nums2) {
            System.out.println(n);
        }

    }
}
