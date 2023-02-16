import java.util.Random;

public class TestesCPF {
    private Random rand = new Random();
    private GeraCpfValido geraCpf = new GeraCpfValido();

    private String cpfGerado;
    private String cpfGeradoValido;
    private String[] arrayCpfsTestes;
    private String repeat;
    private String cpfRepeat;
    private String cpfRepeatFive;

    public boolean TestesPrograma()
    {
        int contadorTestes = 10;
        System.out.println("\nIniciando bateria de testes!");

        while (contadorTestes > 0)
        {
            repeat = Integer.toString(rand.nextInt(1, 10));
            cpfRepeat = repeat.repeat(11);
            cpfRepeatFive = repeat.repeat(5);

            cpfGerado = geraCpf.RandCPF();
            cpfGeradoValido = geraCpf.CpfValido();

            arrayCpfsTestes = new String[] {cpfGerado, cpfGeradoValido, cpfRepeat, cpfRepeatFive};
            String multCpfs = cpfGerado + " " + cpfGeradoValido + " " + cpfRepeat + " " + cpfRepeatFive;
            System.out.println("\nCpfs gerados: " + multCpfs);

            for (int i = 0; i < arrayCpfsTestes.length; i++)
            {
                ValidaCPF cpf = new ValidaCPF(arrayCpfsTestes[i]);

                if (cpf.Valida())
                {
                    System.out.println(arrayCpfsTestes[i]
                            + " Válido");
                }
                else
                {
                    System.out.println(arrayCpfsTestes[i] + " Inválido");
                }
            }
            contadorTestes--;
        }
        System.out.println("\nFim dos testes!");

        return false;
    }
}
