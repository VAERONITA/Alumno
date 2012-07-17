/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Alumno extends Persona implements Datos.Bean{
    private String Matricula;
    private Carrera micarrera;
    
    public Alumno(String nom,String apat,String amat, String tel, String dir,String Carr_clave, String Carr_nom, String Matri){
        micarrera=new Carrera(Carr_clave, Carr_nom);
        setnombre(nom);
        setape_pat(apat);
        setape_mat(amat);
        settel(tel);
        setdirecc(dir);
        setMatricula(Matri);
    }

    public void setMatricula(String Matricula) {
        this.Matricula=Matricula.toUpperCase();
    }
    public String getMatricula() {
        return this.Matricula;
    }
    public void setCarreranom(String carrera) {
        this.micarrera.setNombre(carrera.toUpperCase());
    }
    public String getCarreranom() {
        return this.micarrera.getNombre();
    }
    public void setCarreraClave(String clave) {
        this.micarrera.setclave(clave);
    }
    public String getCarreraClave() {
        return this.micarrera.getclave();
    }
    public Carrera getCarrera(){
        return this.micarrera;
    }

}
