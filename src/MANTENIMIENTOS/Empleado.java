package MANTENIMIENTOS;

import ARCHIVOS.ArchivoEmpleados;
import MENÚ_LOGIN.Menu_Principal;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Empleado extends javax.swing.JFrame {

    boolean creear;
    boolean encontrado = false;
    String Santigualinea;
    String pro;
    String num;

  
    public Empleado() {
        initComponents();
        setTitle("Empleados");
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        cajaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaApellido1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaPropina = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaFoto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaPorPropina = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Cajaestado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel1.setText("ID Empleado:");

        cajaId.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        cajaId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        cajaNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel3.setText("Apellido 1:");

        cajaApellido1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel4.setText("Apellido 2:");

        cajaApellido2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel5.setText("Tipo:");

        cajaTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel6.setText("Propinas:");

        cajaPropina.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        cajaPropina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaPropinaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel7.setText("Foto:");

        cajaFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel8.setText("Porcentaje de propina:");

        cajaPorPropina.setEditable(false);
        cajaPorPropina.setBackground(new java.awt.Color(255, 255, 255));
        cajaPorPropina.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        cajaPorPropina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPorPropinaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/x (1).png"))); // NOI18N
        btnSalir.setAutoscrolls(true);
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/descargar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cajaestado.setEditable(false);
        Cajaestado.setBackground(new java.awt.Color(51, 204, 255));
        Cajaestado.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        Cajaestado.setForeground(new java.awt.Color(255, 0, 0));
        Cajaestado.setBorder(null);
        Cajaestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaestadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Salir");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Limpiar");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel13))
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cajaPorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel5))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cajaestado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(181, 181, 181)
                                        .addComponent(jLabel11)
                                        .addGap(96, 96, 96))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cajaestado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cajaPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cajaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cajaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cajaApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cajaIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdKeyReleased
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int cod;

            cod = Integer.parseInt(cajaId.getText());

            Scanner s;

            try {
                File f = new File("Empleados.txt");
                s = new Scanner(f);
                if (!f.exists()) {

                    f.createNewFile();

                } else {
                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        Scanner sl = new Scanner(linea);
                        sl.useDelimiter("\\s*;\\s*");
                        try {
                            if (cod == Integer.parseInt(sl.next())) {
                                cajaNombre.setText(sl.next());
                                cajaApellido1.setText(sl.next());
                                cajaApellido2.setText(sl.next());
                                cajaTipo.setText(sl.next());
                                cajaPropina.setText(sl.next());
                                cajaFoto.setText(sl.next());
                                cajaPorPropina.setText(sl.next());

                                encontrado = true;
                                creear = true;

                                Santigualinea = cajaId.getText() + "; " + cajaNombre.getText() + "; " + cajaApellido1.getText() + "; " + cajaApellido2.getText() + "; " + cajaTipo.getText() + "; " + cajaPropina.getText() + "; " + cajaFoto.getText() + "; " + cajaPorPropina.getText();

                                Cajaestado.setText("MODIFICANDO");

                            } else {

                                cajaNombre.setText("");
                                cajaApellido1.setText("");
                                cajaApellido2.setText("");
                                cajaTipo.setText("");
                                cajaPropina.setText("");
                                cajaFoto.setText("");
                                cajaPorPropina.setText("");

                                encontrado = false;
                                creear = false;
                                Cajaestado.setText("CREANDO");
                            }
                        } catch (Exception el) {
                            el.printStackTrace();
                        }
                    }
                }
                s.close();
            } catch (FileNotFoundException el) {
                JOptionPane.showMessageDialog(null, "Error al leer Arcivo" + el);
            } catch (IOException el) {
                el.printStackTrace();
            }

        }
    }//GEN-LAST:event_cajaIdKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cajaNombre.setText("");
        cajaApellido1.setText("");
        cajaApellido2.setText("");
        cajaTipo.setText("");
        cajaPropina.setText("");
        cajaFoto.setText("");
        cajaPorPropina.setText("");
        cajaId.setText("");
        Cajaestado.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (cajaId.getText().equals("") || cajaApellido1.getText().equals("") || cajaApellido2.getText().equals("") || cajaTipo.getText().equals("")
                || cajaPropina.getText().equals("") || cajaFoto.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");
        } else {

            String Id = "";
            String nombre = "", apell1 = "", apell2 = "", tipo = "",foto="";
            String propina = "", PorPropina = "";
            String Snuevalinea = "";

            ArchivoEmpleados MA = new ArchivoEmpleados();
            Id = cajaId.getText();
            nombre = cajaNombre.getText();
            apell1 = cajaApellido1.getText();
            apell2 = cajaApellido2.getText();
            tipo = cajaTipo.getText();
            propina = cajaPropina.getText();
            foto = cajaFoto.getText();
            
              if (cajaPorPropina.getText().isEmpty()) {
            cajaPorPropina.setText("0");
        }

        PorPropina= cajaPorPropina.getText();


            try {

                if (creear == false) {
                    MA.GuardarDatos(Id, nombre, tipo, apell1, apell2, propina, foto, PorPropina);
                } else {
                    Snuevalinea = (Id + "; " + nombre + "; " + tipo + "; " + apell1 + "; " + apell2 + "; " + propina + "; " + foto + "; " + PorPropina);
                    MA.Modificar(Santigualinea, Snuevalinea);
                }

                cajaId.setText("");
                cajaNombre.setText("");
                cajaApellido1.setText("");
                cajaApellido2.setText("");
                cajaTipo.setText("");
                cajaPropina.setText("");
                cajaPorPropina.setText("");
                cajaFoto.setText("");
                Cajaestado.setText("");

            } catch (IOException el) {

                el.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Registro guardado");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void CajaestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaestadoActionPerformed

    private void cajaPorPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPorPropinaActionPerformed

       
        
    }//GEN-LAST:event_cajaPorPropinaActionPerformed

    private void cajaPropinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPropinaKeyReleased

    }//GEN-LAST:event_cajaPropinaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cajaestado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaApellido1;
    private javax.swing.JTextField cajaApellido2;
    private javax.swing.JTextField cajaFoto;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPorPropina;
    private javax.swing.JTextField cajaPropina;
    private javax.swing.JTextField cajaTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
