package main;

import model.Inventory;
import prototype.Character;
import registry.PrototypeRegistry;

public class Main {

    public static void main(String[] args) {

        PrototypeRegistry registry = new PrototypeRegistry();

    
        Inventory warriorInventory = new Inventory();
        warriorInventory.addItem("Health Potion");
        registry.registerPrototype("Warrior",
                new Character("Warrior", "Warrior", warriorInventory));

        Inventory mageInventory = new Inventory();
        mageInventory.addItem("Mana Potion");
        mageInventory.addItem("Spellbook");
        registry.registerPrototype("Mage",
                new Character("Mage", "Mage", mageInventory));

      
        Character warriorCopy = registry.getCopy("Warrior");
        warriorCopy.setName("Warrior-Copy");

        Character mageCopy = registry.getCopy("Mage");
        mageCopy.setName("Mage-Copy");

      
        warriorCopy.getInventory().addItem("Shield");

  
        System.out.println("Original prototypes");
        System.out.println(registry.getPrototype("Warrior"));
        System.out.println(registry.getPrototype("Mage"));

        System.out.println("\nClones");
        System.out.println(warriorCopy);
        System.out.println(mageCopy);

        System.out.println("\nVerification");
        System.out.println("Warrior prototype inventory: "
                + registry.getPrototype("Warrior").getInventory());
        System.out.println("Warrior-Copy inventory:      "
                + warriorCopy.getInventory());

     
        System.out.println("\nNon-existent prototype");
        Character unknown = registry.getCopy("Archer");
        System.out.println("Result: " + unknown);
    }
}