package com.Specials;
//finding prime number
public class isPrime {
	
	public static void main(String[] args) {
		int n=49;
		int count = 0;
		for(int i=1;i<=n;i++) {
			if((n%i)==0) {
				 count = count+1;
			}			
		}
		if(count==2) {
			System.out.println(n+" Prime Number");
		}else {
			System.out.println(n+ " is Not Prime NUmber");
		}
	}
}
