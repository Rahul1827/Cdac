package MyPackage;
import java.util.Scanner;

public class MyFirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello");
	Scanner sc=new Scanner(System.in);
	
	int a[];
	
	a=new int[5];
	System.out.println("Enter the elements:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("Array Elements are:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
	
	}

}