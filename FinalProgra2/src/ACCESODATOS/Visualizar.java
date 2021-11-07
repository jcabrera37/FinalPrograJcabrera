
package ACCESODATOS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio Cabrera
 */
public class Visualizar{
    
    
    public void visualizar_Marca(JTable tabla){

    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar_Marcas();
    
    tabla.setDefaultRenderer(Object.class, new TablasConsultas());
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Id Marca");
    dt.addColumn("Marca de Telefono");
    
        try {
            while(rs.next()){
                Object[] fila = new Object[2];
                fila[0] = rs.getObject("id_marcas");
                fila[1] = rs.getObject("nombre_marcas");
            
            dt.addRow(fila);
            }
            tabla.setModel(dt);
        } catch (SQLException e) {
            System.out.println("error"+e);
        }
    } 
    
    public void visualizar_Modelos(JTable tabla){

    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar_Modelos();
    
    tabla.setDefaultRenderer(Object.class, new TablasConsultas());
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Identificador");
    dt.addColumn("Modelos Disponibles");
    
        try {
            while(rs.next()){
                Object[] fila = new Object[2];
                fila[0] = rs.getObject("idModelos");
                fila[1] = rs.getObject("nombre_modelos");
            
            dt.addRow(fila);
            }
            tabla.setModel(dt);
        } catch (SQLException e) {
            System.out.println("error"+e);
        }
    } 
    
    public void visualizar_Telefono(JTable tabla){

    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar_Telefonos();
    
    tabla.setDefaultRenderer(Object.class, new TablasConsultas());
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Id");
    dt.addColumn("IMEI");
    dt.addColumn("MODELO");
    dt.addColumn("MARCA");
    dt.addColumn("DIRECCION MAC");
    
        try {
            while(rs.next()){
                Object[] fila = new Object[5];
                fila[0] = rs.getObject("idTelefono");
                fila[1] = rs.getObject("IME");
                fila[2] = rs.getObject("modelo");
                fila[3] = rs.getObject("marca");
                fila[4] = rs.getObject("MAC_adress");
            
            dt.addRow(fila);
            }
            tabla.setModel(dt);
        } catch (SQLException e) {
            System.out.println("error"+e);
        }
    } 
}
