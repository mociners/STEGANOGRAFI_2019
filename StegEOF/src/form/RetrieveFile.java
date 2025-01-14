/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import stegano.AlgoritmaEOF;
import control.ExecuteFile;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import stegano.SecretInStego;


/**
 *
 * @author Zierviera
 */
public class RetrieveFile extends javax.swing.JFrame {
    
Dimension UM = Toolkit.getDefaultToolkit().getScreenSize();
private File CoverF,
             SecretF,
             StegoF,
             StegoFix,
             masterFile, 
             outputFile,
             dataFile;
    /**
     * Creates new form RetrieveFile
     */
    public RetrieveFile() {
        initComponents();
        this.setTitle("Retrieve File Form");
        setLocation(UM.width/2-getWidth()/2,UM.height/2-getHeight()/2);
        show();
        Awal();
        tampilkanImage();
    }
    
//Method Untuk Memanggil Image/gambar
 public static BufferedImage loadImage(String ref) {
 BufferedImage bimg = null;
 try {
 bimg = ImageIO.read(new File(ref));
 } catch (Exception e) {
 e.printStackTrace();
 }
 return bimg;
 }
 
 //Method untuk Resize Image
 public static BufferedImage resize(BufferedImage img, int
 newW, int newH) {    
 int w = img.getWidth();
 int h = img.getHeight();
 BufferedImage dimg = dimg = new BufferedImage(newW, newH,
 img.getType());
 Graphics2D g = dimg.createGraphics();
 g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
 RenderingHints.VALUE_INTERPOLATION_BILINEAR);
 g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
 g.dispose();
 return dimg;
 }
 
//Method Untuk Menampilkan Gambar Pada JLabel
public void tampilkanImage(){

}     
    public File getStego() 
{
    return StegoF;
}
public File getSecret() 
{
    return SecretF;
}
public boolean fileChooserStego(){        
    StegoF = new File(Stego.getText());
    String dir = StegoF.getAbsolutePath();
    SecretInStego.setCheck(StegoF);
    return true;
}
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Stego = new javax.swing.JTextField();
        bChooseImg = new javax.swing.JButton();
        bRetrieve = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Secret = new javax.swing.JTextField();
        bSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Retrieve File");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gambar Embeded");

        Stego.setEditable(false);

        bChooseImg.setText("...");
        bChooseImg.setToolTipText("Browse Embedded Image");
        bChooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChooseImgActionPerformed(evt);
            }
        });

        bRetrieve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bRetrieve.setText("Simpan");
        bRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetrieveActionPerformed(evt);
            }
        });

        jButton3.setText("Keluar");
        jButton3.setToolTipText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Simpan Pesan");

        Secret.setEditable(false);

        bSave.setText("...");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Stego, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bChooseImg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Secret, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bRetrieve)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Stego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(bChooseImg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChooseImgActionPerformed
    chooseStego();
    
    }//GEN-LAST:event_bChooseImgActionPerformed
public void chooseStego(){
    String current = "D:/";
    javax.swing.JFileChooser jfc = new JFileChooser(current);
    FileFilter bothFilter, jpgFilter, gifFilter,bmpFilter,pngFilter;    
    bothFilter = new FileNameExtensionFilter("Gambar JPEG,GIF,BMP,PNG", "jpg", "gif","bmp","png");
    jpgFilter = new FileNameExtensionFilter("Gambar JPEG", "jpg");
    bmpFilter = new FileNameExtensionFilter("Gambar BMP", "bmp");
    gifFilter = new FileNameExtensionFilter("Gambar GIF", "gif");
    pngFilter = new FileNameExtensionFilter("Gambar PNG", "png");
    jfc.setAcceptAllFileFilterUsed(false);
    jfc.addChoosableFileFilter(bothFilter);
    jfc.addChoosableFileFilter(jpgFilter);
    jfc.addChoosableFileFilter(bmpFilter);
    jfc.addChoosableFileFilter(gifFilter);
    jfc.addChoosableFileFilter(pngFilter);
    if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        String f = jfc.getSelectedFile().toString();
        Stego.setText(f);

        masterFile = jfc.getSelectedFile();
    }
}
    private void bRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetrieveActionPerformed
if (Secret.getText().equals("") || Stego.getText().equals("")) {
    JOptionPane.showMessageDialog(this, "Fullfil the form, Please!", "Warning", JOptionPane.ERROR_MESSAGE);      
}else{
    try {
    retrieve();
} catch (IOException ex) {
    Logger.getLogger(RetrieveFile.class.getName()).log(Level.SEVERE, null, ex);
}
}
    }//GEN-LAST:event_bRetrieveActionPerformed
    public boolean retrieve() throws IOException{
        
    StegoF = new File(Stego.getText());
    String dir = StegoF.getAbsolutePath();
    File getSecret = new File(Secret.getText());      
        if(AlgoritmaEOF.RetrieveFile(StegoF,getSecret))
        { 
          JOptionPane.showMessageDialog(null, AlgoritmaEOF.getMessage(), "Retrieve Success", JOptionPane.INFORMATION_MESSAGE);
          int pilih = JOptionPane.showConfirmDialog(this, "Do you want to open it now?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(pilih == JOptionPane.YES_OPTION){
                ExecuteFile.bukaFile(AlgoritmaEOF.getPath());
                Awal();
            }else{
             Awal();   
            }            
        }
        else{
            JOptionPane.showMessageDialog(this, AlgoritmaEOF.getMessage(), "Retrieve Failed", JOptionPane.ERROR_MESSAGE);
        }
            return true;  
}        
public void Awal(){
    bChooseImg.setEnabled(true);
    bSave.setEnabled(true);
    Stego.setText("");
    Secret.setText("");
    
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
    save();
       
    }//GEN-LAST:event_bSaveActionPerformed
    public void save(){
        JFileChooser chooser = new JFileChooser("D:/") {
            public void approveSelection() {
                if (getSelectedFile().isFile()) {
                    return;
                } else {
                    super.approveSelection();
                }
            }
        };
    
    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    int returnVal = chooser.showSaveDialog(this);    
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        try {
            File directory = chooser.getSelectedFile();
            Secret.setText(directory.getAbsolutePath() );
            SecretF = chooser.getSelectedFile();   
                  
        } catch (Exception except) {
            //msg if opening fails
            JOptionPane.showMessageDialog(this, "The file is not valid!",
                "Error!", JOptionPane.INFORMATION_MESSAGE);
            Secret.setText("");
        }
        
    }
    }
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
            java.util.logging.Logger.getLogger(RetrieveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetrieveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetrieveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetrieveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetrieveFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Secret;
    private javax.swing.JTextField Stego;
    private javax.swing.JButton bChooseImg;
    private javax.swing.JButton bRetrieve;
    private javax.swing.JButton bSave;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
