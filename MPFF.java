package miniProyecto;

import java.util.Scanner;

public class MPFF {

	public static void main(String[] args) {
		        Scanner lector = new Scanner(System.in);
		        
		        // Pedirle al jugador ingresar una plabara secretea
		        
		        System.out.print("→Ingrese la palabra secreta en mayúscula: ");
		        String palabraSecreta = lector.next();
		        
		        
		        // Converrtir la palabra en un arreglo de char
		        
		        char[] charArray = palabraSecreta.toCharArray();
		        char[] longChar = new char[palabraSecreta.length()];

		        
		        // Se actualiza el arreglo con la misma cantidad de guiones que letras en la palabra secrteta
		        
		        for (int i = 0; i < palabraSecreta.length(); i++) {
		        	longChar[i] = '_';
		        }

		        boolean fin = false;
		        int intentFallidos = 0;

		        while (!fin && intentFallidos < 6) {

		            System.out.print('\n' + "Ingrese una letra: ");
		            char letra = lector.next().charAt(0);

		            boolean letAdivinada = false;
		        
		            
		         // Comparar la letra ingresada con cada letra de la palabra secreta

		            for (int i = 0; i < palabraSecreta.length(); i++) {
		                if (charArray[i] == letra) {
		                	longChar[i] = letra;  // Si la letra coincide se actualiza el array longChar
		                	letAdivinada = true;
		                }
		            }
		            
		         // Si la letra no está en la palabra secreta aumentan los intentos fallidos

		            if (!letAdivinada) {
		            	intentFallidos++;
		            }
		            
		            // Muestra el estado actual del array longChar (el progreso de la palabra adivinada)
		            
		            for (int i = 0; i < longChar.length; i++) {
		                System.out.print(longChar[i] + " ");
		            }

		            if (intentFallidos == 1) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|           ");
	        			System.out.println("				|           ");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");
		            } else if (intentFallidos == 2) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|         | ");
	        			System.out.println("				|           ");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");
		            } else if (intentFallidos == 3) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|        /| ");
	        			System.out.println("				|           ");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");
		            } else if (intentFallidos == 4) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|        /|\\ ");
	        			System.out.println("				|           ");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");

		            } else if (intentFallidos == 5) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|        /|\\");
	        			System.out.println("				|        /  ");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");
		            } else if (intentFallidos == 6) {
		            	System.out.println("			|¯¯¯¯¯¯¯¯¯|   ");
	        			System.out.println("				|         O ");
	        			System.out.println("				|        /|\\");
	        			System.out.println("				|        / \\");
	        			System.out.println("				|           ");
	        			System.out.println("                             ¯¯¯¯¯¯¯");
	        			
	                    System.out.println('\n' +"---------------------------------------------" + '\n' );
		                System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
		                fin = true;
	                    System.out.println('\n' +"---------------------------------------------" + '\n' );

		            }

		            boolean tLetrasAdivinadas = true;
		            
		         // Si hay algun guion significa que no adivinó la palabra y perdió
		            
		            for (int i = 0; i < longChar.length; i++) {
		                if (longChar[i] == '_') {
		                	tLetrasAdivinadas = false;
		                    
		                }
		            }

		         // Si todas las letras han sido adivinadas se termina el juego

		            if (tLetrasAdivinadas) {
		                fin = true;
	                    System.out.println('\n' +"---------------------------------------------" + '\n' );
		                System.out.println("¡Adivinaste la palabra!");
	                    System.out.println('\n' +"---------------------------------------------" + '\n' );

		            }
		        }
		    }
		}

	