import javax.sound.midi.Soundbank;

public class Computador {
    Computador(String mrc, float pr, HardwareBasico[] hbs, SistemaOperacional s)
    {
        marca = mrc;
        preco = pr;
        so = s;
        hb = hbs;
    }

    public String marca;
    public float preco;

    public Cliente[] cl;
    public SistemaOperacional so;
    public HardwareBasico[] hb;
    public MemoriaUSB usb;

    public void mostraPCConfigs()
    {

        System.out.println("Configuracoes do PC:\n");
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco + " Reais");
        System.out.println("----------------------------");
        System.out.println("Hardware Basico: ");
        for (int i = 0; i < hb.length; i++) {
            if(hb[i] != null)
            {
                System.out.println("Nome: " + hb[i].nome);
                System.out.println("Capacidade: " + hb[i].capacidade);
            }
        }
        System.out.println("----------------------------");

        System.out.println("Sistema Operacional: ");
        System.out.println("Nome: " + so.nome);
        System.out.println("Tipo: " + so.tipo + " bits");
        System.out.println("----------------------------");

        if(usb!= null)
        usb.infomem();
    }
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        usb = musb;
    }

}
