
public class P1 {
int a;
char c;
short d;
public void test () {
	int a=200;
	System.out.println(a);
	System.out.println(this);
	System.out.println(this.a);
	System.out.println(this.c);
	System.out.println(this.d);
}
public static void main (String []args) {
	int a=200;
	System.out.println(a);
	P1 obj=new P1();
	obj.test();
//	P1 obj2=new P1();
//	obj2.test();
}
}
