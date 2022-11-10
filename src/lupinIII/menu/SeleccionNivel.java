/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lupinIII.menu;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uniminuto.POO.lupinIII.control.Game;
import uniminuto.POO.lupinIII.model.exceptions.ArchivoCorruptoException;

/**
 *
 * @author NicoXtreme
 */
public class SeleccionNivel extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionNivel
     */
    public boolean bloqueado;
    
    
    public int nivel;
    String path;
    public SeleccionNivel() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Nivel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Nivel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Nivel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Nivel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Nivel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 44, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(91, 99, 140));

        Nivel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Nivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nivel1.setText("Nivel 1");
        Nivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nivel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 170, 370));

        jPanel8.setBackground(new java.awt.Color(91, 99, 140));

        Nivel2.setVisible(false);
        Nivel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Nivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nivel2.setText("Nivel 2");
        Nivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nivel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 170, 370));

        jPanel9.setBackground(new java.awt.Color(91, 99, 140));

        Nivel3.setVisible(false);
        Nivel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Nivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nivel3.setText("Nivel 3");
        Nivel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nivel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 170, 370));

        jPanel10.setBackground(new java.awt.Color(91, 99, 140));

        Nivel4.setVisible(false);
        Nivel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Nivel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nivel4.setText("Nivel 4");
        Nivel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nivel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 170, 370));

        jPanel11.setBackground(new java.awt.Color(91, 99, 140));

        Nivel5.setVisible(false);
        Nivel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Nivel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nivel5.setText("Nivel 5");
        Nivel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nivel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nivel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 170, 370));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel6.setText("SELECCIONA UN NIVEL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel7.setText("RETROCEDER");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        MenuPrincipal newframe = new MenuPrincipal();
        
        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void Nivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nivel1MouseClicked
        nivel = 1;
        try {
             
           Game newframe = new Game(Game.class.getResource("/uniminuto/POO/lupinIII/games/lupinIIINivel1.txt").getPath().replaceAll("%20", " "));
             
            newframe.setVisible(true);
            
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArchivoCorruptoException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Nivel1MouseClicked

    private void Nivel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nivel2MouseClicked
        nivel = 2;
        try {
              Game newframe = new Game(Game.class.getResource("/uniminuto/POO/lupinIII/games/lupinIIINivel2.txt").getPath().replaceAll("%20", " "));
             
            newframe.setVisible(true);
            
            newframe.setVisible(true);
            
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArchivoCorruptoException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Nivel2MouseClicked

    private void Nivel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nivel3MouseClicked
        nivel = 3;
        try {
            Game newframe = new Game(Game.class.getResource("/uniminuto/POO/lupinIII/games/lupinIIINivel3.txt").getPath().replaceAll("%20", " "));
             
            newframe.setVisible(true);
            
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArchivoCorruptoException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Nivel3MouseClicked

    private void Nivel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nivel4MouseClicked
        nivel = 4;
        try {
            Game newframe = new Game(Game.class.getResource("/uniminuto/POO/lupinIII/games/lupinIIINivel4.txt").getPath().replaceAll("%20", " "));
             
            newframe.setVisible(true);
           
            
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArchivoCorruptoException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Nivel4MouseClicked

    private void Nivel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nivel5MouseClicked
        nivel = 5;
        try {
            Game newframe = new Game(Game.class.getResource("/uniminuto/POO/lupinIII/games/lupinIIINivel5.txt").getPath().replaceAll("%20", " "));
             
            newframe.setVisible(true);
            
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArchivoCorruptoException ex) {
            Logger.getLogger(SeleccionNivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Nivel5MouseClicked

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
            java.util.logging.Logger.getLogger(SeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionNivel().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nivel1;
    public javax.swing.JLabel Nivel2;
    private javax.swing.JLabel Nivel3;
    private javax.swing.JLabel Nivel4;
    private javax.swing.JLabel Nivel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}