package CodigoDeOtrosE;

import java.util.Scanner;
public class CodigoOtros6 {
	


	    public static void main(String[] args) {
	        int[] n = new int[20];

	        for (int i = 0; i < 20; i++) {
	            n[i] = (int) (Math.random() * 381) + 20;
	            System.out.print(n[i] + " ");
	        }

	        System.out.println("\n¿Qué números quiere resaltar? ");
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        Scanner scanner = new Scanner(System.in);
	        int opcion = scanner.nextInt();

	        int multiplo = (opcion == 1) ? 5 : 7;

	        for (int e : n) {
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " ");
	            }
	        }
	        
	        scanner.close();
	    }
	}

/*Se importó la clase Scanner y se utilizó para leer la entrada del usuario.
Se cerró el objeto Scanner después de su uso para evitar posibles pérdidas de recursos.
Se corrigió la declaración de int[] n = new int[20];.
Se corrigió la lectura de la opción utilizando scanner.nextInt() en lugar de System.console().readLine().
Se corrigieron las impresiones con System.out.println() y System.out.print().*/