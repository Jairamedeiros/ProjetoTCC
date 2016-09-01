
package modelBeans;


public class BeansFranquia {
    
    private int codigo;
    private String nome;
    private String segmento;
    private String pesquisa;
  
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getSegmento() {
        return segmento;
    }

  
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
       
    
}
