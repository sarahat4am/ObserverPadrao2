package observer2.padrao.projeto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorIncial = new BigDecimal("1200");
        BigDecimal desconto = new BigDecimal("25");
        Gerente gerente = new Gerente("Pedro");
        Estoque estoque = new Estoque("Camisa", valorIncial , desconto);

        estoque.addObserver(gerente);
        estoque.setValor(valorIncial);
    }
}
