
public class SIDDHESH {
	public static void main (String [] args) {
	
	for  (int i=0; i<5; i++) {
		for (int j=0; j<45; j++ ) {
			if ( ((i==0 &(j>=0 | j<4)) | (i==1 & j==0) | (i==2 & (j>=0 | j<4)) | (i==3 & j==3) | (i==4 & (j>=0 | j<4)))  |
				((i==0 & (j>5 | j<10)) | (j==7 & (i>0 | i<4)) | (i==4 & (j>5 | j<10)) )	) { 
					System.out.print ("*");
		} else {
			System.out.print (" ");
			}
	}
			System.out.println();
			
}
}
}
