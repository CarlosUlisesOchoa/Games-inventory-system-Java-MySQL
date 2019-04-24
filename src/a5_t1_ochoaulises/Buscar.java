/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5_t1_ochoaulises;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JOptionPane;
import shaneDialogs.Dialogs;

/**
 *
 * @author Uli Gibson
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Registrar
     */
    public Buscar() {
        initComponents();
        this.setTitle("Videojuegos - Búsqueda");
        actualizarTabla();
    }
    
    private boolean registroAbierto = false;

    
    public void actualizarTabla()
    {
        tabRegistros.setModel(Principal.myDB.getTable());
        setEstadoRegistro(false);
        Principal.updateContador();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cboxConsola = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboxCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblEliminarReg = new javax.swing.JLabel();
        lblModificar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtIDBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRegistros = new javax.swing.JTable();
        lblExportToPDF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        label1.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        label1.setText("Busqueda de videojuego");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Existencias:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Consola:");

        txtExistencias.setEditable(false);
        txtExistencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtExistencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistenciasKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cboxConsola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboxConsola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PS4", "XBOX ONE", "PS VITA" }));
        cboxConsola.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("$");

        cboxCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCIÓN", "DISPAROS", "ESTRATEGIA", "TERROR", "DEPORTE", "AVENTURA" }));
        cboxCategoria.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Categoría:");

        lblEliminarReg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEliminarReg.setForeground(java.awt.Color.gray);
        lblEliminarReg.setText("Eliminar");
        lblEliminarReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarRegMouseClicked(evt);
            }
        });

        lblModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblModificar.setForeground(java.awt.Color.gray);
        lblModificar.setText("Modificar");
        lblModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxConsola, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtID)
                            .addComponent(txtExistencias))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEliminarReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblModificar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEliminarReg)
                    .addComponent(lblModificar))
                .addGap(22, 22, 22))
        );

        txtIDBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDBuscarKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID a buscar:");

        btnBuscar.setBackground(new java.awt.Color(133, 194, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabRegistros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabRegistros);

        lblExportToPDF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblExportToPDF.setForeground(new java.awt.Color(51, 153, 255));
        lblExportToPDF.setText("<html><u><p>Exportar todos los registros a PDF</p></u></html>");
        lblExportToPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExportToPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExportToPDFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblExportToPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblExportToPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        if(txtIDBuscar.getText().length() > 0) {
        
            if(Videojuegos.accBuscar()) {
                setEstadoRegistro(true);
            }
            else {
                setEstadoRegistro(false);
                tabRegistros.clearSelection();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el ID que desea buscar", this.getTitle()+" - Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lblEliminarRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarRegMouseClicked
        // TODO add your handling code here:
        
        if(!registroAbierto) return;
        
        String ObjButtons[] = {"Si, estoy seguro","No, cancelar!"};
        int PromptResult = JOptionPane.showOptionDialog(null, 
            String.format("¿Seguro que deseas eliminar \"%s [ID: %s]\" ",txtNombre.getText(), txtID.getText()), 
            this.getTitle()+" - Aviso", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE, null, ObjButtons,ObjButtons[1]);
        if(PromptResult==0)
        {
            Videojuegos.eliminarReg(Integer.valueOf(txtID.getText()));
            setEstadoRegistro(false);
            actualizarTabla();
        }
    }//GEN-LAST:event_lblEliminarRegMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
        // TODO add your handling code here:
        if(!registroAbierto) return;
        
        String ObjButtons[] = {"Si, estoy seguro","No, cancelar!"};
        int PromptResult = JOptionPane.showOptionDialog(null, 
            "¿Seguro que deseas aplicar los cambios?", 
            this.getTitle()+" - Aviso", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE, null, ObjButtons,ObjButtons[1]);
        if(PromptResult==0)
        {
            Videojuegos modReg = new Videojuegos(
                    Integer.valueOf(txtID.getText()), txtNombre.getText(),
                    Integer.valueOf(txtExistencias.getText()), cboxConsola.getSelectedIndex(),
                    cboxCategoria.getSelectedIndex(), txtPrecio.getText()
            );
            Videojuegos.actualizarReg(Integer.valueOf(txtID.getText()), modReg);
            actualizarTabla();
            btnBuscarActionPerformed(null);
        }
        
    }//GEN-LAST:event_lblModificarMouseClicked

    private void txtIDBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDBuscarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (c < '0' || c > '9') && c != KeyEvent.VK_BACK_SPACE) { // Si no es un número entre 0 y 9 ni tampoco un backspace, se cancela el ingreso
            evt.consume();
        }
    }//GEN-LAST:event_txtIDBuscarKeyTyped

    private void txtExistenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciasKeyTyped
        // TODO add your handling code here:
        if  ((!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') 
            || ((evt.getKeyChar() == '.' && txtExistencias.getText().contains(".")))
            ) {
                evt.consume();
        }
    }//GEN-LAST:event_txtExistenciasKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        if  ((!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') 
            || ((evt.getKeyChar() == '.' && txtPrecio.getText().contains(".")))
            ) {
                evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void tabRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabRegistrosMouseClicked
        // TODO add your handling code here:
        if(evt.getButton() == MouseEvent.BUTTON3) return; // Si es clic derecho, retornar...
        String ID_Clicked = tabRegistros.getModel().getValueAt(tabRegistros.getSelectedRow(), 0).toString();
        if(!ID_Clicked.equals(txtID.getText())) { //Si el ID clickeado no es el mismo actualmente seleccionado, entonces..
            txtIDBuscar.setText(ID_Clicked);
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_tabRegistrosMouseClicked

    private void lblExportToPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExportToPDFMouseClicked
        // TODO add your handling code here:
        FileChooser fc = new FileChooser();
        File dir = fc.getDirToSave("Registros de videojuegos.pdf", new String[]{"pdf"});
        
        if(dir != null) {
            if(new PDF().exportJTableToPDF(tabRegistros, dir, true)) {
                Dialogs.InfoMsg("¡Se exportó el archivo exitosamente!");
            }
        }
    }//GEN-LAST:event_lblExportToPDFMouseClicked

    private void setEstadoRegistro(boolean estado)
    {
        if(estado){
            lblEliminarReg.setForeground(Color.black);
            lblEliminarReg.setCursor(new Cursor(Cursor.HAND_CURSOR));
            lblModificar.setForeground(Color.black);
            lblModificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else {
            lblEliminarReg.setForeground(Color.gray);
            lblEliminarReg.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            lblModificar.setForeground(Color.gray);
            lblModificar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            registroAbierto = false;
            txtNombre.setText("");
            txtID.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            cboxCategoria.setSelectedIndex(0);
            cboxConsola.setSelectedIndex(0);
        }
        registroAbierto = estado;
        txtNombre.setEditable(estado);
        txtExistencias.setEditable(estado);
        txtPrecio.setEditable(estado);
        cboxCategoria.setEnabled(estado);
        cboxConsola.setEnabled(estado);
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JComboBox<String> cboxCategoria;
    public static javax.swing.JComboBox<String> cboxConsola;
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
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblEliminarReg;
    private javax.swing.JLabel lblExportToPDF;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JTable tabRegistros;
    public static javax.swing.JTextField txtExistencias;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtIDBuscar;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
