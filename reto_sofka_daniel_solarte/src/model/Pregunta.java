/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Pregunta {
    private int id;
    private String pregunta;
    private Categoria categoria;
    private String sql;
    private ConexionSQL cc = new ConexionSQL();
    private Connection conn = cc.conexion();

    public Pregunta(int id, String pregunta, Categoria categoria) {
        this.id = id;
        this.pregunta = pregunta;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
}
