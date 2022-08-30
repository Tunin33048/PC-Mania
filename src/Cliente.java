import java.util.ArrayList;

public class Cliente {

    public String nome;
    public long cpf;
    public ArrayList<Computador> computadores;
    Computador[] comp= new Computador[50];

    Cliente(String nome, long cpf)
    {
       this.nome = nome;
       this.cpf =  cpf;
       computadores = new ArrayList<Computador>();
    } 


    public float calculaTotalCompra()
    {
        float soma = 0;
        for (Computador computador:computadores)
        {
            soma += computador.preco;
        };
        return soma;
    }


}
