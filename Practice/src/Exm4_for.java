import java.util.*;
public class Exm4_for {

	public static void main(String[] args) {
		int num, input = 0;
		num = (int)(Math.random() * 100) + 1;
		System.out.print("숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.nextInt();
			if(input > num) {
				System.out.println("더 작은 값을 입력하세요.");
			}
			else if(input < num) {
				System.out.println("더 큰 값을 입력하세요.");
			}
			
		} while (input != num);
		
		System.out.println("정답입니다.");

	}

}
