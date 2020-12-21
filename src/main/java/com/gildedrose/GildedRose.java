package com.gildedrose;

class GildedRose {
	Item[] items;

	
	public GildedRose(Item[] items) {
		this.items = new Item[items.length];
		//To keep things simple, we create the right object type  
		for (int i = 0; i < items.length; i++) {
			this.items[i] = Item.createNewItem(items[i].name, items[i].sellIn, items[i].quality);
		}
	}

	/**
	 * Updates individual Item
	 */
	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			update(items[i]);
		}

	}

	private void update(Item item) {
		item.updateItem();
	}
}