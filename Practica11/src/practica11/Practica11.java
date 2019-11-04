/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author pc18
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funciones cadena = new Funciones();
        System.out.println("Funcion String 2 Int " + cadena.convStr2Int(("147")));
        System.out.println("Medida de la cadena: "+cadena.Strlongitud("HOLA"));
        System.out.println("El numero mayor de 20, 24 y 15 es: "+cadena.nummay("24", "15", "20"));
        String []cads = {"HOLA", "MAURICIO", "PIZZA", "OCTUBRE", "EXACTO", "SEIS", "ALITAS", "HAMBURGUESA", "MIGUEL", "teclado"};
        String []cads2;
        cads2 = cadena.LongitudMayor(cads);
        System.out.println("Las cadenas acomodadas de mayor a menor en longitud son:");
        for(int i=0; i<10; i++)
            System.out.println(cads2[i]);
        System.out.println("Los elementos en una cadena separada por - son: "+cadena.Concatenacion(cads));
        System.out.println("Los indices del String ingresado son: "+cadena.Posicion("Medicina"));
        cads2 = cadena.comenzarA(cads);
        System.out.println("Las cadenas que comienzan con la letra a son:");
        for(int i=0; cads2[i]!=null; i++)
            System.out.println(cads2[i]);
        cads2 = cadena.terminarS(cads);
        System.out.println("Las cadenas que terminan con la letra s son:");
        for(int i=0; cads2[i]!=null; i++)
            System.out.println(cads2[i]);
        cads2 = cadena.containsStr(cads);
        System.out.println("Las cadenas que contienen la letra a son:");
        for(int i=0; cads2[i]!=null; i++)
            System.out.println(cads2[i]);
        cadena.containAlfabeto("RAMA");
        cadena.palindromo("ANA");
        cadena.divesp("ANITA LAVA LA TINA CON UNA LLAVE");
        System.out.println("La subcadena mas grande es: "+cadena.divespM("ESTA CADENA ES PALINDROMO"));
    }
    
}
