
public class Exm5_2 {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0.0;
		int[] array = {100, 79, 69, 55, 93};
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		average = sum / (double)array.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);

	}

}
