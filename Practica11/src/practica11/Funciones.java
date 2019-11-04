/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc18
 */
public class Funciones {

    //1.Funcion que reciba String y lo convierta a número
    public int convStr2Int(String str)
    {
        return Integer.parseInt(str);
    }
    
    //2.Funcion que reciba 3 números y retorne el mayor
    public int nummay(String n1, String n2, String n3)
    {
        int num1, num2, num3;
        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);
        num3 = Integer.parseInt(n3);
        if(num1>num2)
            if(num1>num3)
                return num1;
            else
                return num3;
        else
            if(num2>num3)
                return num2;
            else
                return num3;
    }
    
    
    //3.Funcion que reciba un arreglo de Strings y ordene los elementos de mayor a menor de acuerdo a la longitud de cada String.
    public String[] LongitudMayor(String[] str)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=i+1; j<10; j++)
            {
                if(str[i].length()<str[j].length())
                {
                    String aux=str[i];
                    str[i] = str[j];
                    str[j] = aux;
                }
            }
        }
        return str;
    }
    
    //3.Funcion que reciba un arreglo de Strings y regrese un String separado por -, |.
    public String Concatenacion(String[] str)
    {
        String concatenado="";
        for(int i=0; i<10; i++)
            concatenado = concatenado.concat(str[i]+"-");
        return concatenado;
    }
    
    //5.Funcion que reciba un String y retorne la longitud del String
    public int Strlongitud(String str)
    {
        int i=0;
        for(i=0; i<str.length(); i++);
        return i;
    }
    
    //6.Funcion que reciba un String, y retorne la posicion de cada String.
    public String Posicion(String str)
    {
        String pos = "";
        for(int i=0; i<str.length(); i++)
        {
            pos = pos.concat(String.valueOf(i));
        }
        return str+"/"+pos;
    }
    
    //7.Funcion que recibe un arreglo de 10 elementos y muestre los elementos que comiencen con A
    public String[] comenzarA(String[] str)
    {
        String seleccion[] = new String[10];
        int j=0;
        for(int i=0; i<10; i++)
        {
            if(str[i].startsWith("A") || str[i].startsWith("a"))
            {
                seleccion[j] = str[i];
                j++;
            }
        }
        return seleccion;
    }
    
    //8.Funcion que recibe un arreglo de 10 elementos y muestre los elementos que terminen con S
    public String[] terminarS(String[] str)
    {
        String seleccion[] = new String[10];
        int j=0;
        for(int i=0; i<10; i++)
        {
            if(str[i].endsWith("S") || str[i].endsWith("s"))
            {
                seleccion[j] = str[i];
                j++;
            }
        }
        return seleccion;
    }
    
    //9.Funcion que recibe un arreglo de 10 elementos y muestre los elementos que contentan la A
    public String[] containsStr(String[] str)
    {
        String seleccion[] = new String[10];
        int j=0;
        for(int i=0; i<10; i++)
        {
            if(str[i].contains("A") || str[i].contains("a"))
            {
                seleccion[j] = str[i];
                j++;
            }
        }
        return seleccion;
    }
    
    //10.Funcion que recibe un string e imprima el alfabeto con su índice
    public void containAlfabeto(String str)
    {
        str = str.toUpperCase();
        char []letras = new char[30];
        letras[0]=str.charAt(0);
        for(int i=1; i<30; i++)
            letras[i]='/';
        int k=1;
        for(int i=1; i<str.length(); i++)
        {
            Boolean flag = false, flag2=false;
            int j=0;
            while(j<30)
            {
                if(str.charAt(i) != letras[j])
                    flag = true;
                j++;
            }
            j=0;
            for(int m=0; m<30; m++)
            {
                if(letras[m]==str.charAt(i))
                    flag2=true;
            }
            if(!flag2)
                if(flag)
                {
                    letras[k]=str.charAt(i);
                    k++;
                }
        }
        System.out.println("Las letras contenidas en esta cadena son: ");
        for(int i=0; i<k; i++)
        {
            String cadena="";
            for(int j=0; j<str.length(); j++)
            {
                if(letras[i]==str.charAt(j))
                    cadena = cadena.concat(j+",");
            }
            System.out.println(letras[i]+"="+cadena);
        }
    }
    
    //11.Funcion que reciba un string y diga si es palindromo o no.
    public void palindromo(String str)
    {
        int tamanio = str.length()-1;
        Boolean palind = true;
        for(int i=0; i<tamanio; i++)
        {
            if(str.charAt(i)!=str.charAt(tamanio))
                palind = false;
            tamanio--;
        }
        if(palind)
            System.out.println("Es palindromo");
        else
            System.out.println("No es palindromo");
    }
    
    //12.Funcion que reciba un String y se divida por espacios.
    public void divesp(String str)
    {
        String []cadena;
        cadena = str.split(" ");
        for(int i=0; i<cadena.length; i++)
        {
            System.out.println(cadena[i]);
        }
    }
    
    //12.Funcion que reciba un String y se divida por espacios y mencione cual cadena es mayor
    public String divespM(String str)
    {
        String []cadena;
        cadena = str.split(" ");
        for(int i=0; i<cadena.length; i++)
        {
            if(cadena[0].length()<cadena[i].length())
            {
                 String aux = cadena[0];
                 cadena[0]=cadena[i];
                 cadena[i]=aux;
            }
        }
        return cadena[0];
    }
}
