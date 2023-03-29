public class ContaBuilder {

    private int saldoLivre;
    private int saldoInvestimento;
    private long numConta;
    private String nomeCorrentista;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;

    public static class Builder {
        private long numConta;
        private String nomeCorrentista;
        private int saldoLivre = 0;
        private int saldoInvestimento = 0;
        private double taxaRemuneracao = 0;
        private double taxaSaldoNegativo = 0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(long numConta, String nomeCorrentista) {
            this.numConta = numConta;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivre(int saldoLivre) {
            this.saldoLivre = saldoLivre;
            return this;
        }

        public Builder saldoInvestimento(int saldoInvestimento) {
            this.saldoInvestimento = saldoInvestimento;
            return this;
        }

        public Builder taxaRemuneracao(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder taxaSaldoNegativo(double taxaSaldoNegativo) {
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public Builder categoriaIncial(Categoria categoriaInicial) {
            this.categoriaInicial = categoriaInicial;
            return this;
        }

        public ContaBuilder build(){
            return new ContaBuilder(this);
        }


    }

    private ContaBuilder(Builder builder){
        this.saldoLivre = builder.saldoLivre;
        this.saldoInvestimento = builder.saldoInvestimento;
        this.numConta = builder.numConta;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }

    public String toString(){
        return "numConta: " + numConta + "\nnomeCorrentista: " + nomeCorrentista + "\nsaldoLivre: " + saldoLivre + 
                "\nsaldoInvestimento: " + saldoInvestimento + "\ntaxaRemuneracao: " + taxaRemuneracao + 
                "\ntaxaSaldoNegativo: " + taxaSaldoNegativo + "\ncategoria: " + categoriaInicial; 
    }

}
