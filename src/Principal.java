public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Sinners";
        meuFilme.anoDeLancamento = 2025;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);

    }
}
