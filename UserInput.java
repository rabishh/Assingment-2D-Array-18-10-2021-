package ClassPractice;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element:");
		int [][]a=new int[2][3];
			for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				 a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}

