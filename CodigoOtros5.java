package CodigoDeOtrosE;
import java.util.Scanner;

public class CodigoOtros5 {
	

	    public static void main(String[] args) { // se introduce metodo main
	        Scanner scan = new Scanner(System.in);// System.in
	        // Creación de variables
	        int numero = 0;// corrección de variables 
	        int numeroHolder = 0;
	        int afo = 0;
	        int noAfo = 0;
	        int digito = 0;
	        System.out.println("Instroduzca un numero");//Se añade println
	        numero = Integer.parseInt(scan.nextLine());
	        numeroHolder = numero;
	        scan.close();
	        while (numero > 0) {
	            digito = (int) (numero % 10);
	            System.out.println("Digito: "+digito);
	            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	                afo++;
	            } else {
	                noAfo++;
	            }
	            numero /= 10;// sacar condición del else
	                          
	        }
	        if (afo > noAfo) {// se crea if para aplicar condición solo al final del codigo
	            System.out.println("El " + numeroHolder + " es un número afortunado.");//corrección println
	        } else {
	            System.out.println("El " + numeroHolder + " no es un número afortunado.");
	        }
	    }

	}


