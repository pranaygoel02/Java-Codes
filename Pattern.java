public class Pattern {
    public static void main(String... ar) {
        // Pattern-8
        boolean atEnd = true;
        boolean left = true;
        for (int i = 1, l = 4, r = 4; i <= 15; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= l && j <= r) {
                    System.out.print(atEnd ? "*" : " ");
                } else {
                    System.out.print(atEnd ? " " : "*");
                }
            }
            if (i % 4 == 0) {
                left = !left;
            }

            if (left) {
                l--;
                r++;
            } else {
                l++;
                r--;
            }
            atEnd = (i >= 4 && i < 11) ? false : true;
            System.out.println();
        }
    }
}
