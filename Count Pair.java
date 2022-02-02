import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int first = 0, second = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 0) {
                    if (arr[i + 1] == 1) {
                        second++;
                    }
                } else {
                    if (arr[i + 1] == 0) {
                        first++;
                    }
                }
            }
            System.out.println(first);
            System.out.println(second);

        }

    }
}
