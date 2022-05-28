
/*
 * You are given the following pseudo code:
 * res = a
 * for i = 1 to k
 * if i is odd
 * res = res & b
 * else
 * res = res | b
 * 
 * You are also given the values of a, b, and k. Find the final value of res.
 * Input
 * First line consists of a single integer, T, denoting the number of test
 * cases.
 * Each test case consists of 3 lines, each consisting of a single integer
 * denoting a, b and k respectively.
 * Output
 * Print the final value of
 * res
 * for each test case in a new line.
 * Constraints
 * 1≤T≤105
 * 
 * 1≤a,b,k≤1018
 * Sample Input
 * 1
 * 4
 * 5
 * 1
 * 
 * Sample Output
 * 4
 * Time Limit: 1
 * Memory Limit: 256
 * Source Limit:
 */
import java.util.*;

class CloudBloom {
    public static void main(String args[]) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(); // Reading input from STDIN
            while (t > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long k = sc.nextLong();
                if (k == 1L) {
                    System.out.println(a & b);
                } else {
                    System.out.println(b);
                }
                t--;

            }
        }

    }
}
