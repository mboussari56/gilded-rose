package com.gildedrose;

/*
**********************************************************************************************
* Copyright (c) 2020 Firststack LTD (http://www.firststack.co.uk)
* All rights reserved.
********************************************************************************************** 
*/

/**
*
* @author moudjib.boussari
* date / time 20 Dec 2020 22:05:04
**/
public class AgedBrieItem extends Item {

	public AgedBrieItem(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}

	@Override
	public void updateItem() {
		if (quality < 50) {
			quality = quality + 1;
		}

		sellIn = sellIn - 1;
		if (sellIn < 0) {
			if (quality < 50) {
				quality = quality + 1;
			}
		}
	}

}
