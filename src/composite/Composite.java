package composite;

import java.util.*;

public class Composite implements Component{
    private List<Component> lista;
    private String nome;

    public Composite(String nome) {
        lista = new ArrayList<>();
        this.nome = nome;
    }

    public void add(Component c) {
        lista.add(c);
    }

    public void remove(Component c) {
        lista.remove(c);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component c : lista) {
            total += c.getPreco();
        }
        return total;
        
    }


}
