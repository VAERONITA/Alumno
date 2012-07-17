/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Carrera implements Datos.Bean{    
    public Carrera(){
        this.clave=" ";
        this.Nombre=" ";
        this.siglas=" ";
    }
    public Carrera(String clave,String Nombre){
        setclave(clave);
        setNombre(Nombre);
    }
    
    private String siglas;
    private String clave;
    private String Nombre;
    
    
    public String getsiglas(){
        return this.clave;
    }
    public void setsiglas(String clave){        
        this.siglas=clave.toUpperCase();
    }
    public String getclave(){
        return this.clave;
    }
    public void setclave(String clave){        
        this.clave=clave.toUpperCase();
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Name){
        this.Nombre=Name.toUpperCase();
    }

}
