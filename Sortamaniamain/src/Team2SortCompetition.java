import java.util.Arrays;

/**
 * SortAMania
 * @author Lingli Zou, Alyssa Ma, Lily Li
 * Period 2
 * 2/26/18
 */

public class Team2SortCompetition extends SortCompetition{

	public String greeting()
	{
		return "Hello this is Team 2!! Fighting!";
		
	}	
		//challenge one
		@Override
		public int challengeOne(int[] arr) 
		{
			//random number generator 
			//data set: an array of 10,000 random integers between 0-1000
			insertionSort(arr);

			int middle = (arr.length/2);

		    if (arr.length%2==1) 
		    {
		    	return arr[middle];
		    } 
		    
		    else 
		    {
		    	return (arr[middle-1] + arr[middle])/2;	
		    }		
		}
		
		//challenge two
		public int challengeTwo(String[] test1, String given) {
			stringSort(test1);
			
			for(int i = 0; i < test1.length; i++) {
				if(test1[i].equals(given)) {
					return i;
				}
			}
			return -1;
		}
		
		//challenge three
		public int challengeThree(int [] list1)
		{
			insort(list1);
			
			int median = list1.length/2;
			if(list1.length % 2 != 0)
			{
				median = (int) list1[median];
			}
			else
			{
				median = (int) list1[median-1] + (list1[median]/2);
			}
			return median;
		}
		
		//challenge four

		public int challengeFour(int[][] arr)
		{
			for (int x=0; x<arr.length;x++) 
			{
				for (int y=0; y< arr[x].length;y++) 
				{
					insort(arr[x]);
				}
			}
			//median method test -alyssa
			int a = arr.length;
			int median = ( (arr[a / 2] [a / 2]  +  arr[(a / 2)][(a / 2) - 1]  +  arr[(a / 2) - 1][a / 2]  +  arr[(a / 2) - 1][(a / 2) - 1]) / 4);
			return median;
		}
	
		
		//challenge five
		public int challengeFive(Comparable[] mysArr, Comparable given) {
			cstringSort(mysArr);
			for(int i = 0; i < mysArr.length; i++) {
				if(mysArr[i].equals(given)) {
					return i;
				}
			}
			return -1;
		}
		
// _______________________________________________________________________Private challenge 1
		
	public static int[]randomInts(int len)
	{
		int[] list1 = new int[len];
		
		for (int i = 0; i<list1.length-1; i++)
		{
			list1[i]=(int)(Math.random()*10000);
	
		}
		
			return list1;
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
	
	// Challenge 2 and 5 helper method
	private static void cstringSort (Comparable[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					cstringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
	}
	
	private static void cstringSwap(Comparable[]arr, int index1, int index2) {
		Comparable string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}
	
	private static void stringSort (String[] test1) {
		int swapNum = 0;
		for(int i = 0; i<test1.length;i++) {
			swapNum = i; 
			for(int j=i-1; j>=0;j--) {
				if(test1[swapNum].compareTo(test1[j])<0) {
					stringSwap(test1, swapNum, j);
					swapNum--;
				}
				else if(test1[swapNum].compareTo(test1[j])>0) {
					break;
				}
			}
		}
	}
	
	private static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}

// ____________________________Private challenge 3
	
	private static void insort(int [] list1)
	{
		int x = list1.length;
		
		for(int i = 1 ; i < x; i++)
		{
			int y = list1[i];
			int z = i - 1;
			
			while(z >= 0 && list1[z] > y)
			{
				list1[z + 1] = list1[z];
				z = z - 1;
			}
			list1[z + 1] = y;
		}
	}
	
	public static int median(int [] list1)
	{
		int median = list1.length/2;
		
		if(list1.length % 2 == 1)
		{
			return list1[median]; 
		}
		else
		{
			return (list1[list1.length / 2] + ( list1[list1.length / 2 - 1])/2);
		}
	}
	
	//Challenge 4 insertion attempt -Alyssa
	
	public static void inso(int [][] x, int a, int b)
	{
		int c;
		int d;
		
		for(int i = 1; i < a; i++)
		{
			c = x[i][b];
			int[] xRow = x[i];
			d = i - 1;
			
			while((d >= 0) && (x[d][b] > c))
			{
				x[d + 1] = x[d];
				d = d - 1;
			}
			x[d + 1] = xRow;
		}
	}
	
	
}

