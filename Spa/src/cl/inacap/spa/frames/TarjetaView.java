
package cl.inacap.spa.frames;

import cl.inacap.spa.dao.*;
import cl.inacap.spa.dao.TipoCuentaDAO;
import cl.inacap.spa.dto.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author javierquinchen
 */
public class TarjetaView extends javax.swing.JInternalFrame {

    private Tarjeta tarjeta = new Tarjeta();
    private TarjetaDAO tarjetaDAO = new TarjetaDAO();
    private Cliente client = new Cliente();
            
    private BancoDAO bancoDAO=new BancoDAO();
    private TipoCuentaDAO tipoCuentaDAO = new TipoCuentaDAO();
   
    
    
    
    public TarjetaView() {
        initComponents();
        numeroCuenta.setEnabled(false);
        clave.setEnabled(false);
        mesVenc.setEnabled(false);
        anoVenc.setEnabled(false);
        saveDatos.setEnabled(false);
        editarBancobtn.setVisible(false);
    }

    
    public void vaciar(){
        numeroCuenta.setText("");
        clave.setText("");
        mesVenc.setText("");
        anoVenc.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bancoCombo = new javax.swing.JComboBox<>();
        tipoCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guardarBancobtn = new javax.swing.JButton();
        editarBancobtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        numeroCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mesVenc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        anoVenc = new javax.swing.JTextField();
        saveDatos = new javax.swing.JButton();

        setClosable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bancoCombo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                bancoComboComponentShown(evt);
            }
        });
        getContentPane().add(bancoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 22, 145, -1));

        getContentPane().add(tipoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 145, -1));

        jLabel1.setText("Banco");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 26, -1, -1));

        jLabel2.setText("Tipo cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        guardarBancobtn.setText("Guardar Banco");
        guardarBancobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBancobtnActionPerformed(evt);
            }
        });
        getContentPane().add(guardarBancobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        editarBancobtn.setText("Editar Banco");
        editarBancobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBancobtnActionPerformed(evt);
            }
        });
        getContentPane().add(editarBancobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 134, -1));

        jLabel3.setText("Numero de Cuenta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        numeroCuenta.setToolTipText("");
        getContentPane().add(numeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 191, -1));

        jLabel4.setText("Clave");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        getContentPane().add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 68, -1));

        jLabel5.setText("Vencimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(mesVenc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 39, -1));

        jLabel6.setText("/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 13, -1));
        getContentPane().add(anoVenc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 39, -1));

        saveDatos.setText("Guardar Datos ");
        saveDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDatosActionPerformed(evt);
            }
        });
        getContentPane().add(saveDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBancobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBancobtnActionPerformed
        numeroCuenta.setEnabled(true);
        clave.setEnabled(true);
        saveDatos.setEnabled(true);  
        
        bancoCombo.setEnabled(false);
        tipoCombo.setEnabled(false);
        
        
        
        
        if(tipoCombo.getSelectedItem().equals("Credito")){
            mesVenc.setEnabled(true);
            anoVenc.setEnabled(true);
        }else{
            mesVenc.setEnabled(false);
            anoVenc.setEnabled(false);
        }
        editarBancobtn.setVisible(true);
        guardarBancobtn.setVisible(false);
        
    }//GEN-LAST:event_guardarBancobtnActionPerformed

    private void editarBancobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBancobtnActionPerformed
        numeroCuenta.setEnabled(false);
        clave.setEnabled(false);
        mesVenc.setEnabled(false);
        anoVenc.setEnabled(false);
        saveDatos.setEnabled(false);  
        
        bancoCombo.setEnabled(true);
        tipoCombo.setEnabled(true);
        editarBancobtn.setVisible(false);
        guardarBancobtn.setVisible(true);
    }//GEN-LAST:event_editarBancobtnActionPerformed

    private void saveDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDatosActionPerformed

     int idBanco = bancoDAO.buscar((String) bancoCombo.getSelectedItem());
     int idTipoCuenta = tipoCuentaDAO.buscar((String)tipoCombo.getSelectedItem());
    
     String mes = mesVenc.getText();
     String ano = anoVenc.getText();
     String fecha = mes + "/" + ano;
     
     
     //Seteo de Variables al objeto
     
     tarjeta.setNumCuenta(Integer.parseInt(numeroCuenta.getText()));
     tarjeta.setFechaVencimiento(fecha);
     tarjeta.setCodigo(Integer.parseInt(clave.getText()));
     tarjeta.setIdBanco(idBanco);
     tarjeta.setTipoCuenta(idTipoCuenta);

     tarjetaDAO.addTarjeta(tarjeta);
     vaciar();
    }//GEN-LAST:event_saveDatosActionPerformed

    private void bancoComboComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bancoComboComponentShown
    
    }//GEN-LAST:event_bancoComboComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
 
        List<Banco> bancos = this.bancoDAO.obtener();

        if (bancos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No Hay Bancos", " Bancos vacíos ", JOptionPane.WARNING_MESSAGE);
            this.hide();
        } else {
            for (Banco banco : bancos){
                this.bancoCombo.addItem(banco.getNombreBanco());
            }
        }
      
        List<TipoCuenta> tipos = this.tipoCuentaDAO.obtener();

        if (tipos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No Hay Bancos", " Bancos vacíos ", JOptionPane.WARNING_MESSAGE);
            this.hide();
        } else {
            for (TipoCuenta tipo : tipos){
                this.tipoCombo.addItem(tipo.getNombreTipo());
            }
        }
        
        
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoVenc;
    public javax.swing.JComboBox<String> bancoCombo;
    private javax.swing.JTextField clave;
    private javax.swing.JButton editarBancobtn;
    private javax.swing.JButton guardarBancobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mesVenc;
    private javax.swing.JTextField numeroCuenta;
    private javax.swing.JButton saveDatos;
    private javax.swing.JComboBox<String> tipoCombo;
    // End of variables declaration//GEN-END:variables
}
