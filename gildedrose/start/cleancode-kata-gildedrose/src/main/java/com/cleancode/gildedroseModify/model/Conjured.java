package com.cleancode.gildedroseModify.model;

import com.cleancode.gildedroseModify.ItemCategory;
import com.cleancode.gildedroseModify.domain.Item;

public class Conjured extends ItemCategory {
    protected void updateExpired(Item item) {
        decrementQuality(item);
        decrementQuality(item);
    }
    protected void updateQuality(Item item) {
        decrementQuality(item);
        decrementQuality(item);
    }
}