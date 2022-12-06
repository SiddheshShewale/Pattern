
public class PATTERN {
	
	public static void main(String[] args){
		for (int i=0; i<5; i++)  {
		for (int j=0; j<10; j++)  {
		if((i+j==4 | j-i==5 )  | (i==2 & j>2 & j<7)) {
		System.out.print("*");
		}else{
		System.out.print(" ");
		}
		}
		System.out.println( );
		}
		}
}
