import java.util.Scanner;
public class P9 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
System.out.println("enter the no of rows");
int row = sc.nextInt();


for (int i=1; i<=row; i++) {
	for (int j=1; j<=row-i; j++) {
		System.out.print(" ");
	}
	for (int k=1;k<=i;k++) {
		System.out.print("*");
		
	}
	for (int l=2;l<=i;l++) {
		System.out.print("*");
	}
	
	System.out.println();
}

	for (int m=1;m<=row;m++) {
		for (int n=1; n<=m; n++) {
			System.out.print(" ");
		}
		for (int o=row-1; o>=m; o--) {
			System.out.print("*");
		}
		for (int p=row-2;p>=m;p--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}