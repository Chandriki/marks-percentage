package chandriki1;
import java.util.Scanner;
public class percentage {
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of 5 subjects");
		System.out.println("enter marks obtained ");
		float a = sc.nextFloat();
		System.out.println("enter the the total marks of subject a");
		int x=sc.nextInt();
		System.out.println("enter marks obtained ");
		float b = sc.nextFloat();
		System.out.println("enter the the total marks of subject b");
		int y=sc.nextInt();
		System.out.println("enter marks obtained ");
		float c = sc.nextFloat();
		System.out.println("enter the the total marks of subject c");
		int z=sc.nextInt();
		System.out.println("enter marks obtained ");
		float d = sc.nextFloat();
		System.out.println("enter the the total marks of subject d");
		int w=sc.nextInt();
		System.out.println("enter marks obtained ");
		float e = sc.nextFloat();
		System.out.println("enter the the total marks of subject e");
		int v=sc.nextInt();
		float sum=a+b+c+d+e;
		float sum2=x+y+z+w+v;
		float div=sum/sum2;
		float percentage=div*100;
		System.out.println("Total percentage:"+percentage);
		
		
		//whether the no.is integer or not 
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter a number:");
		boolean b1=sc1.hasNextInt();
		System.out.println(b1);
		
	}

}
