package Puntouno;

import java.util.Scanner;

class Triangulo  {
	public static void main(String[] args) {
		
		double base , altura , resultado ;
		Scanner obj = new Scanner  (System.in);
		
		System.out.append("ingrese base :\t");
		base = obj.nextDouble();
		
		System.out.append("ingrese la altura : t \t");
		altura = obj.nextDouble();
		
		resultado = ((base * altura)/2);
		
		System.out.print("el area del triangulo es :\t"+resultado);
	}
}



