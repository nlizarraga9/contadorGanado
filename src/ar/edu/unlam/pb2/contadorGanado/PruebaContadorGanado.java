package ar.edu.unlam.pb2.contadorGanado;

import java.util.Scanner;

public class PruebaContadorGanado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Listo para comenzar a contar");
		System.out.println("Oprima 0 para ver lo contado");
		System.out.println("Oprima -1 para Resetear");
		System.out.println("Oprima -2 para Apagar");
		
		Scanner teclado = new Scanner(System.in);
		
		ContadorDeGanado contador = new ContadorDeGanado();
		
		int cuenta;
		boolean ingreso_correcto = true;
		
		while (ingreso_correcto) {
			try {
				System.out.println("Cuente");
				cuenta = teclado.nextInt();
				
				if (cuenta == -1) {
					contador.reset(true);
				}else if (cuenta == 0) {
					System.out.println("Por ahora el total contado es: "+contador.getValorActual());
				}else if (cuenta == -2) {
					ingreso_correcto = false;
					System.out.println("Chau");
				} else if (cuenta>0) {
					contador.cuenta(cuenta);
				}
			}catch (Exception e) {
				System.out.println("Ingrese un numero correcto!");
				ingreso_correcto = true;
				teclado.nextLine();
			}
		}
	}

}
