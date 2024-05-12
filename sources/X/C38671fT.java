package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38671fT<K, V> implements Map.Entry<K, V>, InterfaceC90533gv {
    public final K LJLIL;
    public final V LJLILLLLZI;

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        K k = this.LJLIL;
        int i2 = 0;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        V value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('=');
        LIZ.append(getValue());
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !o.LJ(entry.getKey(), this.LJLIL) || !o.LJ(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public C38671fT(K k, V v) {
        this.LJLIL = k;
        this.LJLILLLLZI = v;
    }
}
