import java.util.*;
public class ques4{
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter radius-");
	float r=sc.nextInt();

	float area = 3.14f* r*r;
	System.out.println("Area=" + area);
}
}