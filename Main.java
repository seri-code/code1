package classLesson;

public class Main {

	public static void main(String[] args) { // 실행 클래스 
		Average average = new Average();
			    //객체 : 새로운 클래스 -> 일반 클래스 파일의 파일명을 가져와서 적용시킴
		//즉, 객체 생성--->> 클래스의 인스턴스화 생성코드
		 //클래스를 참조하기 위해서 new 연산자를 사용하여 참조 변수 average를 만듦 
		
		int[] TestArr1 = { 3 , 4 , 5 };
		System.out.println(average.Average(TestArr1));
						//참조 변수명.클래스 내 메소드 형식(계산식 기능 수행)

		int[] TestArr2 = { 10, 20, 30 };
		System.out.println(average.Average(TestArr2));
		
		int[] TestArr3 = { 30, 60 };
		System.out.println(average.Average(TestArr3));
	}

}
