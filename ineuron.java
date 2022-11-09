
public class ineuron {
    public static void main(String args[]) {
        int n = 5;
        // printing I

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        // printing N

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == j || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // printing E

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1 || i == n / 2) && (j > 0 && j < 3 * (n / 4))
                        || (i != 0 && i != n - 1) && j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        // printing U

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == n - 1 && j >= 0 || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing R

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == n / 2 && j >= 0 || i == 0 && j >= 0 || j == n - 1 && i <= n / 2
                        || i >= n / 2 && i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // printing O

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == 0 && j >= 0 || i == n - 1 && j >= 0 || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // printing N

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == j || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
