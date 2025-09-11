package com.Suvam.unitTesting.business;

import org.springframework.stereotype.Component;

import com.Suvam.unitTesting.model.Item;
@Component
public class ItemBusinessService {

	public Item retreiveHardcodedItem() {
		return new Item(1,"Ball",10,100);
	}

}
