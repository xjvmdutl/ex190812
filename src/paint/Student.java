package paint;

public class Student extends Person {
	
	public Student() {
		//1.자식 생성자에서 부모 생성자는 반드시 호출된다
		//2.그래서 코드에 명시적인 부모 생성자 호출이 없는 경우
		//	컴파일러가 자동으로 부모의 기본 생성자 호출을 넣어준다.
		//super();//이게 생략되어 있다, 컴파일러가 넣어준다.
		//1.암시적으로 부모 생성자 호출
		super("김준호");//2.명시적으로 부모생성자 호출->자동으로 부모의 기본생성자 호출을 하지 않는다.
		//super()는 반드시 앞에 명시해어야한다.
		System.out.println("Student() called");
		//super();//에러
	}
}
