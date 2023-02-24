package Puntotres;

import java.util.Scanner;

public class Puntotres{
	
	public static void main (String[] args ) {
		try (Scanner scanner = new Scanner (System.in)) {
			int personas = 0;
			
			int result;
			
			
			
			
			System.out.print("digite el numero de personas que se registran en el viaje");
			 personas = scanner.nextInt();
			
			 if (personas <=45) {
				System.out.print("se utilizara  un bus");
			 }
				
				else {
					 result = personas -45;
					
					System.out.print("las personas que no podran ir en el bus se iran en fulgonetas"+result+ "personas se iran en fulgonetas");
				}
				

		}

	}


}