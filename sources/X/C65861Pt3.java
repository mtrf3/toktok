package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65861Pt3<K, V> implements Map.Entry<K, V>, EHP {
    public final C65864Pt6<K, V> LJLIL;
    public final int LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL.keysArray[this.LJLILLLLZI];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        V[] vArr = this.LJLIL.valuesArray;
        o.LJI(vArr);
        return vArr[this.LJLILLLLZI];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        K key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
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
        LIZ.append(getKey());
        LIZ.append('=');
        LIZ.append(getValue());
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (o.LJ(entry.getKey(), getKey()) && o.LJ(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        V[] allocateValuesArray = this.LJLIL.allocateValuesArray();
        int i = this.LJLILLLLZI;
        V v2 = allocateValuesArray[i];
        allocateValuesArray[i] = v;
        return v2;
    }

    public C65861Pt3(C65864Pt6<K, V> map, int i) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
        this.LJLILLLLZI = i;
    }
}
