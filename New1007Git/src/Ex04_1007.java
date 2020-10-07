import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex04_1007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int sum = 0;
		
		System.out.println("점수를 입력하고 마지막에 -1을 입력하세요.");
		while(true) {
			int input = Integer.parseInt(br.readLine());
			if(input==-1) {
				break;
			}
			++cnt;
			sum += input;
		}
		double avg = (sum/(cnt*1.0));
		System.out.printf("정수의 개수는 %d개이며 합은 %d이고 평균은 %.2f입니다.",cnt, sum, avg);
		br.close();
	}
	

}
