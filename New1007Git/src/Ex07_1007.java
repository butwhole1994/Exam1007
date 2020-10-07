import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex07_1007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">>");
			String input = br.readLine();
			if(input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		}
		br.close();

	}

}
