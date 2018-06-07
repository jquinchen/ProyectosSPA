
package cl.inacap.spa.dto;

/**
 *
 * @author javierquinchen
 */
public class Banco {
    int idBanco;
    String nombreBanco;

    public Banco() {
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    @Override
    public String toString(){
        return nombreBanco;
    }
    
}
