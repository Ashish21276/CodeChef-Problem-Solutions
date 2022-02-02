import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int mis = 0;

        for (int i = 1; i < arr[n - 1]; i++) {
            while (count != arr[i - 1] && k > 0) {
                mis = count;
                count++;
                k--;
            }
            if (k == 0)
                break;
            count++;

        }

        System.out.println(mis);

    }
}
