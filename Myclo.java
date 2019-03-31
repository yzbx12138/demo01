package java38;

public class Myclo {

	public static void main(String[] args) {//不行，待改进
		int []a = {-1,20,-5,30,-4};
		int max = a[0];
		int temp = 0;
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				temp+=a[j];
			}
			if (max<temp) {
				max = temp;
				System.out.println(max);
			}
			temp = 0;
		}
		System.out.println(max);

	}

}
