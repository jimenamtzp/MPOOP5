/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String lugar;
    private Fecha fNacimiento;
    private int posicion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ocupacion, String lugar, Fecha fNacimiento, int posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.lugar = lugar;
        this.fNacimiento = fNacimiento;
        this.posicion = posicion;
    }
    
    public Persona(String nombre, String apellido, String ocupacion, String lugar, int dia, int mes, int anio, int posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.lugar = lugar;
        this.fNacimiento = new Fecha(dia, mes, anio);
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion() {
        this.posicion = posicion;
    }

    @Override //Anotación que me dice que hay una sobreescritura del texto
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido +", ocupacion = " + ocupacion +", lugar = " + lugar + ", fNacimiento = " + fNacimiento + ", Posicion = "+ posicion +'}';
    }
    
}
