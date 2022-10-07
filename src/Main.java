public class Main {
    public static void main(String[] args) {
       SaidaUSB su = new SaidaUSB();
       ConexaoPS2 cp = new ConexaoPS2();
       ConexaoUSB cu = new ConexaoUSB();
       Adaptador adaptador = new Adaptador();

       System.out.println(adaptador.conecta(cp));
    }
}