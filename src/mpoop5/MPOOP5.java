 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class MPOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir1 = new Circulo();
        //cir1.radio = 5; no es correcto
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.permietro();
        System.out.println(cir1.toString());
        System.out.println(cir1);
        
        System.out.println("################");
        Circulo cir2 = new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        
        System.out.println("################");
        Coche coche = new Coche();
        System.out.println(coche);
        
        System.out.println("#######Chofer#########");
        Persona per1 = new Persona();
        per1.setNombre("Panchito");
        per1.setApellido("Lopez");
        per1.setOcupacion("Chofer");
        per1.setLugar("CDMX");
        //per1.setfNacimiento(fnacimiento);
        Fecha fecha = new Fecha(6,12,2001);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
        
        System.out.println("#######Copiloto#########");
        Persona per2 = new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Aguilar");
        per2.setOcupacion("Copiloto");
        per2.setLugar("Nueva York");
        per2.setfNacimiento(new Fecha(15,06,1989));
        System.out.println(per2);
        
        System.out.println("#######Persona1#########");
        Persona per3 = new Persona("Alan","Martínez","Persona 1","Los Ángeles",new Fecha(16,02,2002), 1);
        System.out.println(per3);
        
        System.out.println("########Persona2########");
        Persona per4 = new Persona("Sofia","Pineda","Persona 2","París",12,9,1999,1);
        System.out.println(per4);
        
        System.out.println("#######Chofer#########");
        Persona chofer = new Persona("Juan", "Perez", "Chofer","CDMX",2,3,2001,1);
        Persona copiloto = new Persona("Ama", "Hernandez", "Chofer","CDMX",2,3,2001,1);
        Persona persona1 = new Persona("Jorge", "Martinez", "Chofer","CDMX",2,3,2001,1);
        Persona persona2 = new Persona("Juana", "Lopez", "Chofer","CDMX",2,3,2001,1);
        Coche coche1 = new Coche("Chevrolet","Azul",345,4,8766,chofer,copiloto,persona1,persona2);
        System.out.println(coche1);
        
    }  
}
