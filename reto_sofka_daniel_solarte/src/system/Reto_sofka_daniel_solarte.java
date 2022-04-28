/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.Connection;
import model.ConexionSQL;
import view.frm_Inicio;

/**
 *
 * @author danie
 */
public class Reto_sofka_daniel_solarte {

    public static void main(String[] args) {

        ConexionSQL cc = new ConexionSQL();
        Connection conn = cc.conexion();

        frm_Inicio inicio = new frm_Inicio();
        inicio.setVisible(true);

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * (4 - 1)) + 1;
            System.out.println(random);
        }
    }

}
