public class Adaptador extends SaidaUSB {
    public String conecta(ConexaoPS2 conexaoPS2){
        return conexaoPS2.obtemconexao() + getNomeConexao();
    }
}
