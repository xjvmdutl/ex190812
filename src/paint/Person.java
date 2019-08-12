package paint;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name=name;
		System.out.println("Person() called");
	}
	//public Person() {//1번 방법(암시적 부모 기본생성자 호출)
	//}
}
