package javaPg;
import java.util.*;


public class first {
	
	/*static void fun() {
		System.out.println("Hello world");
	}*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= new int[5];
		
		for(int count=0; count<arr.length; count++) {
			arr[count]=sc.nextInt();
		}
		
		for(int count=0; count<arr.length; count++) {
			System.out.println(arr[count]);
		}
	}

}
