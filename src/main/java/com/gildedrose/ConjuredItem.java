package com.gildedrose;

/*
**********************************************************************************************
* Copyright (c) 2020 Firststack LTD (http://www.firststack.co.uk)
* All rights reserved.
********************************************************************************************** 
*/

/**
 *
 * @author moudjib.boussari date / time 20 Dec 2020 20:28:54
 **/
public class ConjuredItem extends Item {

	@Override
	public void updateItem() {
		sellIn = sellIn - 1;
		if (sellIn < 0) {
			quality = quality - quality;
		}else {
			quality = quality - 2;

		}
	}

	public ConjuredItem(int sellIn, int quality) {
		super("Conjured Mana Cake", sellIn, quality);
	}
	
	
}
