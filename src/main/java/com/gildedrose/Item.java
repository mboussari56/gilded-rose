package com.gildedrose;

public class Item {

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public static Item createNewItem(String name, int sellIn, int quality) {
		switch (name) {
		case "Conjured Mana Cake":
			return new ConjuredItem(sellIn, quality);
		case "Backstage passes to a TAFKAL80ETC concert":
			return new BackstageItem(sellIn, quality);
		case "Sulfuras, Hand of Ragnaros":
			return new SulfurasItem(sellIn, quality);
		case "Aged Brie":
			return new AgedBrieItem(sellIn, quality);
		default:
			return new Item(name, sellIn, quality);
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	public void updateItem() {
		if (quality > 0) {
			quality = quality - 1;
		}
		sellIn = sellIn - 1;
		if (sellIn < 0) {
			if (quality > 0) {
				quality = quality - 1;
			}
		}
	}
}
