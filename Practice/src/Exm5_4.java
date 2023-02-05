import java.util.Arrays;

public class Exm5_4 {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		int n = 0;
		int tmp = 0;
		
		for(int i=0; i<100; i++) {
			n = (int)(Math.random()*10);
			tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			
		}
		System.out.println(Arrays.toString(numArr));
	}
}