package cl.inacap.spa.dao;

import cl.inacap.spa.dto.Banco;
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
public class BancoDAO extends Conexion{
    Banco banco=new Banco();
    
   public List <Banco>obtener(){
       List<Banco> bancos=new ArrayList<>();
        try{
            this.conectar();
            String sql="SELECT idBanco, nombreBanco FROM Bancos";
                       PreparedStatement st=this.conexion.prepareStatement(sql);
                       ResultSet rs=st.executeQuery();
                       
                       while(rs.next()){
                      
                           Banco banco=new Banco();
                           banco.setIdBanco(rs.getInt(1));
                           banco.setNombreBanco(rs.getString(2));
                           
                           bancos.add(banco);
                       }
                    
                       rs.close();
        }catch(SQLException ex){
           bancos=null;
        }finally{
            this.desconectar();
        }
        return bancos;
   }
   
   public int buscar(String nombre){
       try{
            this.conectar();
            String sql="SELECT idBanco FROM Bancos where nombreBanco = '"+nombre+"'";
                       PreparedStatement st=this.conexion.prepareStatement(sql);
                       ResultSet rs=st.executeQuery();
                       
                       while(rs.next()){
                           
                           banco.setIdBanco(rs.getInt(1));
                       }
                    
                       rs.close();
        }catch(SQLException ex){
          
        }finally{
            this.desconectar();
        }
       return banco.getIdBanco();
   }
              
}
