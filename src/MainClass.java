import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {


        //promocao 1
        HardwareBasico h11 = new HardwareBasico();
        h11.nome = "Pentium Core i3";
        h11.capacidade = 1200;
        HardwareBasico h12 = new HardwareBasico();
        h12.nome = "Memoria RAM";
        h12.capacidade = 4;
        HardwareBasico h13 = new HardwareBasico();
        h13.nome = "HD";
        h13.capacidade = 500;
        HardwareBasico[] hardware1 = new HardwareBasico[50];
        hardware1[0] = h11;
        hardware1[1] = h12;
        hardware1[2] = h13;

        SistemaOperacional s1 = new SistemaOperacional();
        s1.nome = "Linux Ubuntu";
        s1.tipo = 32;


        Computador p1 = new Computador("Positivo",1300,hardware1,s1);

        //-------------------------------------------------------------------------------------------------

        //promocao 2
        HardwareBasico h21 = new HardwareBasico();
        h21.nome = "Pentium Core i5";
        h21.capacidade = 2260;
        HardwareBasico h22 = new HardwareBasico();
        h22.nome = "Memoria RAM";
        h22.capacidade = 8;
        HardwareBasico h23 = new HardwareBasico();
        h23.nome = "HD";
        h23.capacidade = 1000;
        HardwareBasico[] hardware2 = new HardwareBasico[50];
        hardware2[0] = h21;
        hardware2[1] = h22;
        hardware2[2] = h23;

        SistemaOperacional s2 = new SistemaOperacional();
        s2.nome = "Windows 8";
        s2.tipo = 64;


        Computador p2 = new Computador("Acer",1800,hardware2,s2);

        //-------------------------------------------------------------------------------------------------

        //promocao 3
        HardwareBasico h31 = new HardwareBasico();
        h31.nome = "Pentium Core i7";
        h31.capacidade = 3500;
        HardwareBasico h32 = new HardwareBasico();
        h32.nome = "Memoria RAM";
        h32.capacidade = 16;
        HardwareBasico h33 = new HardwareBasico();
        h33.nome = "HD";
        h33.capacidade = 2000;
        HardwareBasico[] hardware3 = new HardwareBasico[50];
        hardware2[0] = h31;
        hardware2[1] = h32;
        hardware2[2] = h33;

        SistemaOperacional s3 = new SistemaOperacional();
        s2.nome = "Windows 10";
        s2.tipo = 64;


        Computador p3 = new Computador("Vaio",2800,hardware3,s3);

        //-------------------------------------------------------------------------------------------------

        Cliente c1 = new Cliente("antonio",1231231231);
        MemoriaUSB m1 = new MemoriaUSB("Pen drive", 16);
        MemoriaUSB m2 = new MemoriaUSB("Pen drive", 32);
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000);

        float soma = 0;
        boolean pc1 = false;
        boolean pc2 = false;
        boolean pc3 = false;
        System.out.println("1 - Promocao PC numero 1");
        System.out.println("2 - Promocao PC numero 2");
        System.out.println("3 - Promocao PC numero 3");
        System.out.println("0 - Para  encerrar\n");
        System.out.println("Digite a Promocao:");
        Scanner entrada = new Scanner(System.in);
        int i = entrada.nextInt();
        int n = 0;
        Computador[] cp = new Computador[100];
        while (i != 0)
        {
            int x=0;
            switch (i) {
                case 1:
                    System.out.println("PC " + 1 + " adicionado\n");
                    c1.computadores.add(p1);
                    c1.comp[n] = p1;
                    p1.addMemoriaUSB(m1);
                    n++;
                    break;
            
                case 2:
                    System.out.println("PC " + 2 + " adicionado\n");
                    c1.computadores.add(p2);
                    c1.comp[n] = p2;
                    p2.addMemoriaUSB(m2);
                    n++;
                    break;

                case 3:
                    System.out.println("PC " + 3 + " adicionado\n");
                    c1.computadores.add(p3);
                    c1.comp[n] = p3;
                    p3.addMemoriaUSB(m3);
                    n++;
                    break;

                    default:
                    System.out.println("Digite um valor válido\n");
                    break;


            }
            System.out.println("Caso queira adicionar mais algum produto digite:");
            System.out.println("1 - Promocao PC numero 1");
            System.out.println("2 - Promocao PC numero 2");
            System.out.println("3 - Promocao PC numero 3");
            System.out.println("0 - Para  encerrar\n");
            System.out.println("Digite a Promocao ou 0 para encerrar:");
            i = entrada.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("PC " + (j+1) + " comprado:");
            c1.comp[j].mostraPCConfigs();
        }

        System.out.println("Total da Compra: R$" + c1.calculaTotalCompra());
    }
}
