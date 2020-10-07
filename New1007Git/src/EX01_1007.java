import java.io.*;
public class EX01_1007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score;
		
		do {
			System.out.print("점수를 입력하시오: ");
			score = Integer.parseInt(br.readLine());
			if(score<0 || score>100) {
				System.out.println("올바르지 않은 범위(0~100)입니다. 다시 입력해주세요.");
			}
		} while(score<0 || score>100);
		
		if(score>=80) {
			System.out.println("축하합니다! 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		br.close();
	}

}
