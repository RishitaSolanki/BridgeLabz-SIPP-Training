import java.util.*;
public class ques3{
public static void main(String[] args){
		
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a temp in celsius-");
	float temp=sc.nextFloat();

	float Ftemp=(temp * 9/5) + 32;
	System.out.println("Temp in Farhient-" + Ftemp);


}
}