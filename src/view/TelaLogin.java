
package view;

import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelImagemLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAcessar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(70, 160, 90, 23);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(77, 23));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(77, 23));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(77, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(190, 160, 90, 23);

        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(70, 100, 60, 30);

        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 50, 50, 30);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(130, 50, 150, 30);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(130, 100, 150, 30);

        jLabelImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sicad.png"))); // NOI18N
        jLabelImagemLogin.setToolTipText("");
        getContentPane().add(jLabelImagemLogin);
        jLabelImagemLogin.setBounds(0, 0, 400, 350);

        setSize(new java.awt.Dimension(412, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(jTextFieldUsuario.getText().equals("jaira")&& jPasswordFieldSenha.getText().equals("123")){       
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
        
        }else{        
            JOptionPane.showMessageDialog(rootPane, "Usuário ou senha inválidos!");
        
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       System.exit(0);
      
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelImagemLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
