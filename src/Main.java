// Definindo a classe Pessoa (Exercício 1)
class Pessoa {
    String nome;
    int idade; // Atributo obrigatório
    String profissao;
}

// Definindo a classe Carro (Exercício 2)
class Carro {
    String modelo;
    int ano; // Atributo obrigatório
    String cor;
}

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // EXERCÍCIO 1: Classe Pessoa
        // ==========================================
        System.out.println("--- EXERCÍCIO 1: PESSOA ---");

        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 25;
        p1.profissao = "Engenheira";

        Pessoa p2 = new Pessoa();
        p2.nome = "Carlos";
        p2.idade = 40;
        p2.profissao = "Professor";

        Pessoa p3 = new Pessoa();
        p3.nome = "Beatriz";
        p3.idade = 30;
        p3.profissao = "Designer";

        if (p1.idade > p2.idade && p1.idade > p3.idade) {
            System.out.println("A pessoa mais velha é: " + p1.nome + " com " + p1.idade + " anos.");
        } else if (p2.idade > p1.idade && p2.idade > p3.idade) {
            System.out.println("A pessoa mais velha é: " + p2.nome + " com " + p2.idade + " anos.");
        } else {
            System.out.println("A pessoa mais velha é: " + p3.nome + " com " + p3.idade + " anos.");
        }

        System.out.println();

        // ==========================================
        // EXERCÍCIO 2: Classe Carro
        // ==========================================
        System.out.println("--- EXERCÍCIO 2: CARRO ---");

        Carro carro1 = new Carro();
        carro1.modelo = "Fusca";
        carro1.ano = 1980;
        carro1.cor = "Azul";

        Carro carro2 = new Carro();
        carro2.modelo = "Civic";
        carro2.ano = 2022;
        carro2.cor = "Preto";

        carro1.cor = "Vermelho";

        System.out.println("Carro 1 -> Modelo: " + carro1.modelo + ", Ano: " + carro1.ano + ", Cor: " + carro1.cor);
        System.out.println("Carro 2 -> Modelo: " + carro2.modelo + ", Ano: " + carro2.ano + ", Cor: " + carro2.cor);

//        RESPOSTA PARA O COMENTÁRIO DO CÓDIGO:
//        Por que a alteração em um carro não afetou o outro?
//        Resposta: Porque cada objeto (carro1 e carro2) é uma instância independente alocada em espaços
//        de memória diferentes. Quando alteramos o atributo 'cor'do carro1, modificamos exclusivamente
//        o dado desse objeto, sem interferir no carro2.
    }
}
