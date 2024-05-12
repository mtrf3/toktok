package X;

import java.util.Map;

/* renamed from: X.03v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014303v<K, V> implements Map.Entry<K, V> {
    public final K LJLIL;
    public final V LJLILLLLZI;
    public C014303v<K, V> LJLJI;
    public C014303v<K, V> LJLJJI;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.LJLIL.hashCode() ^ this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("=");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C014303v)) {
            return false;
        }
        C014303v c014303v = (C014303v) obj;
        if (this.LJLIL.equals(c014303v.LJLIL) && this.LJLILLLLZI.equals(c014303v.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public C014303v(K k, V v) {
        this.LJLIL = k;
        this.LJLILLLLZI = v;
    }
}
