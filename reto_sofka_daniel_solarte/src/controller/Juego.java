/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;
import model.ConexionSQL;
import model.Opcion;
import model.Pregunta;

/**
 *
 * @author danie
 */
public class Juego {

    public Juego() {
    }

    ConexionSQL cc = new ConexionSQL();
    Connection conn = cc.conexion();

    private int ronda = 0;

    public int getRonda() {
        return ronda;
    }

    private ArrayList<Pregunta> preguntas = new ArrayList<>();

    public void agregarJugador(String nombre) {
        String sql = "INSERT INTO jugadores (nombre) VALUES(?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.execute();
            System.out.println("Jugador agregado exitosamente!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el usuario: " + e);
        }
    }

    public Categoria consultarCategoria(int id) {
        String sql = "SELECT * FROM categorias WHERE id =" + String.valueOf(id);
        Categoria categoria = null;

        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);

            if (res.next()) {
                categoria = new Categoria(Integer.parseInt(res.getString("id")), res.getString("nom_categoria"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la categoria: " + e);
        }

        return categoria;
    }

    public Pregunta consultarPregunta(int id) {
        String sql = "SELECT * FROM preguntas WHERE id =" + String.valueOf(id);
        Pregunta pregunta = null;

        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
                Categoria categoria = consultarCategoria(Integer.parseInt(res.getString("id_categoria")));
                pregunta = new Pregunta(Integer.parseInt(res.getString("id")), res.getString("pregunta"), categoria);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la pregunta: " + e);
        }

        return pregunta;
    }

    public ArrayList consultarPreguntas(int cat) {

        String sql = "SELECT * FROM preguntas WHERE id_categoria =" + String.valueOf(cat);
        ArrayList<Pregunta> preguntas = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
                preguntas.add(consultarPregunta(Integer.parseInt(res.getString("id"))));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar las preguntas " + e);
        }

        return preguntas;
    }

    public ArrayList consultarOpciones(int id) {
        String sql = "SELECT * FROM opciones WHERE id_pregunta =" + String.valueOf(id);

        ArrayList<Opcion> opciones = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
                Opcion opcion = new Opcion(Integer.parseInt(res.getString("id")), res.getString("opcion"), consultarPregunta(Integer.parseInt(res.getString("id_pregunta"))), true);
                opciones.add(opcion);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar las opciones: " + e);
        }

        return opciones;
    }

    public Opcion consultarOpcion(String respuesta) {
        String sql = "SELECT * FROM opciones WHERE opcion ='"+respuesta+"'";
        Opcion opcion = null;

        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
                Pregunta pregunta = consultarPregunta(Integer.parseInt(res.getString("id_pregunta")));
                opcion = new Opcion(Integer.parseInt(res.getString("id")), res.getString("opcion"), pregunta, Boolean.parseBoolean(res.getString("es_correcto")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la opcion: " + e);
        }
        
        return opcion;
    }

    public Pregunta preguntaAEvaluar() {

        ronda = ronda + 1;
        ArrayList<Pregunta> preguntas = consultarPreguntas(ronda);
        int random = (int) (Math.random() * 4 + 1);

        return preguntas.get(random);
    }

    public Boolean esCorrecto(String respuesta) {
        Opcion opcion = consultarOpcion(respuesta);
        Boolean resultado = null;
        if (opcion.getEs_correcto() == true){
            return true;
        } else {
            return false;
        }
    }

    /*    public int sumarPuntaje(){
        
    } */
}
