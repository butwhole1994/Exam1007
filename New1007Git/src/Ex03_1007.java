import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex03_1007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = false;
		
		do {
			System.out.print("학점을 입력하세요.(A~D,F): ");
			String scolar = br.readLine();
			
			switch (scolar) {
			case "A" :
			case "B" :
				System.out.println("참 잘하였습니다.");
				break;
			case "C" :
			case "D" :
				System.out.println("좀 더 노력하세요.");
				break;
			case "F" :
				System.out.println("다음 학기에 다시 수강하세요.");
				break;
			default :
				System.out.println("잘못된 학점입니다. 다시 입력해주세요.");
				loop = true;
			}
			
		} while(loop);
		br.close();

	}

}
