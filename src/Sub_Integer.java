import java.util.HashMap;
import java.util.Map;

/**
 * Consider two sets of integers, S and T.
 * Devise an algorithm that uses a hash table to test whether S is a subset of T.
 * S is considered a subset of T if every element in S in an element in T (Not necessarily in the same order).
 */
public class Sub_Integer {
    public static String subset(int[] S, int[] T){
        Map<Integer, Boolean> map = new HashMap<>();

        for(int num: T){
            map.put(num, true);
        }
        for(int num : S){
            if(!map.containsKey(num)){
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args){
        int[] S = {32,3};
        int[] T = {1, 2, 3, 52, 32, 54};

        int[] S1 = {89, 32, 54, 32, 3};
        int[] T1 = {54, 32, 99};
        System.out.println(subset(S1,T1));
    }




}
