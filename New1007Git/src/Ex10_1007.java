
public class Ex10_1007 {

	public static void main(String[] args) {
		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은?");
		int sum = 0;
		int i = 1;
		
		while(sum<5000) {
			sum += i;
			if(sum>5000) {
				sum -= i;
				i--;
				break;
			}
			++i;
		}
		System.out.printf("1부터 %d까지의 합이 %d입니다.",i,sum);
	}

}
