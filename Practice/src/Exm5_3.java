
public class Exm5_3 {

	public static void main(String[] args) {
		int[] score = {99, 40, 53, 68, 30, 86, 21};
		int max = score[0];
		int min = score[0];
	
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			else {
				min = score[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
}
}