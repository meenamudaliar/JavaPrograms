package samples;

import java.util.Scanner;

public class SquareMatrix {
public static void main(String args[]) {
	int n,temp;
	int k=1,m=2;
	String rc;
	Scanner sc=new Scanner(System.in);
	n=Integer.parseInt(sc.nextLine());
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++) {
		String valuesarr[]=sc.nextLine().split(",");
		for(int j=0;j<n;j++) {
			
			a[i][j]=Integer.parseInt(valuesarr[j]);
		}
	}
	rc=sc.next();
	switch(rc) {
	case "column":
		 for(int i = 0; i < n; i++)
         {
             temp = a[i][(k-1)];
             a[i][k-1] = a[i][(m-1)];
             a[i][m-1] = temp;
         }
		
		for(int i=0;i<n;i++) {
			String comma="";
			for(int j=0;j<n;j++) {
				
				System.out.print(comma+a[i][j]);
				comma=",";
			}
			System.out.println("");
		}
		break;
	case "row":
		
		for(int i = 0; i < n; i++)
        {
            temp = a[(k-1)][i];
            a[k-1][i] = a[m-1][i];
            a[m-1][i] = temp;
        }
		 
		 for(int i=0;i<n;i++) {
			 String comma="";
				for(int j=0;j<n;j++) {
					
					System.out.print(comma+a[i][j]);
				comma=",";
				}
				System.out.println("");
			}
		 break;
	}
	
	
	
	sc.close();
}
}
