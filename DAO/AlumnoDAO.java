/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Alumno;
import Datos.Bean;
import Datos.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAERON
 */
public class AlumnoDAO implements DAO.OperacionesDAO{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Alumno alumno=(Alumno)bean;
        Connection conexion=dao.DAOFactory.getConexion();
        PreparedStatement ps=null;
        try {
            ps=(com.mysql.jdbc.PreparedStatement) conexion.prepareCall(SQL.InsertarAlumno);
            ps.setString(1, alumno.getnombre());
            ps.setString(2, alumno.getape_pat());
            ps.setString(3, alumno.getape_mat());
            ps.setString(4, alumno.getTel());
            ps.setString(5, alumno.getdirecc());
            ps.setString(6, alumno.getMatricula());
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
