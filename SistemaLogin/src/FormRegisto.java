
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormRegisto extends javax.swing.JFrame {
    
    public static Scanner ler = new Scanner(System.in);
    public static String pass;
    public static String login;
    
    public FormRegisto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctxRePassword = new javax.swing.JPasswordField();
        ctxPassword = new javax.swing.JPasswordField();
        ctxTelefone = new javax.swing.JTextField();
        ctxMorada = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();
        ctxNome = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ctxNif = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ctxLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Registo de Utilizadores");

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Morada");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Reescreva Password");

        ctxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxPasswordActionPerformed(evt);
            }
        });

        ctxMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxMoradaActionPerformed(evt);
            }
        });

        ctxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxEmailActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("VALIDAR DADOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Registo de Utilizador");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("NIF");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Login");

        ctxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addGap(93, 93, 93)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ctxPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(ctxEmail)
                                    .addComponent(ctxMorada)
                                    .addComponent(ctxTelefone)
                                    .addComponent(ctxNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(ctxNif, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ctxLogin)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel7)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctxNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        this.dispose();  //fecha a janela atual
        log.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mensagemErro(String erro){
        JOptionPane.showMessageDialog(null, erro, "Erro validação", JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String telefone = ctxTelefone.getText();
        String nif = ctxNif.getText();
        login = ctxLogin.getText();
        pass = ctxPassword.getText();
        String rePass = ctxRePassword.getText();
        if(nome.equals("")|| email.equals("")|| morada.equals("")|| telefone.equals("")|| nif.equals("") || pass.equals("") || rePass.equals("")){
            mensagemErro("Preencha todos os campos");   
        }
        else if(!validaCampoNumerico(telefone)){
                mensagemErro("O campo telefone tem de ser numerico e ter 9 digitos");   
            }
        else if(!validaCampoNumerico(nif)){
                mensagemErro("O campo nif tem de ser numerico e ter 9 digitos");
        }
        else if(!validaCampoAlfabeto(nome)){
                mensagemErro("O campo nome tem que conter letras e ter mais de 2 letras");
        }
        else if(!validaCampoEmail(email)){
                mensagemErro("O campo email tem que conter um @ e deve conter um . depois do @");
       }
        else if(!validaCampoPass(pass)){
                mensagemErro("O campo password tem que conter pelo menos uma letra maiuscula e uma letra minuscula, ter mais de 8 caracteres, pelo menos um algarismo e pelo menos um caracter especial");
        }
        else if(!validaCampoMorada(morada)){
                mensagemErro("O campo morada tem que conter letras e ter mais de 5 letras");
            }
        else if (!pass.equals(rePass)){
            mensagemErro("As passawords não coincidem");                                                                                                                                                                                                                                                                                                                                                                                                                                     
        }
        
        else{   
        File ficheiro = new File(login+".txt");
       
        try {
         if(!ficheiro.exists()){
            ficheiro.createNewFile();
            
        }
        FileWriter fw = new FileWriter(ficheiro);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(pass);
                bw.newLine();
                bw.write("Login: "+login);
                bw.newLine();
                bw.write("Nome: "+nome);
                bw.newLine();
                bw.write("Email: "+email);
                bw.newLine();
                bw.write("Morada: "+morada);
                bw.newLine();
                bw.write("Telefone: "+telefone);
                bw.newLine();
                bw.write("Nif: "+nif);
                bw.close();
                fw.close();
                
                LigaBD.registaUtilizador(nome, email, morada, Integer.parseInt(telefone),  Integer.parseInt(nif) , login, pass);
                
                Login lo = new Login();
                this.setVisible(false);
                lo.setVisible(true);
                
        }catch (IOException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(FormRegisto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginActionPerformed

    }//GEN-LAST:event_ctxLoginActionPerformed

    private void ctxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxEmailActionPerformed

    private void ctxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxPasswordActionPerformed
        // TODO add yur handling code here:
    }//GEN-LAST:event_ctxPasswordActionPerformed

    private void ctxMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxMoradaActionPerformed

    }//GEN-LAST:event_ctxMoradaActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxLogin;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNif;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JPasswordField ctxRePassword;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private boolean validaCampoNumerico(String valor) {
        int x, contador=0, t = valor.length();
        char c;
        if(t!=9)
            return false;
        else{
            for(x=0;x<t;x++){
                c = valor.charAt(x);
                if(isDigit(c))
                    contador++;
            }
            if(t!=contador)
                return false;
        }
        return true;
    }

    private boolean validaCampoAlfabeto(String nome) {
        int x, contador=0, t = nome.length();
        char c;
        if(t<2)
            return false;
        else{
            for(x=0;x<t;x++){
                c = nome.charAt(x);
                if(isLetter(c))
                    contador++;
            }
            if(t!=contador)
                return false;
        }
        return true;
    }
    
    private boolean validaCampoEmail(String email) {
        int x, contador=0, t = email.length();
        if (email.contains(String.valueOf('@')) && (email.contains(String.valueOf('.'))))
            return true;
        return false;
        
}

    private boolean validaCampoPass (String pass) {
        int x,  t = pass.length() ;
        char c;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = false;

    for (x = 0; x < t; x++) {
        c = pass.charAt(x);
        if(t<8){
            return false;
        }
          else if (Character.isDigit(c)) {
            numberPresent = true;
        } else if (Character.isUpperCase(c)) {
            upperCasePresent = true;
        } else if (Character.isLowerCase(c)) {
            lowerCasePresent = true;
        } else if (specialChars.contains(String.valueOf(c))) {
            specialCharacterPresent = true;
        }
    }
        if(numberPresent==true && upperCasePresent==true && lowerCasePresent==true && specialCharacterPresent==true){
            
    
        return true;
        }
        return false;
        
}
    
    private boolean validaCampoMorada(String morada) {
       int y, contador = 0, mo = morada.length();
       char c;
       if(mo<5)
           return false;
       else{
           for (y=0;y<mo;y++){
               c = morada.charAt(y);
               if(isLetter(c))
                   contador++;
           }
       }
       return true;
    }
    
}