package X;

import java.util.Map;

/* renamed from: X.PnJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65505PnJ<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getKey());
        LIZ.append("=");
        LIZ.append(getValue());
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C78886Uxe.LJIIIIZZ(getKey(), entry.getKey()) || !C78886Uxe.LJIIIIZZ(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
