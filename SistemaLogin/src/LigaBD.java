
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LigaBD {
    
    public static Connection ligacao(){
        String url = "jdbc:mysql://localhost:3306/rhcencal?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection liga = null;
        try {
            liga = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro na tentativa de ligação á base de dados");
        }
        return liga;
    }
    public static void registaUtilizador(String nome, String email, String morada, int telefone, int nif, String login, String pass)throws SQLException{
  
        String query = "Insert Into utilizador(nome,email,morada,telefone,nif,login,password)"
        + "VALUES (?,?,?,?,?,?,?)";
        Connection liga = ligacao();
        PreparedStatement ps = liga.prepareStatement(query);
        
        ps.setString(1,nome);
        ps.setString(2,email);
        ps.setString(3,morada);
        ps.setInt(4,telefone);
        ps.setInt(5,nif);
        ps.setString(6,login);
        ps.setString(7,pass);
        ps.execute();
    }

    static void atualizaUtilizador(String nome, String email, String morada, String telefone, String nif, String login ,String pass) {
        
        String sql = "UPDATE utilizador SET nome=?,email=?,morada=?, telefone=?,nif=?,password=? WHERE login=?";
        Connection conn = LigaBD.ligacao();
        PreparedStatement ps; 
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2,email);
            ps.setString(3,morada);
            ps.setInt(4,Integer.parseInt(telefone));
            ps.setInt(5,Integer.parseInt(nif));
            ps.setString(6,pass);
            ps.setString(7,login);
            int retorno = ps.executeUpdate();
        if(retorno>0){
            System.out.println("Novo registo alterado");   
        }else{
            System.out.println("Não foi possivel alterar os registos");
        }

        }catch (SQLException ex) {
            Logger.getLogger(LigaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void remove(String p) {
        Connection con = ligacao();
        try {
            PreparedStatement ps = con.prepareStatement(p);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LigaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}