/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dkmth
 */
public class EditTeacher extends javax.swing.JFrame {

    /**
     * Creates new form EditTeacher
     */
    public EditTeacher() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            //
            /*String sql=" Select * from teacher_subject";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from teacher_subject");
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int count = rsMetaData.getColumnCount();
            for(int i = 2; i<=count; i++) {
                    subject1.addItem(rsMetaData.getColumnName(i));
            }
            //
            String sql1=" Select * from teacher_class";
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery("select * from teacher_class");
            ResultSetMetaData rsMetaData1 = rs1.getMetaData();
            count = rsMetaData1.getColumnCount();
            while(rs1.next())
            {
                for(int i = 2; i<=count; i++) {
                    if(rs1.getString(rsMetaData.getColumnName(i))!=null)
                        class1.addItem(rs1.getString(rsMetaData.getColumnName(i)));
                }
            }*/
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        degree = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        subject = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        save = new javax.swing.JButton();
        subject1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(833, 500));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Edit Teacher Page");

        jLabel2.setText("Nhập Id giáo viên cần sửa:");

        jLabel3.setText("Tên:");

        jLabel4.setText("Id:");

        jLabel5.setText("Dob:");

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        jLabel6.setText("Bằng cấp:");

        jLabel7.setText("Môn dạy:");

        jLabel8.setText("Lớp dạy:");

        jLabel9.setText("SĐT:");

        subject.setText(" ");

        jLabel11.setText(" ");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel10.setText("Thêm môn:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(search)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(id)
                    .addComponent(number)
                    .addComponent(degree)
                    .addComponent(dob)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(save))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subject1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin obj= new Admin();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String idEdit=jTextField1.getText();
        subject1.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            String sql=" Select * from teacher_information";
            Statement st=(Statement) conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            Statement stmt = conn.createStatement();
            String s="";
            String s1="";
            while(rs.next())
            {
                String idGet=rs.getString("id");
                if(idEdit.equals(idGet))
                {
                    id.setText(rs.getString("id"));
                    name.setText(rs.getString("name"));
                    dob.setText(rs.getString("dob"));
                    degree.setText(rs.getString("degree"));
                    number.setText(rs.getString("Number"));
                    
                    break;
                }
   
            }
            ResultSet rs1 = stmt.executeQuery("select * from teacher_subject");
            ResultSetMetaData rsMetaData = rs1.getMetaData();
            int dem=rsMetaData.getColumnCount();
                    
            while(rs1.next())
                    {
                        String idGet1=rs1.getString("id");
                        if(idEdit.equals(idGet1))
                        {
                            for (int i=2;i<=dem;i++)
                            {
                                if(rs1.getString(rsMetaData.getColumnName(i))!=null)
                                {    

                                    if(i<dem)
                                        s+=rsMetaData.getColumnName(i)+", ";
                                    else
                                        s+=rsMetaData.getColumnName(i);
                                }
                                else
                                    subject1.addItem(rsMetaData.getColumnName(i));                                   
                            }
                            break;
                        }
                    }
                    subject.setText(s);
            //        
            ResultSet rs2 = stmt.executeQuery("select * from teacher_class");
            ResultSetMetaData rsMetaData1 = rs2.getMetaData();
            dem=rsMetaData1.getColumnCount();
            
            while(rs2.next())
                    {
                        String idGet2=rs2.getString("id");
                        if(idEdit.equals(idGet2))
                        {
                            for (int i=2;i<=dem;i++)
                            {
                                if(rs2.getString(rsMetaData1.getColumnName(i))!=null)
                                {    

                                    if(i<dem)
                                        s1+=rs2.getString(rsMetaData1.getColumnName(i))+", ";
                                    else
                                        s1+=rs2.getString(rsMetaData1.getColumnName(i));

                                }
                            }
                        break;
                        }
                    }
                    jLabel11.setText(s1);
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String idEdit=jTextField1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            
            String sql="";
            sql=" UPDATE teacher_information \n" +
                    "SET id ='"+id.getText() +"', name='"+name.getText()+"', dob='"+dob.getText()+"', Number='"+number.getText()+"'\n" +
                        "WHERE id='"+jTextField1.getText()+"';";
            JOptionPane.showMessageDialog(null,sql);
            PreparedStatement st=conn.prepareStatement(sql);
            st.executeUpdate();
            //
            Statement st1=(Statement) conn.createStatement();
            ResultSet rs=st1.executeQuery("Select * from teacher_subject");
            while(rs.next())
            {
                //JOptionPane.showMessageDialog(null,rs.getString("id")+" "+jTextField1.getText()+" "+rs.getString(subject1.getItemAt(subject1.getSelectedIndex())));
                if(rs.getString("id").equals(jTextField1.getText()) && rs.getString(subject1.getItemAt(subject1.getSelectedIndex()))==null)
                {
                    String sql1="";
                    String t=(String)subject1.getItemAt(subject1.getSelectedIndex());
                    sql1=" UPDATE teacher_subject \n" +
                            "SET id ='"+id.getText()+"', "+t+"= 1\n"+
                    "WHERE id='"+jTextField1.getText()+"';";
                    //JOptionPane.showMessageDialog(null,t);
                    //JOptionPane.showMessageDialog(null,sql1);
                    st=conn.prepareStatement(sql1);
                    st.executeUpdate();
                break;
                }
            }
            Statement stmt = conn.createStatement();
            String s="";
            String s1="";
            ResultSet rs1 = stmt.executeQuery("select * from teacher_subject");
            ResultSetMetaData rsMetaData = rs1.getMetaData();
            int dem=rsMetaData.getColumnCount();
                    
            while(rs1.next())
                    {
                        String idGet1=rs1.getString("id");
                        if(idEdit.equals(idGet1))
                        {
                            for (int i=2;i<=dem;i++)
                            {
                                if(rs1.getString(rsMetaData.getColumnName(i))!=null)
                                {    
                                    if(i<dem)
                                        s+=rsMetaData.getColumnName(i)+", ";
                                    else
                                        s+=rsMetaData.getColumnName(i);
                                }
                                else
                                    subject1.addItem(rsMetaData.getColumnName(i));                                   
                            }
                            break;
                        }
                    }
                    subject.setText(s);
            //        
            ResultSet rs2 = stmt.executeQuery("select * from teacher_class");
            ResultSetMetaData rsMetaData1 = rs2.getMetaData();
            dem=rsMetaData1.getColumnCount();
            
            while(rs2.next())
                    {
                        String idGet2=rs2.getString("id");
                        if(idEdit.equals(idGet2))
                        {
                            for (int i=2;i<=dem;i++)
                            {
                                if(rs2.getString(rsMetaData1.getColumnName(i))!=null)
                                {    

                                    if(i<dem)
                                        s1+=rs2.getString(rsMetaData1.getColumnName(i))+", ";
                                    else
                                        s1+=rs2.getString(rsMetaData1.getColumnName(i));

                                }
                            }
                        break;
                        }
                    }
                    jLabel11.setText(s1);
            
            JOptionPane.showMessageDialog(null,"Sua thanh cong!");
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField degree;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JLabel subject;
    private javax.swing.JComboBox<String> subject1;
    // End of variables declaration//GEN-END:variables
}