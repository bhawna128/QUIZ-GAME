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
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author ADMIN
 */
public class questions extends javax.swing.JFrame {

    /**
     * Creates new form questions
     */
    public questions() {
        initComponents();
        this.setTitle("BHAWNA");
        showroot();
    }
    void showroot()
{
    jComboBox1.removeAllItems();
    String rootid=String.valueOf(jComboBox1.getSelectedItem());
    try{
    Connection con=project_logics.GetDataFromDataBase.getDbInstance();
    PreparedStatement pstmt=con.prepareStatement("select * from root");           
    ResultSet rs=pstmt.executeQuery();
    while(rs.next())
    {
     jComboBox1.addItem(rs.getString("rootname"));
    }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error is --> "+e);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(450, 50, 150, 40);

        jComboBox2.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "easy", "medium", "hard" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(450, 100, 150, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(450, 150, 150, 40);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(450, 200, 150, 40);

        jTextField4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(470, 360, 110, 40);

        jTextField6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(470, 410, 110, 40);

        buttonGroup1.add(jRadioButton2);
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(430, 370, 21, 21);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(430, 420, 21, 21);

        jTextField3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(300, 360, 110, 40);

        jTextField5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(300, 410, 110, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(260, 370, 20, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(260, 420, 21, 21);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 470, 300, 50);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel1.setText("Roottype");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 50, 120, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(830, 30, 70, 70);

        kGradientPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 280, 320, 80);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel5.setText("questions");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(280, 300, 150, 30);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel4.setText("already enter questions");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(200, 220, 230, 40);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setText("limit");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(300, 170, 110, 40);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel2.setText("level");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(300, 120, 100, 30);

        jPanel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, -20, 1500, 1000);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        jMenu1.setText("File");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("updatequestions");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("quiz");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("quiz1");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("updatelimit");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
    
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String roottype=String.valueOf(jComboBox1.getSelectedItem());
     String root_id=String.valueOf(project_logics.GetDataFromDataBase.getRootid(roottype));
     String level=String.valueOf(jComboBox2.getSelectedItem());
             
     String limit=jTextField1.getText();
//     //String entered_ques=jTextField2.getText();
     String questions=jTextArea1.getText();
     String opt1=jTextField3.getText();
     String opt2=jTextField4.getText();
     String opt3=jTextField5.getText();
     String opt4=jTextField6.getText();
     String answer=null;
     if(jRadioButton1.isSelected())
     {
      answer=jTextField3.getText();
     }    
     else if(jRadioButton2.isSelected())
     {
      answer=jTextField4.getText(); 
     }
     else if(jRadioButton3.isSelected())
     { 
      answer=jTextField5.getText(); 
     }
     else if(jRadioButton4.isSelected())
     {
      answer=jTextField6.getText(); 
     }
try
{
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
    Connection con=project_logics.GetDataFromDataBase.getDbInstance();
    PreparedStatement pstmt=con.prepareStatement("Insert into question_record (`roottype`,`level`,`questions`,`opt1`,`opt2`,`opt3`,`opt4`,`answer`) values (?,?,?,?,?,?,?,?)");
    pstmt.setString(1,roottype);
    pstmt.setString(2,level);
    pstmt.setString(3,questions);
    pstmt.setString(4,opt1);
    pstmt.setString(5,opt2);
    pstmt.setString(6,opt3);
    pstmt.setString(7,opt4);
    pstmt.setString(8,answer);
    
    int ab=pstmt.executeUpdate();
    if(ab>0)
    {
    JOptionPane.showMessageDialog(null,"Questions Inserted");
    int entered_ques=project_logics.GetDataFromDataBase.getTotalCount(root_id,level);
    int flag=project_logics.GetDataFromDataBase.updateEnteredQuestionCount(entered_ques,root_id,level);
    if(flag>0)
    {
        JOptionPane.showMessageDialog(null,"Question Count updated ");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Question Count not updated ");
    }

    // get updated qus counter
    jTextArea1.setText("");
    jTextField2.setText(project_logics.GetDataFromDataBase.getTotalCount(root_id,level)+"");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");

    buttonGroup1.clearSelection();
    }
    else
    {
     JOptionPane.showMessageDialog(null,"Question Not Inserted !");
    }
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Exception issssssss --> "+e);
}   
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    //String my_root_value=jComboBox1.getSelectedItem().toString();
    String my_selected_root=String.valueOf(jComboBox1.getSelectedItem());//root
    String root_id=String.valueOf(project_logics.GetDataFromDataBase.getRootid(my_selected_root));//rootid

    try
    {
  //  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");  
     Connection con=project_logics.GetDataFromDataBase.getDbInstance();
    PreparedStatement pstmt=con.prepareStatement("select `level` from subroot where `rootid`=?");
    pstmt.setString(1,root_id);
   // jTextField1.setText(null);
    ResultSet rs=pstmt.executeQuery();
    jComboBox2.removeAllItems();
    jTextField1.setText(null);
   while(rs.next())
    {
     jComboBox2.addItem(rs.getString("level"));
    }   
    } 
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"error--"+e);  
    }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        String root=String.valueOf(jComboBox1.getSelectedItem());
        String level=String.valueOf(jComboBox2.getSelectedItem());
        String root_id=String.valueOf(project_logics.GetDataFromDataBase.getRootid(root));
    try
    {
         Connection con1=project_logics.GetDataFromDataBase.getDbInstance();  
        PreparedStatement pstmt1=con1.prepareStatement("select `limit`,`entered_ques` from subroot where `rootid`=? and `level`=?");
        pstmt1.setString(1,root_id);
        pstmt1.setString(2,level);
        ResultSet rs1=pstmt1.executeQuery();

        if(rs1.next())
        {
          jTextField1.setText(rs1.getString("limit"));
          jTextField2.setText(rs1.getString("entered_ques"));

        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"error--"+e);  
    }    
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

   private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField1ActionPerformed

   private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
      dispose();
      new updatequestions().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

   private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
      dispose();
      new quiz1().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

   private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
      dispose();
      new quiz().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

   private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
     dispose();
      new Updatelimit().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     dispose();
   }//GEN-LAST:event_jButton2ActionPerformed

   private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}