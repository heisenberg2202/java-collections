import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Collection<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int i : nums) {
            System.out.println(i);
        }
        List<Integer> nums2 = new ArrayList<>();

        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(99);
        nums2.add(5);

        System.out.println(nums2.get(3));
    }
}
