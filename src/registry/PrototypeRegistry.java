package registry;

import prototype.Character;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private final Map<String, Character> prototypes = new HashMap<>();

    public void registerPrototype(String key, Character character) {
        prototypes.put(key, character);
    }

    public Character getCopy(String key) {
        Character prototype = prototypes.get(key);
        if (prototype == null) {
            System.out.println("Prototype not found for key: " + key);
            return null;
        }
        return prototype.cloneCharacter();
    }

    public Character getPrototype(String key) {
        return prototypes.get(key);
    }
}