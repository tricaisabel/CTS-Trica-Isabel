package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Item{
    private String nume;
    private List<Item> items;

    public Flota(String nume) {
        this.nume = nume;
        this.items = new ArrayList<Item>();
    }

    @Override
    public void adaugaItem(Item item) {
        items.add(item);
    }

    @Override
    public void stergeItem(Item item) {
        items.remove(item);
    }

    @Override
    public void descrieItem() {
        System.out.println(this.nume);
        for(Item item:items){
            item.descrieItem();
        }
    }

    @Override
    public Item getItem(int position) {
        return items.get(position);
    }

    @Override
    public float calculeazSumaGarantata(float pretPerLoc) {
        float suma=0;
        for(Item item:items){
            suma+=item.calculeazSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
