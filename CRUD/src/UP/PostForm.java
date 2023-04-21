/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UP;

import crud.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zentoy
 */
public class PostForm extends javax.swing.JFrame {

    /**
     * Creates new form PostForm
     */
    public PostForm() {
        initComponents();
        User();
    }

     private void User(){
       String databaseURL = "jdbc:derby://localhost:1527/zenbase";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select USER_ID From USERPOST ");
            ResultSet rs = pst.executeQuery();
            uid.removeAllItems();
            while(rs.next()){
                uid.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        show = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pid = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uid = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setText("SHOW TABLE");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 50));

        add.setText("ADD POST");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 50));

        update.setText("UPDATE POST");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 50));

        delete.setText("DELETE POST");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "POST FORM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 34));
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 34));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 250, 34));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("User ID");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Post ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Poss Title");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Post Date");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        uid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "this", "null" }));
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 250, 40));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 440, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        PostTable use =new PostTable();
        use.show();
        dispose();
    }//GEN-LAST:event_showActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         String db = "jdbc:derby://localhost:1527/zenbase";
       String sql ="DELETE FROM POST WHERE POST_ID=?";
        try {
            Connection con = DriverManager.getConnection(db);
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, pid.getText());
            
            
            int U = ps.executeUpdate();
            if(U == 1){
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                
                pid.setText("");
                uid.setSelectedItem(0);
                title.setText("");
                pid.setText("");
    
            }
            else{
                JOptionPane.showMessageDialog(null, "Failed to Delete");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main info =new Main();
        info.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    String db = "jdbc:derby://localhost:1527/zenbase";
       String sql ="INSERT INTO POST VALUES(?,?,?,?)";
        try {
            Connection con = DriverManager.getConnection(db);
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, pid.getText()); 
            ps.setString(2, title.getText());
            ps.setString(3, date.getText());
            ps.setString(4, (String) uid.getSelectedItem());
            
            int U = ps.executeUpdate();
            if(U == 1){
                JOptionPane.showMessageDialog(null, "Added Successfully!");
                
                pid.setText("");
                uid.setSelectedItem(0);
                date.setText("");
                title.setText("");
    
            }
            else{
                JOptionPane.showMessageDialog(null, "Failed to Add");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String db = "jdbc:derby://localhost:1527/zenbase";
       String sql ="UPDATE USERPOST SET POST_TITLE=?, POST_DATE=?, USER_ID=? WHERE POST_ID=?";
        try {
            Connection con = DriverManager.getConnection(db);
            PreparedStatement ps = con.prepareStatement(sql);
            
           
            
            ps.setString(1, title.getText());
            ps.setString(2, date.getText());
            ps.setString(3, (String) uid.getSelectedItem());
             ps.setString(4, pid.getText());
            
            int U = ps.executeUpdate();
            if(U == 1){
                JOptionPane.showMessageDialog(null, "Update Successfully!");
                
                title.setText("");
                uid.setSelectedItem(0);
                date.setText("");
                pid.setText("");
    
            }
            else{
                JOptionPane.showMessageDialog(null, "Failed to Update");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(PostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pid;
    private javax.swing.JButton show;
    private javax.swing.JTextField title;
    private javax.swing.JComboBox<String> uid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
