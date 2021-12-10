package number_system_converter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Long.toBinaryString;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GUI extends javax.swing.JFrame {

    boolean boundsError=false;

    public GUI() {
        initComponents();
        this.setTitle("Numbering System Converter");
        this.setResizable(false);
        
        //JFrame Center in screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);

        ans1.setText("");  ans2.setText("");  ans3.setText("");  ans4.setText("");
        
        addWindowListener(new WindowAdapter()
        {

        @Override
        public void windowOpened(WindowEvent we) {
        setIconImage( new ImageIcon("src/icons/p.png").getImage()); 
        JOptionPane.showMessageDialog(null, "the default selected number system is decimal","welcome to my program ;) ",1,new ImageIcon("src/icons/7.png")); }

        @Override
        public void windowClosing(WindowEvent we)
        {
        int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("src/icons/can.png"));
        if (ans==YES_OPTION )dispose();
        }

        @Override
        public void windowClosed(WindowEvent we) { JOptionPane.showMessageDialog(null, "thank you for use my program ;) ","good bye",1,new ImageIcon("src/icons/7.png")); }

        @Override
        public void windowIconified(WindowEvent we) { setIconImage( new ImageIcon("src/icons/pl.png").getImage()); }

        @Override
        public void windowDeiconified(WindowEvent we) { setIconImage( new ImageIcon("src/icons/p.png").getImage()); }

     });
        
        input.getDocument().addDocumentListener(new DocumentListener()
         {

        @Override
        public void insertUpdate(DocumentEvent de) { action(); updateTIP(); }

        @Override
        public void removeUpdate(DocumentEvent de) { action(); boundsError=false; updateTIP();}

         @Override
         public void changedUpdate(DocumentEvent de) {/*...*/ }

         });
        
        a1.setSelected(true);
        
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        lapel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        a4 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        sp1 = new javax.swing.JSeparator();
        panel2 = new javax.swing.JPanel();
        i1 = new javax.swing.JLabel();
        ans1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        ans2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        ans3 = new javax.swing.JLabel();
        ans4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number To Convert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 15), new java.awt.Color(153, 0, 0))); // NOI18N

        lapel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lapel1.setText("Number : ");

        input.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lapel1)
                .addGap(32, 32, 32)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lapel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input))
                .addGap(15, 15, 15))
        );

        buttonGroup1.add(a4);
        a4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        a4.setMnemonic('4');
        a4.setText("Hexa Decimal");
        a4.setToolTipText("<html><h3>input char from 0-9 and (a-f or A-F)</h3></html>");
        a4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a4ItemStateChanged(evt);
            }
        });
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(a1);
        a1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        a1.setMnemonic('1');
        a1.setText("Decimal");
        a1.setToolTipText("<html><h3>input char from 0-9</h3></html>");
        a1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a1ItemStateChanged(evt);
            }
        });
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(a2);
        a2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        a2.setMnemonic('2');
        a2.setText("Binary");
        a2.setToolTipText("<html><h3>input chars 0,1</h3></html>");
        a2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a2ItemStateChanged(evt);
            }
        });
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(a3);
        a3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        a3.setMnemonic('3');
        a3.setText("Octal");
        a3.setToolTipText("<html><h3>input chars from 0-7</h3></html>");
        a3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a3ItemStateChanged(evt);
            }
        });
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Numbering System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 15), new java.awt.Color(153, 0, 0))); // NOI18N

        i1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        i1.setText("Decimal :");

        ans1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ans1.setForeground(new java.awt.Color(51, 102, 0));
        ans1.setText("***");

        i2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        i2.setText("Binary :");

        ans2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ans2.setForeground(new java.awt.Color(51, 102, 0));
        ans2.setText("***");

        i3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        i3.setText("Octal :");

        ans3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ans3.setForeground(new java.awt.Color(51, 102, 0));
        ans3.setText("***");

        ans4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ans4.setForeground(new java.awt.Color(51, 102, 0));
        ans4.setText("***");

        i5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        i5.setText("Hexa Decimal :");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i1)
                    .addComponent(i2)
                    .addComponent(i3)
                    .addComponent(i5))
                .addGap(44, 44, 44)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ans4)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ans3)
                        .addComponent(ans2))
                    .addComponent(ans1))
                .addGap(231, 231, 231))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i1)
                    .addComponent(ans1))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i2)
                    .addComponent(ans2))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i3)
                    .addComponent(ans3))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans4)
                    .addComponent(i5))
                .addGap(30, 30, 30))
        );

        cc.setBackground(new java.awt.Color(204, 204, 204));
        cc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cc.setForeground(new java.awt.Color(153, 0, 51));
        cc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rem1.png"))); // NOI18N
        cc.setMnemonic('c');
        cc.setText("CLEAR");
        cc.setToolTipText("Alt+C");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(cc)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(cc)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a1)
                        .addGap(26, 26, 26)
                        .addComponent(a2)
                        .addGap(26, 26, 26)
                        .addComponent(a3)
                        .addGap(26, 26, 26)
                        .addComponent(a4)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sp1)
                        .addGap(10, 10, 10))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4))
                .addGap(23, 23, 23)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyTyped
        
        if(boundsError==true){
            evt.consume(); return;
        }
        
        if(a1.isSelected()){
        if(!((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='9')))evt.consume();
        }
        else
        if(a2.isSelected()){
        if(!((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='1')))evt.consume();
        }
        else
        if(a3.isSelected()){
        if(!((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='7')))evt.consume();
        }
        else
        if(a4.isSelected()){
        if(!(
           ((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='9'))
           ||((evt.getKeyChar()>='A')&&(evt.getKeyChar()<='F'))
           ||((evt.getKeyChar()>='a')&&(evt.getKeyChar()<='f'))))evt.consume();
        }
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "please select number system then input","Hint ",1,new ImageIcon("src/icons/vg.png"));
        }   
    }//GEN-LAST:event_inputKeyTyped

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
      a1.setSelected(true);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
      a2.setSelected(true);
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
      a3.setSelected(true);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
      a4.setSelected(true);
    }//GEN-LAST:event_a4ActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        clear();
    }//GEN-LAST:event_ccActionPerformed

    private void a1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a1ItemStateChanged
        if(a1.isSelected())input.setText(ans1.getText());
    }//GEN-LAST:event_a1ItemStateChanged

    private void a2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a2ItemStateChanged
        if(a2.isSelected())input.setText(ans2.getText());
    }//GEN-LAST:event_a2ItemStateChanged

    private void a3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a3ItemStateChanged
        if(a3.isSelected())input.setText(ans3.getText());
    }//GEN-LAST:event_a3ItemStateChanged

    private void a4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a4ItemStateChanged
        if(a4.isSelected())input.setText(ans4.getText());
    }//GEN-LAST:event_a4ItemStateChanged

    public void clear()
    {
       boundsError=false;
       a1.setSelected(false); a2.setSelected(false); a3.setSelected(false); a4.setSelected(false);
       buttonGroup1.clearSelection();
       ans1.setText("");  ans2.setText("");  ans3.setText("");  ans4.setText(""); 
       input.setText("");
    }
    
    public void action()
    {
        try{
         String o=input.getText();
         
         if(a1.isSelected())
         {
           if(o.isEmpty()){clear(); a1.setSelected(true); return;}
             
           long num=Long.parseLong(o);
             
           ans1.setText(""+num);
             
           String binary = toBinaryString(num);
           ans2.setText(binary);
             
           String octal=Long.toOctalString(num);
           ans3.setText(octal);
           
           String hexadecimal =Long.toHexString(num);
           ans4.setText(hexadecimal);
           return;
         }
         
         else 
             
         if(a2.isSelected())
         {
           if(o.isEmpty()){clear(); a2.setSelected(true); return;}
             
           long decimal =Long.parseLong(o,2);
             
           String binary = toBinaryString(decimal);
           ans2.setText(binary);
             
           ans1.setText(""+decimal);
          
           String octal=Long.toOctalString(decimal );
           ans3.setText(octal);
           
           String hexadecimal =Long.toHexString(decimal);
           ans4.setText(hexadecimal);
           return;
         }
 
         else 
             
         if(a3.isSelected())
         {
           if(o.isEmpty()){clear(); a3.setSelected(true); return;}
             
           long decimal =Long.parseLong(o,8);
             
           String octal=Long.toOctalString(decimal);
           ans3.setText(octal);
             
           ans1.setText(""+decimal);
          
           String binary = toBinaryString(decimal);
           ans2.setText(binary);
           
           String hexadecimal =Long.toHexString(decimal);
           ans4.setText(hexadecimal);
           return;
         }
         
         else 
             
         if(a4.isSelected())
         {
           if(o.isEmpty()){clear(); a4.setSelected(true); return;}
             
           long decimal =Long.parseLong(o,16);
             
           String hexadecimal =Long.toHexString(decimal);// 001F == 1f
           ans4.setText(hexadecimal);
             
           ans1.setText(""+decimal);
          
           String binary = toBinaryString(decimal);
           ans2.setText(binary);
           
           String octal=Long.toOctalString(decimal );
           ans3.setText(octal);
           return;
         }
         //return;
        }
        catch(NumberFormatException e)
        {
            boundsError=true; JOptionPane.showMessageDialog(null, "Error , the size out of bound","Hint ",1,new ImageIcon("src/icons/vg.png")); return;
        }
        
        String o=input.getText();
        if(!o.isEmpty())JOptionPane.showMessageDialog(null, "unexpected error","Hint ",1,new ImageIcon("src/icons/vg.png")); 

    }
    
    private void updateTIP()
    {
        ans1.setToolTipText(ans1.getText()); 
        ans2.setToolTipText(ans2.getText()); 
        ans3.setToolTipText(ans3.getText()); 
        ans4.setToolTipText(ans4.getText());
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JLabel ans1;
    private javax.swing.JLabel ans2;
    private javax.swing.JLabel ans3;
    private javax.swing.JLabel ans4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cc;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i5;
    private javax.swing.JTextField input;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lapel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JSeparator sp1;
    // End of variables declaration//GEN-END:variables
}
