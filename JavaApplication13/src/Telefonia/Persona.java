/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telefonia;
/**
 *
 * @author ULP
 */
public class Persona {
    
    private long dni;
    private String nombre;
    private String commit;
    public Persona(long dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void llamarMensajear(Telefono tel, long nroDestino, String mensaje){
        
         if(tel instanceof Celular){
             tel.Llamar(nroDestino);
             System.out.println(mensaje);
         }
    }
    
    
    
    
}
