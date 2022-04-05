package Paneles;

import Conectar.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import Modelo.estudiantes;
import ModeloBD.estudiantesBD;

/**
 *
 * @author RaMIRO
 */
public class frmBuscarestudiantes extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    String sql="";
    Connection cn=conectar.getConexion();
    Statement st;
    ResultSet rs;
    
    public String id;
    public frmBuscarestudiantes() {
        initComponents();
        sqlNombre();
        bloquear();
        btnModificar.setEnabled(false);
        t_datos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(""+t_datos.getSelectedRow());
                desbloquear();
                if(t_datos.getSelectedRow()!= -1){
                    int fila = t_datos.getSelectedRow();
                    id = t_datos.getValueAt(fila,0).toString();
                    txtCodigo.setText(t_datos.getValueAt(fila,0).toString());
                    txt1nombre.setText(t_datos.getValueAt(fila,1).toString());
                    txt2nombre.setText(t_datos.getValueAt(fila,2).toString());
                    txt1apellido.setText(t_datos.getValueAt(fila,3).toString());
                    txt2apellido.setText(t_datos.getValueAt(fila,4).toString());
                    txtdireccion.setText(t_datos.getValueAt(fila,5).toString());
                    txtcorreo.setText(t_datos.getValueAt(fila,6).toString());
                    txtCedula.setText(t_datos.getValueAt(fila,7).toString());
                    txttelefono.setText(t_datos.getValueAt(fila,8).toString());
                    
                    


                }
                
                throw new UnsupportedOperationException("No se pudo cargar la información"); //To change body of generated methods, choose Tools | Templates.
            }
        });
