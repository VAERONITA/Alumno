
import Datos.Alumno;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno VAERON=new Alumno("Victor Alfonso", "Esparza", "Reyes", "4491541233", "gema", "ISEI", "ingenieria en sistemas estrategicos de informacion", "up100186");
        
        JOptionPane.showMessageDialog(null, "El alumno "+VAERON.getnombre()+" estudia la carrera de "+VAERON.getCarreranom());
    }
}
