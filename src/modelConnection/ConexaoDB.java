
package modelConnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoDB {
    
    public Statement stm;
    public ResultSet rs;
    String driver = "org.postgresql.Driver";
    String caminho = "jdbc:postgresql://localhost:5432/ProjetoTCC";
    String usuario = "postgres";
    String senha = "328932";
    public Connection con;
    
    
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
           // JOptionPane.showMessageDialog(null,"Conexão efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados:\n" 
                                          + ex.getMessage());
           
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ExecutaSql:\n" + ex.getMessage());
                   
        }
       
    }
    

    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null,"Banco de dados desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar conexão com o banco de dados:\n"
                                          + ex.getMessage());
            
            
            
        }
   
        
    }

}

