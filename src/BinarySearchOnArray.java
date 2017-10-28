import java.util.Arrays;

public class BinarySearchOnArray {
public static void main(String a[])
{
	char array[]= {'a','b','h','i','s','h','e','k'};
	int index= Arrays.binarySearch(array, 0,array.length-1,'h');
	System.out.println("char 'h' index is " +index);
	
}
}
