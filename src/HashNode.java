
/***************************************************************************
 * Purpose : Implementation of Hash Map
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 15-06-2021
 *
 ************************************************************************/
	//A node of chains
	public class HashNode<K,V> {
	K key;
	V value;
    HashNode<K,V> next;
    
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
    
	}


