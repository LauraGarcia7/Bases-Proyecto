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
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Labing
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            int ID = sc.nextInt();
            if (ID == 000) {
                break;
            }
            int latitud = sc.nextInt(), longitud = sc.nextInt();
            String EmpresaContratante = sc.next(), Ubicacion = sc.next(), fecha = sc.next();
            Objeto o = new Objeto(ID, fecha, longitud, latitud, EmpresaContratante, Ubicacion);
            array.add(o);

        } while (true);
        
        //Fecha, Ubicacion, Coordenadas, EmpresaContratante, ID
       /* Objeto o1 = new Objeto(12, "12/12/2012", 123, 321, "ANH", "cali");
         Objeto o2 = new Objeto(200, "09/03/2010", 5463, 321, "SOLAFE", "Bogota");
         Objeto o3 = new Objeto(3, "10/10/2014", 168, 666, "CAR", "cartagena");
         Objeto o4 = new Objeto(04555, "31/07/2018", 956, 584798, "GIA", "Maicao");
         Objeto o5 = new Objeto(9, "11/03/2012", 6568, 41658, "OOS", "villavicencio");
         Objeto o6 = new Objeto(18, "27/08/2000", 359, 1465, "PACIFIC", "barranquilla");
         Objeto o7 = new Objeto(97, "01/10/2016", 984569, 989, "SEA", "medellin");
         Objeto o8 = new Objeto(108, "15/02/2013", 1456, 1234, "ANH", "cali");
         Objeto o9 = new Objeto(1, "07/09/2015", 3299, 9685, "CAR", "bogota");
         Objeto o10 = new Objeto(10,"27/01/2007", 1657, 651,  "ANH", "bucarramanga");
         Objeto o11 = new Objeto(11,"5/11/2011", 57489, 9873,  "UNAL", "santamarta");
         Objeto o12 = new Objeto(Calendar.getInstance(), 5468, 98165, 1234567, "CVC", "neiva");
         Objeto o13 = new Objeto(Calendar.getInstance(), 5468, 12340, 1234567, "XPA", "ibague");
         Objeto o14 = new Objeto(Calendar.getInstance(), 123, 1264, 1234567, "ANH", "cali");
         Objeto o15 = new Objeto(Calendar.getInstance(), 5468, 321, 1234567, "ANH", "cali");
         Objeto o16 = new Objeto(Calendar.getInstance(), 123, 98765, 1234567, "CAR", "bogota");
         Objeto o17 = new Objeto(Calendar.getInstance(), 123, 324, 1234567, "ANH", "medellin");
         
         array.add(o1);
         array.add(o2);
         array.add(o3);
         array.add(o4);
         array.add(o5);
         array.add(o6);
         array.add(o7);
         array.add(o8);
         array.add(o9);
         array.add(010);
         array.add(o11);
         array.add(o12);
         array.add(o13);
         array.add(o14);
         array.add(o15);
         array.add(o16);
         array.add(o17);*/

        Objeto o = new Objeto();
       // System.out.println(o.toString());

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Holii  "+i + ":  " + array.get(i));
        }

        /*    Collections.sort(array, null);
        
         Collections.sort(array, new Comparator() {
         public int compare(Objeto p1, Objeto p2) {
         return new Integer(p1.getId()).compareTo(new Integer(p2.getId()));
         }

         @Override
         public int compare(Object o1, Object o2) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
         });
         */
        JavaApplication1.Ordenar(1, array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Ordenado  "+i + ":  " + array.get(i));
        }
    }

    public static void Ordenar(int Opcion, ArrayList array) {

        switch (Opcion) {
            case 1:
                System.out.println("ID");
                Collections.sort(array);
                
              /*  Collections.sort(array, new Comparator(){
                    public int compare(Objeto p1, Objeto p2) {
                        return new Integer(p1.getId()).compareTo(new Integer(p2.getId()));
                    }

                    public int compare(Object o1, Object o2) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });*/
                break;
            case 2:
                System.out.println("ID");
                Collections.sort(array, new Comparator() {
                    public int compare(Objeto p1, Objeto p2) {
                        // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                        return new String(p2.getUbicacion()).compareTo(new String(p1.getUbicacion()));
                    }

                    public int compare(Object o1, Object o2) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
                break;

        }

    }

}
