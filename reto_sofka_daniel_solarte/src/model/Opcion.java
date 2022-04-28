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
public class Opcion {
    
    private int id;
    private String opcion;
    private Pregunta pregunta;
    private Boolean es_correcto;

    public Opcion(int id, String opcion, Pregunta pregunta, Boolean es_correcto) {
        this.id = id;
        this.opcion = opcion;
        this.pregunta = pregunta;
        this.es_correcto = es_correcto;
    }

    public int getId() {
        return id;
    }

    public String getOpcion() {
        return opcion;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public Boolean getEs_correcto() {
        return es_correcto;
    }

}
