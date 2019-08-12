package Cal;
import java.util.Scanner;
public class CalcApp {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			int a = Integer.parseInt(tokens[0]);
			char c=tokens[1].charAt(0);
			int b = Integer.parseInt(tokens[2]);
			Arith arith = null;
			switch(c){
			case '+':
				arith = new Add();
				break;
			case '-':
				arith = new Sub();
				break;
			case '*':
				arith = new Mul();
				break;
			case '/':
				arith = new Div();
				break;
			default:
				break;
			}
			if(arith==null) {
				System.out.println("잘못된 사칙연산 입니다");
				break;
			}
			arith.Set(a, b);
			System.out.println(">>"+arith.calculate());
		}
		
		scanner.close();

	}

}
