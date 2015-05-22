package com.rebel.gui;

import com.rebel.scan.Scan;
import java.awt.Color;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private int startPort;
    private int endPort;

    public GUI() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/com/rebel/icon/icon.png")).getImage());
        getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        startLabel = new javax.swing.JLabel();
        startField = new javax.swing.JTextField();
        endLabel = new javax.swing.JLabel();
        endField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peep: Port Scanner");
        setResizable(false);

        addressLabel.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(51, 153, 0));
        addressLabel.setText("Web Address");

        addressField.setBackground(new java.awt.Color(0, 0, 0));
        addressField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addressField.setForeground(new java.awt.Color(51, 153, 0));
        addressField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        addressField.setCaretColor(new java.awt.Color(51, 153, 0));

        startLabel.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        startLabel.setForeground(new java.awt.Color(51, 153, 0));
        startLabel.setText("Star Port");

        startField.setBackground(new java.awt.Color(0, 0, 0));
        startField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        startField.setForeground(new java.awt.Color(51, 153, 0));
        startField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        startField.setCaretColor(new java.awt.Color(51, 153, 0));

        endLabel.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        endLabel.setForeground(new java.awt.Color(51, 153, 0));
        endLabel.setText("End Port");

        endField.setBackground(new java.awt.Color(0, 0, 0));
        endField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        endField.setForeground(new java.awt.Color(51, 153, 0));
        endField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        endField.setCaretColor(new java.awt.Color(51, 153, 0));

        scrollPane.setBackground(new java.awt.Color(0, 0, 0));
        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true), "Port Status ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 12), new java.awt.Color(51, 153, 0))); // NOI18N

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(0, 0, 0));
        textArea.setColumns(20);
        textArea.setForeground(new java.awt.Color(51, 51, 255));
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(null);
        scrollPane.setViewportView(textArea);

        searchButton.setBackground(new java.awt.Color(255, 153, 0));
        searchButton.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 51, 255));
        searchButton.setText("Scan");
        searchButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startLabel)
                    .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endLabel)
                    .addComponent(endField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        textArea.setEditable(false);
        startField.setEditable(false);
        endField.setEditable(false);
        searchButton.setEnabled(false);
        
        textArea.setText("");
        startPort = Integer.parseInt(startField.getText());
        endPort = Integer.parseInt(endField.getText());

        try {
            
            Scan s = new Scan(InetAddress.getByName(addressField.getText()));
            
            for (int port=startPort; port<=endPort; port++) {

                String t = textArea.getText();
                
                if (s.status(port)) {
                    textArea.setText(t + ">> " + port + ": Open ***\n");
                } else {
                    textArea.setText(t + port + ": Close\n");
                }
            }

            JOptionPane.showMessageDialog(null, "Scan Completed!");

        } catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        textArea.setEditable(true);
        startField.setEditable(true);
        endField.setEditable(true);
        searchButton.setEnabled(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField endField;
    private javax.swing.JLabel endLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField startField;
    private javax.swing.JLabel startLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
