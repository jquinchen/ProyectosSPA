package cl.inacap.spa.dao;

import cl.inacap.spa.dto.*;
import cl.inacap.spa.utils.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author javierquinchen
 */
public class TipoCuentaDAO extends Conexion {
    TipoCuenta tcuenta = new TipoCuenta();
    
    
 public int buscar(String nombre){
       try{
            this.conectar();
            String sql="SELECT idTipo FROM tipoCuenta where nombreTipo = '"+nombre+"'";
                       PreparedStatement st=this.conexion.prepareStatement(sql);
                       ResultSet rs=st.executeQuery();
                       
                       while(rs.next()){
                           tcuenta.setIdTipo(rs.getInt(1));
                       }
                    
                       rs.close();
        }catch(SQLException ex){
          
        }finally{
            this.desconectar();
        }
       return tcuenta.getIdTipo();
   }
 
    public List <TipoCuenta>obtener(){
        List<TipoCuenta> tipos=new ArrayList<>();
        try{
            this.conectar();
            String sql="SELECT idTipo, nombreTipo FROM tipoCuenta";
                       PreparedStatement st=this.conexion.prepareStatement(sql);
                       ResultSet rs=st.executeQuery();
                       
                       while(rs.next()){
                      
                           TipoCuenta tCuenta=new TipoCuenta();
                           tCuenta.setIdTipo(rs.getInt(1));
                           tCuenta.setNombreTipo(rs.getString(2));
                           
                           tipos.add(tCuenta);
                       }
                    
                       rs.close();
        }catch(SQLException ex){
           tipos=null;
        }finally{
            this.desconectar();
        }
        return tipos;
    }
}
