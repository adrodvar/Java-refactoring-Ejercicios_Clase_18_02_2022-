package com.cleancode.gildedroseModify.model;

import com.cleancode.gildedroseModify.ItemCategory;
import com.cleancode.gildedroseModify.domain.Item;

public class Cheese extends ItemCategory {
    protected void updateExpired(Item item) {
        incrementQuality(item);
    }
    protected void updateQuality(Item item) {
        incrementQuality(item);
    }
}