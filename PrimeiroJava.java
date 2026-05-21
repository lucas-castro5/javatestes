public class PrimeiroJava {

    public static void main(String[] args) {
        String nome = "lucas";
        int idade = 19;
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");

        verificarIdade(idade);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Repetição: " + i);
        }

        Smartphone meuSmartphone = new Smartphone("Samsung", "A52s", 100, "Android 11");
        meuSmartphone.mostrarStatus();

        Celular meuCelular = new Celular("Samsung", "S20FE", 100);
        meuCelular.mostrarStatus();

        System.out.println("---------TERMINOU O STATUS DO CELULAR---------");
        System.out.println(meuSmartphone.getMarca());
        System.out.println(meuSmartphone.getModelo());
        System.out.println(meuSmartphone.getBateria());
    }

    public static void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}

class Celular {

    protected String marca;
    protected String modelo;
    protected int bateria;

    public Celular() {}

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getBateria() { return bateria; }
    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Valor de bateria inválido. Deve ser entre 0 e 100.");
        }
    }

    public void mostrarStatus() {
        System.out.println("--- Status do Celular ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }
}

class Smartphone extends Celular {

    protected String sistemaOperacional;

    public Smartphone(String marca, String modelo, int bateria, String sistemaOperacional) {
        super(marca, modelo, bateria);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void mostrarStatus() {
        System.out.println("--- Status do Smartphone ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
}