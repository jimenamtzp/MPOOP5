/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Circulo {
    public final float PI = 3.1416f;
    private float radio;
    
    public Circulo(){ 
    }
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public void permietro(){
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro = "+perimetro);
    }
    
    public void area(){
        System.out.println("Area = "+(PI * radio * radio));
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio){
      //if(radio<=0){
      //    System.out.println("Error en el radio");
      this.radio = Math.abs(radio);
    }
    
    public String toString(){
        return "Circulo{radio="+radio+"}";
    }
}
