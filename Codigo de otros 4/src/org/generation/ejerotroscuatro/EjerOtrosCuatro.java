package org.generation.ejerotroscuatro;


import java.util.Scanner;//importar clase scanner

public class EjerOtrosCuatro {
	

	    public static void main(String[] args) {// creación de metodo main
	        Scanner sc = new Scanner(System.in); // instancias de scanner para utilizar System.in

	        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	        String j1 = sc.nextLine();

	        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	        String j2 = sc.nextLine();

	        if (j1.equals(j2)) {
	            System.out.println("Empate");
	        } else {
	            int ganador = 2;
	            switch (j1) {
	                case "piedra":
	                    if (j2.equals("tijeras")) { // se sustituye el "==" por "equals"
	                        ganador = 1;
	                    }
	                    break; // se agrega el fin de cada caso con un break
	                case "papel":
	                    if (j2.equals("piedra")) {
	                        ganador = 1;
	                    }
	                    break;
	                case "tijeras":
	                    if (j2.equals("papel")) {
	                        ganador = 1;
	                    }
	                    break;
	                default:
	            }
	            System.out.println("Gana el jugador " + ganador);
	        }
	    }
	}


/*
 * 1. Se importó la clase Scanner.
 * 2. Se creó un método main para que el código sea ejecutable.
 * 3.Se corrigió la creación de instancias de Scanner para que se utilice System.in.
 * 4. Se corrigieron las comparaciones de cadenas, utilizando el método equals() en lugar del operador ==.
 * 5.Se corrigieron los casos del switch para que cada caso termine con break.*/


