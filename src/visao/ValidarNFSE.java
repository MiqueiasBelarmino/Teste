package visao;

import dao.NFSEDao;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.NFSE;
import util.Conexao;

/**
 *
 * @author Miquéias
 */
public class ValidarNFSE extends javax.swing.JFrame {

    /**
     * Creates new form ValidarNFSE
     */
    private NFSE nfse = null;
    private JFileChooser arquivo;

    public ValidarNFSE() {
        initComponents();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/img/logo.png")));
        Conexao.db_host = "OX_SERVIDOR";//define o host de conexão uma vez que não há implementação de escolha dinamica
        txtNotaInterna.requestFocus();//define o foco no campo Nota Interna
        txtAreaResultados.setText("Conectado com sucesso. Host: " + Conexao.getHost());
        txtNotaExterna.setEnabled(false);
        btnCorrigir.setEnabled(false);
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
        txtNotaInterna = new javax.swing.JTextField();
        txtNotaExterna = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        comboEmpresa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVerificar = new javax.swing.JButton();
        btnCorrigir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnXML = new javax.swing.JButton();
        labelXMLOrigem = new javax.swing.JLabel();
        labelXMLDestino = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Validador de Nota Fiscal de Serviço - Oxetil");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        txtNotaInterna.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Nota Interna *"));
        txtNotaInterna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotaInternaKeyPressed(evt);
            }
        });

        txtNotaExterna.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Nota Externa*"));
        txtNotaExterna.setEnabled(false);
        txtNotaExterna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotaExternaKeyPressed(evt);
            }
        });

        txtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo do Cliente"));
        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoClienteKeyPressed(evt);
            }
        });

        comboEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OXETIL", "MAC", "CLEAN", "TECSTERIL", "STERIL SUL" }));
        comboEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        jLabel1.setText("* -  Obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotaExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotaExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnVerificar.setText("Verificar Nota Interna");
        btnVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarMouseEntered(evt);
            }
        });
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        btnVerificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVerificarKeyPressed(evt);
            }
        });

        btnCorrigir.setText("Corrigir Nota");
        btnCorrigir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorrigirMouseEntered(evt);
            }
        });
        btnCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigirActionPerformed(evt);
            }
        });
        btnCorrigir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCorrigirKeyPressed(evt);
            }
        });

        btnBuscar.setText("Detalhar Nota Interna");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        btnXML.setText("Buscar XML");
        btnXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXMLMouseEntered(evt);
            }
        });
        btnXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXMLActionPerformed(evt);
            }
        });

        labelXMLOrigem.setText("XML Origem:");

        labelXMLDestino.setText("XML Destino:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXML)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCorrigir))
                    .addComponent(labelXMLOrigem)
                    .addComponent(labelXMLDestino))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXML, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelXMLOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelXMLDestino)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        txtAreaResultados.setEditable(false);
        txtAreaResultados.setColumns(20);
        txtAreaResultados.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNotaExternaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaExternaKeyPressed
        txtNotaExterna.setEditable(numberInputVerifier(txtNotaExterna, evt));//validação para aceitar digitação apenas de numeros
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnVerificar.requestFocus();
        }
    }//GEN-LAST:event_txtNotaExternaKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void txtCodigoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//verificação de tecla para mudar foco para próximo campo com o enter
            txtNotaInterna.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoClienteKeyPressed

    private void txtNotaInternaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaInternaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//verificação de tecla para mudar foco para próximo campo com o enter
            txtNotaExterna.requestFocus();
        }
    }//GEN-LAST:event_txtNotaInternaKeyPressed

    private void btnVerificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerificarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//verificação de tecla para acionar Ação do botão "btnVerificar"
            btnVerificarActionPerformed(null);
        }
    }//GEN-LAST:event_btnVerificarKeyPressed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        txtNotaExterna.setText("");
        String res = "";
        if (vazio()) {
            JOptionPane.showMessageDialog(null, "Nº da Nota Interna é obrigatório");
        } else {
            txtAreaResultados.setText(txtAreaResultados.getText() + "\n------------------------- Verificar Nota Interna -------------------------");
            popularNFSE();
            txtAreaResultados.setText(txtAreaResultados.getText() + "\nEmpresa: " + comboEmpresa.getSelectedItem() + " | Nota Interna: " + txtNotaInterna.getText());
            res = NFSEDao.verificar(nfse.getNumeroInterno(), nfse.getCodigoEmpresa());

            if ("null".equals(res)) {
                JOptionPane.showMessageDialog(null, "Nota não consta no banco de dados");
                txtAreaResultados.setText(txtAreaResultados.getText() + "\nNota não consta no banco de dados");
                txtNotaExterna.setEnabled(true);
                btnBuscar.setEnabled(true);
                txtNotaExterna.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Nota já consta no banco de dados");
                txtAreaResultados.setText(txtAreaResultados.getText() + "\nNota já consta no banco de dados");
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigirActionPerformed
        String nota = txtNotaExterna.getText().trim();
        int valor = Integer.parseInt(nota);
        if (nota.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Nº da nota externa");
        } else {

            txtAreaResultados.setText(txtAreaResultados.getText() + "\n---------------------------------- Corrigir Nota ----------------------------------");
            try {
                NFSEDao.corrigir(nfse, valor);
                txtAreaResultados.setText(txtAreaResultados.getText() + "\nCorreção efetuada com sucesso");
            } catch (Exception e) {
                txtAreaResultados.setText(txtAreaResultados.getText() + "\nFalha na correção");
            }
            txtNotaExterna.setEnabled(false);
            btnCorrigir.setEnabled(false);

        }
    }//GEN-LAST:event_btnCorrigirActionPerformed

    private void btnCorrigirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCorrigirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorrigirKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valor = txtNotaInterna.getText().trim();
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nº da Nota Interna obrigatório");
        } else {
            int interno = Integer.parseInt(valor);
            nfse = new NFSE();
            nfse = NFSEDao.localizar(interno, (comboEmpresa.getSelectedIndex() + 1));
            txtCodigoCliente.setText("" + nfse.getClienteCodigo());
            txtNotaExterna.setText("" + nfse.getNumeroExterno());
            txtNotaInterna.setText("" + nfse.getNumeroInterno());
            btnVerificar.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXMLActionPerformed
        arquivo = new JFileChooser("C:\\Users\\Rafael\\Downloads");//cria um seletor de arquivo
        FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Arquivos XML", "xml");//cria um filtro de extenção e define apenas xml
        arquivo.addChoosableFileFilter(filtroPDF);
        arquivo.setAcceptAllFileFilterUsed(false);

        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            labelXMLOrigem.setText("XML Origem: " + arquivo.getSelectedFile().getAbsolutePath());
            labelXMLDestino.setText("XML Destino: "+txtNotaExterna.getText().trim() + "2-nfse.xml");
            btnCorrigir.setEnabled(true);
            txtAreaResultados.setText(txtAreaResultados.getText() + "\n------------------------------------- Buscar XML -------------------------------------");
            txtAreaResultados.setText(txtAreaResultados.getText() + "\n" + arquivo.getSelectedFile().getAbsolutePath());
            try {
                File origem = new File(arquivo.getSelectedFile().getAbsolutePath());
                File dir = null;
                switch (comboEmpresa.getSelectedItem().toString()) {
                    case "OXETIL": {
                        dir = new File("\\\\OX_Servidor\\E\\Nota Fiscal Eletronica NFSE\\74554189000109\\NFSE\\");
                    }
                    case "MAC": {
                        dir = new File("\\\\OX_Servidor\\E\\Nota Fiscal Eletronica NFSE\\01651135000180\\NFSE\\");
                    }
                }

                // move o arquivo para o novo diretorio
                boolean ok = origem.renameTo(new File(dir,txtNotaExterna.getText().trim() + "2-nfse.xml"));
                if (ok) {
                    txtAreaResultados.setText(txtAreaResultados.getText() + "\nArquivo foi movido com sucesso");
                } else {
                    System.out.println("");
                    txtAreaResultados.setText(txtAreaResultados.getText() + "\nNão foi possível mover o arquivo");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao mover arquivo XML.\nEntre em contato com o Departamento de TI.\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnXMLActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setToolTipText("Mostra algumas informações da nota");
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnVerificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseEntered
        btnVerificar.setToolTipText("Verifica se a nota interna possui Nº externo");
    }//GEN-LAST:event_btnVerificarMouseEntered

    private void btnXMLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMLMouseEntered
        btnXML.setToolTipText("Indica o arquivo XML da nota externa");
    }//GEN-LAST:event_btnXMLMouseEntered

    private void btnCorrigirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrigirMouseEntered
        btnCorrigir.setToolTipText("Efetua correção da nota interna");
    }//GEN-LAST:event_btnCorrigirMouseEntered

    private boolean vazio() {
        return /*txtCodigoCliente.getText().trim().isEmpty() 
                && */ txtNotaExterna.getText().trim().isEmpty()
                && txtNotaInterna.getText().trim().isEmpty();
    }

    private void popularNFSE() {

        String codigoCliente = txtCodigoCliente.getText().trim();
        int resultado = 0;

        nfse = new NFSE();
        nfse.setCodigoEmpresa(comboEmpresa.getSelectedIndex() + 1);
        if (!codigoCliente.isEmpty()) {
            resultado = Integer.parseInt(txtCodigoCliente.getText().trim());
        }
        nfse.setClienteCodigo(resultado);
        resultado = 0;

        if (!txtNotaInterna.getText().isEmpty()) {
            resultado = Integer.parseInt(txtNotaInterna.getText().trim());
        }
        nfse.setNumeroInterno(resultado);
        resultado = 0;

        if (!txtNotaExterna.getText().isEmpty()) {
            resultado = Integer.parseInt(txtNotaExterna.getText().trim());
        }
        nfse.setNumeroExterno(resultado);
    }

    private boolean numberInputVerifier(Component j, KeyEvent evt) {
        String value = "";
        JTextField txt;

        if ((j instanceof JTextField) || (j instanceof JTextField)) {
            txt = (JTextField) j;
            value = txt.getText();
        }

        return (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')
                || (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                || (evt.getKeyCode() == KeyEvent.VK_DELETE);
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
            java.util.logging.Logger.getLogger(ValidarNFSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarNFSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarNFSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarNFSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidarNFSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCorrigir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnXML;
    private javax.swing.JComboBox<String> comboEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelXMLDestino;
    private javax.swing.JLabel labelXMLOrigem;
    private javax.swing.JTextArea txtAreaResultados;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNotaExterna;
    private javax.swing.JTextField txtNotaInterna;
    // End of variables declaration//GEN-END:variables
}
