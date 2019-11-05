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
public class Radio extends Movil{
    private String color;
    private String marca;
    private String Modelo;
    private String banda;

    @Override
    public void apagar(int a) {
        System.out.println("Radio "+a+" apagado");
    }

    @Override
    public void encender(int a) {
        System.out.println("Radio "+a+" encendido");
    }

    Radio(String banda){
        this.CambiarBanda(banda);
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
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the banda
     */
    
    public void CambiarBanda(String cambio){
        this.banda = cambio;
    }
    
    public void CambiarEstacion(int a){
        System.out.println("Se ha cambiado la estacion de la radio "+a);
    }

    /**
     * @return the banda
     */
    public String getBanda() {
        return banda;
    }
}
