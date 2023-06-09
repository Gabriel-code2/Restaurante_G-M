package MOVIMIENTOS;

import ARCHIVOS.ArchivoPedidos;
import ARCHIVOS.DetallePedido;
import MANTENIMIENTOS.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Usuario
 */
public class Pedidos extends javax.swing.JFrame {

    boolean creear;
    boolean encontrado = false;
    boolean CL = false;

    boolean encontradoM = false;
    String Santigualinea;

    public Pedidos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pedidos");
        fechapedido.setText(fecha());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Idpedido = new javax.swing.JTextField();
        idcliente = new javax.swing.JTextField();
        valorpedido = new javax.swing.JTextField();
        conceptopedido = new javax.swing.JTextField();
        fechapedido = new javax.swing.JTextField();
        valoritbis = new javax.swing.JTextField();
        valorPropinas = new javax.swing.JTextField();
        idCamarero = new javax.swing.JTextField();
        idMesaPedido = new javax.swing.JTextField();
        SI = new javax.swing.JRadioButton();
        NO = new javax.swing.JRadioButton();
        estado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        IDDProducto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        PreProducto1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        IDProducto1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Sec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID Cliente Pedido:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Valor Pedido:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Disponible:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Valor Itbis:");

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID Pedido:");

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Valor Propina:");

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Concepto:");

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ID Mesa:");

        jLabel11.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("ID Camarero:");

