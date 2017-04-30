/**
 * Created by chaoranchen on 4/30/17.
 */
public class Entry<K, V> {
    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

}
