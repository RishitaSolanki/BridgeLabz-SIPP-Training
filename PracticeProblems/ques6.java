
import java.util.*;
public class ques6{
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter principle amount-");
	 float p=sc.nextInt();
	 
	System.out.println("Enter rate-");
	 float r=sc.nextInt();
	 
	 System.out.println("Enter time-");
	 int t=sc.nextInt();
	 
	 double SimpleInterest = (p * r * t) / 100;
	 System.out.println("SimpleInterest-" + SimpleInterest );



}
}