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
public class Celular extends Telefono {
    
    private String empresa;
    
    public Celular(long numero, String modelo, String marca, String empresa){
        super(numero, modelo, marca);
        this.empresa = empresa;
    }
    
    public String getEmpresa(){
        return empresa; 
    }
    public void setEmpresa(String e){
        empresa = e;
    }

    @Override
    public boolean Llamar(long nroDestino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
