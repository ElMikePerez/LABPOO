/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlpoo;

/**
 *
 * @author pc18
 */
public class Telefono extends Movil{

    private String marca;
    private String modelo;
    private int precio;
    
    Telefono()
    {
        
    }
    
    @Override
    public void apagar(int a) {
        System.out.println("Telefono "+a+" apagado");
    }

    @Override
    public void encender(int a) {
        System.out.println("Telefono "+a+" encendido");
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void hacerllamada(int a)
    {
        System.out.println("Celular "+a+" llamando");
    }
    
    public void colgarllamada(int a)
    {
        System.out.println("Celular "+a+" colgando llamada");
    }
}
