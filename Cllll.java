package java38;

import java.util.Random;

public class Cllll {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		int z;
		Random random = new Random();
		for (int i = 0; i < 10;) {
			a = random.nextInt(100);
			b = random.nextInt(100);
			c = random.nextInt(100);
			z = random.nextInt(4);
			
			if (z==0) {
				if (a+b+c>0&&a+b+c<100) {
					System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
					i++;
				}else {
				}
				
			}else if (z==1) {
				if (a+b-c>0&&a+b-c<100) {
					System.out.println(a+"+"+b+"-"+c+"="+(a+b-c));
					i++;
				}else {
				}
			}else if (z==2) {
				if (a-b+c>0&&a-b+c<100) {
					System.out.println(a+"-"+b+"+"+c+"="+(a-b+c));
					i++;
				}else {
				}
			}else {
				if (a-b-c>0&&a-b-c<100) {
					System.out.println(a+"-"+b+"-"+c+"="+(a-b-c));
					i++;
				}else {
				}
			}
			
		}
		
		//scanner.close();
	}

}
