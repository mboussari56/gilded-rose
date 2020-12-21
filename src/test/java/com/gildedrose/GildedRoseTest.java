package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

	/**
	 * Foo is not a very nice name for a test. Makes the code ambiguous. 
	 * Solution :
	 * 		Change foo to something more meaningful
	 * 		Make the test for robust
	 */
	@Test
	void test_update_quality() {
		Item[] items = new Item[] { 
				new Item("fixme", 0, 0), 
				new Item("+5 Dexterity Vest", 10, 20), //
				new Item("Aged Brie", 2, 0), //
				new Item("Elixir of the Mongoose", 5, 7), //
				new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
				new Item("Ragnaros", 1, 80), //
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				new Item("Conjured Mana Cake", 3, 6), 
				new Item("Aged Brie", 15, 48),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 8), new Item("Tea", -1, 2),
				new Item("Aged Brie", -1, 48), new Item("Aged Brie", -1, 50),
				new Item("Backstage passes to a TAFKAL80ETC concert", -1, 2)

		};
		
		final GildedRose response = testUpdate(items);

		// Default cases
		assertEquals("fixme, -1, 0", response.items[0].toString()); // Default case
		assertEquals("+5 Dexterity Vest, 9, 19", response.items[1].toString()); // Default case
		assertEquals("Tea, -2, 0", response.items[13].toString()); // Default case
		assertEquals("Elixir of the Mongoose, 4, 6", response.items[3].toString()); // Default case
		assertEquals("Ragnaros, 0, 79", response.items[5].toString());

		// Aged Brie case
		assertEquals("Aged Brie, 1, 1", response.items[2].toString());
		assertEquals("Aged Brie, -2, 50", response.items[14].toString());
		assertEquals("Aged Brie, -2, 50", response.items[15].toString());
		assertEquals("Aged Brie, 14, 49", response.items[11].toString());

		// Sulfuras use cases
		assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", response.items[4].toString());
		assertEquals("Sulfuras, Hand of Ragnaros, -1, 80", response.items[6].toString());

		// Backstage passes use cases
      assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 21", response.items[7].toString());
      assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", response.items[8].toString());
      assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", response.items[9].toString());
      assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 11", response.items[12].toString());
      assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0", response.items[16].toString());
	
      //New feature
      assertEquals("Conjured Mana Cake, 2, 4", response.items[10].toString());


	}

	private GildedRose testUpdate(Item[] items) {
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		return app;
	}

}
