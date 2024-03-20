import java.util.*;

/**
 * takes an array of Strings and uses radix sort to sort the array lexicographically
 */
public class RadixSort {
    //StringBuilder build = new StringBuilder();
    // Scanner scan = new Scanner(System.in);

    //HashMap<String, Integer> hash = new HashMap<>();

    /*public void sort(String[] s) {
        for (int i = 0; i < s.length; i++) {

        }
    }*/


    // radix sort on the array
    public static void radix(String[] array) {
        // max length of the string
        int max = 0;
        for (String s : array) {
            max = Math.max(max, s.length());
        }
        // the counting
        for (int pos = max - 1; pos >= 0; pos--) {

            array = sort(array, pos);
        }
        for (String s : array) {
            System.out.println(s);
        }

    }

    //counting sort on the array for the char at given position
    public static String[] sort(String[] array, int pos) {
        // creates map
        Map<Character, List<String>> map = new HashMap<>(); // hash map being used
        for (char c = 'a'; c <= 'z'; c++) { // empty list
            map.put(c, new ArrayList<>());
        }

        for (String s : array) {
            char charac = getCharAt(s, pos);
            map.get(charac).add(s);
        }
        // sort the array
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            List<String> strings = map.get(c);
            for (String s : strings) {
                array[i++] = s;
            }
        }
        return array;
    }

    private static char getCharAt(String s, int pos){
        if(pos >= s.length()){
            return 'a';
        }
        return s.charAt(pos);
    }
    public static void main(String[] args) {
        String[] input = {"gojo", "google", "jogo", "bill", "pup", "cipher", "watchmen", "knight", "it", "stand", "sandman", "hydra", "surtr"};
        radix(input);
    }
}
