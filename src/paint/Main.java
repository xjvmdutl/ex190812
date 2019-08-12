package paint;

public class Main {
	//public static void drawPoint(Point point) {
	//	point.show();
	//}
	//public static void draw(Shape shape) {
	//		shape.draw();
	//}
	//public static void drawColorPoint(ColorPoint point) {
		//point.show();
	//}
	//public static void draw(Triangle triangle) {
		//triangle.draw();
	//}
	//public static void draw(Rect rect) {
		//rect.draw();
	//}
	//public static void draw(Circle circle) {
		//circle.draw();
	//}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	public static void resize(Drawable drawable) {
		if(drawable instanceof Resizable)
			((Resizable)drawable).resize();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		draw(p1);
		p1.show(false);//show메소드를 가지고 일관된방식으로 여러 기능을 구현할수 있다.
		
		//Point p2 =new Point(100,200);
		draw(new Point(100,200));
		
		//ColorPoint cp1 = new ColorPoint();
		//cp1.setX(300);
		//cp1.setY(200);
		//cp1.setColor("yellow");
		draw(new ColorPoint(300,200,"yellow"));
		//drawColorPoint(cp1);//
		//draw((Point)cp1);//다운 케스팅
		//Triangle triangle = new Triangle();
		draw(new Triangle());
		//Rect rect = new Rect();
		draw(new Rect());
		//Circle circle = new Circle();
		draw(new Circle());
		draw(new GraphicText("Hello"));
		//instanceof 연산자 
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle circle = new Circle();
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		//System.out.println(circle instanceof Triangle);//계층관게가 성립하지 않으면 instanceof연산자를 사용할수 없다.	
	}
}
