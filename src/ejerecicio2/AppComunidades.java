
/**
 * 
 */
package ejerecicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author daw1
 */
public class AppComunidades extends javax.swing.JFrame {

    /**
     * Creates new form AppComunidades
     */
    public AppComunidades() {
        initComponents();
        establecerConexion();
    }
    /**
     * 
     */
    public void establecerConexion() {
        try {
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                this.lConexion.setText("Conexion Establecia");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * 
     * @return 
     */
    public int buscarId() {
        PreparedStatement psSelectNombre;
        int id = 0;
        try {
            psSelectNombre = conn.prepareStatement(this.selectNombre);
            psSelectNombre.setString(1, (String) this.listaComunidades.getSelectedItem());
            rs = psSelectNombre.executeQuery();
            rs.next();
            id = rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "!Error " + ex.getMessage() + ex.getErrorCode(), "Ventana check", JOptionPane.INFORMATION_MESSAGE);
        }
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lParque = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        lNombre1 = new javax.swing.JLabel();
        textExtension = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bNuevo = new javax.swing.JButton();
        lConexion = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        listaComunidades = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lParque.setText("id Parque");

        textId.setBackground(new java.awt.Color(204, 255, 204));
        textId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lNombre.setText("Nombre parque");

        textNombre.setBackground(new java.awt.Color(204, 255, 204));
        textNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lNombre1.setText("Extension");

        textExtension.setBackground(new java.awt.Color(204, 255, 204));
        textExtension.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textExtension.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Km2");

        bNuevo.setText("NEW");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        lCodigo.setText("Codigo Comunidad");
        lCodigo.setToolTipText("");

        bEditar.setText("EDIT");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bBorrar.setText("DELETE");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        listaComunidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andalucia", "Aragon", "Castilla La Mancha", "Canarias", "Comunidad Valenciana" }));
        listaComunidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaComunidadesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCodigo)
                                    .addComponent(lNombre1))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textExtension, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(listaComunidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNombre)
                                    .addComponent(lParque))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lParque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaComunidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        PreparedStatement psInsert;
        PreparedStatement psSelectIdParque;
        try {
            psInsert = conn.prepareStatement(this.insertParque);
            psInsert.setString(1, this.textNombre.getText());
            psInsert.setDouble(2, Double.parseDouble(this.textExtension.getText()));
            psInsert.setInt(3, buscarId());
            int hecho = psInsert.executeUpdate();

            if (hecho != 0) {
                psSelectIdParque = conn.prepareStatement(this.selectId);
                psSelectIdParque.setString(1, this.textNombre.getText());
                rs = psSelectIdParque.executeQuery();
                rs.next();
                id = rs.getInt("id");
                JOptionPane.showMessageDialog(null, "Insercion correcta Se ha añadido el parque:" + id, "Ventana check", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Insercion incorrecta", "Ventana check", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "!!Error" + ex.getMessage() + ex.getErrorCode(), "Ventana check", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bNuevoActionPerformed
    
   
  
    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        PreparedStatement psUpdate = null;
        String updateParque ;
        try {
            if (!this.textNombre.getText().isEmpty() && comunidadModif != 0 && !this.textExtension.getText().isEmpty()) {
                updateParque = "update parque set  nombre = ?, extension = ?, idComunidad= ? where id = ?";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setString(1, this.textNombre.getText()); 
                psUpdate.setDouble(2, Double.parseDouble(this.textExtension.getText()));
                
                psUpdate.setInt(3, buscarId());
                psUpdate.setInt(4, Integer.parseInt(this.textId.getText()));

            }
            if (!this.textNombre.getText().isEmpty() && comunidadModif != 0) {
                updateParque = "update parque set  nombre = ?, idComunidad= ? where id = ?";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setString(1, this.textNombre.getText());
                psUpdate.setInt(2, buscarId());
                psUpdate.setInt(3, Integer.parseInt(this.textId.getText()));

            }
            if (!this.textExtension.getText().isEmpty() && comunidadModif != 0) {
                updateParque = "update parque set  extension = ?, idComunidad = ? where id = ? ";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setDouble(1, Double.parseDouble(this.textExtension.getText()));
                psUpdate.setInt(2, buscarId());
                psUpdate.setInt(3, Integer.parseInt(this.textId.getText()));

            }
            if (!this.textNombre.getText().isEmpty()) {
                updateParque = "update parque set nombre = ? where id = ?";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setString(1, this.textNombre.getText());
                
                psUpdate.setInt(2, Integer.parseInt(this.textId.getText()));               
            }
            if (!this.textExtension.getText().isEmpty()) {
                updateParque = "update parque set extension = ? where id = ?";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setDouble(1, Double.parseDouble(this.textExtension.getText()));              
                psUpdate.setInt(2, Integer.parseInt(this.textId.getText()));               
            }
            if(comunidadModif!=0){
                updateParque=" update parque set idComunidad = ? where id = ?";
                psUpdate = conn.prepareStatement(updateParque);
                psUpdate.setInt(1, buscarId());
                psUpdate.setInt(2, Integer.parseInt(this.textId.getText())); 
            
            }           
            int hecho = psUpdate.executeUpdate();
            if (hecho != 0) {
                JOptionPane.showMessageDialog(null, "Edicion correcta", "Ventana check", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Edicion incorrecta", "Ventana check", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "!!Error" + ex.getMessage() + ex.getErrorCode(), "Ventana check", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        PreparedStatement psDelete;
        int hecho = 0;
        try {
            if (textNombre.getText().isEmpty() != true && this.textId.getText().isEmpty() == true) {
                String delete1 = "delete from parque where nombre = ?";
                psDelete = conn.prepareStatement(delete1);
                psDelete.setString(1, (String) this.textNombre.getText());
                hecho = psDelete.executeUpdate();
            } else if (textId.getText().isEmpty() != true) {
                String delete2 = "delete from parque where id = ?";
                psDelete = conn.prepareStatement(delete2);
                psDelete.setInt(1, Integer.parseInt(this.textId.getText()));
                hecho = psDelete.executeUpdate();
            }

            if (hecho != 0) {
                JOptionPane.showMessageDialog(null, " Borrado correcto", "Ventana check", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Borrado incorrecto", "Ventana check", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppComunidades.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_bBorrarActionPerformed

    private void listaComunidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaComunidadesItemStateChanged
        comunidadModif = buscarId();
    }//GEN-LAST:event_listaComunidadesItemStateChanged

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
            java.util.logging.Logger.getLogger(AppComunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppComunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppComunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppComunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppComunidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lConexion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lNombre1;
    private javax.swing.JLabel lParque;
    private javax.swing.JComboBox listaComunidades;
    private javax.swing.JTextField textExtension;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
    private String insertParque = "insert into parque (nombre,extension,idComunidad) values(?,?,?) ";

    private String selectNombre = "select id from comunidad where nombre = ? ";
    private String selectId = "select id from parque where nombre = ?";
    private Connection conn;
    private static String bd = "parques";
    private static String login = "root";
    private static String password = "root";
    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    private int idComunidad = 0;
    private int id = 0, comunidadModif = 0;
    private ResultSet rs;
}
