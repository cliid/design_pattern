package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Pistol implements Item {
    @Override
    public String name() {
        return "Pistol";
    }

    @Override
    public void use() {
        System.out.println("Used Pistol");
    }
}
