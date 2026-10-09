package prototype;

import model.Inventory;

public class Character {

    private String name;
    private String characterClass;
    private Inventory inventory;

    public Character(String name, String characterClass, Inventory inventory) {
        this.name = name;
        this.characterClass = characterClass;
        this.inventory = inventory;
    }

   
    private Character(Character other) {
        this.name = other.name;
        this.characterClass = other.characterClass;
        this.inventory = other.inventory.copy(); 
    }

    public Character cloneCharacter() {
        return new Character(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', class='" + characterClass
                + "', inventory=" + inventory + "}";
    }
}