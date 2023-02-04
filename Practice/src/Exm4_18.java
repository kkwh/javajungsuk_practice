import java.awt.Menu;
import java.util.Scanner;

public class Exm4_18 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. sqare");
			System.out.println("2. sqareroot");
			System.out.println("3. log");
			System.out.print("메뉴를 선택해주세요.");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(!(1 <= num && num <= 3)) {
				System.out.println("잘못입력하셨습니다. 첫 페이지로 이동합니다.");
				continue;
			}
				
				System.out.println("선택하신 메뉴는 " + num +"번입니다.");
			
		}

	}

}
