package Cal;

public abstract class Arith {
	protected int a;
	protected int b;
	public void Set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public abstract int calculate();
}
