
public class izlez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vnesi strana a: ");
		double a = input.nextDouble();
		
		System.out.println("Vnesi strana b: ");
		double b = input.nextDouble();
		
		System.out.println("Vnesi strana c: ");
		double c = input.nextDouble();
		
		
		vlez zadaca_1 = new vlez(a, b, c);
		if (zadaca_1.rezultat()) {

		System.out.println("Postoi triagolnik so zadadenite strani ");
		if (a * a == b * b + c * c || b * b == a * a + c * c|| c * c == a * a + b * b) {
		System.out.print("Toj e pravoagolen. ");
		
		} else if (a * a < b * b + c * c && b * b < a * a + c * c && c * c < a * a + b * b );
		System.out.print(" Toj e ostroagolen "); 
		
		System.out.print("Toj e tapoagolen ");
		} else
		System.out.print(" Ne postoi triagolnik so dadenite strani. ");

}
