package task1_core;

public class prime {

	public static void main(String[] args) {
		int num = 8;
		int c=0;
		for (int i=2;i<num/2;i++) {
			if (num %i==0) {
				System.out.println(num + "is not prime number");
				c++;
				break;
			}
		}
		if (c==0) {
			System.out.println(num + "is prime number");
		}

	}

}

