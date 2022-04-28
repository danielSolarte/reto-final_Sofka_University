/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Juego;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Opcion;
import model.Pregunta;

/**
 *
 * @author danie
 */
public class frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form frm_Principal
     */
    Juego juego;

    public frm_Principal(Juego juego) {
        initComponents();
        this.juego = juego;
        cargarPregunta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_Opciones = new javax.swing.ButtonGroup();
        jLblRonda = new javax.swing.JLabel();
        jLblPregunta = new javax.swing.JLabel();
        jRBOpcion1 = new javax.swing.JRadioButton();
        jRBOpcion2 = new javax.swing.JRadioButton();
        jRBOpcion3 = new javax.swing.JRadioButton();
        jRBOpcion4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblRonda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblRonda.setText("RONDA 1");
        jLblRonda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLblPregunta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLblPregunta.setText("Este es el texto de la pregunta");
        jLblPregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLblPregunta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btng_Opciones.add(jRBOpcion1);
        jRBOpcion1.setText("Opcion 1");

        btng_Opciones.add(jRBOpcion2);
        jRBOpcion2.setText("Opcion 2");

        btng_Opciones.add(jRBOpcion3);
        jRBOpcion3.setText("Opcion 3");

        btng_Opciones.add(jRBOpcion4);
        jRBOpcion4.setText("Opcion 4");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("PREGUNTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblRonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBOpcion3)
                            .addComponent(jRBOpcion2)
                            .addComponent(jRBOpcion1))
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBOpcion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBOpcion1)
                        .addGap(18, 18, 18)
                        .addComponent(jRBOpcion2)
                        .addGap(18, 18, 18)
                        .addComponent(jRBOpcion3)
                        .addGap(18, 18, 18)
                        .addComponent(jRBOpcion4)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(juego.esCorrecto(seleccionado()) == true){
            cargarPregunta();
        } else {
            JOptionPane.showMessageDialog(null, "HAS PERDIDO");
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btng_Opciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblPregunta;
    private javax.swing.JLabel jLblRonda;
    private javax.swing.JRadioButton jRBOpcion1;
    private javax.swing.JRadioButton jRBOpcion2;
    private javax.swing.JRadioButton jRBOpcion3;
    private javax.swing.JRadioButton jRBOpcion4;
    // End of variables declaration//GEN-END:variables

    private void cargarPregunta() {
        Pregunta pregunta = juego.preguntaAEvaluar();
        jLblRonda.setText("Ronda "+juego.getRonda());
        ArrayList<Opcion> opciones = juego.consultarOpciones(pregunta.getId());

        jLblPregunta.setText(pregunta.getPregunta());
        jRBOpcion1.setText(opciones.get(0).getOpcion());
        jRBOpcion2.setText(opciones.get(1).getOpcion());
        jRBOpcion3.setText(opciones.get(2).getOpcion());
        jRBOpcion4.setText(opciones.get(3).getOpcion());

    }

    public String seleccionado() {

        String respuesta="";
        
        if (jRBOpcion1.isSelected()) {
            respuesta = jRBOpcion1.getText();
        }
        if (jRBOpcion2.isSelected()) {
            respuesta = jRBOpcion2.getText();
        }
        if (jRBOpcion3.isSelected()) {
            respuesta = jRBOpcion3.getText();
        }
        if (jRBOpcion4.isSelected()) {
            respuesta = jRBOpcion4.getText();
        }
        
        return respuesta;
    }
}
