package com.demo;
import java.util.Scanner;
public class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		int sum = 0;
		for(int i=l;i<=r;i++){
			int count = 0;
			for(int n=1;n<=i;n++){
				if(i%n==0){
					count +=1;
				}
			}
			if(count == 2){
				sum +=1;
			}
		}
		System.out.println(sum);
	}
}

