public abstract class VeiculoAutomotor implements BemSeguravel {

    protected String modelo;
    protected double valorMercado;
    protected int anoFabricacao;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }
}
