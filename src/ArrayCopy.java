import java.util.Arrays;

public class ArrayCopy {
public static void main(String a[])
{
	int a1[]= {2,5,6,7,9};
	System.out.println("array size: "+ a1.length);
	int a2[]=Arrays.copyOf(a1, 10);
	System.out.println("new array size: "+ a2.length);
}
}
