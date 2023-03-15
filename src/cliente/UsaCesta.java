package cliente;

import composite.Component;
import composite.Composite;
import composite.Leaf;

public class UsaCesta {
    public static void main(String[] args) throws Exception {
        Composite cesta = new Composite("Cesta de café da manhã");

        Component pao = new Leaf("Pão", 0.5);
        Component leite = new Leaf("Leite", 1.5);
        Component manteiga = new Leaf("Manteiga", 2.5);
        Component queijo = new Leaf("Queijo", 3.5);
        Component bomBomChocolate = new Leaf("BomBom de Chocolate", 4.5);
        Component bomBom = new Leaf("BomBom", 5.5);

        Composite caixa = new Composite("Caixa de BomBom");
        caixa.add(bomBom);
        caixa.add(bomBomChocolate);

        cesta.add(pao);
        cesta.add(leite);
        cesta.add(manteiga);
        cesta.add(queijo);
        cesta.add(caixa);

        System.out.println("Total: " + cesta.getPreco());

    }
}
