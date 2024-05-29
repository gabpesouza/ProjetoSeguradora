public class Caminhao extends VeiculoAutomotor {

    private static final double VALOR_PREMIO_ADICIONAL_POR_EIXO = 50;

    private double quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, double quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }


    @Override
    public double calcularValorPremio() {

        double valorPremio = this.valorMercado * 0.2;
        valorPremio += getValorPremioAdicionalPorEixo();

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhao %s ano %d, avaliado em R$ %.2f %nPremio: R$ %.2f",
                this.modelo, this.anoFabricacao, this.valorMercado, calcularValorPremio());
    }

    private double getValorPremioAdicionalPorEixo() {
        return this.quantidadeEixos * VALOR_PREMIO_ADICIONAL_POR_EIXO;
    }
}
