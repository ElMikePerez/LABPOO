/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlpoo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author pc18
 */
public class EXAMENLPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono []celulares = new Telefono[3];
        Radio []radios = new Radio[3];
        for(int i=0; i<3; i++)
        {
            celulares[i] = new Telefono();
            if(i%2!=0)
                radios[i] = new Radio("FM");
            else
                radios[i] = new Radio("AM");
        }
        celulares[0].setMarca("LANIX");
        celulares[1].setMarca("LG");
        celulares[2].setMarca("SAMSUNG");
        celulares[0].setModelo("2015");
        celulares[1].setModelo("2009");
        celulares[2].setModelo("2004");
        celulares[0].setPrecio(2000);
        celulares[1].setPrecio(4500);
        celulares[2].setPrecio(6000);
        
        radios[0].setMarca("LG");
        radios[1].setMarca("STEREN");
        radios[2].setMarca("ELECTRONICS");
        radios[0].setColor("Amarillo");
        radios[1].setColor("Rojo");
        radios[2].setColor("Gris");
        radios[0].setModelo("ANTIGUO");
        radios[1].setModelo("VIEJO");
        radios[2].setModelo("GRANDE");
        
        System.out.println("Prueba de radios");
        for(int i=0; i<3; i++)
        {
            radios[i].encender(i+1);
            System.out.println("Banda = "+radios[i].getBanda());
            System.out.println("Marca = "+radios[i].getMarca());
            System.out.println("Color = "+radios[i].getColor());
            System.out.println("Modelo = "+radios[i].getModelo());
            radios[i].CambiarEstacion(i+1);
            radios[i].apagar(i+1);
        }
        
        System.out.println("Prueba de celulares");
        for(int i=0; i<3; i++)
        {
            celulares[i].encender(i+1);
            System.out.println("Marca = "+celulares[i].getMarca());
            System.out.println("Precio = "+celulares[i].getPrecio());
            System.out.println("Modelo = "+celulares[i].getModelo());
            celulares[i].hacerllamada(i+1);
            celulares[i].colgarllamada(i+1);
            celulares[i].apagar(i+1);
        }
    }
    
}
