package ModeloBD;

import Conectar.conectar;
import Paneles.frmestudiantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.estudiantes;



public class estudiantesBD {

    //Inserta un nuevo Registro
    public static void insertar(estudiantes per) throws SQLException {
        Connection con = conectar.getConexion();
        PreparedStatement ps = null;

        String sql;

        sql = "INSERT INTO estudiantes (CEDULA, PRIMERNOMBRE,SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO,DIRECCION,TELEFONO,CORREO)VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getCEDULA());
            ps.setString(2, per.getPRIMERNOMBRE());
            ps.setString(3, per.getSEGUNDONOMBRE());
            ps.setString(4, per.getPRIMERAPELLIDO());
            ps.setString(5, per.getSEGUNDOAPELLIDO());
            ps.setString(6, per.getDIRECCION());
            ps.setString(7, per.getTELEFONO());
            ps.setString(8, per.getCORREO());

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registrado con exito", "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
            }

            con.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se logro grabar el Registro..." + ex, "Grabar Registro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(frmestudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar(estudiantes obj) throws SQLException {
        Connection con = conectar.getConexion();
        PreparedStatement ps = null;

        String sql;
        sql = "UPDATE estudiantes SET CEDULA=?,PRIMERNOMBRE=?,SEGUNDONOMBRE=?,PRIMERAPELLIDO=?,SEGUNDOAPELLIDO=?,DIRECCION=?,TELEFONO=?,CORREO=? WHERE idestudiante=" + obj.getIDESTUDIANTE();
        //JOptionPane.showMessageDialog(null,"bb"+per.getCli_codigo(), "Actualizar Registro",JOptionPane.INFORMATION_MESSAGE);
        ps = con.prepareStatement(sql);
        ps.setString(1, obj.getCEDULA());
        ps.setString(2, obj.getPRIMERNOMBRE());
        ps.setString(3, obj.getSEGUNDONOMBRE());
        ps.setString(4, obj.getPRIMERAPELLIDO());
        ps.setString(5, obj.getSEGUNDOAPELLIDO());
        ps.setString(6, obj.getDIRECCION());
        ps.setString(7, obj.getTELEFONO());
        ps.setString(8, obj.getCORREO());

        int rowsUpdated = ps.executeUpdate();
        con.close();
        ps.close();
        if (rowsUpdated > 0) {
            //JOptionPane.showMessageDialog(null,"Actualización Exitosa", "Actualizar Registro",JOptionPane.INFORMATION_MESSAGE);
            //return true;
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa", "Edicion Registro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Modificacion Exitosa");
        } else {
            //JOptionPane.showMessageDialog(null,"No se pudo Actualizar el Registro", "Actualizar Registro",JOptionPane.ERROR_MESSAGE);
            //return false;
            JOptionPane.showMessageDialog(null, "No se logro Modificar el Registro...", "Modificar Registro", JOptionPane.ERROR_MESSAGE);
            System.out.println("No se puedo Modificar el Registro");
        }
    }

    public static void eliminar(estudiantes obj) throws SQLException {
        Connection con = conectar.getConexion();
        PreparedStatement ps = null;

        String sql;
        //DELETE FROM table_name WHERE condition;
        //String Ssql = "DELETE FROM contacto WHERE id_contacto = ?";

        sql = "DELETE FROM estudiantes WHERE IDESTUDIANTE="+obj.getIDESTUDIANTE();
        ps = con.prepareStatement(sql);

        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa", "Eliminar Registro", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar el Registro", "Eliminar Registro", JOptionPane.ERROR_MESSAGE);

        }

        con.close();
        ps.close();
    }

}
