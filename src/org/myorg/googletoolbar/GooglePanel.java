/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.googletoolbar;
import Model.Stopwatch;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.openide.awt.HtmlBrowser.URLDisplayer;

/**
 *
 * @author FELIPE
 */
public class GooglePanel extends javax.swing.JPanel {

    private Timer time;
    private Stopwatch stopwatch; 
    /*Creates new form GooglePanel*/
    public GooglePanel() {
        initComponents();
        time = new Timer(1000, actions);
    }
   
    private ActionListener actions = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            stopwatch.decreaseSeconds();
            updateTimeLabel();
            if(stopwatch.finished()){
                time.stop();
            }
        }
    };
    
    private void updateTimeLabel(){
        this.timeLbl.setText(this.stopwatch.toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        minutesLbl = new javax.swing.JLabel();
        minutesInput = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        timeLbl = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.jButton2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(minutesLbl, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.minutesLbl.text")); // NOI18N

        minutesInput.setText(org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.minutesInput.text")); // NOI18N
        minutesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesInputActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(startBtn, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.startBtn.text")); // NOI18N
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(stopBtn, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.stopBtn.text")); // NOI18N
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(pauseBtn, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.pauseBtn.text")); // NOI18N

        timeLbl.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(timeLbl, org.openide.util.NbBundle.getMessage(GooglePanel.class, "GooglePanel.timeLbl.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minutesLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minutesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pauseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeLbl)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutesLbl)
                    .addComponent(minutesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn)
                    .addComponent(stopBtn)
                    .addComponent(pauseBtn)
                    .addComponent(timeLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void minutesInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesInputActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        String txtMinutes = minutesInput.getText().trim();

        //Valida si el tiempo ingresado es vacio o menor a 0.
        if("".equals(txtMinutes) || txtMinutes.indexOf(",") != -1 || txtMinutes.indexOf(".") != -1 || (Double.parseDouble(txtMinutes) < 0) ){
            JOptionPane.showMessageDialog(new JFrame(), "Error!, para iniciar el contador debes ingresar un número que sea mayor a 0 y debe ser entero.", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Variables para pasar el número a minutos
        int operableMinutes = Integer.parseInt(txtMinutes);
        int totalSeconds = operableMinutes * 60;
        
        //Deshabilitar botón Start
        startBtn.setEnabled(false);
        
        //Create a StopWacht
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        totalSeconds /= 60;
        int seconds = totalSeconds / 60;
        stopwatch = new Stopwatch(hours, minutes, seconds);
        time.start();
    }//GEN-LAST:event_startBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        // Stoped a AtopWacht
        time.stop();
        
    }//GEN-LAST:event_stopBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField minutesInput;
    private javax.swing.JLabel minutesLbl;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    private javax.swing.JLabel timeLbl;
    // End of variables declaration//GEN-END:variables
}
