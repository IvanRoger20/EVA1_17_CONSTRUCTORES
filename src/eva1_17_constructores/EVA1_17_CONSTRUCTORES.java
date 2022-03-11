/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_constructores;


/**
 *
 * @author IvanTron
 */
public class EVA1_17_CONSTRUCTORES
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        Persona persona2 = new Persona();
        System.out.println("Nombre 2: " +  persona2.getNombre());
        System.out.println("Edad 2: " + persona2.getEdad());
        
        Persona persona3 = new Persona("Ruben", 40);
        System.out.println("Nombre 3: " +  persona3.getNombre());
        System.out.println("Edad 3: " + persona3.getEdad());
        
        Persona persona4 = new Persona(5.0);
        System.out.println("Nombre 4: " +  persona4.getNombre());
        System.out.println("Edad 4: " + persona4.getEdad());
    }
    
}

class Persona {
    private String nombre;
    private int edad;

    //Constructor Default
    public Persona() {
        System.out.println("Creando el objeto");
        nombre = "Juan Perez";
        edad = 100;
    }
    
    //Sobrecarga de métodos
    public Persona(String nombre, int edad) {
        System.out.println("Creando el objeto con constructor que acepta valores");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(double valor) {
        System.out.println("Creando el objeto con el constructor que acepta double");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}