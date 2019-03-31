package java38;


public class Cllllo {

	public int []zxm_a = {1};
	public int zxm_max = zxm_a[0];
	public int zxm_temp = 0;	
	public int start = 0;
	
	
	//This is the head of the function
	public static void main(String[] args) {
		//This is the body of the function
		Cllllo c = new Cllllo();
		c.evaluation();
	}
	
	//This is the head of the function
	public void evaluation() {
		
		
		
		//This is the body of the function
		for (int i = 0; i < 2*zxm_a.length; i++) {
			
			//Judge jump condition
			if (start==i-zxm_a.length) {
				break;
			}
			
			//The algorithm for calculating the sum of the largest subarrays
			if (zxm_temp<0) {
				zxm_temp = zxm_a[i%zxm_a.length];
				start = i;
//System.out.println("i"+i);
			}else {
				zxm_temp += zxm_a[i%zxm_a.length];
			}
			
			if (zxm_temp>zxm_max) {
				zxm_max = zxm_temp;
			}
			
			
			
		}
		//The output
		System.out.println(zxm_max);
	}

}
