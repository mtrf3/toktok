package X;

import java.io.Serializable;

/* renamed from: X.PnK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65506PnK<K, V> extends AbstractC65505PnJ<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final K LJLIL;
    public final V LJLILLLLZI;

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final V getValue() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC65505PnJ, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public C65506PnK(K k, V v) {
        this.LJLIL = k;
        this.LJLILLLLZI = v;
    }
}
