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
* date / time 20 Dec 2020 21:50:37
**/
public class SulfurasItem extends Item {

	public SulfurasItem(int sellIn, int quality) {
		super("Sulfuras, Hand of Ragnaros", sellIn, quality);
	}

	@Override
	public void updateItem() {
		// Do nothing, being a legendary item, never has to be sold or decreases in Quality
	}

}
