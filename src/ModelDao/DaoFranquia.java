
package ModelDao;

import modelConnection.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBeans.BeansFranquia;


public class DaoFranquia {
    
    ConexaoDB conex = new ConexaoDB();
    BeansFranquia model = new BeansFranquia();
    
    public void Salvar(BeansFranquia model){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into franquias (nome_franquia,segmento_franquia) values(?,?)");
            pst.setString(1, model.getNome());
            pst.setString(2, model.getSegmento());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados\nErro: " + ex);
        }
        
        conex.desconecta();
        
    }
     
    public void Editar(BeansFranquia model){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update franquias set nome_franquia=?, segmento_franquia=? where cod_franquia=?");
            pst.setString(1,model.getNome());
            pst.setString(2,model.getSegmento());
            pst.setInt(3, model.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro na alteração dos dados\nErro: " + ex);
        }
            
         conex.desconecta();
        
    }
   
    
    public void Excluir(BeansFranquia model){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from franquias where cod_franquia=?");
            pst.setInt(1, model.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluídos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados\nErro: " + ex);
        }
        
        conex.desconecta();
    }
    
    public BeansFranquia buscaFranquia(BeansFranquia model){
        conex.conexao();
        conex.executaSql("select *from franquias where nome_franquia like'%" + model.getPesquisa()+"%'");
        try {
            conex.rs.first();
            model.setCodigo(conex.rs.getInt("cod_franquia"));
            model.setNome(conex.rs.getString("nome_franquia"));
            model.setSegmento(conex.rs.getString("segmento_franquia"));
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao franquia!\n Erro: " + ex);
           
        }
        
        conex.desconecta();
        return model;
        
    }
    
}