//        {
//            
//        }
    }
    public void sqlNombre(){
        sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE PRIMERNOMBRE LIKE '%"+txtBuscar.getText()+"%'";
        cargar(sql);
    }

    void cargar(String valor){
        String[] titulos={"Codigo","Cedula","Primer Nombre","Segundo Nombre","Primer Apellido","Segundo Apellido","Direccion","Telefono","Correo"};
        String[] registros= new String[9];
        
        //String sql="SELECT id_cliente, nombre, apellido, direccion, telefono, cedula FROM clientes WHERE cli_apellidos LIKE '%"+valor+"%' AND cli_tipo = 'Aspirante'";
        //String sql="SELECT id_cliente, nombre, apellido, direccion, telefono, cedula FROM clientecredito WHERE apellido LIKE '%"+valor+"%'";
        String sql=valor;
        model = new DefaultTableModel(null, titulos);

        
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            //Object[] regustros = new Object[rs.getColumnCount()];
            while(rs.next()){
                registros[0]=rs.getString("IDESTUDIANTE");
                registros[1]=rs.getString("CEDULA");
                registros[2]=rs.getString("PRIMERNOMBRE");
                registros[3]=rs.getString("SEGUNDONOMBRE");
                registros[4]=rs.getString("PRIMERAPELLIDO");
                registros[5]=rs.getString("SEGUNDOAPELLIDO");
                registros[6]=rs.getString("DIRECCION");
                registros[7]=rs.getString("TELEFONO");
                registros[8]=rs.getString("CORREO");
               
                model.addRow(registros);
                t_datos.setModel(model);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(JIFPersonalInterno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex,"Error de excepción",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    public void limpiar(){
        txt1nombre.setText("");
        txt2nombre.setText("");
        txt1apellido.setText("");
        txt2apellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        txtCedula.setText("");
                
    }
    
    public void bloquear(){
        btnModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        txt1nombre.setEnabled(false);
        txt2nombre.setEnabled(false);
        txt1apellido.setEnabled(false);
        txt2apellido.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtCedula.setEnabled(false);
                
    }
    
    public void desbloquear(){
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        txt1nombre.setEnabled(true);
        txt2nombre.setEnabled(true);
        txt1apellido.setEnabled(true);
        txt2apellido.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtCedula.setEnabled(true);
        txtCedula.setEnabled(true);
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBuscar = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt1nombre = new javax.swing.JTextField();
        txt2nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt1apellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt2apellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbBuscar1Nombre = new javax.swing.JRadioButton();
        rbBuscar2Nombre = new javax.swing.JRadioButton();
        rbBuscar1apellido = new javax.swing.JRadioButton();
        rbBuscar2apellido = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        rbBuscardireccion = new javax.swing.JRadioButton();
        rbBuscarCorreo = new javax.swing.JRadioButton();
        rbBuscarCedula = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Seleccionado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PRIMER NOMBRE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 116, -1));
        jPanel2.add(txt1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 588, -1));
        jPanel2.add(txt2nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 588, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SEGUNDO NOMBRE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 116, -1));

        txt1apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt1apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 588, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("PRIMER APELLIDO");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 116, -1));

        txt2apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt2apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 185, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("SEGUNDO APELLIDO");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 110, 235, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("CEDULA");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("DIRECCION");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 116, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("CORREO");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 136, 185, -1));
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 162, 185, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("TELEFONO");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 77, -1));
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 147, 235, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\java imagenes\\depositphotos_184028684-stock-illustration-hexagonal-abstract-background-big-data.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 740, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 754, 200));

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setRollover(true);

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java11.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnModificar);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Today_96px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnGuardar);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java6.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCancelar);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java33.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEliminar);

        getContentPane().add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 754, 100));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbBuscar1Nombre.setBackground(null);
        grupoBuscar.add(rbBuscar1Nombre);
        rbBuscar1Nombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscar1Nombre.setSelected(true);
        rbBuscar1Nombre.setText("Primer Nombre");
        jPanel1.add(rbBuscar1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        rbBuscar2Nombre.setBackground(null);
        grupoBuscar.add(rbBuscar2Nombre);
        rbBuscar2Nombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscar2Nombre.setText("Segundo Nombre");
        jPanel1.add(rbBuscar2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        rbBuscar1apellido.setBackground(null);
        grupoBuscar.add(rbBuscar1apellido);
        rbBuscar1apellido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscar1apellido.setText("Primer Apellido");
        jPanel1.add(rbBuscar1apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        rbBuscar2apellido.setBackground(null);
        grupoBuscar.add(rbBuscar2apellido);
        rbBuscar2apellido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscar2apellido.setText("Segundo Apellido");
        jPanel1.add(rbBuscar2apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 50, 722, 30));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 20, 20, 20));

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 722, 195));

        rbBuscardireccion.setBackground(null);
        grupoBuscar.add(rbBuscardireccion);
        rbBuscardireccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscardireccion.setText("Direccion");
        jPanel1.add(rbBuscardireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        rbBuscarCorreo.setBackground(null);
        grupoBuscar.add(rbBuscarCorreo);
        rbBuscarCorreo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscarCorreo.setText("Correo");
        jPanel1.add(rbBuscarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        rbBuscarCedula.setBackground(null);
        grupoBuscar.add(rbBuscarCedula);
        rbBuscarCedula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        rbBuscarCedula.setText("Cedula");
        jPanel1.add(rbBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\java imagenes\\imagenes-en-hd-para-fondo-de-pantalla-grandes.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 754, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\java imagenes\\depositphotos_184028684-stock-illustration-hexagonal-abstract-background-big-data.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 750, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        
        if(rbBuscar1Nombre.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE PRIMERNOMBRE LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }else if(rbBuscar2Nombre.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE SEGUNDONOMBRE LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }else if(rbBuscar1apellido.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE PRIMERAPELLIDO LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }else if(rbBuscar2apellido.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE SEGUNDO APELLIDO LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }
        else if(rbBuscardireccion.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE DIRECCION LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }
        else if(rbBuscarCorreo.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE CORREO LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }
        else if(rbBuscarCedula.isSelected()){
            sql="SELECT IDESTUDIANTE,CEDULA, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, DIRECCION,TELEFONO,CORREO FROM estudiantes WHERE  CEDULA LIKE '%"+txtBuscar.getText()+"%'";
            cargar(sql);
        }
        
        
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        desbloquear();
        


//        clientes obj = new clientes(txtCodigo.getText(),txtNombres.getText(),txtApellidos.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCedula.getText());
//        try {
//            clientesBD.actualizar(obj);
////            limpiar();
////            bloquear();
//
//
//            //t_datos.removeAll();
//            cargar("");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error BD: " + ex.getMessage());
//        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        estudiantes obj = new estudiantes(txtCodigo.getText(),txtCedula.getText(),txt1nombre.getText(),txt2nombre.getText(), txt1apellido.getText(), txt2apellido.getText(), txtdireccion.getText(),txttelefono.getText(),txtcorreo.getText());
        try {
            estudiantesBD.eliminar(obj);
            //cargar("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error BD: " + ex.getMessage());
        }
        bloquear();
            limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        estudiantes obj = new estudiantes(txtCodigo.getText(),txtCedula.getText(),txt1nombre.getText(),txt2nombre.getText(), txt1apellido.getText(), txt2apellido.getText(), txtdireccion.getText(),txttelefono.getText(),txtcorreo.getText());
       
        try {
            estudiantesBD.actualizar(obj);
            
            sqlNombre();
            
        } catch (SQLException ex) {
            Logger.getLogger(frmBuscarestudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        bloquear();
            limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txt1apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1apellidoActionPerformed

    private void txt2apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2apellidoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup grupoBuscar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JRadioButton rbBuscar1Nombre;
    private javax.swing.JRadioButton rbBuscar1apellido;
    private javax.swing.JRadioButton rbBuscar2Nombre;
    private javax.swing.JRadioButton rbBuscar2apellido;
    private javax.swing.JRadioButton rbBuscarCedula;
    private javax.swing.JRadioButton rbBuscarCorreo;
    private javax.swing.JRadioButton rbBuscardireccion;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField txt1apellido;
    private javax.swing.JTextField txt1nombre;
    private javax.swing.JTextField txt2apellido;
    private javax.swing.JTextField txt2nombre;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
