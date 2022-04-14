package baseClasses;

import java.util.Arrays;

public class ReadExcel {
public static void main(String[] args) {
		
		int num []= {55,65,77,88,22,4,5,6,85,91,95,41,65,2};
		
		//sort array in ascending order
		
		Arrays.sort(num);
		
		for(int i=0;  i<=num.length-1 ;i++) {
			System.out.println(i);
		}
		
		//get last element from array
		System.out.println("largest element is:"+num[num.length-1]);
		
	}
	
}
