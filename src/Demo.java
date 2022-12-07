
public class Demo {
	static int a;
	{
		System.out.println(a);
		a=10;
		System.out.println("from static");
		
	}
	
public static void main(String[] args) {
//	System.out.println("main method");
//	DemoOne.mOne();
//	Demo.mOne();
//	
//	new DemoOne();
//	new 
//}
//public static void mOne() {
//	System.out.println("mOne method");
	
	Demo d=new Demo();
	System.out.println("from main");
	System.out.println(a);
	
	
}
}
