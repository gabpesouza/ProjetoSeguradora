public class CarroParticular extends VeiculoAutomotor {

    private static final int ANO_LIMITE_ISENCAO_VALOR_PREMIO_ADICIONAL = 2000;
    private static final double PERCENTUAL_VALOR_PREMIO_ADICIONAL = 0.5;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = this.valorMercado * 0.4;

        if (anoFabricacao < ANO_LIMITE_ISENCAO_VALOR_PREMIO_ADICIONAL) {
            valorPremio += valorPremioAdicional(valorPremio);
        }

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular %s ano %d, avaliado em R$ %.2f %nPremio: R$ %.2f",
                this.modelo, this.anoFabricacao, this.valorMercado, calcularValorPremio());
    }

    private double valorPremioAdicional(double valorPremio) {
        return valorPremio * PERCENTUAL_VALOR_PREMIO_ADICIONAL;
    }


}
