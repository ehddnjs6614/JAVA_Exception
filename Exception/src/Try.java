
public class Try {
	
	public static void main(String[] args) {
	 // alt + shift +Z 트라이캐치 
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {//오류가 났을때만 이부분으로 넘어와서 실행
			
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); //로그파일기록할때 유용하게 쓰임.
			e.printStackTrace(); // 그오류 내용까지 파악가능.
			}
		System.out.println("종료");
	}
}
