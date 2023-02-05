import java.util.function.BiConsumer;

public class Exm5_7 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
						};
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("=============================");
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		
		for(int i=0; i<score.length; i++) {
			int num = i+1;
			int kor = 0;
			int eng = 0;
			int math = 0;
			int sum = 0;
			float avg = 0.0f;
			System.out.printf("%2d", num);

			
			for(int j=0; j<score[i].length; j++) {
				kor = score[i][j];
				eng = score[i][j];
				math = score[i][j];
				sum = kor + eng + math ;
				avg = (float)sum / score[i].length;
				korSum += kor;
				engSum += eng;
				mathSum += math;
				System.out.printf("%5d%5d%5d%5d%7.1f%n", kor, eng, math, sum, avg);
				break;
				
			}
			
		}
		System.out.println("=============================");
		System.out.printf("총점:%3d%5d%5d", korSum, engSum, mathSum);
	}
}