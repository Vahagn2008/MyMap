package room;

import java.util.Objects;

public class Pair<T, E> {

    public T key;

    public E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> myMap = (Pair<?, ?>) o;
        return Objects.equals(key, myMap.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}
