public class PrimeiroJava {

    public static void main(String[] args) {
        String nome = "lucas";
        int idade = 19;
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");

        verificaridade(idade);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Repetição: " + i);
        }
        Celular meuCelular = new Celular();
        meuCelular.marca = "Samsung";
        meuCelular.modelo = "A52s";
        meuCelular.bateria = 100;
        meuCelular.mostrarStatus();
    }

    public static void verificaridade(int idade) {
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}

class Celular {
    // Atributos SEM static (cada celular terá os seus)
    String marca;
    String modelo;
    int bateria;

    // Método SEM static (comportamento de cada celular)
    public void mostrarStatus() {
        System.out.println("--- Status do Celular ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }
}