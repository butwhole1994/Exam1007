import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex06_1007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		System.out.println("점수를 10개 입력하세요.");
		
		for(int i=0; i<10; ++i) {
			int input = Integer.parseInt(br.readLine());
			if (input==0 || input<0) {
				continue;
			}
			sum += input;
		}
		 
		System.out.printf("정수의 합은 %d",sum);
		br.close();
	}
	

}
