package ClassPractice;
import java.util.Scanner;
public class SumOf0And1ColEqual3 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements in the array:");
	int arr[][]=new int[3][3];
	boolean flag=false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]+arr[i][1]==arr[i][2]) {
				flag=true;
			}else {
				flag=false;
				System.out.println("the sum is not equal to the last element:");
				break;
			}
		}
		if(flag==true)
			System.out.println("true");
	}
}
