package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import logics.Checker;

public class GUI_password extends javax.swing.JFrame {

    int count = 0, countUpper = 0, countLower = 0, countDigit = 0;
    int pressed;
    char cEvt, c;

    public GUI_password() {
        initComponents();
        setTitle("Password checker");
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("src/img/icono.jpg");
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblLower = new javax.swing.JLabel();
        lblUpper = new javax.swing.JLabel();
        lblDigit = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setText("Welcome");

        jLabel2.setText("Enter your password:");

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputKeyReleased(evt);
            }
        });

        lblLower.setText("Your password must have a lowercase character");

        lblUpper.setText("Your password must have an uppercase character");

        lblDigit.setText("Your password must have a digit");

        lblSize.setText("The length of your password is 8 characters minimum");

        btnOk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOk.setText("Verify");
        btnOk.setAlignmentY(0.0F);
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOk.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOk.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOk.setPreferredSize(new java.awt.Dimension(80, 50));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDigit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUpper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUpper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDigit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSize)
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:

//        for (; i < chain.length(); i++) {
//            c.add(chain.charAt(i));
//            count = count + 1;
//        }
//
//        if (count >= 8 && countUpper >= 1) {
//            lblSize.setForeground(Color.green);
//            lblUpper.setForeground(Color.green);
//        } else {
//            txtInput.setText("");
//            count = 0;
//            countUpper = 0;
//            lblSize.setForeground(Color.red);
//            lblUpper.setForeground(Color.red);
//        }
//        if (count >= 8 && countUpper >= 1 && countLower > 1 && countDigit > 1) {
//            lblSize.setForeground(Color.green);
//            lblUpper.setForeground(Color.green);
//            lblLower.setForeground(Color.green);
//            lblDigit.setForeground(Color.green);
//        } else {
//            txtInput.setText("");
//            count = 0;
//            countUpper = 0;
//            countLower = 0;
//            lblSize.setForeground(Color.red);
//            lblUpper.setForeground(Color.red);
//            lblLower.setForeground(Color.red);
//            lblDigit.setForeground(Color.red);
//        }
    }//GEN-LAST:event_txtInputActionPerformed

    private void txtInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyPressed

    }//GEN-LAST:event_txtInputKeyPressed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        JOptionPane.showMessageDialog(null, "Password sent!",
                "Info", JOptionPane.INFORMATION_MESSAGE);
        txtInput.setText("");
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        String chain = txtInput.getText(); //input string
        pressed = evt.getKeyCode();
        char[] c = new char[chain.length()];
        boolean flag = false;
        
        //digits
        Checker ch = new Checker();
        countDigit = ch.digitChecker(chain);
        if(countDigit >= 1){
            lblDigit.setForeground(Color.green);
        }else{
            lblDigit.setForeground(Color.red);
        }
        
        //Size of the password
        flag = ch.lengthChecker(chain);
        if(flag)
        {
            lblSize.setForeground(Color.green);
        }else{
            lblSize.setForeground(Color.red);
        }
        
        //Capital letter
        countUpper = ch.upperChecker(chain);
        if(countUpper >= 1){
            lblUpper.setForeground(Color.green);
        }else{
            lblUpper.setForeground(Color.red);
        }
        
        //Lower letters
        countLower = ch.lowerChecker(chain);
        if(countLower >= 1)
        {
            lblLower.setForeground(Color.green);
        }else{
            lblLower.setForeground(Color.red);
        }
        
        if (pressed == 8) count--;
    }//GEN-LAST:event_txtInputKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDigit;
    private javax.swing.JLabel lblLower;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblUpper;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
