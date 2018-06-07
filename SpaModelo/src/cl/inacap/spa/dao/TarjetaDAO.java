package cl.inacap.spa.dao;

import cl.inacap.spa.dto.*;
import cl.inacap.spa.dao.*;
import cl.inacap.spa.utils.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author javierquinchen
 */
public class TarjetaDAO extends Conexion{
    
    public void addTarjeta(Tarjeta tarjeta){
         try {
            this.conectar();
            String sql = "INSERT INTO Tarjeta (numCuenta, fechaVencimiento,codigo,idBanco, tipoCuenta) VALUES (?,?,?,?,?)";
            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setInt(1, tarjeta.getNumCuenta());
            st.setString(2, tarjeta.getFechaVencimiento());
            st.setInt(3, tarjeta.getCodigo());
            st.setInt(4, tarjeta.getIdBanco());
            st.setInt(5, tarjeta.getTipoCuenta());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresada");
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Error");
        } finally {
            this.desconectar();
        }
    }
    
}
