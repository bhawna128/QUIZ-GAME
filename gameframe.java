/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package work1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class gameframe extends javax.swing.JFrame {
    int total_ques_count=0;
    ArrayList<Integer> aa=new ArrayList<>();
   int not_attempted=0;
   int correct_answer=0;
   int wrong_answer=0;
   String correct_ans="";
    public gameframe(String user_name,String root,String difficulty,String date)
    {
        initComponents();
        this.setTitle("BHAWNA");
        jLabel4.setText(user_name);
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14));
        jTextField1.setText(root);
        jTextField8.setText(date);
        jTextField2.setText(difficulty);
        
        totalCount(root,difficulty);
        jTextField3.setText(aa.size()+"");
        
        correct_ans=showQuestions(aa.get(total_ques_count));
        total_ques_count++;
        
    }
 

    String showQuestions(int id)
    {
        String ans="";
        
        try
        {
         Connection con=project_logics.GetDataFromDataBase.getDbInstance();
         PreparedStatement pstmt=con.prepareStatement("select * from question_record where `ques_id`=?");
         pstmt.setInt(1,id);
         ResultSet rs=pstmt.executeQuery();
         if(rs.next())
         {
         jTextArea1.setText(rs.getString("questions"));
         jTextField4.setText(rs.getString("opt1"));
         jTextField6.setText(rs.getString("opt2"));
         jTextField5.setText(rs.getString("opt3"));
         jTextField7.setText(rs.getString("opt4"));
         ans=rs.getString("answer");                        
         }
         else{
           JOptionPane.showMessageDialog(null,"question not found");
         }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"error is---"+e);
        }
        return ans;
        
    }
