// Veiculo.java
public interface Veiculo {
    void acelerar();
    void frear();
}
// Carro.java
public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}
// Moto.java
public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
}
// FabricaVeiculo.java
public interface FabricaVeiculo {
    Veiculo criarVeiculo();
}
// FabricaCarro.java
public class FabricaCarro implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
// FabricaMoto.java
public class FabricaMoto implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        FabricaVeiculo fabricaCarro = new FabricaCarro();
        Veiculo meuCarro = fabricaCarro.criarVeiculo();
        meuCarro.acelerar();
        meuCarro.frear();

        // Criando uma fábrica de motos
        FabricaVeiculo fabricaMoto = new FabricaMoto();
        Veiculo minhaMoto = fabricaMoto.criarVeiculo();
        minhaMoto.acelerar();
        minhaMoto.frear();
    }
}

