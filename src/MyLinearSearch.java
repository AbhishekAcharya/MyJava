public class MyLinearSearch {
public static int linearSearch(int arr[], int key)
{
	int size=arr.length;
	for(int i=0;i<size;i++)
	{
		if(arr[i]==key)
		{
			return i;
		}
	}
	return -1;
}
public static void main (String a[])
{
	int arr1[]= {23,43,7,89,1,9};
	int searchKey=7;
	System.out.println("Key"+ searchKey + " is found at "+ linearSearch(arr1,searchKey));
}
}