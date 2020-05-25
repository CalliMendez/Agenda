/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author akbal
 */
public class agent extends javax.swing.JFrame {

    /**
     * Creates new form agent
     */
    public agent() {
        initComponents();
        lblhora.setVisible(false);
lblplace.setVisible(false);
lblorganize.setVisible(false);
lbladress.setVisible(false);
lblphone.setVisible(false);
txthora.setVisible(false);
txtmin.setVisible(false);
txtplace.setVisible(false);
txtadress.setVisible(false);
txtorganize.setVisible(false);
txtphone.setVisible(false);
lbl.setVisible(false);
    }
    
    public boolean fecha(){
        boolean f;
        Integer y = Integer.valueOf(txtyear.getText());
        Integer m = Integer.valueOf(txtmonth.getText());
        Integer d = Integer.valueOf(txtday.getText());
        if(y<2000||y>2080){
        f=false;
        JOptionPane.showMessageDialog(this,"inserte un año entre el 2000 y el 2080");
        }
        else if(m<1||m>12){
        f=false;
        JOptionPane.showMessageDialog(this,"inserte mes valido");
        }
        else if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d<1||d>31)){
        f=false;
        JOptionPane.showMessageDialog(this,"inserte dia valido");
        }
        else if((m==4||m==6||m==9||m==11)&&(d<1||d>30)){
        f=false;
        JOptionPane.showMessageDialog(this,"inserte dia valido");
        }
        else if(m==2&&(d<1||d>29)){
        f=false;
        JOptionPane.showMessageDialog(this,"inserte dia valido");
        }
        else{
        f=true;
        }
        
        return f;
    }
    
    public boolean hora(){
        boolean r;
        Integer h = Integer.valueOf(txthora.getText());
        Integer min = Integer.valueOf(txtmin.getText());
        if(h<0||h>23||min<0||min>59){
        JOptionPane.showMessageDialog(this,"inserte hora valida");
        r=false;
        }
        else{
        r=true;
        }
        
        return r;
    }
    
    public void errores(){
    if(cmbEvent.getSelectedIndex()==-1){
    JOptionPane.showMessageDialog(this,"por favor seleccione un tipo de evento");
    }
    else{
        fecha();
        hora();
        if(hora()==true&&fecha()==true){
        crearEvento();
    }
    }
    }
    
    public void crearEvento(){
        Object[] options={"si","no"};
        switch (cmbEvent.getSelectedIndex()) {
            case 0:
                {
                    social s = new social();
                    s.crearEvento(new evento(txtnombre.getText(),
                            String.format("%s/%s/%s",txtday.getText(),txtmonth.getText(),txtyear.getText()),
                            String.format("%s:%s",txthora.getText(),txtmin.getText()),txtplace.getText(),txtorganize.getText(),
                            txtphone.getText(),txtadress.getText()));
                    int opcion = JOptionPane.showOptionDialog(this,"¿Deseas crear otro evento?","evento creado",JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
                    if(opcion == JOptionPane.NO_OPTION){
JOptionPane.showMessageDialog(this,"eventos guardados exitosamente","ejecucion finalizada",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
}
                    break;
                }
            case 1:
                {
                    familar s = new familar();
                    s.crearEvento(new evento(txtnombre.getText(),
                            String.format("%s/%s/%s",txtday.getText(),txtmonth.getText(),txtyear.getText()),
                            String.format("%s:%s",txthora.getText(),txtmin.getText()),txtplace.getText(),txtorganize.getText(),
                            txtphone.getText(),txtadress.getText()));
                    int opcion = JOptionPane.showOptionDialog(this,"¿Deseas crear otro evento?","evento creado",JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
                    if(opcion == JOptionPane.NO_OPTION){
JOptionPane.showMessageDialog(this,"eventos guardados exitosamente","ejecucion finalizada",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
}
                    break;
                }
            case 2:
                {
                    negocios s = new negocios();
                    s.crearEvento(new evento(txtnombre.getText(),
                            String.format("%s/%s/%s",txtday.getText(),txtmonth.getText(),txtyear.getText()),
                            String.format("%s:%s",txthora.getText(),txtmin.getText()),txtplace.getText(),txtorganize.getText(),
                            txtphone.getText(),txtadress.getText()));
                    int opcion = JOptionPane.showOptionDialog(this,"¿Deseas crear otro evento?","evento creado",JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
                    if(opcion == JOptionPane.NO_OPTION){
JOptionPane.showMessageDialog(this,"eventos guardados exitosamente","ejecucion finalizada",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
}
                    break;
                }
            default:
                break;
        }
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
        txtnombre = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        txtday = new javax.swing.JTextField();
        txtmonth = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        btndetalles = new javax.swing.JToggleButton();
        lblhora = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        txtmin = new javax.swing.JTextField();
        lblplace = new javax.swing.JLabel();
        lblorganize = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lbladress = new javax.swing.JLabel();
        txtplace = new javax.swing.JTextField();
        txtorganize = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtadress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbEvent = new javax.swing.JComboBox<>();
        btncrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Niombre del evento");

        lbldate.setText("Fecha de evento");

        txtday.setText("00");
        txtday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdayActionPerformed(evt);
            }
        });

        txtmonth.setText("00");
        txtmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmonthActionPerformed(evt);
            }
        });

        txtyear.setText("0000");
        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });

        btndetalles.setText("Agregar Detalles");
        btndetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetallesActionPerformed(evt);
            }
        });

        lblhora.setText("Hora");

        txthora.setText("00");

        lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl.setText(":");

        txtmin.setText("00");
        txtmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtminActionPerformed(evt);
            }
        });

        lblplace.setText("Lugar");

        lblorganize.setText("Persona/grupo que lo organiza");

        lblphone.setText("Telefono");

        lbladress.setText("Correo electronico");

        jLabel10.setText("Tipo de evento");

        cmbEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Social", "Familiar", "Negocios" }));
        cmbEvent.setSelectedIndex(-1);
        cmbEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEventActionPerformed(evt);
            }
        });

        btncrear.setText("Crear evento");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        jLabel1.setText("DD");

        jLabel3.setText("MM");

        jLabel4.setText("YY");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblphone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbladress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblhora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblplace)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtplace))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblorganize)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtorganize, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbldate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtday, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndetalles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate)
                    .addComponent(txtday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(btndetalles)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhora)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl)
                    .addComponent(txtmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblplace)
                    .addComponent(txtplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblorganize)
                    .addComponent(txtorganize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphone)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladress)
                    .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdayActionPerformed

    private void txtmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmonthActionPerformed

    private void btndetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetallesActionPerformed
lblhora.setVisible(btndetalles.isSelected());
lblplace.setVisible(btndetalles.isSelected());
lblorganize.setVisible(btndetalles.isSelected());
lbladress.setVisible(btndetalles.isSelected());
lblphone.setVisible(btndetalles.isSelected());
txthora.setVisible(btndetalles.isSelected());
txtmin.setVisible(btndetalles.isSelected());
txtplace.setVisible(btndetalles.isSelected());
txtadress.setVisible(btndetalles.isSelected());
txtorganize.setVisible(btndetalles.isSelected());
txtphone.setVisible(btndetalles.isSelected());
lbl.setVisible(btndetalles.isSelected());
    }//GEN-LAST:event_btndetallesActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
   errores();
    }//GEN-LAST:event_btncrearActionPerformed

    private void cmbEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEventActionPerformed

    private void txtminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtminActionPerformed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrear;
    private javax.swing.JToggleButton btndetalles;
    private javax.swing.JComboBox<String> cmbEvent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbladress;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblorganize;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblplace;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtday;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtmin;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtorganize;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtplace;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
