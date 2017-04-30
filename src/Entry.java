/**
 * Created by chaoranchen on 4/30/17.
 */
public class Entry<K, V> {
    private K key;
    private V value;
    private Entry<K, V> next;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}
