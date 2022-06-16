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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dkmth
 */
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Courses
     */
    private int vt;
    private String cur_sub;
    private String[] sub= new String[100];
    private String[] lop= new String[100];
    private String s;
    public Courses() {
        initComponents();
    }
    public Courses(String s)
    {
        initComponents();
        this.s=s;
        this.vt=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            String sql=" Select * from teacher_class";
            Statement st=(Statement) conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            DefaultTableModel tm= (DefaultTableModel) Table.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                if(s.equals(rs.getString("id")))
                {
                    int count = rsMetaData.getColumnCount();
                    for (int i=2;i<=count;i++)
                    {
                        if(rs.getString(rsMetaData.getColumnName(i))!=null)
                        {
                            //JOptionPane.showMessageDialog(null,rsMetaData.getColumnName(i)+" "+rs.getString(rsMetaData.getColumnName(i)));
                            vt++;
                            if(vt==1)
                                this.cur_sub=rsMetaData.getColumnName(i);
                            this.lop[vt]=rs.getString(rsMetaData.getColumnName(i));
                            this.sub[vt]=rsMetaData.getColumnName(i);
                            //JOptionPane.showMessageDialog(null,cur_sub);
                            subject.addItem(rs.getString(rsMetaData.getColumnName(i)));
                        }
                    }
                    break;
                }
            }
            
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
        subject = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ok = new javax.swing.JButton();
        add = new javax.swing.JButton();
        id1 = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        id = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mark = new javax.swing.JTextField();
        cham = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Môn học");

        subject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectItemStateChanged(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên sinh viên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Sinh viên:");

        jLabel3.setText("Id sinh viên:");

        jLabel4.setText("Điểm:");

        cham.setText("Chấm");
        cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(add)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(id1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(mark, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(cham)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(remove))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cham))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String test= id1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            
            String sql="";
            sql=" UPDATE student_class \n" +
                "SET "+ this.cur_sub +"='"+subject.getSelectedItem().toString() +"'\n" +
                "WHERE id='"+id1.getText()+"';";
            PreparedStatement st=conn.prepareStatement(sql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Them sinh vien "+ id1.getText()+" vao lop "+subject.getSelectedItem()+" thanh cong!");
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_addActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        id.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            String sql=" Select * from student_class";
            String sql1=" Select * from student_information";
            String sql2="Select * from student_subject";
            Statement st=(Statement) conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel tm= (DefaultTableModel) Table.getModel();
            tm.setRowCount(0);
            int so_sv=0;
            int[] sv= new int[1000];
            String[] ten_sv= new String[1000];
            while(rs.next())
            {
                //JOptionPane.showMessageDialog(null,rs.getInt("id")+" "+subject.getSelectedItem().toString());
                if(subject.getSelectedItem().toString().equals(rs.getString(cur_sub)))
                    {
                        so_sv++;
                        sv[so_sv]=rs.getInt("id");
                        //JOptionPane.showMessageDialog(null,rs.getInt("id"));
                        //Object obj[]={rs.getString("name"),};
                        //tm.addRow(obj);
                    }      
            }
            rs=st.executeQuery(sql1);
            int t=0;
            while(rs.next())
            {
                for (int i=1;i<=so_sv;i++)
                    if(sv[i]==rs.getInt("id"))
                    {
                        t++;
                        ten_sv[t]=rs.getString("name");
                        //tm.addRow(obj);
                        break;
                    }
            }
            rs=st.executeQuery(sql2);
            t=0;
            while(rs.next())
            {
                for (int i=1;i<=so_sv;i++)
                {
                    if(sv[i]==rs.getInt("id"))
                    {
                        t++;
                        Object obj[]={ten_sv[t],rs.getFloat(cur_sub)};
                        tm.addRow(obj);
                    }
                }
            }
            for (int i=1;i<=so_sv;i++)
            {
                id.addItem(Integer.toString(sv[i]));
            }
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_okActionPerformed

    private void subjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectItemStateChanged
        //JOptionPane.showMessageDialog(null,sub);
        for (int i=1;i<=vt;i++)
            if(subject.getSelectedItem().toString().equals(lop[i]))
                this.cur_sub=sub[i];
        //JOptionPane.showMessageDialog(null,sub);
    }//GEN-LAST:event_subjectItemStateChanged

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String test= id1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            
            String sql="";
            sql=" UPDATE student_class \n" +
                "SET "+ this.cur_sub +"=NULL\n" +
                "WHERE id='"+id1.getText()+"';";
            PreparedStatement st=conn.prepareStatement(sql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Xoa sinh vien "+ id1.getText()+" khoi lop "+subject.getSelectedItem()+" thanh cong!");
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            
            String sql="";
            sql=" UPDATE student_subject \n" +
                "SET "+ this.cur_sub +"=NULL\n" +
                "WHERE id='"+id1.getText()+"';";
            PreparedStatement st=conn.prepareStatement(sql);
            st.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Xoa sinh vien "+ id1.getText()+" khoi lop "+subject.getSelectedItem()+" thanh cong!");
            conn.close();
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void chamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            
            String  sql="";
            sql=" UPDATE student_subject \n" +
                "SET "+ this.cur_sub +"='"+mark.getText()+"'\n" +
                "WHERE id='"+id.getSelectedItem().toString()+"';";
            
            PreparedStatement st=conn.prepareStatement(sql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cham diem thanh cong!");
            //JOptionPane.showMessageDialog(null,"Xoa sinh vien "+ id1.getText()+" khoi lop "+subject.getSelectedItem()+" thanh cong!");
            conn.close();
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            String sql=" Select * from student_subject";
            Statement st=(Statement) conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            float dtb=0;
            int dem=0;
            while(rs.next())
            {
                if(id.getSelectedItem().toString().equals(rs.getString("id")))
                {
                    int count = rsMetaData.getColumnCount();
                    for (int i=2;i<=count;i++)
                    {
                        if(rs.getString(rsMetaData.getColumnName(i))!=null)
                        {
                            //JOptionPane.showMessageDialog(null,rsMetaData.getColumnName(i)+" "+rs.getString(rsMetaData.getColumnName(i)));
                            dem++;
                            dtb+=Float.parseFloat(rs.getString(rsMetaData.getColumnName(i)));
                        }
                    }
                    break;
    
                }
            }
            if (dem>0)
                dtb=dtb/(float)dem;
            sql=" UPDATE student_information \n" +
                "SET tb="+Float.toString(dtb)+"\n" +
                "WHERE id='"+id.getSelectedItem().toString()+"';";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            String hocluc="";
            if(dtb>=9&& dtb<=10)
                hocluc="Xuat sac";
            else if(dtb>=8 && dtb<9)
                hocluc="Gioi";
            else if(dtb>=7&& dtb<8)
                hocluc="Kha";
            else if(dtb>=5&& dtb<7)
                hocluc="Trung binh";
            else if(dtb>=4 && dtb<5)
                hocluc="Yeu";
            else
                hocluc="Kem";
            sql=" UPDATE student_information \n" +
                "SET hocluc='"+hocluc+"'\n" +
                "WHERE id='"+id.getSelectedItem().toString()+"';";
            stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_chamActionPerformed

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
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton add;
    private javax.swing.JButton cham;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mark;
    private javax.swing.JButton ok;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> subject;
    // End of variables declaration//GEN-END:variables
}