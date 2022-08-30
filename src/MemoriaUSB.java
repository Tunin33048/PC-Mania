public class MemoriaUSB {

    public String nome;
    public int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
    void infomem(){
        System.out.println("Infos Memoria USB:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Capacidade: " + this.capacidade + " GB");
        System.out.println("----------------------------\n");
    };


}

