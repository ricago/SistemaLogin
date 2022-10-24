
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EditaUser extends javax.swing.JFrame {

    
    public EditaUser(){
        initComponents();
            preencheFormulario();
            preencheBD();
        }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctxMorada = new javax.swing.JTextField();
        ctxNif = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ctxPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        ctxRePassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctxRegisto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ctxTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ctxNome = new javax.swing.JTextField();
        ctxUser = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctxMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxMoradaActionPerformed(evt);
            }
        });

        ctxNif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxNifActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Alterar dados de utilizador");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("NIF");

        ctxRegisto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ctxRegisto.setForeground(new java.awt.Color(0, 102, 204));
        ctxRegisto.setText("Registar Utilizador");
        ctxRegisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxRegistoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Morada");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Reescreva Password");

        ctxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxTelefoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Login");

        ctxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxNomeActionPerformed(evt);
            }
        });

        ctxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxUserActionPerformed(evt);
            }
        });

        ctxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctxRegisto)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ctxUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctxNome)
                            .addComponent(ctxEmail)
                            .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctxNif, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxNif, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ctxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctxMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxMoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxMoradaActionPerformed

    private void ctxNifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxNifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxNifActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
  public static void mensagemErro(String erro){
        JOptionPane.showMessageDialog(null, erro, "Erro validação", JOptionPane.ERROR_MESSAGE);
    } 
    
    private void ctxRegistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxRegistoActionPerformed
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String telefone = ctxTelefone.getText();
        String nif = ctxNif.getText();
        String pass = ctxPassword.getText();
        String rePass = ctxRePassword.getText();
        String login = ctxUser.getText();
        if(nome.equals("") || morada.equals("")||telefone.equals("")||nif.equals("")|| pass.equals("")|| rePass.equals("")){
            mensagemErro("Preencha todos os campos");

        }else{
            if(!validaNome(nome))
            mensagemErro("Nome só pode conter mais de 2 letras");

            if(!validaCampoNumerico(telefone)){//! negação
                mensagemErro("O campo telefone " + "de ser numérico e ter 9 digitos");
            }
            if(!validaCampoNumerico(nif)){//! negação
                mensagemErro("O  " + "de ser numérico e ter 9 digitos");
            }

            if(!validaMorada(morada))
            mensagemErro("Morada tem de ter mais de 5 caracteres");

            if(!validaEmail(email))
            mensagemErro("Email inválido");
            if(!validaPass(pass))
            mensagemErro("password inválida.Tem de ter 8 caracteres e pelos menos:1 maiuscula,1 minuscula e 1 caracter especial");
            if(!pass.equals(rePass))
            mensagemErro("passwords têm de coincidir");
        }
        
        File ficheiro = new File(login+".txt");

        try {
            if(!ficheiro.exists()){
                ficheiro.createNewFile();
            }
            FileWriter fw = new FileWriter(ficheiro);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(pass);
            bw.newLine();
            bw.write(rePass);
            bw.newLine();
            bw.write(nome);
            bw.newLine();
            bw.write(email);
            bw.newLine();
            bw.write(morada);
            bw.newLine();
            bw.write(telefone);
            bw.newLine();
            bw.write(nif);
            bw.newLine();
            bw.write(login);
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(FormRegisto.class.getName()).log(Level.SEVERE, null, ex);
        }
        LigaBD.atualizaUtilizador(nome,email,morada,telefone,nif,pass);

    }//GEN-LAST:event_ctxRegistoActionPerformed

    private void ctxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxTelefoneActionPerformed

    private void ctxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxNomeActionPerformed

    private void ctxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxUserActionPerformed

    private void ctxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxEmailActionPerformed

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
            java.util.logging.Logger.getLogger(EditaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new EditaUser().setVisible(true);
                
                }
            
        });
    }
    private void preencheFormulario() {
    int cont = 0;
    String[] lista = new String [8];
    FileReader fr;
    
           
        try {
            fr = new FileReader(Login.login+".txt");
             BufferedReader br = new BufferedReader(fr);
            while (br.ready()){
                lista[cont] = br.readLine();
                cont ++;
            }
                ctxPassword.setText(lista[0]);
                ctxRePassword.setText(lista[1]);
                ctxNome.setText(lista[2]);
                ctxEmail.setText(lista[3]);
                ctxMorada.setText(lista[4]);
                ctxTelefone.setText(lista[5]);
                ctxNif.setText(lista[6]);
                ctxUser.setText(lista[7]);
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EditaUser.class.getName()).log(Level.SEVERE, null, ex);
        
   
               } catch (IOException ex) {
            Logger.getLogger(MenuOpcoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNif;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JPasswordField ctxRePassword;
    private javax.swing.JButton ctxRegisto;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JTextField ctxUser;
    private javax.swing.JButton jButton1;
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

    private boolean validaNome(String nome) {
        
        int x, contador=0, n = nome.length();
        char c;
        if(n<2)
            return false;
        else{
            for (x=0;x<n;x++){
                c = nome.charAt(x);
                if(isLetter(c))
                    contador++;  
                        
        }
        if(n!=contador)
                return false;    
    }
    return true;         
        
    }
        
               
    private boolean validaCampoNumerico(String telefone) {
        
        int x, contador=0, t = telefone.length();
        char c;
        if(t!=9)
            return false;
        else{
            for(x=0;x<t;x++){
                c = telefone.charAt(x);
                if(isDigit(c))
                    contador++;       
            }
            if(t!=contador)
                return false;
        }
        return true;
        
    }

    private boolean validaMorada(String morada) {
        
        int x, contador=0, n = morada.length();
        char c;
        if(n<6)
            return false;
        else{
            for (x=0;x<n;x++){
                c = morada.charAt(x);
                if(isLetter(c))
                    contador++;
                }
        if(n!=contador)
                return false;    
    }
    return true;   
        
    }

    private boolean validaEmail(String email) {
       
        int k,z,p; 
                
        k = email.indexOf("@");
        if (k==-1)
            return false;
        z = email.indexOf('.');
        if (z==-1)
            return false;
        //p =email.indexOf('@','k');
        String nova = email.substring(k+1,email.length());
        p= nova.indexOf('@');
        //System.out.println("texto: "+nova+" p: "+p+" K: "+k);
        if  (p==-1)
            return true;
        else
            return false;
        
    }

    private boolean validaPass(String pass) {
        
        int x;
        int numeros=0;
        int maiusculas=0;
        int minusculas=0;
        int especiais=0;
        
        char c;
        if (pass.length()<8)
                return false;
        else{
        for(x=0;x<pass.length();x++){
            c = pass.charAt(x);    
            if(c==' ')        //verificação espaços
                return false;
            if (!isDigit(c) && !isLetter(c))
                especiais++;
            if(isDigit(c))//verificação números
                numeros++;
                
            if (isUpperCase(c))//verificação maiúsculas
                maiusculas++;
            
            if (isLowerCase(c))//verificação minusculas
                minusculas++;
        }    
            if ((numeros<1) || (maiusculas<1) || (minusculas<1) || (especiais<1))
                    return false;
                
        }
        return true;
    }

    private void preencheBD(){
        Connection conn = LigaBD.ligacao();
            java.sql.Connection c = LigaBD.ligacao(); 
        String sql = "SELECT * FROM utilizador WHERE login = '"+Login.login+"'"; 
        PreparedStatement ps;
        
        try {
            ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 
         
        while(rs.next()){ 
            ctxNome.setText(rs.getString(2)); 
            ctxEmail.setText(rs.getString(3)); 
            ctxMorada.setText(rs.getString(4)); 
            ctxTelefone.setText(""+rs.getInt(5)); 
            ctxNif.setText(""+rs.getInt(6)); 
            ctxUser.setText(rs.getString(7)); 
            ctxPassword.setText(rs.getString(8));
            ctxRePassword.setText(rs.getString(8));
             
        }
        } catch (SQLException ex) {
            Logger.getLogger(EditaUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            
             }
}
