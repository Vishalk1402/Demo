package practice;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		int[] arr = {1,2,3,4,5,6,9,10};
		Arrays.sort(arr);
		System.out.println(d.binarySearch(arr, 12));

	}
}
