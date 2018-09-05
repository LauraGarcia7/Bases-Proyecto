/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lala
 */
public class Proyecto {
    public static void main(String[] args) {
         ArrayList<Object> arreglo = new ArrayList<Object>();
         Scanner sc= new Scanner(System.in);
         int latitud,longitud,ID;
         String EmpresaContratante, Ubicacion,fecha;
         do{    
             ID=sc.nextInt();
             if (ID==000) {
                 break;
             }
             latitud=sc.nextInt();
             longitud=sc.nextInt();
             EmpresaContratante=sc.next();
             Ubicacion=sc.next();
             fecha=sc.next();
        //Fecha, Ubicacion, Coordenadas, EmpresaContratante, ID
         ArrayList<Object> arreglito = new ArrayList<Object>();
         arreglito.add(ID);
         arreglito.add(fecha);
         arreglito.add(latitud);
         arreglito.add(longitud);
         arreglito.add(EmpresaContratante);
         arreglito.add(Ubicacion);
         
         arreglo.add(arreglito);
                 
             } while (true);
      
         System.out.println(arreglo.toString());
         
         
         Collections.sort(arreglo, new Comparator() {
	
	public int compare(arreglo p1, Persona p2) {
		return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
	}
});
         for (int i = 0; i < arreglo.size(); i++) {
            Object arreglito;
            String o;
            arreglito=(arreglo.get(i));
            System.out.println(arreglito);
            arreglito.
        }
    /**
     * @param args the command line arguments
     */
   
    
}
