
package view;

import modelConnection.ConexaoDB;


public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoDB conecta = new ConexaoDB();
   
    
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInterno = new javax.swing.JPanel();
        jButtonFranquia = new javax.swing.JButton();
        jButtonFranqueado = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jLabelAgenda = new javax.swing.JLabel();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelGerenciamento = new javax.swing.JLabel();
        jButtonFecharPainel = new javax.swing.JButton();
        jLabelPlanoFundo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemFranquia = new javax.swing.JMenuItem();
        jMenuItemFranqueado = new javax.swing.JMenuItem();
        jMenuFerramenta = new javax.swing.JMenu();
        jMenuItemSistema = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jButtonFranquia.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButtonFranquia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFranquia.setForeground(new java.awt.Color(0, 0, 102));
        jButtonFranquia.setText("Franquia");
        jButtonFranquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFranquiaActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonFranquia);
        jButtonFranquia.setBounds(30, 60, 120, 23);

        jButtonFranqueado.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButtonFranqueado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFranqueado.setForeground(new java.awt.Color(0, 0, 102));
        jButtonFranqueado.setText("Franqueado");
        jPanelInterno.add(jButtonFranqueado);
        jButtonFranqueado.setBounds(190, 60, 120, 23);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AGENDA.png"))); // NOI18N
        jPanelInterno.add(jButtonAgenda);
        jButtonAgenda.setBounds(30, 160, 40, 40);

        jLabelAgenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(0, 0, 102));
        jLabelAgenda.setText("Agenda:");
        jPanelInterno.add(jLabelAgenda);
        jLabelAgenda.setBounds(30, 120, 60, 20);

        jLabelCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(0, 0, 102));
        jLabelCadastro.setText("Cadastro:");
        jPanelInterno.add(jLabelCadastro);
        jLabelCadastro.setBounds(30, 20, 80, 20);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conf1.png"))); // NOI18N
        jPanelInterno.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(-240, 0, 1030, 300);

        jInternalFrameBemVindo.getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(0, 30, 1000, 300);

        jLabelGerenciamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGerenciamento.setText("Sistema de Gerenciamento");
        jInternalFrameBemVindo.getContentPane().add(jLabelGerenciamento);
        jLabelGerenciamento.setBounds(0, 0, 330, 30);

        jButtonFecharPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharPainel.setToolTipText("Fechar tela");
        jButtonFecharPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharPainelActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharPainel);
        jButtonFecharPainel.setBounds(750, 0, 30, 30);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(100, 40, 800, 360);

        jLabelPlanoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PlanoFundoPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelPlanoFundo);
        jLabelPlanoFundo.setBounds(0, 0, 1020, 520);

        jMenuCadastro.setText("Cadastro");

        jMenuItemFranquia.setText("Franquia");
        jMenuItemFranquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFranquiaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFranquia);

        jMenuItemFranqueado.setText("Franqueado");
        jMenuCadastro.add(jMenuItemFranqueado);

        jMenuBar.add(jMenuCadastro);

        jMenuFerramenta.setText("Ferramenta");

        jMenuItemSistema.setText("Sistema Gerenciamento");
        jMenuItemSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSistemaActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jMenuItemSistema);

        jMenuBar.add(jMenuFerramenta);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(1032, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharPainelActionPerformed
       jInternalFrameBemVindo.dispose();
        
        
        
    }//GEN-LAST:event_jButtonFecharPainelActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSistemaActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItemSistemaActionPerformed

    private void jMenuItemFranquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFranquiaActionPerformed
        FormFranquia tela = new FormFranquia();
        tela.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItemFranquiaActionPerformed

    private void jButtonFranquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFranquiaActionPerformed
        FormFranquia tela = new FormFranquia();
        tela.setVisible(true);
          
    }//GEN-LAST:event_jButtonFranquiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonFecharPainel;
    private javax.swing.JButton jButtonFranqueado;
    private javax.swing.JButton jButtonFranquia;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelGerenciamento;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelPlanoFundo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramenta;
    private javax.swing.JMenuItem jMenuItemFranqueado;
    private javax.swing.JMenuItem jMenuItemFranquia;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSistema;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}
