package samples;

import java.util.Scanner;

public class StringPossiblecharacters {

	public static void main(String[] args) {
		String s;
		String t="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		s=sc.next();
		if(s.length()>3) {
			System.out.println("Only 3 characters allowed");
			s="";
			
		}
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<s.length();k++) {
				t=t+s.charAt(i)+s.charAt(j)+s.charAt(k);
				System.out.println(t);
				t="";
				
				}
			}
		}
		
	}

}
