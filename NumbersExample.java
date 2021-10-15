package samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersExample {

	public static void main(String[] args) {

int start;
int end;
ArrayList<Integer> o1=new ArrayList<Integer>();
ArrayList<Integer> o2=new ArrayList<Integer>();
ArrayList<Integer> o3=new ArrayList<Integer>();
ArrayList<Integer> o4=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
start=sc.nextInt();
end=sc.nextInt();
for(int i=start;i<=end;i++) {
if(i%3==0||i%5==0) {
	o1.add(i);
	}
}
for(int i=start;i<=end;i++) {
 if(i%3==0&&i%5==0){
	o2.add(i);
	
}
}

for(int i=start;i<=end;i++) {
if(i%3==0) {
	o3.add(i);
	
}
}
for(int i=start;i<=end;i++) {
 if(i%5==0) {
	o4.add(i);
	
}

	}
System.out.println(o1);
System.out.println(o2);
System.out.println(o3);
System.out.println(o4);

}
}
