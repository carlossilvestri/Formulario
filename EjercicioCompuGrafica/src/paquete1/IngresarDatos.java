/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class IngresarDatos extends javax.swing.JFrame {

    //Declaracion de variables:
    String nombre, edadString = "";
    int edadInt = 0;
    boolean seleccionasteRadio = false;
    int contador = 0;

    /**
     * Creates new form IngresarDatos
     */
    public IngresarDatos() {
        initComponents();
        //Centrar la interfaz
        this.setLocationRelativeTo(null);
        //Agregar los radios al buttonGroup
        buttonGroup1.add(hombre);
        buttonGroup1.add(mujer);
        //Cambiar a transparente el fondo de los textfield
        txtNombre.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtEdad.setBackground(new java.awt.Color(0, 0, 0, 1));


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
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        enviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensaje");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(91, 77, 77));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre Completo");
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 240, 30));

        txtEdad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(91, 77, 77));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setText("Edad");
        txtEdad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdadFocusGained(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 71, 30));
        getContentPane().add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 20, -1));
        getContentPane().add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 20, -1));

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete1/imagenes/btnEnviar.png"))); // NOI18N
        enviar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete1/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
//Obtener los datos:
        nombre = txtNombre.getText();
        edadString = txtEdad.getText().trim();
        boolean error = false;
        String sexo = "";
        //Identificar si la edad es valida
        try {
            edadInt = Integer.parseInt(edadString);
            error = false;
        } catch (Exception e) {
            //Entonces no ingreso una edad valida.
            error = true;
        }
        //Validar si se oprimio un boton de radio:
        if (hombre.isSelected()) {
            seleccionasteRadio = true;
            sexo = "hombre";
        } else if (mujer.isSelected()) {
            seleccionasteRadio = true;
            sexo = "mujer";
        } else {
            seleccionasteRadio = false;
        }
//Mas validaciones
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Nombre no válido.");
        } else if (nombre.equals("Nombre Completo")) {
            JOptionPane.showMessageDialog(rootPane, "Nombre no válido.");
        } else if (error == true) {
            JOptionPane.showMessageDialog(rootPane, "Edad no válida");
        } else if (!seleccionasteRadio) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un sexo.");
        } else if (seleccionasteRadio) {
            JOptionPane.showMessageDialog(null, " ¡Hola " + nombre + "! Tienes " + String.valueOf(edadInt) + " y eres " + sexo + ". ");
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        contador++;
        if (contador > 1) {
            //Eliminar el texto que este en el txtNombre:
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        //Eliminar el texto que este en el txtEdad:
        txtEdad.setText("");
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyPressed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        /*VALIDAR: que en el textbox no se ingresen letras.*/
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");

        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        /*VALIDAR: que en el textbox no se ingresen números.*/
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
        // Cuando el mouse esta dentro del boton entonces cambiar el color del boton enviar:
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete1/imagenes/btnEnviarHover.png")));

    }//GEN-LAST:event_enviarMouseEntered

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
        // Cuando el mouse esta dentro del boton entonces cambiar el color del boton enviar:
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete1/imagenes/btnEnviar.png")));
    }//GEN-LAST:event_enviarMouseExited

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
                String textoNombre = "";
                textoNombre = txtNombre.getText();
        if (textoNombre.equals("Nombre Completo")) {
            //Eliminar el texto que este en el txtNombre:
            txtNombre.setText("");
        }
        System.out.println("Click");
    }//GEN-LAST:event_txtNombreMouseClicked

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
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton enviar;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
