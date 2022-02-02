import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[10];
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";
        arr[7] = "seven";
        arr[8] = "eight";
        arr[9] = "nine";
        if (n < 10) {
            System.out.println(arr[n]);
        } else {
            System.out.println("number is greater than nine");
        }
    }
}
