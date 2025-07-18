/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteController;
import controller.TimeController;
import interdisciplinar.Cliente;
import interdisciplinar.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author yurib
 */
public class Editar extends javax.swing.JFrame {

    /**
     * Creates new form Editar
     */
    
    private List<String> listarTimes = new ArrayList<>();
    
    private void carregarTimesComboBox() {
    TimeController controller = new TimeController();
    listarTimes = controller.listarTimes();
    comboBoxTime.removeAllItems();
    for (String nomeTime : listarTimes) {
    comboBoxTime.addItem(nomeTime);
    CampoEmail.setText(Cliente.clienteLogado.getEmail());
    CampoNome.setText(Cliente.clienteLogado.getNome());
    String Time = Cliente.clienteLogado.getNomeTime();
    comboBoxTime.setSelectedItem(Time);
    }
}
    

    public Editar() {
    initComponents();
    carregarTimesComboBox();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        CampoNome = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxTime = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CampoSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Confirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        comboBoxTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Futebol:");

        CampoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        Voltar.setForeground(new java.awt.Color(255, 51, 51));
        Voltar.setText("Voltar");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar)
                .addContainerGap(563, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Confirmar)))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Confirmar)
                .addGap(37, 37, 37)
                .addComponent(Voltar)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>                        

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    String novoNome = CampoNome.getText();
    String novaSenha = CampoSenha.getText();
    String nomeSelecionado = (String) comboBoxTime.getSelectedItem();  // Nome do time escolhido

    
    Cliente cliente = Cliente.clienteLogado;
    
    ClienteController controle = new ClienteController();
    boolean sucesso = controle.alterarCliente(cliente.getEmail(), novoNome, novaSenha, nomeSelecionado);

    if (sucesso) {
        JOptionPane.showMessageDialog(this, "Alterações salvas com sucesso!");
        cliente.setNome(novoNome);
        cliente.setCSenha(novaSenha);
        cliente.setNomeTime(nomeSelecionado);
        
        Cliente.clienteLogado = cliente;
        
        InicioLogado tela = new InicioLogado(cliente.getNome());
        tela.setVisible(true);
        this.dispose(); // Fecha tela
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao salvar alterações.");
    }

        // TODO add your handling code here:
    }                                         

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        InicioLogado tela = new InicioLogado(Cliente.clienteLogado.getNome());
        tela.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }                                   

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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoSenha;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Voltar;
    private javax.swing.JComboBox<String> comboBoxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}
