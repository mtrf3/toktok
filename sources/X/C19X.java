package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.19X, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19X<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC014403w<K, V> {
    public C014303v<K, V> LJLIL;
    public C014303v<K, V> LJLILLLLZI;

    public abstract C014303v<K, V> LIZIZ(C014303v<K, V> c014303v);

    public abstract C014303v<K, V> LIZLLL(C014303v<K, V> c014303v);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C014303v<K, V> c014303v;
        C014303v<K, V> c014303v2 = this.LJLILLLLZI;
        C014303v<K, V> c014303v3 = this.LJLIL;
        if (c014303v2 == c014303v3 || c014303v3 == null) {
            c014303v = null;
        } else {
            c014303v = LIZLLL(c014303v2);
        }
        this.LJLILLLLZI = c014303v;
        return c014303v2;
    }

    @Override // X.InterfaceC014403w
    public final void LIZ(C014303v<K, V> c014303v) {
        C014303v<K, V> c014303v2 = null;
        if (this.LJLIL == c014303v && c014303v == this.LJLILLLLZI) {
            this.LJLILLLLZI = null;
            this.LJLIL = null;
        }
        C014303v<K, V> c014303v3 = this.LJLIL;
        if (c014303v3 == c014303v) {
            this.LJLIL = LIZIZ(c014303v3);
        }
        C014303v<K, V> c014303v4 = this.LJLILLLLZI;
        if (c014303v4 == c014303v) {
            C014303v<K, V> c014303v5 = this.LJLIL;
            if (c014303v4 != c014303v5 && c014303v5 != null) {
                c014303v2 = LIZLLL(c014303v4);
            }
            this.LJLILLLLZI = c014303v2;
        }
    }

    public C19X(C014303v<K, V> c014303v, C014303v<K, V> c014303v2) {
        this.LJLIL = c014303v2;
        this.LJLILLLLZI = c014303v;
    }
}
