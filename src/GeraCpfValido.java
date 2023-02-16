import java.util.Random;

public class GeraCpfValido {
    private Random rand = new Random();

    public String Aleatorio;

    public String RandCPF()
    {
        int geraUm = rand.nextInt(1, 9) + 1;
        int geraDois = rand.nextInt(1, 9) + 1;
        int geraTres = rand.nextInt(1, 9) + 1;
        int geraQuatro = rand.nextInt(1, 9) + 1;
        int geraCinco = rand.nextInt(1, 9) + 1;
        int geraSeis = rand.nextInt(1, 9) + 1;
        int geraSete = rand.nextInt(1, 9) + 1;
        int geraOito = rand.nextInt(1, 9) + 1;
        int geraNove = rand.nextInt(1, 9) + 1;
        Aleatorio = Integer.toString(geraUm) + Integer.toString(geraDois) + Integer.toString(geraTres) + Integer.toString(geraQuatro) + Integer.toString(geraCinco) + Integer.toString(geraSeis) + Integer.toString(geraSete) + Integer.toString(geraOito) + Integer.toString(geraNove);
        String aleatorioStr = Aleatorio;

        return aleatorioStr;
    }

    public String CpfValido()
    {
        String geraCpfValido = this.RandCPF();
        ValidaCPF cpf = new ValidaCPF(geraCpfValido);
        String cpfGerado = cpf.GeraNovoCpf();

        return this.CpfValidoFormatado(cpfGerado);
    }

    public String CpfValidoFormatado(String cpf)
    {
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
    }
}
