package com.gildedrose;

/*
**********************************************************************************************
* Copyright (c) 2020 Firststack LTD (http://www.firststack.co.uk)
* All rights reserved.
********************************************************************************************** 
*/

/**
 *
 * @author moudjib.boussari date / time 20 Dec 2020 21:57:03
 **/
public class BackstageItem extends Item {

	public BackstageItem(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	public void updateItem() {
		if (quality < 50) {
			quality = quality + 1;
			if (sellIn < 11) {
				if (quality < 50) {
					quality = quality + 1;
				}
			}
			if (sellIn < 6) {
				if (quality < 50) {
					quality = quality + 1;
				}
			}

		}

		sellIn = sellIn - 1;
		if (sellIn < 0) {
			quality = quality - quality;
		}

	}

}
