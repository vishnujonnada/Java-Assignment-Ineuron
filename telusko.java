public class telusko {
    public static void main(String[] args) {
        int n = 7;
        // printing T
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 4) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                    ;
                }
            }
            System.out.println();
        }

        System.out.print("");
        // printing E

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == 4 || i == 7) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // printing L
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 7 || j == 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                    ;
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing U

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 7 || j == 7) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                    ;
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing S

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 4 || i == 7) {
                    System.out.print(" *");
                } else if (j == 1 && i <= 4) {
                    System.out.print("*");
                } else if (j == 7 && i > 4) {
                    System.out.print("  *");
                } else {
                    System.out.print("  ");
                    ;
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing k

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= 0 && j == 0 || i == j && j >= n / 2 || i + j == n - 1 && i < 3 * (n / 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing o

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == 0 && j >= 0 || i == n - 1 && j >= 0 || j == n - 1 && i >= 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
