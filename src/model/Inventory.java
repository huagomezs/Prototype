package model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<String> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

   
    public Inventory(Inventory other) {
        this.items = new ArrayList<>(other.items);
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public Inventory copy() {
        return new Inventory(this);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}