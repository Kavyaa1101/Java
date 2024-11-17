public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
        int direction = -1, row = 0;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) direction *= -1;
            row += direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) result.append(sb);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3)); // Output: "PAHNAPLSIIGYIR"
    }
}
