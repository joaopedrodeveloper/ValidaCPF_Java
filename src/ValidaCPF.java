public class ValidaCPF {
    private String CpfLimpo;
    private String Digito;
    private String Digito1;
    private  String Digito2;
    private String NovoCpf;
    private String CpfNumeros;

    public ValidaCPF(String cpf)
    {
        this.CpfLimpo = cpf.trim().replace(".", "").replace("-","");
        this.Valida();
    }

    public String CalculaDigitos(String cpfNumeros)
    {
        int soma = 0;
        int resto;
        int multiplocador = cpfNumeros.length() + 1;

        for (int i = 0; i < cpfNumeros.length(); i++)
        {
            //soma += (cpfNumeros.charAt(i) - 48) * multiplicador--;
            //Ou
            soma += Integer.parseInt(String.valueOf(cpfNumeros.charAt(i))) * multiplocador--;
        }
        resto = 11 - (soma % 11);
        Digito = resto <= 9 ? Integer.toString(resto) : "0";

        return Digito;
    }

    public String GeraNovoCpf()
    {
        CpfNumeros = CpfLimpo.substring(0, 9);
        Digito1 = CalculaDigitos(CpfNumeros);
        Digito2 = CalculaDigitos(CpfNumeros + Digito1);
        this.NovoCpf = CpfNumeros + Digito1 + Digito2;

        return this.NovoCpf;
    }

    public boolean Valida()
    {
        if (this.CpfLimpo == "") return false;
        if (this.CpfLimpo.length() < 11) return false;
        if (this.eSequencia()) return false;

        this.GeraNovoCpf();

        return this.NovoCpf.equals(this.NovoCpf);
    }

    public boolean eSequencia()
    {
        String cpfNumPri = CpfLimpo;
        char cpfNumPrim = cpfNumPri.charAt(0);
        String repeat = new String();

        return CpfLimpo == repeat;
    }
}
