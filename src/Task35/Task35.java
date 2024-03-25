package Task35;


import figures.Dot;
import java.awt.Color;
import java.awt.Point;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author a.yusupova
 */
public class Task35 extends javax.swing.JFrame {

    /**
     * Creates new form Task20
     */
    public Task35() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        canvas1 = new java.awt.Canvas();
        jrbDot = new javax.swing.JRadioButton();
        jrbCircle = new javax.swing.JRadioButton();
        jrbRectangle = new javax.swing.JRadioButton();
        jrbEllipse = new javax.swing.JRadioButton();
        jbCreate = new javax.swing.JButton();
        jrbSquare = new javax.swing.JRadioButton();
        jrbTriangle = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas1.setMinimumSize(new java.awt.Dimension(100, 100));

        buttonGroup1.add(jrbDot);
        jrbDot.setText("Dot");
        jrbDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDotActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbCircle);
        jrbCircle.setText("Circle");
        jrbCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCircleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbRectangle);
        jrbRectangle.setText("Rectangle");

        buttonGroup1.add(jrbEllipse);
        jrbEllipse.setText("Ellipse");

        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbSquare);
        jrbSquare.setText("Square");

        buttonGroup1.add(jrbTriangle);
        jrbTriangle.setText("Triangle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jrbDot, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(jrbCircle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(jrbRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(jrbEllipse, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(jbCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jrbSquare, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jrbTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDot, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbEllipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSquare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbTriangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCreate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDotActionPerformed

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        // TODO add your handling code here:
        graphics = this.canvas1.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 
                this.canvas1.getWidth(), this.canvas1.getHeight());
        
        
        figures.Dot dot = new Dot(graphics);
        dot.color();
        
        figures.Figure fig = dot;
        fig.getRotation();
        
        if(currentFig != null)
            currentFig.hide();
        
        if(jrbCircle.isSelected())
            currentFig = new figures.Circle(15, this.graphics);
        if(jrbEllipse.isSelected())
            currentFig = new figures.Ellipse(15,45, this.graphics);
        if(jrbRectangle.isSelected())
            currentFig = new figures.Rectangle(15,45, this.graphics);
        if(jrbSquare.isSelected())
            currentFig = new figures.Square(15, this.graphics);
        if(jrbTriangle.isSelected())
            currentFig = new figures.Triangle(new Point(1,1),new Point(15,77), new Point(24,32), this.graphics);
        if(jrbDot.isSelected())
            currentFig = new figures.Dot(this.graphics);

        if(currentFig != null)
        {
            currentFig.setBackgroundColor(graphics.getColor());
            currentFig.setColor(Color.BLACK);
            currentFig.moveTo(this.canvas1.getWidth()/2, this.canvas1.getHeight()/2);
            currentFig.show();
        }
    }//GEN-LAST:event_jbCreateActionPerformed

    private void jrbCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCircleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCircleActionPerformed

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
            java.util.logging.Logger.getLogger(Task35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task35().setVisible(true);
            }
        });
    }
    
    private figures.Figure currentFig;
    private java.awt.Graphics graphics;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jbCreate;
    private javax.swing.JRadioButton jrbCircle;
    private javax.swing.JRadioButton jrbDot;
    private javax.swing.JRadioButton jrbEllipse;
    private javax.swing.JRadioButton jrbRectangle;
    private javax.swing.JRadioButton jrbSquare;
    private javax.swing.JRadioButton jrbTriangle;
    // End of variables declaration//GEN-END:variables
}
