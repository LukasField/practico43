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
public class Fijo extends Telefono {
    private String f;
    private String tipoDeLinea;
    
    public Fijo(long numero, String modelo, String marca, String tipoDeLinea){
        super(numero, modelo, marca);
        this.tipoDeLinea = tipoDeLinea;
    }
    
    public String getTipoDeLinea(){
        return tipoDeLinea;
    }
    
    public void setTipoDeLinea(String t){
        tipoDeLinea = t;
    }

    @Override
    public boolean Llamar(long nroDestino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
