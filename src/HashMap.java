/**
 * Created by chaoranchen on 4/30/17.
 */
public class HashMap<K, V> implements Map<K, V> {

    private Entry<K, V>[] arr;

    private int hash(K key) {
        return ((int)key % arr.length);
    }

    public void clear() {
        int size = arr.length;
        arr = new Entry[size];
    }

    boolean containsKey(K key) {

    }

    V get(K key) {

    }
}
