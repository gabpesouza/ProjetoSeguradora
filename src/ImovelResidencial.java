public class ImovelResidencial implements BemSeguravel {


    private static final double TAXA_METRO_QUADRADO = 0.30;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return calcularTaxaAreaConstruida() + 0.1 * valorMercado;
    }

    @Override
    public String descrever() {
        return String.format("Imovel residencial com %d m2 de area construida, avaliado em R$ %.2f %nPremio: R$ %.2f",
                areaConstruida, valorMercado, calcularValorPremio());
    }

    private double calcularTaxaAreaConstruida() {
        return areaConstruida * TAXA_METRO_QUADRADO;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
}
