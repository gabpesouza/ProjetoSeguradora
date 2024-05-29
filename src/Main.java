//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 500);
        CarroParticular carro = new CarroParticular("HR-V", 80_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 200_000, 2021, 4);

        servicoPropostaSeguro.emitir(imovelResidencial);
        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);

    }
}