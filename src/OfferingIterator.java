package online_trading;

import java.util.Iterator;
////////Iterating for iterator class/////
public class OfferingIterator extends OfferingList {

	private OfferingList offeringList;

	private OfferingList offeringList;

	public boolean hasNext() {
		return false;
	}

	public Offering Next(Iterator iterator) {
		return null;
	}

	public void MoveToHead(Iterator iterator) {

	}

	public void Remove(Iterator Iterator) {
		if (this.HasNext(iterator)){
			iterator.next();
		}

	}

}
