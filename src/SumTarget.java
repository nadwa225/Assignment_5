import java.util.HashMap;

public class SumTarget {
    public static int[] sumTarget(int[] A, int N) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        map.put(0, -1); //handles begining

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (map.containsKey(sum - N)) {
                return new int[]{map.get(sum - N) + 1, i};
            }

            map.put(sum, i);
        }

        return new int[]{-1, -1}; // No subarray found
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7, 5};
        int N = 12;
        int[] result = sumTarget(A, N);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("no subarray of N" + N);
        } else {
            System.out.println("The sum is "+N + " from index " +result[0] + " to index "+result[1]);
        }
    }
}
