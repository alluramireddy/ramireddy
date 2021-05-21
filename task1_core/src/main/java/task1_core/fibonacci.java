package task1_core;

public class fibonacci {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		for (int m=1;m<10;m++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
