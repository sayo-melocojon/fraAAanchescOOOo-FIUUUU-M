/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author User sayo melocojon 
 * 4 de diciembre. 2023
 */
 class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    public Vehiculo (String marca, String modelo, int año, String color){
        this.marca= marca;
        this.modelo=modelo;
        this.año=año;
        this.color= color;
    }
    public String getMarca(){
        return marca;
    }
            
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getModelo(){
        return modelo;
    }
            
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public int getAño(){
        return año;
    }
    
    public String getColor(){
        return color;
    }
            
    public void setColor(String color){
        this.color=color;
    }
}


