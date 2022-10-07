public class SaidaPS2 extends Saida<ConexaoPS2>   {
    @Override
    public String conecta(ConexaoPS2 conexao) {
        return conexao.obtemconexao() + getNomeConexao();
    }

    @Override
    public String getNomeConexao() {
        return "Conexao PS2";
    }
}
