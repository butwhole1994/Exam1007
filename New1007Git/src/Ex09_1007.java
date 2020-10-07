
public class Ex09_1007 {

	public static void main(String[] args) {
		int mul = 1;
		for(int i=1; i<=10; ++i) {//줄바꿈 횟수
			mul *= i;
			for(int j=1; j<i+1; ++j) { //출력
				System.out.print(j);
				if(i==1) {//첫 행은 * 없음
					
				} else if(j==i){//마지막 열은 * 없음
					
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println(" = "+mul);
		}

	}

}
