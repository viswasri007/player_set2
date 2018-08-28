import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str=str.toLowerCase();
		if(str.equals("sunday") || str.equals("saturday"))
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