        Idpedido.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        Idpedido.setForeground(new java.awt.Color(102, 102, 102));
        Idpedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        Idpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdpedidoActionPerformed(evt);
            }
        });

        idcliente.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        idcliente.setForeground(new java.awt.Color(102, 102, 102));
        idcliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclienteActionPerformed(evt);
            }
        });

        valorpedido.setEditable(false);
        valorpedido.setBackground(new java.awt.Color(255, 255, 255));
        valorpedido.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        valorpedido.setForeground(new java.awt.Color(255, 0, 0));
        valorpedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        valorpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorpedidoActionPerformed(evt);
            }
        });
        valorpedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorpedidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorpedidoKeyTyped(evt);
            }
        });

        conceptopedido.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        conceptopedido.setForeground(new java.awt.Color(102, 102, 102));
        conceptopedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        fechapedido.setEditable(false);
        fechapedido.setBackground(new java.awt.Color(255, 255, 255));
        fechapedido.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        fechapedido.setForeground(new java.awt.Color(102, 102, 102));
        fechapedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        valoritbis.setEditable(false);
        valoritbis.setBackground(new java.awt.Color(255, 255, 255));
        valoritbis.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        valoritbis.setForeground(new java.awt.Color(102, 102, 102));
        valoritbis.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        valorPropinas.setEditable(false);
        valorPropinas.setBackground(new java.awt.Color(255, 255, 255));
        valorPropinas.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        valorPropinas.setForeground(new java.awt.Color(255, 0, 0));
        valorPropinas.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        idCamarero.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        idCamarero.setForeground(new java.awt.Color(102, 102, 102));
        idCamarero.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        idCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCamareroActionPerformed(evt);
            }
        });

        idMesaPedido.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        idMesaPedido.setForeground(new java.awt.Color(102, 102, 102));
        idMesaPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        SI.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(SI);
        SI.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        SI.setText("Si");
        SI.setEnabled(false);

        NO.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(NO);
        NO.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        NO.setText("NO");
        NO.setEnabled(false);

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(51, 204, 255));
        estado.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel12.setText("Salir");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x (1).png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel13.setText("Limpiar");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel14.setText("Guardar");

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/descargar.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ID Det Producto:");

        IDDProducto.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        IDDProducto.setForeground(new java.awt.Color(102, 102, 102));
        IDDProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        IDDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDDProductoActionPerformed(evt);
            }
        });
        IDDProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDDProductoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Cantidad:");

        Cantidad.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(102, 102, 102));
        Cantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Precio Producto:");

        PreProducto1.setEditable(false);
        PreProducto1.setBackground(new java.awt.Color(255, 255, 255));
        PreProducto1.setFont(new java.awt.Font("Liberation Mono", 1, 16)); // NOI18N
        PreProducto1.setForeground(new java.awt.Color(102, 102, 102));
        PreProducto1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel18.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("ID Producto:");

        IDProducto1.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        IDProducto1.setForeground(new java.awt.Color(102, 102, 102));
        IDProducto1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        IDProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDProducto1ActionPerformed(evt);
            }
        });

        Sec.setBackground(new java.awt.Color(255, 255, 255));
        Sec.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        Sec.setForeground(new java.awt.Color(102, 102, 102));
        Sec.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel16.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("SEC Producto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel12)))
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NO))
                                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(valorpedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(fechapedido, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorPropinas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(valoritbis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idMesaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conceptopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(265, 265, 265)
                                    .addComponent(PreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(104, 104, 104)
                        .addComponent(Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fechapedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(valoritbis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(valorPropinas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conceptopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(valorpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(idMesaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SI)
                    .addComponent(NO))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IDDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(IDProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(PreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Idpedido.setText("");
        idcliente.setText("");
        valorPropinas.setText("");
        valorpedido.setText("");
        valoritbis.setText("");
        conceptopedido.setText("");
        idCamarero.setText("");
        idMesaPedido.setText("");
        estado.setText("");

        IDDProducto.setText("");
        IDProducto1.setText("");
        Cantidad.setText("");
        PreProducto1.setText("");
        Sec.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Idpedido.getText().equals("") || idcliente.getText().equals("") || valorPropinas.getText().equals("") || valorpedido.getText().equals("") || valoritbis.getText().equals("") || conceptopedido.getText().equals("") || idCamarero.getText().equals("") || valoritbis.getText().equals("") || conceptopedido.getText().equals("") || idMesaPedido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");

        } else {

            String Id = "";
            String fecha = "", Idcliente = "", Idmesa = "", Camarero = "", mesa = "";
            String fechaR = "", hora = "", ValorP = "", ValorItbis = "", Concep = "", propi = "";
            String Snuevalinea = "", ST = "";

            ArchivoPedidos archivo = new ArchivoPedidos();
            NO.setSelected(true);
            Id = Idpedido.getText();
            fecha = fechapedido.getText();
            Idcliente = idcliente.getText();
            propi = valorPropinas.getText();
            ValorP = valorpedido.getText();
            ValorItbis = valoritbis.getText();
            Concep = conceptopedido.getText();
            Camarero = idCamarero.getText();
            mesa = idMesaPedido.getText();

            if (NO.isSelected()) {
                ST = "NO";
            } else {
                ST = "Si";
            }
            try {

                if (creear == false) {
                    archivo.GuardarDatos(Id, fecha, Idcliente, ValorP, ST, ValorItbis, propi, Concep, Camarero, mesa);
                } else {
                    Snuevalinea = (Id + " ; " + fecha + " ; " + Idcliente + " ; " + ValorP + " ; " + ST + " ; " + ValorItbis + " ; " + propi + " ; " + Concep + " ; " + Camarero + " ; " + mesa);
                    archivo.Modificar(Santigualinea, Snuevalinea);
                }

                Idpedido.setText("");
                fechapedido.setText("");
                idcliente.setText("");
                valorPropinas.setText("");
                valorpedido.setText("");
                valoritbis.setText("");
                conceptopedido.setText("");
                idCamarero.setText("");
                idMesaPedido.setText("");

                estado.setText("");

            } catch (IOException el) {
                el.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Registro guardado");

        }

        if (IDDProducto.getText().equals("") || IDProducto1.getText().equals("") || Cantidad.getText().equals("") || PreProducto1.getText().equals("") || Sec.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Rellene Todos los campos ");

        } else {

            String Id = "";
            String Idp = "", Can = "", precio = "", Secu = "", mesa = "";
            String Snuevalinea = "", ST = "";

            DetallePedido archivo = new DetallePedido();

            Id = IDDProducto.getText();
            Idp = IDProducto1.getText();
            Can = Cantidad.getText();
            precio = PreProducto1.getText();
            Secu = Sec.getText();

            try {

                if (creear == false) {
                    archivo.GuardarDatos(Id, Idp, Can, precio, Secu);
                } else {
                    Snuevalinea = (Id + " ; " + Idp + " ; " + Can + " ; " + precio + " ; " + Secu);
                    archivo.Modificar(Santigualinea, Snuevalinea);
                }

                IDDProducto.setText("");
                IDProducto1.setText("");
                Cantidad.setText("");
                PreProducto1.setText("");
                Sec.setText("");

            } catch (IOException el) {
                el.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Detalle guardado");

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void IdpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdpedidoActionPerformed
        if (evt.getSource() == Idpedido) {

            boolean encontrado = false;
            int cod = Integer.parseInt(Idpedido.getText());
            String ST = "NO";
            Scanner s;

            try {
                File f = new File("Pedidos.txt");
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
                                fechapedido.setText(sl.next());
                                idcliente.setText(sl.next());
                                valorpedido.setText(sl.next());
                                if (ST.equals(sl.next())) {
                                    NO.setSelected(true);
                                } else {
                                    SI.setSelected(true);
                                }
                                valoritbis.setText(sl.next());
                                valorPropinas.setText(sl.next());

                                conceptopedido.setText(sl.next());
                                idCamarero.setText(sl.next());
                                idMesaPedido.setText(sl.next());

                                encontrado = true;
                                creear = true;

                                Santigualinea = Idpedido.getText() + " ; " + fechapedido.getText() + " ; " + idcliente.getText() + " ; " + valorPropinas.getText() + " ; " + valorpedido.getText() + " ; " + conceptopedido.getText() + " ; " + idCamarero.getText() + " ; " + idMesaPedido.getText();

                                estado.setText("MODIFICANDO");

                            } else {

                                idcliente.setText("");
                                valorPropinas.setText("");
                                valorpedido.setText("");
                                valoritbis.setText("");
                                conceptopedido.setText("");
                                idCamarero.setText("");
                                idMesaPedido.setText("");

                                encontrado = false;
                                creear = false;
                                estado.setText("CREANDO");
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


    }//GEN-LAST:event_IdpedidoActionPerformed

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed

        if (evt.getSource() == idcliente) {

            String auxid = idcliente.getText();
            String nombreTipo = "";

            boolean encontrado = false;
            try {
                int Id_Tipo = Integer.parseInt(auxid);
                try {
                    File f = new File("Clientes.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                encontrado = true;
                                nombreTipo = s1.next();
                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(rootPane, "El cliente NO Existe");
                            JOptionPane.showMessageDialog(rootPane, "Por Favor creelo como nuevo");
                            CL = true;

                            Cliente C = new Cliente();
                            C.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "El Nombre del cliente es: " + nombreTipo);
                            conceptopedido.grabFocus();
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El clinete no Existe");
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                idcliente.setText("");
                JOptionPane.showMessageDialog(rootPane, "No se permiten caracteres en el Id");
            }

        }

        if (evt.getSource() == idcliente && CL == false) {

            String auxid = idcliente.getText();

            String nombreTipo = "", FC = "";
            int mesa = 0, cliente = 0;

            boolean encontrado = false;
            try {
                int Id_Tipo = Integer.parseInt(auxid);
                try {
                    File f = new File("Reservas.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                s1.next();
                                s1.next();
                                mesa = s1.nextInt();
                                FC = s1.next();
                                encontrado = true;

                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(this, "EL CLIENTE NO TIENE RESERVA", "Error", JOptionPane.ERROR_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "El Cliente hizo una Reserva el: " + FC);
                            JOptionPane.showMessageDialog(rootPane, "La mesa reservada fue la numero: " + mesa);
                            idMesaPedido.setText(Integer.toString(mesa));

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El clinete no Existe");
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                idcliente.setText("");
                JOptionPane.showMessageDialog(rootPane, "No se permiten caracteres en el Id");
            }
        }

    }//GEN-LAST:event_idclienteActionPerformed

    private void idCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCamareroActionPerformed

        if (evt.getSource() == idCamarero) {
            String auxid = idCamarero.getText();

            String nombreTipo = "", empleado = "Camarero";

            boolean encontrado = false;
            try {
                int Id_Tipo = Integer.parseInt(auxid);
                String TP = "";
                try {

                    File f = new File("Empleados.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                encontrado = true;
                                nombreTipo = s1.next();
                                TP = s1.next();

                                if (empleado.equals(s1.next())) {
                                    JOptionPane.showMessageDialog(rootPane, "El Empleado es Camarero");
                                    JOptionPane.showMessageDialog(rootPane, "Nombre del camarero: " + nombreTipo);

                                }

                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(this, "El EMPLEADO NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);

                        } else {

                            JOptionPane.showMessageDialog(rootPane, "El empleado es " + TP);

                        }

                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                idCamarero.setText("");
                JOptionPane.showMessageDialog(rootPane, "No se permiten caracteres en el Id");
            }
        }


    }//GEN-LAST:event_idCamareroActionPerformed

    private void valorpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorpedidoActionPerformed

        int Vpedido = Integer.parseInt(valorpedido.getText());

        double propi = Vpedido * 0.10;

        valorPropinas.setText(Integer.toString((int) propi));


    }//GEN-LAST:event_valorpedidoActionPerformed

    private void valorpedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorpedidoKeyReleased

        int Vpedido = Integer.parseInt(valorpedido.getText());

        double propi = Vpedido * 0.10;

        valorPropinas.setText(Integer.toString((int) propi));

    }//GEN-LAST:event_valorpedidoKeyReleased

    private void IDDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDDProductoActionPerformed
        IDDProducto.setText(Idpedido.getText());
        
    }//GEN-LAST:event_IDDProductoActionPerformed

    private void IDProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDProducto1ActionPerformed

        if (evt.getSource() == IDProducto1) {
            String auxid = IDProducto1.getText();
            String nombreTipo = "";

            boolean encontrado = false;
            try {
                int Id_Tipo = Integer.parseInt(auxid);
                try {
                    File f = new File("Productos.txt");
                    Scanner s = new Scanner(f);
                    if (f.exists()) {

                        while (s.hasNextLine() && !encontrado) {
                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);
                            s1.useDelimiter("\\s*;\\s*");

                            if (Id_Tipo == Integer.parseInt(s1.next())) {
                                encontrado = true;
                                s1.next();
                                s1.next();
                                s1.next();
                                nombreTipo = s1.next();
                            }

                        }
                        s.close();

                        if (!encontrado) {
                            JOptionPane.showMessageDialog(this, "El Producto no Existe", "Error", JOptionPane.ERROR_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "El producto existe");
                            Cantidad.grabFocus();
                            PreProducto1.setText(nombreTipo);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "El Producto no Existe", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo correctamente\n" + e);
                }

            } catch (Exception ex) {
                IDProducto1.setText("");
            }
        }


    }//GEN-LAST:event_IDProducto1ActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        if (evt.getSource() == Cantidad) {
            String prec = PreProducto1.getText();
            String cant = Cantidad.getText();

            int aux = Integer.parseInt(cant);
            int aux2 = Integer.parseInt(prec);
            String A;
            String B;
            String C;
            int aux1;
            int a, c;
            aux1 = aux2 * aux;
            a = (int) (aux1 * 0.18);
            c = (int) (aux1 * 0.1);

            A = Integer.toString((int) aux1);
            B = Integer.toString((int) a);
            C = Integer.toString((int) c);

            valorpedido.setText(A);
            valoritbis.setText(B);
            valorPropinas.setText(Integer.toString((int) c));
        }

    }//GEN-LAST:event_CantidadActionPerformed

    private void valorpedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorpedidoKeyTyped


    }//GEN-LAST:event_valorpedidoKeyTyped

    private void IDDProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDDProductoKeyTyped
        
        
    }//GEN-LAST:event_IDDProductoKeyTyped

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField IDDProducto;
    private javax.swing.JTextField IDProducto1;
    private javax.swing.JTextField Idpedido;
    private javax.swing.JRadioButton NO;
    private javax.swing.JTextField PreProducto1;
    private javax.swing.JRadioButton SI;
    private javax.swing.JTextField Sec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField conceptopedido;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField fechapedido;
    private javax.swing.JTextField idCamarero;
    private javax.swing.JTextField idMesaPedido;
    private javax.swing.JTextField idcliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField valorPropinas;
    private javax.swing.JTextField valoritbis;
    private javax.swing.JTextField valorpedido;
    // End of variables declaration//GEN-END:variables
}
