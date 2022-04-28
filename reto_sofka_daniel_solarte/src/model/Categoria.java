/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author danie
 */
public class Categoria {
    private int id;
    private String nom_categoria;
    private int premio;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nom_categoria = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNom_categoria() {
        return nom_categoria;
    }

    public int getPremio() {
        return premio;
    }
}
