//Lingli's class
import java.util.Arrays;

public abstract class One {
	public static void main(String[] args)
	{
		int[] randArr= randomInts(1000);
		long start = System.nanoTime();
		int medium= challengeOne(randArr);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Challenge 1 took: "+ time + " nanoseconds");
		System.out.println(Arrays.toString(randArr));

	}
	
	public static int[]randomInts(int len)
	{
		int[] list1 = new int[len];
		
		for (int i = 0; i<list1.length-1; i++)
		{
			list1[i]=(int)(Math.random()*10000);
		}
	
		return list1;
	}
	//challengeOne: Standard sort and process
	public static int challengeOne(int[] arr) 
	{
		//random number generator 
		//data set: an array of 10,000 random integers between 0-1000
		insertionSort(arr);
		return (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
	}
	
	public static void insertionSort(int[] arr)
	{
		int temp=0;
		for(int outside=1; outside<arr.length; outside++)
		{
				for(int inside=outside; inside>0; inside--)
				{
					if(arr[inside]<arr[inside-1])
					{
						temp=arr[inside-1];
						arr[inside-1]=arr[inside];
						arr[inside]=temp;
					}
					else
					{
						break;
					}
				}
			}
		}

	public static int median(int[] mid) 
	{
	    int middle = (mid.length/2);
	    
	    if (mid.length % 2 == 1) 
	    {
	    	return mid[middle];
	    } 
	    
	    else 
	    {
	    	return (mid[middle - 1] + mid[middle])/2;	
	    }
		
	}
}
