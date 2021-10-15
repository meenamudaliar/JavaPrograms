package samples;

import java.util.Scanner;

public class GridTraversalExample {
	private static int NodeTraversal(int m, int n, String s) {
		int count=0;
		int[][] paths=new int[n][m];
	for(int x=0;x<s.length();x++) {
		
	if(s.charAt(x)=='N'||s.charAt(x)=='S') {
		 for (int i = 1; i < n; i++) {
	         for (int j = 1; j < m; j++) {
	        	paths[i][j]=0;
	         }
	        
		 }
		 count++;
	}
	else if(s.charAt(x)=='E')	{
		for (int j = 1; j < m; j++) {
	
	             for (int i = 1; i < n; i++) {
	              paths[i][j]=0;
	             }
	            
	      }
		 count++;
	}
	else if(s.charAt(x)=='W')	{
		for (int j = 1; j < m; j++) {
	
	             for (int i = 1; i < n; i++) {
	              paths[i][j-1]=0;
	             }
	            
	      }
		 count++;
	}
	else if(s.charAt(x)=='S')	{
		for (int j = 1; j < m; j++) {
	
	             for (int i = 1; i < n; i++) {
	              paths[i-1][j]=0;
	             }
	            
	      }
		 count++;
	}
	}
	return count;
	}
	public static void main(String[] args) {
		int m=11, n=11;
		String s;
		Scanner sc=new Scanner(System.in);
	    s=sc.next();
	    System.out.println(NodeTraversal(m,n,s));
	    		

	}

	

}
