/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmInicial.java
 *
 * Created on Sep 10, 2011, 3:31:40 PM
 */
package view;

/**
 *
 * @author Vitor Freitas
 */
public class FrmPanelInicial extends javax.swing.JPanel {

    /** Creates new form frmInicial */
    public FrmPanelInicial() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitleInicial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 231, 221));

        lbTitleInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitleInicial.setForeground(new java.awt.Color(51, 51, 51));
        lbTitleInicial.setText("Inicial");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floral_hairstyle_silhouette.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleInicial)
                .addContainerGap(591, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbTitleInicial;
    // End of variables declaration//GEN-END:variables
}