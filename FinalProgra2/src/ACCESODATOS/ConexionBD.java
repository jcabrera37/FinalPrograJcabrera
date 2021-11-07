
package ACCESODATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author Julio Cabrera
 */
public class ConexionBD {
   
    
    public Connection conectar(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/examenfinalprogra2b-2";
        try{
            Class.forName("org.h2.Driver");
            con = DriverManager.getConnection(url, "root","");
            System.out.println("En linea!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return con;
    }
    
    public void guardar_marca(String nombre_marca){
    
        Connection con = conectar();
        String insert = "insert into marcas(nombre_marcas) values(?)";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(insert);
            ps.setString(1, nombre_marca);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro Marca"+e);
        }
            
    }
    
        
    public void actualizar_marca(String nombre_marca, int id){
    
        Connection con = conectar();
        String update = "UPDATE `marcas` SET `nombre_marcas` = '"+nombre_marca+"' WHERE `marcas`.`id_marcas` = "+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro Marca"+e);
        }
            
    }
    
     public void eliminar_registro(String tipo,int id){
    
        Connection con = conectar();
        String update = "DELETE FROM `"+tipo+"` WHERE `"+tipo+"`.`id_"+tipo+"` = "+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro Marca"+e);
        }
            
    }
     
     public void eliminar_telefono(int id){
    
        Connection con = conectar();
        String update = "DELETE FROM `telefonos` WHERE `telefonos`.`idTelefono` = "+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro Marca"+e);
        }
            
    }
     
    public void eliminar_modelo(String tipo,int id){
    
        Connection con = conectar();
        String update = "DELETE FROM `"+tipo+"` WHERE `"+tipo+"`.`id"+tipo+"` = "+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro Marca"+e);
        }
            
    } 
    
    public ResultSet visualizar_Marcas(){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Marcas`");
            rs = ps.executeQuery();
        }catch(SQLException ex){
            System.out.println("Error de consulta"+ex);
        }
        return rs;
    }
    
    
    public void guardar_modelo(String nombre_modelo){
    
        Connection con = conectar();
        String insert = "insert into modelos(nombre_modelos) values(?)";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(insert);
            ps.setString(1, nombre_modelo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro Modelo"+e);
        }
            
    }
    
     public void actualizar_modelo(String nombre_modelo, int id){
    
        Connection con = conectar();
        String update = "UPDATE `modelos` SET `nombre_modelos` = '"+nombre_modelo+"' WHERE `modelos`.`idModelos` ="+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro Marca"+e);
        }
            
    }
    
    public ResultSet visualizar_Modelos(){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `modelos`");
            rs = ps.executeQuery();
        }catch(SQLException ex){
            System.out.println("Error de consulta"+ex);
        }
        return rs;
    }
 
    
    public void guardar_telefono(String imei, String modelo, String marca, String Mac){
    
        Connection con = conectar();
        String insert = "insert into telefonos(IME, modelo, marca, MAC_adress) values(?,?,?,?)";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(insert);
            ps.setString(1, imei);
            ps.setString(2, modelo);
            ps.setString(3, marca);
            ps.setString(4, Mac);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro telefono"+e);
        }
            
    }
    
    public void actualizar_Telefono(String imei,String modelo, String marca, String Mac, int id){
    
        Connection con = conectar();
        String update = "UPDATE `telefonos` SET `IME` = '"+imei+"', `modelo` = '"+modelo+"', `marca` = '"+marca+"', `MAC_adress` = '"+Mac+"' WHERE `telefonos`.`idTelefono` = "+id+"";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(update);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado con exito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro Marca"+e);
        }
            
    }
    
    public ResultSet visualizar_Telefonos(){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `telefonos`");
            rs = ps.executeQuery();
        }catch(SQLException ex){
            System.out.println("Error de consulta"+ex);
        }
        return rs;
    }
}//fin clase conexion_BD
