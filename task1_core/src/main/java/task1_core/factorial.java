package task1_core;

public class factorial {

	public static void main(String[] args) {
		int num=4;
		int c=1;
		while (num>1) {
			c=c*num;
		num--;
		}
		System.out.println("factorial number is "+c);
	}

}
