import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void findPermutations(String str, String current, List<String> result) {
        if (str.length() == 0) {
            result.add(current);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            findPermutations(remaining, current + ch, result);
        }
    }

    public static List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        findPermutations(s, "", result);
        return result;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
