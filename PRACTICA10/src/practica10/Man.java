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
public class Man extends  SuperMan{
    private String Edad;
    private String Nombre;
    
    
    public Man()
    {

    }
	
    public String caminar()
    {
    	return ("Camina");
    }

    /**
     *
     * @return
     */
    @Override
    public String SuperFuerza() {
        return ("Con más fuerza");
    }

    /**
     * @return the Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
