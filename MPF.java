package miniProyecto;

import java.util.Scanner;

public class MPF {

	public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Ingrese la plabra secreta en mayúscula: ");
			String pS = lector.next();
			
			char[] car = pS.toCharArray();
	        char[] lon = new char[pS.length()];
	        
	        for(int i = 0; i < pS.length(); i++) {
	        	lon[i]= '_';
	        }
	        
	        
	        boolean fin = false; 
	        int inte = 0;
	        boolean letA;
	        
	        while(!fin && inte < 6) {
	        	System.out.println("ingrese una letra: ");
	            char let = lector.next().charAt(0);
	            
	            for(int i = 0; i<pS.length(); i++) {
	            	if(car[i] == let) {
	            		lon[i] = let;
	            		letA = false;
	            		
	            	}else {
	            	   inte++;
	            	} 
	            }
	            
	            for (int i = 0; i < lon.length; i++) {
	                System.out.print(lon[i] + " ");
	            }

	            
	            if (inte == 1) {
	                System.out.println(" O ");
	            } else if (inte == 2) {
	                System.out.println(" O ");
	                System.out.println(" | ");
	            } else if (inte == 3) {
	                System.out.println(" O ");
	                System.out.print("/| ");
	            } else if (inte == 4) {
	                System.out.println(" O ");
	                System.out.println("/|\\");
	            } else if (inte == 5) {
	                System.out.println(" O ");
	                System.out.print("//|\\");
	                System.out.print(" | ");
	            } else if (inte == 6) {
	                System.out.println(" O ");
	                System.out.print("//|\\");
	                System.out.print(" | ");
	                System.out.print("/ \\");
	                System.out.print("¡Perdiste! La palabra era: " + pS);
	                fin = true;
	            }
	            
	            boolean tLA = true;
	            
	            for (int i = 0; i < lon.length; i++) {
	                if (lon[i] == '_') {
	                    tLA = false;
	                    
	                }
	            }

	            if (tLA) {
	                fin = true;
	                System.out.println("¡Felicidades! Has adivinado la palabra.");
	            }
	        }
	        
	        }
	       
	        
	}

