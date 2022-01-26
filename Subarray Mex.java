import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (x > k) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print((i % x) + " ");
                }
                System.out.println();
            }
        }
    }
}
