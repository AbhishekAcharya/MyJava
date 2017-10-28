import java.util.Arrays;
public class ArrayDeepEquals {
/**
 * @param a
 */
public static void main(String a[])
{
	String strArr[]={"Java","C++","C"};
	String strArr1[]= {"Java","C++","C"};
	System.out.println("strArr and strArr1 are same?" + Arrays.deepEquals(strArr, strArr1));
}
}
