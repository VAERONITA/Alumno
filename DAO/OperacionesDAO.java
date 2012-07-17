/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Datos.Bean;
import java.util.ArrayList;

/**
 *
 * @author Garrison
 */
public interface OperacionesDAO {

    ArrayList select();
    int insert(Bean bean);
    boolean delete(int id);
    boolean update(Bean bean);
    Bean find(int id);

}
