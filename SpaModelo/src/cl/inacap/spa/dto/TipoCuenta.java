/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.spa.dto;

/**
 *
 * @author javierquinchen
 */
public class TipoCuenta {
    int idTipo;
    String nombreTipo;

    public TipoCuenta() {
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    @Override
    public String toString(){
        return nombreTipo;
    }
    
}
