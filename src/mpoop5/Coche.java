/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Coche {
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    public Coche(){
    }

    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio, String nombre, String apellido, String ocupacion, String lugar, int dia, int mes, int anio, int posicion) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
        this.chofer = new Persona(nombre, apellido, ocupacion, lugar, dia, mes, anio, posicion);
        this.copiloto = new Persona(nombre, apellido, ocupacion, lugar, dia, mes, anio, posicion);
        this.pasajero1 = new Persona(nombre, apellido, ocupacion, lugar, dia, mes, anio,posicion);
        this.pasajero2 = new Persona(nombre, apellido, ocupacion, lugar, dia, mes, anio, posicion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getModeloAnio() {
        return modeloAnio;
    }

    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public void encender(){
        System.out.println("Estoy encendiendo");
    }
    
    public void apagar(){
        System.out.println("Me voy a apagar");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
    
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de "+velocidad+"km/h");
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca = " + marca + ", color = " + color + ", placa = " + placa + ", numPuertas = " + numPuertas + ", modeloAnio = " + modeloAnio + ", Chofer = " + chofer +", Copiloto = "+ copiloto + ", Pasajero 1 = "+ pasajero1 + ", Pasajero 2 = "+ pasajero2 + '}';
    }//Ultimo metodo que vamos a hacer
    
    
}
