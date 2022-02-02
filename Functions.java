import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dp = new long[n+1];

        dp[n] = 1;
        dp[n - 1] = 2;

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[i + 2];
        }

        System.out.println(dp[1]);

    }
}
