/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Agustín Carmona
 */
public class CPU {
    private String marca;
    private String modelo;
    private int velocidadProcesor;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadProcesor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesor = velocidadProcesor;
    }

    public int getVelocidadProcesor() {
        return velocidadProcesor;
    }

    public void setVelocidadProcesor(int velocidadProcesor) {
        this.velocidadProcesor = velocidadProcesor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesor=" + velocidadProcesor + '}';
    }
    
    
    
}
