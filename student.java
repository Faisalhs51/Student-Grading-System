
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.*;


public class student extends javax.swing.JFrame {

    public student() {
        initComponents();
        getContentPane().setBackground(Color.PINK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prn = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        em1 = new javax.swing.JTextField();
        dsa1 = new javax.swing.JTextField();
        dms1 = new javax.swing.JTextField();
        pcom1 = new javax.swing.JTextField();
        pcpf1 = new javax.swing.JTextField();
        em2 = new javax.swing.JTextField();
        dsa2 = new javax.swing.JTextField();
        pcom2 = new javax.swing.JTextField();
        pcpf2 = new javax.swing.JTextField();
        dms2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        tmarks = new javax.swing.JTextField();
        percentage1 = new javax.swing.JTextField();
        pointer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        records = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT GRADING SYSTEM");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("PRN(7 digit)");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        prn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        prn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prnActionPerformed(evt);
            }
        });

        sname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("EM-III");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("DSA");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("DMS");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("PCPF");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("PCom");

        em1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        em1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em1ActionPerformed(evt);
            }
        });

        dsa1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsa1ActionPerformed(evt);
            }
        });

        dms1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dms1ActionPerformed(evt);
            }
        });

        pcom1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pcom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcom1ActionPerformed(evt);
            }
        });

        pcpf1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        em2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        em2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em2ActionPerformed(evt);
            }
        });

        dsa2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        pcom2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pcom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcom2ActionPerformed(evt);
            }
        });

        pcpf2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pcpf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcpf2ActionPerformed(evt);
            }
        });

        dms2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Theory");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Internal");

        status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tmarks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        percentage1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        percentage1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pointer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pointer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Status");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Total Marks");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Percentage");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Pointer");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Grade");

        grade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mumbai University BE-IT Sem-III");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("SUBJECTS");

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRN", "Name", "EM III (Th)", "EM III (IA)", "DSA (Th)", "DSA (IA)", "DMS (Th)", "DMS (IA", "PCom (Th)", "PCom (IA)", "PCPF (Th)", "PCPF (IA)", "Status", "Total Marks", "Percentage", "SGPA", "Grade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        records.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        records.setText("RECORDS");
        records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(grade)))
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(em1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(em2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pcpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pcom1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(83, 83, 83))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                    .addGap(11, 11, 11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dms1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dsa1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pcom2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pcpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(522, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pointer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(92, 92, 92)
                                .addComponent(tmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dsa2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dms2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(submit)
                .addGap(213, 213, 213)
                .addComponent(records)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(em2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(em1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dsa1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dsa2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dms1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dms2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pcom1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcom2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pcpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(percentage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pointer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(clear)
                    .addComponent(records))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prnActionPerformed

    }//GEN-LAST:event_prnActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniProject", "root", "Faisal@123");

            int em = Integer.parseInt(em1.getText()) + Integer.parseInt(em2.getText());
            int dsa = Integer.parseInt(dsa1.getText()) + Integer.parseInt(dsa2.getText());
            int dms = Integer.parseInt(dms1.getText()) + Integer.parseInt(dms2.getText());
            int pcom = Integer.parseInt(pcom1.getText()) + Integer.parseInt(pcom2.getText());
            int pcpf = Integer.parseInt(pcpf1.getText()) + Integer.parseInt(pcpf2.getText());

            int total = em + dsa + dms + pcom + pcpf;
            tmarks.setText("" + total + "/500");

            float percentage = total / 5;
            percentage1.setText("" + percentage + "%");

            float sgpi = (float) (percentage / 9.5);
            pointer.setText("" + sgpi);

            String st;
            if (percentage >= 40.0) {
                st = "Pass";
            } else {
                st = "Fail";
            }

            status.setText(st);

            char g;
            if (percentage >= 80.0) {
                g = 'O';
            } else if ((percentage < 79.99) && (percentage >= 75.0)) {
                g = 'A';
            } else if ((percentage < 74.99) && (percentage >= 70.0)) {
                g = 'B';
            } else if ((percentage < 69.99) && (percentage >= 60.0)) {
                g = 'C';
            } else if ((percentage < 59.99) && (percentage >= 50.0)) {
                g = 'D';
            } else if ((percentage < 49.99) && (percentage >= 45.0)) {
                g = 'E';
            } else if ((percentage < 44.99) && (percentage >= 40.0)) {
                g = 'P';
            } else {
                g = 'F';
            }

            grade.setText("" + g);

            String query = "insert into student(prn, sname) values(?,?)";
            String query1 = "insert into subject(prn, EMIII, DSA, DMS, PCom, PCPF, EMIII_1, DSA_1, DMS_1, PCom_1, PCPF_1,"
                    + "status, tmarks, percentage, pointer, grade) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement p = con.prepareStatement(query);
            PreparedStatement p1 = con.prepareStatement(query1);
            p.setString(1, prn.getText());
            p.setString(2, sname.getText());
            p1.setString(1, prn.getText());
            p1.setString(2, em1.getText());
            p1.setString(3, dsa1.getText());
            p1.setString(4, dms1.getText());
            p1.setString(5, pcom1.getText());
            p1.setString(6, pcpf1.getText());
            p1.setString(7, em2.getText());
            p1.setString(8, dsa2.getText());
            p1.setString(9, dms2.getText());
            p1.setString(10, pcom2.getText());
            p1.setString(11, pcpf2.getText());
            p1.setString(12, "" + st);
            p1.setString(13, "" + total);
            p1.setString(14, "" + percentage);
            p1.setString(15, "" + sgpi);
            p1.setString(16, "" + g);
            p.executeUpdate();
            p1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Submitted Successfully!");

            Statement stmt = con.createStatement();
            String sql = "select student.prn, student.sname, subject.EMIII, subject.EMIII_1, "
                    + "subject.DSA, subject.DSA_1, subject.DMS, subject.DMS_1, subject.PCom, "
                    + "subject.PCom_1, subject.PCPF, subject.PCPF_1, subject.status, subject.tmarks, "
                    + "subject.percentage, subject.pointer, subject.grade from student, subject "
                    + "where(student.prn = subject.prn) "
                    + "group by student.prn, student.sname "
                    + "order by student.prn";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String tbData[] = {String.valueOf(rs.getInt("prn")),
                    rs.getString("sname"),
                    String.valueOf(rs.getInt("EMIII")),
                    String.valueOf(rs.getInt("EMIII_1")),
                    String.valueOf(rs.getInt("DSA")),
                    String.valueOf(rs.getInt("DSA_1")),
                    String.valueOf(rs.getInt("DMS")),
                    String.valueOf(rs.getInt("DMS_1")),
                    String.valueOf(rs.getInt("PCom")),
                    String.valueOf(rs.getInt("PCom_1")),
                    String.valueOf(rs.getInt("PCPF")),
                    String.valueOf(rs.getInt("PCPF_1")),
                    rs.getString("status"),
                    String.valueOf(rs.getInt("tmarks")),
                    String.valueOf(rs.getFloat("percentage")),
                    String.valueOf(rs.getFloat("pointer")),
                    rs.getString("grade")
                };

                DefaultTableModel tb1Model = (DefaultTableModel) jTable1.getModel();

                tb1Model.addRow(tbData);
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        prn.setText("");
        sname.setText("");
        em1.setText("");
        dsa1.setText("");
        dms1.setText("");
        pcom1.setText("");
        pcpf1.setText("");
        em2.setText("");
        dsa2.setText("");
        dms2.setText("");
        pcom2.setText("");
        pcpf2.setText("");
        status.setText("");
        tmarks.setText("");
        percentage1.setText("");
        pointer.setText("");
        grade.setText("");
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }//GEN-LAST:event_clearActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed

    }//GEN-LAST:event_snameActionPerformed

    private void em1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em1ActionPerformed

    }//GEN-LAST:event_em1ActionPerformed

    private void em2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em2ActionPerformed

    }//GEN-LAST:event_em2ActionPerformed

    private void dsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsa1ActionPerformed

    }//GEN-LAST:event_dsa1ActionPerformed

    private void pcom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcom2ActionPerformed

    }//GEN-LAST:event_pcom2ActionPerformed

    private void pcpf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcpf2ActionPerformed

    }//GEN-LAST:event_pcpf2ActionPerformed

    private void pcom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcom1ActionPerformed

    }//GEN-LAST:event_pcom1ActionPerformed

    private void dms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dms1ActionPerformed

    }//GEN-LAST:event_dms1ActionPerformed

    private void recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsActionPerformed
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniProject", "root", "Faisal@123");

            Statement stmt = con.createStatement();

            String sql = "select student.prn, student.sname, subject.EMIII, subject.EMIII_1, "
                    + "subject.DSA, subject.DSA_1, subject.DMS, subject.DMS_1, subject.PCom, "
                    + "subject.PCom_1, subject.PCPF, subject.PCPF_1, subject.status, subject.tmarks, "
                    + "subject.percentage, subject.pointer, subject.grade from student, subject "
                    + "where(student.prn = subject.prn) "
                    + "group by student.prn, student.sname "
                    + "order by student.prn";

            ResultSet rs = stmt.executeQuery(sql);

            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            dm.getDataVector().removeAllElements();     // For clearing previous records 
            dm.fireTableDataChanged();                  // overwriting not happen

            while (rs.next()) {
                String tbData[] = {String.valueOf(rs.getInt("prn")),
                    rs.getString("sname"),
                    String.valueOf(rs.getInt("EMIII")),
                    String.valueOf(rs.getInt("EMIII_1")),
                    String.valueOf(rs.getInt("DSA")),
                    String.valueOf(rs.getInt("DSA_1")),
                    String.valueOf(rs.getInt("DMS")),
                    String.valueOf(rs.getInt("DMS_1")),
                    String.valueOf(rs.getInt("PCom")),
                    String.valueOf(rs.getInt("PCom_1")),
                    String.valueOf(rs.getInt("PCPF")),
                    String.valueOf(rs.getInt("PCPF_1")),
                    rs.getString("status"),
                    String.valueOf(rs.getInt("tmarks")),
                    String.valueOf(rs.getFloat("percentage")),
                    String.valueOf(rs.getFloat("pointer")),
                    rs.getString("grade")
                };

                DefaultTableModel tb1Model = (DefaultTableModel) jTable1.getModel();

                tb1Model.addRow(tbData);
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_recordsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField dms1;
    private javax.swing.JTextField dms2;
    private javax.swing.JTextField dsa1;
    private javax.swing.JTextField dsa2;
    private javax.swing.JTextField em1;
    private javax.swing.JTextField em2;
    private javax.swing.JTextField grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pcom1;
    private javax.swing.JTextField pcom2;
    private javax.swing.JTextField pcpf1;
    private javax.swing.JTextField pcpf2;
    private javax.swing.JTextField percentage1;
    private javax.swing.JTextField pointer;
    private javax.swing.JTextField prn;
    private javax.swing.JButton records;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField status;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tmarks;
    // End of variables declaration//GEN-END:variables
}
