import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if (a>=18)
	    {
	        System.out.println("Eligible");
	    }
	    else{
	        System.out.println("Not eligible");
	    }
	}
}
