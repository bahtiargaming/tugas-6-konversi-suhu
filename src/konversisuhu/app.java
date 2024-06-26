/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konversisuhu;

import javax.swing.text.html.FormView;

/**
 *
 * @author ASUS
 */
public class app extends javax.swing.JFrame {

    /**
     * Creates new form app
     */
    public app() {
        initComponents();
        RESET();
    }
    
    void RESET(){
        tSuhuAsal.setText(null);
        vHasil.setText(null);
    }

     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tSuhuAsal = new javax.swing.JTextField();
        tSkalaAsal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tSkalaTujuan = new javax.swing.JComboBox<>();
        bKonversi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        vHasil = new javax.swing.JLabel();
        cRESTART = new javax.swing.JButton();
        cCLOSE = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("KOVERSI SUHU");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUHUAWAL"));

        tSuhuAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSuhuAsalActionPerformed(evt);
            }
        });

        tSkalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celcius", "kelvin", "fahrenheit" }));
        tSkalaAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSkalaAsalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tSuhuAsal)
                    .addComponent(tSkalaAsal, 0, 309, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSkalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KONVERSI KE"));

        tSkalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celcius", "kelvin", "fahrenheit" }));
        tSkalaTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSkalaTujuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bKonversi.setText("KONVERSI");
        bKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonversiActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        vHasil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vHasil.setText("jlabel");
        jPanel4.add(vHasil, java.awt.BorderLayout.CENTER);

        cRESTART.setText("RESET");
        cRESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRESTARTActionPerformed(evt);
            }
        });

        cCLOSE.setText("CLOSE");
        cCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCLOSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cRESTART, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cCLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bKonversi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cRESTART)
                    .addComponent(cCLOSE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonversiActionPerformed
        double suhuasal = Double.parseDouble(tSuhuAsal.getText());
        String SkalaAsal = tSkalaAsal.getSelectedItem().toString();
        String SkalaTujuan =tSkalaTujuan.getSelectedItem().toString();
        double hasil = 0;
        
        if (SkalaAsal.equals("celcius") && SkalaTujuan.equals("celcius")) {
            hasil = suhuasal;
            
        } else if (SkalaAsal.equals("celcius") && SkalaTujuan.equals("kelvin")) {
            hasil = suhuasal + 273.15;
        } else if (SkalaAsal.equals("celcius") && SkalaTujuan.equals("fahrenheit")) {
            hasil = suhuasal * 9/5 + 32;
        } else if (SkalaAsal.equals("kelvin") && SkalaTujuan.equals("kelvin")) {
            hasil = suhuasal;
        } else if (SkalaAsal.equals("kelvin") && SkalaTujuan.equals("celcius")) {
            hasil = suhuasal - 273.15;
        } else if (SkalaAsal.equals("kelvin") && SkalaTujuan.equals("fahrenheit")) {
            hasil = suhuasal -273.15 * 9/5 + 32;
        } else if (SkalaAsal.equals("fahrenheit") && SkalaTujuan.equals("fahrenheit")) {
            hasil = suhuasal;
        } else if (SkalaAsal.equals("fahrenheit") && SkalaTujuan.equals("celcius")) {
            hasil = suhuasal - 32 * 5/9;
        } else if (SkalaAsal.equals("fahrenheit") && SkalaTujuan.equals("kelvin")) {
            hasil = suhuasal - 32 * 5/9 + 273.15;
        }
        
        String Skala = SkalaTujuan.substring(0, 1);
        vHasil.setText(String.format("%.2f", hasil) + "\u00B0 + Skala");
    }//GEN-LAST:event_bKonversiActionPerformed

    private void tSkalaAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSkalaAsalActionPerformed
       
    }//GEN-LAST:event_tSkalaAsalActionPerformed

    private void tSkalaTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSkalaTujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSkalaTujuanActionPerformed

    private void cRESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRESTARTActionPerformed
    RESET();        // TODO add your handling code here:
    }//GEN-LAST:event_cRESTARTActionPerformed

    private void tSuhuAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSuhuAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSuhuAsalActionPerformed

    private void cCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCLOSEActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cCLOSEActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bKonversi;
    private javax.swing.JButton cCLOSE;
    private javax.swing.JButton cRESTART;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> tSkalaAsal;
    private javax.swing.JComboBox<String> tSkalaTujuan;
    private javax.swing.JTextField tSuhuAsal;
    private javax.swing.JLabel vHasil;
    // End of variables declaration//GEN-END:variables

    
    
}