package X;

import java.util.AbstractMap;

/* loaded from: classes16.dex */
public final class XQF<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final XQG LJLIL;

    public boolean wasEvicted() {
        return this.LJLIL.LIZJ();
    }

    public XQG getCause() {
        return this.LJLIL;
    }

    public XQF(K k, V v, XQG xqg) {
        super(k, v);
        xqg.getClass();
        this.LJLIL = xqg;
    }

    public static <K, V> XQF<K, V> create(K k, V v, XQG xqg) {
        return new XQF<>(k, v, xqg);
    }
}
