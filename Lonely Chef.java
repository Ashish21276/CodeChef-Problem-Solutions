import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char c = s.charAt(0);
            boolean flag = false;
            if (c == 'a' || c == 'e' || c == 'n' || c == 'k' || c == 'o') {
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                            || s.charAt(i) == 'u') {
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                System.out.println("NO");
            }

        }
    }
}
