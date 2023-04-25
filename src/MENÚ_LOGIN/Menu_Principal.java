package MENÚ_LOGIN;

import CONSULTAS.VentanaDeClientes;
import MANTENIMIENTOS.Reservas;
import MANTENIMIENTOS.Usuario;
import MANTENIMIENTOS.Tipo_Producto;
import MANTENIMIENTOS.Producto;
import MANTENIMIENTOS.Mesa;
import MANTENIMIENTOS.Empleado;
import MANTENIMIENTOS.Comentario;
import MANTENIMIENTOS.Cliente;
import CONSULTAS.Ventana_mesa;
import CONSULTAS.Ventana_Usuario;
import CONSULTAS.VentanaTipoProducto;
import CONSULTAS.VentanaProducto;
import CONSULTAS.VentanaDeReservas;
import CONSULTAS.VentanaDeEmpleados;
import CONSULTAS.VentanaDeComentarios;
import MOVIMIENTOS.E_S_Productos;
import MOVIMIENTOS.Pedidos;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        setTitle("Restaurante G&M");
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        usuario = new javax.swing.JMenuItem();
        comentario = new javax.swing.JMenuItem();
        mesa = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenuItem();
        empleado = new javax.swing.JMenuItem();
        tipoProducto = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        Reservas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pedidos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        consulta_Usuario = new javax.swing.JMenuItem();
        consulta_Comentarios = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        ConsultaMesas = new javax.swing.JMenuItem();
        Consulta_Producto = new javax.swing.JMenuItem();
        TipoProducto = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rubik", 1, 83)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/salida-de-emergencia (2).png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/restaurante (2).png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(25, 25, 25))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(2, 2, 2, 2));

        jMenu1.setForeground(new java.awt.Color(255, 204, 51));
        jMenu1.setText("Mantenimientos    ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N

        usuario.setText("Usuario");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(usuario);

        comentario.setText("Comentario");
        comentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comentarioActionPerformed(evt);
            }
        });
        jMenu1.add(comentario);

        mesa.setText("Mesa");
        mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaActionPerformed(evt);
            }
        });
        jMenu1.add(mesa);

        clientes.setText("Clientes");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        jMenu1.add(clientes);

        empleado.setText("Empledos");
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });
        jMenu1.add(empleado);

        tipoProducto.setText("Tipo de Producto");
        tipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProductoActionPerformed(evt);
            }
        });
        jMenu1.add(tipoProducto);

        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jMenu1.add(Productos);

        Reservas.setText("Reservas");
        Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservasActionPerformed(evt);
            }
        });
        jMenu1.add(Reservas);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 204, 51));
        jMenu2.setText("Movimientos     ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N

        pedidos.setText("Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });
        jMenu2.add(pedidos);

        jMenuItem3.setText("Entrada/Salida de Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        menuProcesos.setForeground(new java.awt.Color(255, 204, 51));
        menuProcesos.setText("Procesos     ");
        menuProcesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProcesos.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        menuProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesosActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Cobro de Pedido");
        menuProcesos.add(jMenuItem4);

        jMenuItem16.setText("Cancelar Reserva");
        menuProcesos.add(jMenuItem16);

        jMenuItem17.setText("Actualizar entrada de Productos");
        menuProcesos.add(jMenuItem17);

        jMenuItem18.setText("Actualizar salida de productos");
        menuProcesos.add(jMenuItem18);

        jMenuItem19.setText("Distribución de Propinas");
        menuProcesos.add(jMenuItem19);

        jMenuBar1.add(menuProcesos);

        jMenu5.setForeground(new java.awt.Color(255, 204, 51));
        jMenu5.setText(" Consultas");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N

        consulta_Usuario.setText("Usuarios");
        consulta_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_UsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(consulta_Usuario);

        consulta_Comentarios.setText("Comentarios");
        consulta_Comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_ComentariosActionPerformed(evt);
            }
        });
        jMenu5.add(consulta_Comentarios);

        jMenuItem24.setText("Empleados");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem24);

        jMenuItem14.setText("Clientes");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem1.setText("Reservas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        ConsultaMesas.setText("Mesas");
        ConsultaMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaMesasActionPerformed(evt);
            }
        });
        jMenu5.add(ConsultaMesas);

        Consulta_Producto.setText("Productos");
        Consulta_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_ProductoActionPerformed(evt);
            }
        });
        jMenu5.add(Consulta_Producto);

        TipoProducto.setText("Productos por Tipo");
        TipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoProductoActionPerformed(evt);
            }
        });
        jMenu5.add(TipoProducto);

        jMenuItem20.setText("Comentarios por fechas");
        jMenu5.add(jMenuItem20);

        jMenuItem22.setText("Mesas Reservadas");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Mesas Disponibles");
        jMenu5.add(jMenuItem23);

        jMenuItem25.setText("Clientes con Reservas");
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("Reservas por Fechas");
        jMenu5.add(jMenuItem26);

        jMenuItem27.setText("Reservas por Mesa");
        jMenu5.add(jMenuItem27);

        jMenuItem30.setText("Pedido por Fecha");
        jMenu5.add(jMenuItem30);

        jMenuItem31.setText("Pedido por Mesas");
        jMenu5.add(jMenuItem31);

        jMenuItem32.setText("Pedido por Camarero");
        jMenu5.add(jMenuItem32);

        jMenuBar1.add(jMenu5);
        jMenu5.getAccessibleContext().setAccessibleParent(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "¿Desea ir al Login?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {

            Login_Principal L = new Login_Principal();
            L.setVisible(true);
            dispose();

        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

        Usuario U = new Usuario();
        U.setVisible(true);

    }//GEN-LAST:event_usuarioActionPerformed

    private void comentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comentarioActionPerformed
        Comentario C = new Comentario();
        C.setVisible(true);

    }//GEN-LAST:event_comentarioActionPerformed

    private void mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaActionPerformed

        Mesa M = new Mesa();
        M.setVisible(true);

    }//GEN-LAST:event_mesaActionPerformed

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        Empleado E = new Empleado();
        E.setVisible(true);

    }//GEN-LAST:event_empleadoActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        Cliente C = new Cliente();
        C.setVisible(true);

    }//GEN-LAST:event_clientesActionPerformed

    private void tipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProductoActionPerformed
        Tipo_Producto TP = new Tipo_Producto();
        TP.setVisible(true);

    }//GEN-LAST:event_tipoProductoActionPerformed

    private void ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasActionPerformed
        Reservas R = new Reservas();
        R.setVisible(true);

    }//GEN-LAST:event_ReservasActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed

        Pedidos P = new Pedidos();
        P.setVisible(true);
    }//GEN-LAST:event_pedidosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        E_S_Productos ES = new E_S_Productos();
        ES.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void consulta_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_UsuarioActionPerformed
        Ventana_Usuario VU = new Ventana_Usuario();
        VU.setVisible(true);

    }//GEN-LAST:event_consulta_UsuarioActionPerformed

    private void consulta_ComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_ComentariosActionPerformed
        VentanaDeComentarios VC = new VentanaDeComentarios();
        VC.setVisible(true);

    }//GEN-LAST:event_consulta_ComentariosActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        VentanaDeClientes VC = new VentanaDeClientes();
        VC.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        Producto VM = new Producto();
        VM.setVisible(true);
    }//GEN-LAST:event_ProductosActionPerformed

    private void ConsultaMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaMesasActionPerformed
        Ventana_mesa VM = new Ventana_mesa();
        VM.setVisible(true);
    }//GEN-LAST:event_ConsultaMesasActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        VentanaDeEmpleados VM = new VentanaDeEmpleados();
        VM.setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void TipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoProductoActionPerformed
        VentanaTipoProducto VTP = new VentanaTipoProducto();
        VTP.setVisible(true);
    }//GEN-LAST:event_TipoProductoActionPerformed

    private void Consulta_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_ProductoActionPerformed
        VentanaProducto VP = new VentanaProducto();
        VP.setVisible(true);
    }//GEN-LAST:event_Consulta_ProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaDeReservas VP = new VentanaDeReservas();
        VP.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesosActionPerformed

    }//GEN-LAST:event_menuProcesosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsultaMesas;
    private javax.swing.JMenuItem Consulta_Producto;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Reservas;
    private javax.swing.JMenuItem TipoProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem clientes;
    private javax.swing.JMenuItem comentario;
    private javax.swing.JMenuItem consulta_Comentarios;
    private javax.swing.JMenuItem consulta_Usuario;
    private javax.swing.JMenuItem empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JMenu menuProcesos;
    private javax.swing.JMenuItem mesa;
    private javax.swing.JMenuItem pedidos;
    private javax.swing.JMenuItem tipoProducto;
    public static javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables
}
