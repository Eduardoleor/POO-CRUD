/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import db.ConnectionService;
import java.awt.Desktop;
import static java.awt.SystemColor.desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author eduardoleal
 */
public class Profile extends javax.swing.JPanel {

    /**
     * Creates new form Profile
     */
    public static String setName, setMatricula, setAp, setAm, setId, setSalon, setFacultad;

    public Profile(String getId, String getMatricula, String getNombre, String getApellido_pa, String getApellido_ma, String getCalificacion, String getSalon, String getFacultad) {
        initComponents();

        id.setText(getId);
        matricula.setText(getMatricula);
        nombre.setText(getNombre);
        apellido_paterno.setText(getApellido_pa);
        apellido_materno.setText(getApellido_ma);
        calificacion.setText(getCalificacion);
        salon.setText(getSalon);
        facultad.setText(getFacultad);

        setName = getNombre;
        setAp = getApellido_pa;
        setAm = getApellido_ma;
        setMatricula = getMatricula;
        setSalon = getSalon;
        setFacultad = getFacultad;

        setId = getId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        matricula = new rojeru_san.RSMTextFull();
        apellido_paterno = new rojeru_san.RSMTextFull();
        nombre = new rojeru_san.RSMTextFull();
        apellido_materno = new rojeru_san.RSMTextFull();
        calificacion = new rojeru_san.RSMTextFull();
        salon = new rojeru_san.RSMTextFull();
        boton_descargar = new rojeru_san.RSButtonRiple();
        id = new rojeru_san.RSMTextFull();
        boton_eliminar = new rojeru_san.RSButtonRiple();
        boton_actualizar = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        facultad = new rojeru_san.RSMTextFull();

        jPanel1.setBackground(new java.awt.Color(16, 32, 39));

        jPanel2.setBackground(new java.awt.Color(38, 50, 56));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText(" Universidad Autónoma de Nuevo León");

        subtitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setText("Facultad de Ingeniería Mecánica y Eléctrica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(titulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(subtitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        matricula.setForeground(new java.awt.Color(255, 255, 255));
        matricula.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        matricula.setBotonColor(new java.awt.Color(255, 255, 255));
        matricula.setCaretColor(new java.awt.Color(255, 255, 255));
        matricula.setColorTransparente(true);
        matricula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        matricula.setModoMaterial(true);
        matricula.setNextFocusableComponent(nombre);
        matricula.setPlaceholder("Matricula");
        matricula.setSoloNumeros(true);
        matricula.setxDarkIcon(true);

        apellido_paterno.setForeground(new java.awt.Color(255, 255, 255));
        apellido_paterno.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        apellido_paterno.setBotonColor(new java.awt.Color(255, 255, 255));
        apellido_paterno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellido_paterno.setColorTransparente(true);
        apellido_paterno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        apellido_paterno.setModoMaterial(true);
        apellido_paterno.setNextFocusableComponent(apellido_materno);
        apellido_paterno.setPlaceholder("Apellido Paterno");
        apellido_paterno.setSoloLetras(true);
        apellido_paterno.setxDarkIcon(true);

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        nombre.setBotonColor(new java.awt.Color(255, 255, 255));
        nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre.setColorTransparente(true);
        nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombre.setModoMaterial(true);
        nombre.setNextFocusableComponent(apellido_paterno);
        nombre.setPlaceholder("Nombre");
        nombre.setSoloLetras(true);
        nombre.setxDarkIcon(true);

        apellido_materno.setForeground(new java.awt.Color(255, 255, 255));
        apellido_materno.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        apellido_materno.setBotonColor(new java.awt.Color(255, 255, 255));
        apellido_materno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellido_materno.setColorTransparente(true);
        apellido_materno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        apellido_materno.setModoMaterial(true);
        apellido_materno.setNextFocusableComponent(calificacion);
        apellido_materno.setPlaceholder("Apellido Materno");
        apellido_materno.setSoloLetras(true);
        apellido_materno.setxDarkIcon(true);

        calificacion.setForeground(new java.awt.Color(255, 255, 255));
        calificacion.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        calificacion.setBotonColor(new java.awt.Color(255, 255, 255));
        calificacion.setCaretColor(new java.awt.Color(255, 255, 255));
        calificacion.setColorTransparente(true);
        calificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        calificacion.setModoMaterial(true);
        calificacion.setNextFocusableComponent(salon);
        calificacion.setPlaceholder("Calificación");
        calificacion.setSoloNumeros(true);
        calificacion.setxDarkIcon(true);

        salon.setForeground(new java.awt.Color(255, 255, 255));
        salon.setAutoscrolls(false);
        salon.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        salon.setBotonColor(new java.awt.Color(255, 255, 255));
        salon.setCaretColor(new java.awt.Color(255, 255, 255));
        salon.setColorTransparente(true);
        salon.setFocusCycleRoot(true);
        salon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salon.setModoMaterial(true);
        salon.setNextFocusableComponent(facultad);
        salon.setPlaceholder("Salon");
        salon.setxDarkIcon(true);

        boton_descargar.setBackground(new java.awt.Color(0, 128, 128));
        boton_descargar.setBorder(null);
        boton_descargar.setText("Descargar Información");
        boton_descargar.setToolTipText("");
        boton_descargar.setColorHover(new java.awt.Color(0, 128, 128));
        boton_descargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_descargar.setFocusable(false);
        boton_descargar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_descargarActionPerformed(evt);
            }
        });

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        id.setBotonColor(new java.awt.Color(255, 255, 255));
        id.setCaretColor(new java.awt.Color(255, 255, 255));
        id.setColorTransparente(true);
        id.setEnabled(false);
        id.setFocusable(false);
        id.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        id.setNextFocusableComponent(nombre);
        id.setPlaceholder("ID");
        id.setSoloNumeros(true);
        id.setxDarkIcon(true);

        boton_eliminar.setBackground(new java.awt.Color(128, 0, 0));
        boton_eliminar.setBorder(null);
        boton_eliminar.setText("Eliminar mi pérfil");
        boton_eliminar.setToolTipText("");
        boton_eliminar.setColorHover(new java.awt.Color(128, 0, 0));
        boton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminar.setFocusable(false);
        boton_eliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_actualizar.setBackground(new java.awt.Color(38, 50, 56));
        boton_actualizar.setBorder(null);
        boton_actualizar.setText("Actualizar Información");
        boton_actualizar.setToolTipText("");
        boton_actualizar.setColorHover(new java.awt.Color(38, 50, 56));
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.setFocusable(false);
        boton_actualizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricula");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Materno");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calificación");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salón");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Facultad");

        facultad.setForeground(new java.awt.Color(255, 255, 255));
        facultad.setAutoscrolls(false);
        facultad.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        facultad.setBotonColor(new java.awt.Color(255, 255, 255));
        facultad.setCaretColor(new java.awt.Color(255, 255, 255));
        facultad.setColorTransparente(true);
        facultad.setFocusCycleRoot(true);
        facultad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultad.setModoMaterial(true);
        facultad.setPlaceholder("Facultad");
        facultad.setxDarkIcon(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // TODO add your handling code here:
        String textMatricula = matricula.getText();
        String textNombre = nombre.getText();
        String textApellidoPaterno = apellido_paterno.getText();
        String textApellidoMaterno = apellido_materno.getText();
        String textCalificacion = calificacion.getText();
        String textSalon = salon.getText();
        String textFacultad = facultad.getText();
        String textId = id.getText();

        if (areAllNotEmpty(textMatricula, textNombre, textApellidoPaterno, textApellidoMaterno, textCalificacion)) {

            ConnectionService connection = new ConnectionService();
            connection.actualizarPerfilAlumno(textMatricula, textNombre, textApellidoPaterno, textApellidoMaterno, textCalificacion, textSalon, textFacultad, textId);

        } else {
            showMessageDialog(null, "Debes ingresar todos los datos.");
        }

    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_descargarActionPerformed
        // TODO add your handling code here:
        createDocument();
    }//GEN-LAST:event_boton_descargarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        // TODO add your handling code here:

        int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el alumno?", "Selecciona una opción",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (input == 0) {
            ConnectionService connection = new ConnectionService();
            connection.eliminarAlumno(setId);
        }

    }//GEN-LAST:event_boton_eliminarActionPerformed

    public static boolean areAllNotEmpty(String... texts) {
        for (String s : texts) {
            if (s == null || "".equals(s)) {
                return false;
            }
        }
        return true;
    }

    public static void createDocument() {
        try {
            File myObj = new File("estudiante.txt");
            if (myObj.createNewFile()) {

                FileWriter writer = new FileWriter("estudiante.txt", true);
                writer.write("Universidad Autónoma de Nuevo León | Facultad de Ingeniería Mecánica y Eléctrica");
                writer.write("\r\n");
                writer.write("Clase: Programación Orientada a Objetos");
                writer.write("\r\n");
                writer.write("Alumno: " + setName + " " + setAp + " " + setAm);
                writer.write("\r\n");
                writer.write("Matricula: " + setMatricula);
                writer.write("\r\n");
                writer.write("Salon: " + setSalon);
                writer.write("\r\n");
                writer.write(setFacultad);
                writer.close();

                Desktop desktop = Desktop.getDesktop();
                desktop.open(myObj);
            } else {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(myObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSMTextFull apellido_materno;
    private rojeru_san.RSMTextFull apellido_paterno;
    private rojeru_san.RSButtonRiple boton_actualizar;
    private rojeru_san.RSButtonRiple boton_descargar;
    private rojeru_san.RSButtonRiple boton_eliminar;
    private rojeru_san.RSMTextFull calificacion;
    private rojeru_san.RSMTextFull facultad;
    private rojeru_san.RSMTextFull id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSMTextFull matricula;
    private rojeru_san.RSMTextFull nombre;
    private rojeru_san.RSMTextFull salon;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
