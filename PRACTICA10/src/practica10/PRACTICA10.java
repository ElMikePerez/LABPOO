/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author pc18
 */
public class PRACTICA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Man superHombre = new Man();
        superHombre.setNombre("Paco");
        superHombre.setEdad("18");
        try
        {
            Man[] sh = new Man[3];
            int [] j = new int[5];
            String []a = new String[10];
            for (int i = 0; i < 3; i++) {
                sh[i] = new Man();
                sh[i].setNombre("Pedrito " + Integer.toString(i));
                sh[i].setEdad("2"+Integer.toString(i));
            }
            Man []sho = ImprimirArreglo(sh);
            imprimeArre(sho);
        }
            
        catch(Exception ex)
        {
             System.out.println(ex.getMessage());
        }
        
        // TODO code application logic her
    }
    
    public static Man[] ImprimirArreglo(Man[] m)
    {
        return m;
    }
    
    public static void imprimeArre(Man[] m)
    {
        for(Man n:m)
        {
            System.out.println(n.getNombre()+" "+n.getEdad() + " "+ n.BrincaMasAlto() + " " + n.SuperFuerza());
        }
    }
}
