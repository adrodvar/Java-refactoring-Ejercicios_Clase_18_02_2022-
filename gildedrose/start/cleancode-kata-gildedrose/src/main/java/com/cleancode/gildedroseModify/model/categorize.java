package com.cleancode.gildedroseModify.model;

import com.cleancode.gildedroseModify.ItemCategory;
import com.cleancode.gildedroseModify.domain.Item;

public class categorize extends ItemCategory {

    public categorize(Item item) {
    }

    public ItemCategory categorize(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Legend();
        }
        if (item.name.equals("Aged Brie")) {
            return new Cheese();
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new Backstage();
        }
        if (item.name.startsWith("Conjured"))
            return new Conjured();
        return new ItemCategory();
    }
}
