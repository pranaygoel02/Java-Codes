public class Pattern {
    public static void main(String... ar) {
        boolean atEnd = true;
        int c = 0;
        boolean left = true;
        for (int i = 1, l = 4, r = 4; i <= 15; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= l && j <= r) {
                    System.out.print(atEnd ? "*" : " ");
                } else {
                    System.out.print(atEnd ? " " : "*");
                }
            }
            if (c == 4) {
                c = 0;
                left = !left;
            }

            if (left) {
                l--;
                r++;
            } else {
                l++;
                r--;
            }
            // if (i % 4 == 0)
            // left = !left;
            atEnd = (i >= 4 && i <= 12) ? false : true;
            c++;
            System.out.println();
        }
    }
}
