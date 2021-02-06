package org.hps.goodiesApp;
import java.util.*;
public class ItemPrice implements Comparator<Item>
{
	@Override
	public int compare(Item o1, Item o2) 
	{
		return o1.price-o2.price;
	}
}
