package paint;

public abstract class Shape implements Drawable {
	private String lineColor;
	private String fillColor;
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	//public abstract void draw(); //{상속을 해주는 부모타입을 수정해야한다.
		//if(this instanceof Triangle) {
			//System.out.println("삼각형을 그렸습니다");
		//}else if(this instanceof Rect) {
			//System.out.println("사각형을 그렸습니다");
		//}
		//구현이 되지 않는다->abstract를 사용(new Shape가 안된다.)
	//}
}
