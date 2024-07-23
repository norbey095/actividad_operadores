package actividad_operadores;

import java.util.Scanner;

public class Actividad_Operadores {

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int primer_numero, segundo_numero;
			
			System.out.print("Ingresa el primer numero: ");
			primer_numero = sc.nextInt();
			
			System.out.print("Ingresa el segundo numero: ");
			segundo_numero = sc.nextInt();
			
			//suma
			System.out.println("La suma es: " + (primer_numero + segundo_numero));
			//multiplicacion
			System.out.println("La multiplicacion es: " + (primer_numero * segundo_numero));
			//¿son iguales?
			System.out.println("Son iguales? "+ (primer_numero == segundo_numero));
			//¿el primer numero es menor que el segundo?
			System.out.println("El primero es menor que el segundo?  "+ (primer_numero < segundo_numero));
			//¿el segundo numero es mayor o igual que el primero
			System.out.println("El segundo numero es mayor o igual al primero?  "+ (segundo_numero >= primer_numero));
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
}
