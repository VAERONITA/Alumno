/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Persona implements Datos.Bean{
    
    public Persona(){
        this.nombre=" ";
        this.ape_pat=" ";
        this.ape_mat=" ";
        this.Tel=" ";
        this.direcc=" ";
    }
    public Persona(String nom,String apat,String amat,String tel,String dir){
        this.nombre=nom;
        this.ape_pat=apat;
        this.ape_mat=amat;
        this.Tel=tel;
        this.direcc=dir;        
    }

    private String nombre;
    private String ape_pat;
    private String ape_mat;
    private String Tel;
    private String direcc;
    
    public String getnombre(){
        return this.nombre;
    }
    public String getape_pat(){
        return this.ape_pat;
    }
    public String getape_mat(){
        return this.ape_mat;
    }
    public String getTel(){
        return this.Tel;
    }
    public String getdirecc(){
        return this.direcc;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setape_pat(String apat){
        this.ape_pat=apat;
    }
    public void setape_mat(String amat){
        this.ape_mat=amat;
    }
    public void settel(String tel){
        this.Tel=tel;
    }
    public void setdirecc(String direc){
        this.direcc=direc;
    }
    
        
}
