/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shovon
 */
public class Home extends javax.swing.JFrame {

    Child onlynumbers = new Child();

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jFreeze = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCfan = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTfan = new javax.swing.JTextField();
        joven = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jiron = new javax.swing.JTextField();
        j10 = new javax.swing.JCheckBox();
        j0 = new javax.swing.JCheckBox();
        j20 = new javax.swing.JCheckBox();
        j5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jtotal = new javax.swing.JButton();
        jTotal = new javax.swing.JTextField();
        jbar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jexit = new javax.swing.JButton();
        jsave = new javax.swing.JButton();
        Remainder = new javax.swing.JComboBox<>();
        jreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jaddres1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jphone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jmodelno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdate = new javax.swing.JTextField();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Shop Data Received management System");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.setLayout(null);

        jCheckBox4.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox4.setText("Freeze");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jCheckBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCheckBox4KeyTyped(evt);
            }
        });
        jPanel1.add(jCheckBox4);
        jCheckBox4.setBounds(10, 20, 90, 23);

        jFreeze.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFreeze.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jFreeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFreezeActionPerformed(evt);
            }
        });
        jFreeze.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFreezeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFreezeKeyTyped(evt);
            }
        });
        jPanel1.add(jFreeze);
        jFreeze.setBounds(120, 20, 100, 30);

        jCheckBox5.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox5.setText("Ceiling Fan");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox5);
        jCheckBox5.setBounds(10, 80, 90, 23);

        jCfan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCfan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jCfan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfanActionPerformed(evt);
            }
        });
        jCfan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCfanKeyTyped(evt);
            }
        });
        jPanel1.add(jCfan);
        jCfan.setBounds(120, 80, 100, 30);

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setText("Oven");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(280, 20, 90, 23);

        jTfan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTfan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jTfan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfanActionPerformed(evt);
            }
        });
        jTfan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTfanKeyTyped(evt);
            }
        });
        jPanel1.add(jTfan);
        jTfan.setBounds(120, 140, 100, 30);

        joven.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        joven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        joven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jovenKeyTyped(evt);
            }
        });
        jPanel1.add(joven);
        joven.setBounds(400, 20, 100, 30);

        jCheckBox3.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox3.setText("Table Fan");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(10, 150, 90, 23);

        jCheckBox6.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox6.setText("Iron");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox6);
        jCheckBox6.setBounds(280, 80, 90, 23);

        jiron.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jiron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jiron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jironKeyTyped(evt);
            }
        });
        jPanel1.add(jiron);
        jiron.setBounds(400, 80, 100, 30);

        buttonGroup1.add(j10);
        j10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j10.setText("10%");
        jPanel1.add(j10);
        j10.setBounds(120, 250, 60, 25);

        buttonGroup1.add(j0);
        j0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j0.setText("0%");
        jPanel1.add(j0);
        j0.setBounds(10, 250, 60, 25);

        buttonGroup1.add(j20);
        j20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j20.setText("20%");
        j20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j20ActionPerformed(evt);
            }
        });
        jPanel1.add(j20);
        j20.setBounds(120, 300, 60, 25);

        buttonGroup1.add(j5);
        j5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j5.setText("5%");
        jPanel1.add(j5);
        j5.setBounds(10, 300, 60, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Discount");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 110, 33);

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(280, 240, 220, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 190, 80, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 190, 90, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(280, 140, 220, 30);

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(250, 140, 20, 23);

        jtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtotal.setText("Total Amount");
        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }
        });

        jTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));

        jbar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remainder Of The Customers", "Per day Cell Amount List", "Per Day Total Cell Product Quantity" }));

        jexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jsave.setText("Save");
        jsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaveActionPerformed(evt);
            }
        });

        Remainder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Remainder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Remainder" }));

        jreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel2.setLayout(null);
        jPanel2.add(jname);
        jname.setBounds(150, 10, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer Name :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 20, 121, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Addres:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 70, 60, 17);
        jPanel2.add(jaddres1);
        jaddres1.setBounds(150, 60, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cell Number:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 130, 100, 17);

        jphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jphoneKeyTyped(evt);
            }
        });
        jPanel2.add(jphone);
        jphone.setBounds(150, 120, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Model No:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(360, 70, 70, 17);
        jPanel2.add(jmodelno);
        jmodelno.setBounds(440, 60, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(360, 20, 40, 17);

        jdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdateActionPerformed(evt);
            }
        });
        jPanel2.add(jdate);
        jdate.setBounds(440, 20, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(565, 565, 565)
                                        .addComponent(jLabel9)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Remainder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jsave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Remainder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        Child iExit = new Child();

        try {
            iExit.iExitSystem();
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jexitActionPerformed

    private void jdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdateActionPerformed
    
    
    }//GEN-LAST:event_jdateActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

        if (jCheckBox4.isSelected()) {

            jFreeze.setEnabled(true);
            jFreeze.setText("");
            jFreeze.requestFocus();
        } else {
            jFreeze.setEnabled(false);
            jFreeze.setText("");
        }

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jFreezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFreezeActionPerformed

    }//GEN-LAST:event_jFreezeActionPerformed

    private void jCheckBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4KeyPressed

    private void jCheckBox4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4KeyTyped

    private void jFreezeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFreezeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFreezeKeyPressed

    private void jFreezeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFreezeKeyTyped

        try {
            onlynumbers.NumbersOnly(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jFreezeKeyTyped

    private void jCfanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCfanKeyTyped
        try {
            onlynumbers.NumbersOnly(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jCfanKeyTyped

    private void jTfanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfanKeyTyped
        try {
            onlynumbers.NumbersOnly(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jTfanKeyTyped

    private void jovenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jovenKeyTyped
        try {
            onlynumbers.NumbersOnly(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jovenKeyTyped

    private void jphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jphoneKeyTyped
        try {
            onlynumbers.NumbersOnly(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "System Error");
        }
    }//GEN-LAST:event_jphoneKeyTyped

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed

        JTextField clearText = null;
        for (Component c : jPanel1.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField) c;
                clearText.setText("0");
                clearText.setText("");
            }
        }
        //====================

        JCheckBox checkers = null;
        for (Component q : jPanel1.getComponents()) {
            if (q.getClass().toString().contains("javax.swing.JCheckBox")) {
                checkers = (JCheckBox) q;
                checkers.setSelected(false);
            }
        }
        buttonGroup1.clearSelection();


    }//GEN-LAST:event_jresetActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        JTextField clearText = null;
        for (Component c : jPanel1.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField) c;
                clearText.setText("0");
                clearText.setEnabled(false);

            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed

        if (jCheckBox5.isSelected()) {

            jCfan.setEnabled(true);
            jCfan.setText("");
            jCfan.requestFocus();
        } else {
            jCfan.setEnabled(false);
            jCfan.setText("");
        }

    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {

            joven.setEnabled(true);
            joven.setText("");
            joven.requestFocus();
        } else {
            joven.setEnabled(false);
            joven.setText("");
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {

            jTfan.setEnabled(true);
            jTfan.setText("");
            jTfan.requestFocus();
        } else {
            jTfan.setEnabled(false);
            jTfan.setText("");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {

            jiron.setEnabled(true);
            jiron.setText("");
            jiron.requestFocus();
        } else {
            jiron.setEnabled(false);
            jiron.setText("");
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jironKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jironKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jironKeyTyped

    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalActionPerformed
        Child cost = new Child();
        double iTotal;
        cost.Freeze = cost.pFreeze * Double.parseDouble(jFreeze.getText());
        cost.Cfan = cost.pCfan * Double.parseDouble(jFreeze.getText());
        cost.Tfan = cost.Tfan * Double.parseDouble(jTfan.getText());
        cost.Oven = cost.pOven * Double.parseDouble(joven.getText());
        cost.Iron = cost.pIron * Double.parseDouble(jiron.getText());

        if (j0.isSelected()) {

            iTotal = cost.getAmount();

            String Total = String.format("%.2f", iTotal);
            jTotal.setText(Total);
        }
        if (j5.isSelected()) {

            iTotal = cost.getAmount();
            iTotal = iTotal - ((iTotal * 5) / 100);

            String Total = String.format("%.2f", iTotal);

            jTotal.setText(Total);
        }
        if (j10.isSelected()) {

            iTotal = cost.getAmount();
            iTotal = iTotal - ((iTotal * 10) / 100);

            String Total = String.format("%.2f", iTotal);

            jTotal.setText(Total);
        }
        if (j20.isSelected()) {

            iTotal = cost.getAmount();
            iTotal = iTotal - ((iTotal * 20) / 100);

            String Total = String.format("%.2f", iTotal);

            jTotal.setText(Total);
        }


    }//GEN-LAST:event_jtotalActionPerformed

    private void j20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j20ActionPerformed

    private void jsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaveActionPerformed



    }//GEN-LAST:event_jsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jComboBox1.addItem(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed
    DefaultListModel model= new DefaultListModel();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(jComboBox1.getItemCount()!=0)
        jComboBox1.removeItem( jComboBox1.getSelectedIndex());
       jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTfanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfanActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         
 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if (jCheckBox1.isSelected()) {

            jTextField1.setEnabled(true);
            jTextField1.setText("");
            jTextField1.requestFocus();
        } else {
            jTextField1.setEnabled(false);
           jTextField1.setText("");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCfanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfanActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Remainder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox j0;
    private javax.swing.JCheckBox j10;
    private javax.swing.JCheckBox j20;
    private javax.swing.JCheckBox j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCfan;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jFreeze;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTfan;
    private javax.swing.JTextField jTotal;
    private javax.swing.JTextField jaddres1;
    private javax.swing.JComboBox<String> jbar;
    private javax.swing.JTextField jdate;
    private javax.swing.JButton jexit;
    private javax.swing.JTextField jiron;
    private javax.swing.JTextField jmodelno;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField joven;
    private javax.swing.JTextField jphone;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jsave;
    private javax.swing.JButton jtotal;
    // End of variables declaration//GEN-END:variables
}
