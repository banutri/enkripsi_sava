/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilham.UI;

//Class Imports
import ilham.Encrypt.Decryption;
import ilham.Encrypt.Encryption;
import ilham.Encrypt.RSAUtils;
import ilham.Fileman.fileman;
import java.io.BufferedReader;
import java.io.DataOutputStream;

//Todo:  Possible move all File I/O Operations to File IO class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Jeremy Blanchard
 * @author Omar Herrera
 */
@SuppressWarnings("serial")
public class EncUI extends javax.swing.JFrame {

    static ilham.Fileman.fileman fio = new fileman();
   
    
    /**
     * Creates new form EncUI
     */
    public EncUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        titledBorder1 = javax.swing.BorderFactory.createTitledBorder("");
        encryptPanel = new javax.swing.JPanel();
        decButton = new javax.swing.JButton();
        encButton = new javax.swing.JButton();
        fileNameLbl = new javax.swing.JLabel();
        fileTextField = new javax.swing.JTextField();
        fcBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        encryptprocessingtime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encryptPanel.setBackground(new java.awt.Color(0, 0, 0));
        encryptPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enkripsi AES dan RSA", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 255, 0))); // NOI18N
        encryptPanel.setForeground(new java.awt.Color(0, 255, 0));

        decButton.setBackground(new java.awt.Color(0, 0, 0));
        decButton.setForeground(new java.awt.Color(51, 255, 0));
        decButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ilham/UI/unlocked.png"))); // NOI18N
        decButton.setText("Decrypt");
        decButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        decButton.setMaximumSize(new java.awt.Dimension(69, 23));
        decButton.setMinimumSize(new java.awt.Dimension(69, 23));
        decButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decButtonActionPerformed(evt);
            }
        });

        encButton.setBackground(new java.awt.Color(0, 0, 0));
        encButton.setForeground(new java.awt.Color(51, 255, 0));
        encButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ilham/UI/locked.png"))); // NOI18N
        encButton.setText("Encrypt");
        encButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        encButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        encButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encButtonActionPerformed(evt);
            }
        });

        fileNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        fileNameLbl.setForeground(new java.awt.Color(51, 255, 0));
        fileNameLbl.setLabelFor(fileTextField);
        fileNameLbl.setText("Filename:");

        fileTextField.setBackground(new java.awt.Color(0, 0, 0));
        fileTextField.setForeground(new java.awt.Color(51, 255, 0));
        fileTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)));
        fileTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        fileTextField.setSelectionColor(new java.awt.Color(0, 255, 0));
        fileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTextFieldActionPerformed(evt);
            }
        });

        fcBtn.setBackground(new java.awt.Color(0, 0, 0));
        fcBtn.setForeground(new java.awt.Color(0, 255, 0));
        fcBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ilham/UI/browse.jpg"))); // NOI18N
        fcBtn.setText("....");
        fcBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        fcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(0, 0, 0));
        exitBtn.setForeground(new java.awt.Color(0, 255, 0));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ilham/UI/close.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Status :");

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(new java.awt.Color(0, 0, 0));
        infoTextArea.setColumns(20);
        infoTextArea.setForeground(new java.awt.Color(51, 255, 0));
        infoTextArea.setRows(5);
        infoTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)));
        infoTextArea.setCaretColor(new java.awt.Color(0, 255, 0));
        infoTextArea.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        infoTextArea.setSelectionColor(new java.awt.Color(0, 255, 0));
        jScrollPane1.setViewportView(infoTextArea);

        encryptprocessingtime.setBackground(new java.awt.Color(0, 0, 0));
        encryptprocessingtime.setForeground(new java.awt.Color(0, 255, 0));
        encryptprocessingtime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        encryptprocessingtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptprocessingtimeActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("millisecond.");

        javax.swing.GroupLayout encryptPanelLayout = new javax.swing.GroupLayout(encryptPanel);
        encryptPanel.setLayout(encryptPanelLayout);
        encryptPanelLayout.setHorizontalGroup(
            encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fileNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encryptPanelLayout.createSequentialGroup()
                        .addComponent(encButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(encryptPanelLayout.createSequentialGroup()
                        .addComponent(encryptprocessingtime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26))
        );
        encryptPanelLayout.setVerticalGroup(
            encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encryptPanelLayout.createSequentialGroup()
                        .addComponent(fcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(encryptPanelLayout.createSequentialGroup()
                        .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(encryptPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(fileNameLbl))
                            .addComponent(fileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptprocessingtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encryptPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encryptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        fileTextField.setText("");
        fio.cleanup();
        JOptionPane.showMessageDialog(null, "Thank you for using EncryptThis!!");
        System.exit(0);

    }//GEN-LAST:event_exitBtnActionPerformed

    private void fcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcBtnActionPerformed
        File file = selectFile();
        if(file!=null){
            if (fio.isEncrypted(file)) {
                encButton.setEnabled(false);
                fio.setEncFile(file);
            } else {
                decButton.setEnabled(false);
                fio.setDecFile(file);
            }
            infoTextArea.append("\nFile Selected:  " + file.getName());
            fileTextField.setText(file.getAbsolutePath());
        }else{
            infoTextArea.append("\nFile Selection Cancelled");
        }
    }//GEN-LAST:event_fcBtnActionPerformed

    private void fileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTextFieldActionPerformed
        Path path = Paths.get(fileTextField.getText()).toAbsolutePath();
        infoTextArea.append("\n Selected FIle Path:"+path.toString());
        if (Files.exists(path)) {
            if (fio.isEncrypted(path)) {
                encButton.setEnabled(false);
                fio.setEncFile(path);
            } else {
                decButton.setEnabled(false);
                fio.setDecFile(path);
            }
        } else {
            infoTextArea.append("***Error:  File cannot be found, please check that the correct location was entered. ***");
        }
    }//GEN-LAST:event_fileTextFieldActionPerformed

    private void encButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encButtonActionPerformed
        String pw="akuini";//getUserPassword();
        byte[] data = "akuini".getBytes();

        RSAUtils.generateKey("./public.key", "./private.key");

        PublicKey publicKey = null;
        try {
            publicKey = RSAUtils.getPublicKey("./public.key");
        } catch (Exception ex) {
            Logger.getLogger(EncUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        byte[] encrypted = RSAUtils.encrypt(publicKey, data);

        PrivateKey privateKey = null;
        try {
            privateKey = RSAUtils.getPrivateKey("./private.key");
        } catch (Exception ex) {
            Logger.getLogger(EncUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        byte[] decrypted = RSAUtils.decrypt(privateKey, encrypted);

        System.out.println("original: " + new String(data));
        System.out.println("encrypted: " + new String(encrypted));
        System.out.println("decrypted: " + new String(decrypted));

        String output;
        infoTextArea.append("\nAction Selected:   Encrypt File");

        if(!pw.equals("")){
            try {
                infoTextArea.append("\nEncrypting File...");
                long startTime = System.nanoTime();
                output = Encryption.encrypt(fio.getDecFile(),pw);
                long endTime = System.nanoTime();
                
                long duration = (endTime - startTime);
                encryptprocessingtime.setText(String.valueOf(duration / 1000000));
                infoTextArea.append("\nEncryption Successful");
                infoTextArea.append("\nOutput File Name:  \n " + output);
            } catch (Exception ex) {
                infoTextArea.append("\nFile Encryption Failed:  \n" + ex);
            }
        }else{
            infoTextArea.append("\nNo Password Entered\nFile Encryption Cancelled");
            fileTextField.setText("");
        }

        cleanup();
    }//GEN-LAST:event_encButtonActionPerformed

    private void decButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decButtonActionPerformed
        String output;
        String pw = "akuini";//getUserPassword();
        infoTextArea.append("\nAction Selected:    Decrypt File:  " + fio.getEncFile().getName());
        JPasswordField pwd = new JPasswordField(15); //ini untuk memasukkan password yang salah

        if(!pw.equals("")){
            try {
                infoTextArea.append("\nDecrypting File...");
                long startTime = System.nanoTime();
                output = Decryption.decrypt(fio.getEncFile(),pw);
                long endTime = System.nanoTime();
                
                long duration = (endTime - startTime);
                encryptprocessingtime.setText(String.valueOf(duration / 1000000));
                infoTextArea.append("\nDecryption Successful");
                infoTextArea.append("\nOutput File Name:    \n" + output);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "password salah");
                int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Password", JOptionPane.OK_CANCEL_OPTION);
                if (action < 0) {
                    JOptionPane.showMessageDialog(null, "Cancelling ");
                } else {
                    pw = new String(pwd.getPassword());
                }

                Logger.getLogger(EncUI.class.getName()).log(Level.SEVERE, null, ex);

            }
        }else{

            infoTextArea.append("\nFile Decryption Cancelled");
            fileTextField.setText("");
        }

        cleanup();
    }//GEN-LAST:event_decButtonActionPerformed

    private void encryptprocessingtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptprocessingtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptprocessingtimeActionPerformed
 



     /**
     * This method obtains a password from the user using a JPasswordField in a
     * JOptionPane confirmDialog.  The password entry is masked to the user.  The entered data is entered into a character array.
     *
     * @return the value entered by the user
     */
    
    private static String getUserPassword() {
        
        JPasswordField pwd = new JPasswordField(15);
        String pw = "";
        int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Password", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
            JOptionPane.showMessageDialog(null, "Cancelling ");
        } else {
            pw = new String(pwd.getPassword());
        }
        return pw;
    }public void read(){
    

	}


    /**
     * This method instantiates a JFileChooser and returns the File object
     * selected by the user
     *
     * @return The File Object selected
     */
    public File selectFile() {
        JFileChooser fc = new JFileChooser();
        int action = fc.showOpenDialog(null);
        if(action==JFileChooser.APPROVE_OPTION){
            return fc.getSelectedFile();
        }else{
            return null;
        }               
        
    }

    /**
     * This is the main method of the program
     * 
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dracula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EncUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decButton;
    private javax.swing.JButton encButton;
    private javax.swing.JPanel encryptPanel;
    private javax.swing.JTextField encryptprocessingtime;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton fcBtn;
    private javax.swing.JLabel fileNameLbl;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.border.TitledBorder titledBorder1;
    // End of variables declaration//GEN-END:variables

    private void cleanup() {
        fileTextField.setText("");
        decButton.setEnabled(true);
        encButton.setEnabled(true);
        fio.cleanup();
    }

    private void showMessageDialog(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
