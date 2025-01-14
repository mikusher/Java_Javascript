/*
 * Copyright (C) 2017 Luis Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.banco.ferramenta.game;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Tavares
 */
public class ParImparGUI extends javax.swing.JFrame {

    private int valor;
    static final int NUM_OPCOES = 999;
    static final String OPC_PAR = "par";
    static final String OPC_IMPAR = "impar";
    static final String OPC_NULL = "null";
    JOptionPane jOp = new JOptionPane();

    /**
     * utils to use
     */
    public int escolha_do_computado() {
        Random randomGenerator = new Random();
        int randomNumber = (int) randomGenerator.nextInt(NUM_OPCOES);;
        return randomNumber;
    }

    public int nome_em_numero(String nome) {
        if (nome == OPC_PAR) {
            return 0;
        } else if (nome == OPC_IMPAR) {
            return 1;
        } else {
            return 2;
        }
    }

    public String numero_em_nome(int numero) {
        if (numero == 0) {
            return OPC_PAR;
        } else if (numero == 1) {
            return OPC_IMPAR;
        } else {
            return OPC_NULL;
        }
    }

    public int valor(int valorUtilizador) {
        valorUtilizador = Integer.parseInt(jtextnumero.getText());
        return valorUtilizador;
    }

    public void pedido_par() {
        if (jtextnumero.getText().equals("")) {
            JOptionPane jOp = new JOptionPane();
            jOp.showMessageDialog(null, "Por Favor, indique um numero valido!!");
        } else {
            par_ou_impar(OPC_PAR, valor(getValor()));
        }
    }

    public void pedido_impar() {
        if (jtextnumero.getText().equals("")) {
            jOp.showMessageDialog(null, "Por Favor, indique um numero valido!!");
        } else {
            par_ou_impar(OPC_IMPAR, valor(getValor()));
        }
    }

    public void imprimir_resultados(String escolhajogado, int valorjogador, int escolhapc) {
        System.out.println("O jogador escolheu " + escolhajogado);
        System.out.println("Valor do Jogador: " + valorjogador + " - Valor do computador: " + escolhapc);
    }

    public void par_ou_impar(String escolhajogador, int valorjogado) {
        int escolhapc = escolha_do_computado();
        int num_comparacao = nome_em_numero(escolhajogador);
        imprimir_resultados(escolhajogador, valorjogado, escolhapc);
        if ((valorjogado + escolhapc) % 2 == num_comparacao) {
            System.out.println("Parabens, você venceu! O resultado foi " + numero_em_nome(num_comparacao));
        } else {
            System.out.println("Owhoo, você perdeu! O resultado foi " + numero_em_nome((num_comparacao + 1) % 2));
            System.out.println("");
        }
    }

    public int getValor() {
        return valor;
    }

    /**
     * Creates new form ParImparGUI
     */
    public ParImparGUI() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jtextnumero = new javax.swing.JTextField();
        jButtonPar = new javax.swing.JButton();
        jButtonImpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAR / IMPAR");

        jLabel1.setText("Indica um Valor");

        jtextnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextnumeroKeyTyped(evt);
            }
        });

        jButtonPar.setText("PAR");
        jButtonPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParActionPerformed(evt);
            }
        });

        jButtonImpar.setText("IMPAR");
        jButtonImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImpar))
                    .addComponent(jtextnumero)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonImpar, jButtonPar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtextnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPar)
                    .addComponent(jButtonImpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonImpar, jButtonPar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParActionPerformed
        pedido_par();
    }//GEN-LAST:event_jButtonParActionPerformed

    private void jButtonImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImparActionPerformed
        pedido_impar();
    }//GEN-LAST:event_jButtonImparActionPerformed

    private void jtextnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextnumeroKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            // se o caractere digitado for um contido na String caracteres
            evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_jtextnumeroKeyTyped

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
            java.util.logging.Logger.getLogger(ParImparGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParImparGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParImparGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParImparGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParImparGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImpar;
    private javax.swing.JButton jButtonPar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtextnumero;
    // End of variables declaration//GEN-END:variables
}
