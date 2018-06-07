/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.spa.dao;

import cl.inacap.spa.utils.Conexion;
import cl.inacap.spa.dto.*;
import cl.inacap.spa.dao.*;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javierquinchen
 */
public class ClienteDAO extends Conexion{
    Cliente client=new Cliente();
    
  
    
    public void agregar(Cliente cliente){
         try {
            this.conectar();
            String sql = "INSERT INTO Clientes (idCliente, nombre, apellido,clave,frecuente) VALUES (?,?,?,?,?)";
            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setInt(1, cliente.getRut());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getClave());
            st.setBoolean(5, cliente.isFrecuente());
            st.executeUpdate();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Error");
        } finally {
            this.desconectar();
        }
    }
    
    public  Cliente validarUsuario(int rut, String clave ){
        try{
            this.conectar();
            String sql="SELECT idCliente, nombre, apellido, clave, frecuente FROM Clientes where idCliente= '"+rut+"' and clave='"+clave+"'";
                       PreparedStatement st=this.conexion.prepareStatement(sql);
                       ResultSet rs=st.executeQuery();
                       while(rs.next()){
                           client.setRut(rs.getInt(1));
                           client.setNombre(rs.getString(2));
                           client.setApellido(rs.getString(3));
                           client.setClave(rs.getString(4));
                           client.setFrecuente(rs.getBoolean(5));
                           JOptionPane.showMessageDialog(null, "Bienvenido");
                       }
                    
                       rs.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }finally{
            this.desconectar();
        }
        return client;
   }
    
    
    
    
}
