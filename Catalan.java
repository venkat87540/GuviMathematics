package com.demo;
import java.util.Scanner;
public class Catalan {

	int catalan(int n)
    {
        int res = 0;
 
        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
  
        Catalan cn = new Catalan();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i <a; i++) {
            System.out.print(cn.catalan(i) + " ");
        }
        for(int j=a;j<=a;j++) {
        	System.out.print(cn.catalan(j));
        }
    }

}
