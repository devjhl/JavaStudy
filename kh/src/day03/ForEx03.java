package day03;

public class ForEx03 {

	public static void main(String[] args) {
		//구구단 2단을 출력하는 코드를 작성하세요.
		/*
		 * 반복횟수 :
		 * 규칙성 : 2 x ? = ??를 출력
		 * 출력 예시
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * .....
		 * 2 x 9 = 18
		 */
			int num = 2;
			for(int i=1; i<=9; i++) {
				System.out.println(num+"x"+i +" =" + (2*i));
			}

	}

}
