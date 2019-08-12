package paint;

public class SwapTest {
	public static void swap1(int m,int n) {
		int temp = m;
		m=n;
		n=temp;
	}
	public static void swap2(Value m,Value n) {
		int temp = m.val;
		m.val=n.val;
		n.val=temp;
	}
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i+ ":" + j );
		swap1(i,j);
		System.out.println(i+":"+j);
		Value v1 = new Value(10);
		Value v2 = new Value(20);
		System.out.println(v1.val+ ":" + v2.val );
		swap2(v1,v2);
		System.out.println(v1.val+":"+v2.val);
		
	}

}