void answer(String ans)
{
    int flag=0;
    String userSelected="";
    if(jRadioButton1.isSelected())
    {
        userSelected=jTextField4.getText();
    }
    else if(jRadioButton2.isSelected())
    {
     userSelected=jTextField6.getText();
    }
    else if(jRadioButton3.isSelected())
    {
     userSelected=jTextField5.getText();
    }
    else if(jRadioButton4.isSelected())
    {
     userSelected=jTextField7.getText();
    }
    else
    {
        flag++;
    }
    if(flag>0)
    {
        not_attempted++;
    }
    else
    {
   if(userSelected.equals(ans))
   {
   correct_answer++; 
   }
   else
   {
    wrong_answer++;
  //  jTextField3.setText("");
   }
                
   }
}
    void totalCount(String root,String level)
    {
    try
    {
       
     Connection con=project_logics.GetDataFromDataBase.getDbInstance();
     PreparedStatement pstmt=con.prepareStatement("select * from question_record where `roottype`=? and `level`=?");
     pstmt.setString(1,root);
     pstmt.setString(2,level);
     ResultSet rs=pstmt.executeQuery();
     while(rs.next())
     {
        aa.add(rs.getInt("ques_id")) ;
     }
   
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null,"Exception is -->"+e);
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

      buttonGroup1 = new javax.swing.ButtonGroup();
      buttonGroup2 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jButton2 = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();
      jTextField1 = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jTextField3 = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jTextField8 = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jTextField2 = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      jTextField6 = new javax.swing.JTextField();
      jTextField4 = new javax.swing.JTextField();
      jTextField5 = new javax.swing.JTextField();
      jTextField7 = new javax.swing.JTextField();
      jRadioButton3 = new javax.swing.JRadioButton();
      jRadioButton4 = new javax.swing.JRadioButton();
      jRadioButton1 = new javax.swing.JRadioButton();
      jRadioButton2 = new javax.swing.JRadioButton();
      jButton3 = new javax.swing.JButton();
      jLabel6 = new javax.swing.JLabel();
      kGradientPanel1 = new keeptoo.KGradientPanel();
      jLabel7 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setMinimumSize(new java.awt.Dimension(800, 800));
      setUndecorated(true);
      getContentPane().setLayout(null);

      jPanel1.setBackground(new java.awt.Color(102, 255, 102));
      jPanel1.setLayout(null);

      jButton2.setBackground(new java.awt.Color(255, 255, 255));
      jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jButton2.setText("CLEAR SELECTION");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });
      jPanel1.add(jButton2);
      jButton2.setBounds(550, 460, 200, 60);

      jButton1.setBackground(new java.awt.Color(255, 255, 255));
      jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jButton1.setText("NEXT");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      jPanel1.add(jButton1);
      jButton1.setBounds(240, 470, 290, 50);

      jTextField1.setEditable(false);
      jTextField1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jTextField1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
         }
      });
      jPanel1.add(jTextField1);
      jTextField1.setBounds(230, 70, 150, 50);
      jPanel1.add(jLabel4);
      jLabel4.setBounds(160, 0, 410, 40);

      jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel3.setText("TOTAL QUESTIONS");
      jPanel1.add(jLabel3);
      jLabel3.setBounds(200, 190, 181, 49);

      jTextArea1.setColumns(20);
      jTextArea1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jTextArea1.setRows(5);
      jScrollPane1.setViewportView(jTextArea1);

      jPanel1.add(jScrollPane1);
      jScrollPane1.setBounds(350, 250, 290, 96);

      jTextField3.setEditable(false);
      jTextField3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jTextField3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField3ActionPerformed(evt);
         }
      });
      jPanel1.add(jTextField3);
      jTextField3.setBounds(390, 190, 190, 49);

      jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel5.setText("QUESTIONS");
      jPanel1.add(jLabel5);
      jLabel5.setBounds(200, 260, 140, 50);

      jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel8.setText("DATE OF PLAYING");
      jPanel1.add(jLabel8);
      jLabel8.setBounds(200, 130, 170, 50);

      jTextField8.setEditable(false);
      jTextField8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jPanel1.add(jTextField8);
      jTextField8.setBounds(390, 130, 190, 50);

      jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel2.setText("LEVEL");
      jPanel1.add(jLabel2);
      jLabel2.setBounds(430, 70, 126, 39);

      jTextField2.setEditable(false);
      jTextField2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jTextField2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField2ActionPerformed(evt);
         }
      });
      jPanel1.add(jTextField2);
      jTextField2.setBounds(560, 60, 150, 50);

      jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
      jLabel1.setText("CHOICE");
      jPanel1.add(jLabel1);
      jLabel1.setBounds(120, 70, 106, 38);

      jTextField6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jPanel1.add(jTextField6);
      jTextField6.setBounds(430, 360, 130, 40);

      jTextField4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jTextField4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField4ActionPerformed(evt);
         }
      });
      jPanel1.add(jTextField4);
      jTextField4.setBounds(240, 360, 120, 40);

      jTextField5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jPanel1.add(jTextField5);
      jTextField5.setBounds(240, 410, 120, 40);

      jTextField7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
      jPanel1.add(jTextField7);
      jTextField7.setBounds(430, 410, 130, 40);

      buttonGroup1.add(jRadioButton3);
      jPanel1.add(jRadioButton3);
      jRadioButton3.setBounds(390, 370, 20, 20);

      buttonGroup1.add(jRadioButton4);
      jPanel1.add(jRadioButton4);
      jRadioButton4.setBounds(390, 420, 21, 20);

      buttonGroup1.add(jRadioButton1);
      jPanel1.add(jRadioButton1);
      jRadioButton1.setBounds(210, 370, 20, 21);

      buttonGroup1.add(jRadioButton2);
      jPanel1.add(jRadioButton2);
      jRadioButton2.setBounds(210, 420, 20, 21);

      jButton3.setBackground(new java.awt.Color(255, 255, 255));
      jButton3.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
      jButton3.setText("X");
      jPanel1.add(jButton3);
      jButton3.setBounds(880, 20, 80, 60);

      jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
      jLabel6.setText("WELCOME");
      jPanel1.add(jLabel6);
      jLabel6.setBounds(40, 0, 140, 40);
      jPanel1.add(kGradientPanel1);
      kGradientPanel1.setBounds(0, 0, 1500, 1000);

      getContentPane().add(jPanel1);
      jPanel1.setBounds(0, 0, 1500, 1000);

      jLabel7.setText("jLabel7");
      getContentPane().add(jLabel7);
      jLabel7.setBounds(170, 20, 150, 30);

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name=jLabel4.getText();
       answer(correct_ans);
       
        if(total_ques_count<aa.size())
        {
            showQuestions(aa.get(total_ques_count));
            total_ques_count++;
            buttonGroup1.clearSelection();
        }
        else
        {
           
         JOptionPane.showMessageDialog(null,"all question displayed");
      //  JOptionPane.showMessageDialog(null,"correct_answer="+correct_answer+" wrong answer="+wrong_answer+" not attempted="+not_attempted);
         JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!!");
        new score(name,correct_answer+"",wrong_answer+"",not_attempted+"").setVisible(true);
        dispose();
       // new score().setVisible(true);
      // jTextField2.setText("");
        }
        
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

   private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField3ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      buttonGroup1.clearSelection();
   }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(gameframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameframe("","","","").setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.ButtonGroup buttonGroup2;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JRadioButton jRadioButton1;
   private javax.swing.JRadioButton jRadioButton2;
   private javax.swing.JRadioButton jRadioButton3;
   private javax.swing.JRadioButton jRadioButton4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JTextField jTextField6;
   private javax.swing.JTextField jTextField7;
   private javax.swing.JTextField jTextField8;
   private keeptoo.KGradientPanel kGradientPanel1;
   // End of variables declaration//GEN-END:variables
}