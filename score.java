/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package work1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class score extends javax.swing.JFrame {
   private String player_name;
   private String correct_answer;
   private String wrong_answer;
   private String not_attempted;
   private Object jTextField8;
   
   /**
    * Creates new form score
    */
   //public score() {
    //  initComponents();
   //    this.setTitle("BHAWNA");
       
   //}
   public score(String name,String correct_ans,String wrong_ans,String not_attempted)
   {
      initComponents();
      jTextField1.setText(name);
      jTextField2.setText(correct_ans);
      
      jTextField3.setText(wrong_ans);
      
      jTextField4.setText(not_attempted);
     
      
   }
  



   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jProgressBar1 = new javax.swing.JProgressBar();
      jPanel2 = new javax.swing.JPanel();
      kGradientPanel1 = new keeptoo.KGradientPanel();
      jLabel5 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jTextField4 = new javax.swing.JTextField();
      jTextField3 = new javax.swing.JTextField();
      jTextField2 = new javax.swing.JTextField();
      jTextField1 = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setMinimumSize(new java.awt.Dimension(1000, 1000));
      setUndecorated(true);
      getContentPane().setLayout(null);

      jPanel2.setBackground(new java.awt.Color(255, 0, 0));
      jPanel2.setPreferredSize(new java.awt.Dimension(700, 500));
      jPanel2.setLayout(null);

      kGradientPanel1.setLayout(null);

      jLabel5.setBackground(new java.awt.Color(255, 255, 255));
      jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(255, 255, 255));
      jLabel5.setText("SCORE");
      kGradientPanel1.add(jLabel5);
      jLabel5.setBounds(320, 10, 220, 40);

      jButton1.setBackground(new java.awt.Color(255, 255, 255));
      jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jButton1.setText("EXIT");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      kGradientPanel1.add(jButton1);
      jButton1.setBounds(270, 340, 134, 50);

      jButton2.setBackground(new java.awt.Color(255, 255, 255));
      jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jButton2.setText("BACK");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });
      kGradientPanel1.add(jButton2);
      jButton2.setBounds(450, 340, 149, 50);

      jTextField4.setEditable(false);
      kGradientPanel1.add(jTextField4);
      jTextField4.setBounds(450, 270, 149, 48);

      jTextField3.setEditable(false);
      kGradientPanel1.add(jTextField3);
      jTextField3.setBounds(450, 210, 149, 48);

      jTextField2.setEditable(false);
      kGradientPanel1.add(jTextField2);
      jTextField2.setBounds(450, 150, 149, 50);

      jTextField1.setEditable(false);
      jTextField1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
         }
      });
      kGradientPanel1.add(jTextField1);
      jTextField1.setBounds(450, 87, 149, 50);

      jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel1.setText("PLAYER NAME");
      kGradientPanel1.add(jLabel1);
      jLabel1.setBounds(270, 90, 169, 47);

      jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel2.setText("CORRECT ANSWER");
      kGradientPanel1.add(jLabel2);
      jLabel2.setBounds(250, 150, 169, 45);

      jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel3.setText("WRONG ANSWER");
      kGradientPanel1.add(jLabel3);
      jLabel3.setBounds(260, 210, 169, 48);

      jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel4.setText("NOT ATTEMPTED");
      kGradientPanel1.add(jLabel4);
      jLabel4.setBounds(260, 270, 169, 48);

      jPanel2.add(kGradientPanel1);
      kGradientPanel1.setBounds(0, 0, 1500, 1000);

      getContentPane().add(jPanel2);
      jPanel2.setBounds(0, 0, 1000, 700);

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //System.exit(0);
     String player_name=jTextField1.getText();
     String correct_answer=jTextField2.getText();
     String wrong_answer=jTextField3.getText();
     String not_attempted=jTextField4.getText();
     String date=String.valueOf(project_logics.GetDataFromDataBase.getpresentdate());
 
     try
     {
      Connection con1=project_logics.GetDataFromDataBase.getDbInstance();
      PreparedStatement pstmt1=con1.prepareStatement("Insert into player_quiz(`player_name`,`correct_answer`,`wrong_answer`,`not_attempted`,`date`) values (?,?,?,?,?)");

      pstmt1.setString(1,player_name);
      pstmt1.setString(2,correct_answer);
      pstmt1.setString(3,wrong_answer);
      pstmt1.setString(4,not_attempted);
      pstmt1.setString(5,date);
      
         int ab=pstmt1.executeUpdate();

         if(ab>0)
         {
           // JOptionPane.showMessageDialog(null,"data Inserted");
            System.exit(0);
         }
         else
         {
            JOptionPane.showMessageDialog(null,"data NOT Inserted");
         }
         
      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null,"Error is --> "+e);
      }
     
     
     
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new welcomeplay().setVisible(true);
    dispose();
   }//GEN-LAST:event_jButton2ActionPerformed

   private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField1ActionPerformed

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
         java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new score("","","","").setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JProgressBar jProgressBar1;
   public javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private keeptoo.KGradientPanel kGradientPanel1;
   // End of variables declaration//GEN-END:variables
}
