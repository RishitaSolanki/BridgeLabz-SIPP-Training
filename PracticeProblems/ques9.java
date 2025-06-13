import java.util.*;
public class ques9{
public static void main(String[] args){
		
	int a,b,c;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter your 1st number-");
	 a=sc.nextInt();
	 
	System.out.println("Enter your 2nd number-");
	 b=sc.nextInt();
	 
	 System.out.println("Enter your 3rd number-");
	 c=sc.nextInt();
	 
	int avg=a+b+c/3;
	System.out.println("Average-" + avg);
}
}