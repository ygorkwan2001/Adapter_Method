public class SaidaUSB extends Saida<ConexaoUSB> {
    @Override
    public String conecta(ConexaoUSB conexao) {
        return conexao.obtemconexao() + getNomeConexao();
    }

    @Override
    public String getNomeConexao() {
        return "Conexao USB";
    }
}
