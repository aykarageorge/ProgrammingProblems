
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    static long gcd(long a, long b) 
    { 
        if (a == Long.valueOf(0))  
            return b; 
          
        return gcd(b%a,a); 
    } 

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String[] nums;
        nums = name.split(" ");
        long num1 = Math.abs(Long.parseLong(nums[0]));
        long num2 = Math.abs(Long.parseLong(nums[1]));

        long n = gcd(num1, num2); 
        int result = 0; 
        for (long i=1; i<=Math.sqrt(n); i++) 
        { 
            // if 'i' is factor of n 
            if (n%i==0) 
            { 
                // check if divisors are equal 
                if (n/i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        System.out.println(result);

    }
}
