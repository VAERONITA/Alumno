/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author VAERON
 */
public class SQL {
    public static String InsertarAlumno="INSERT INTO alumnos(Nombre_alu,Apelli_Pat,Apelli_Mat,Telefono,Direccion,Matricula) values (?,?,?,?,?,?)";
    public static String InsertarCarrera="INSERT INTO carrera(nom_carrera,clave) values (?,?)";
    
}
