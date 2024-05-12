package X;

import java.util.AbstractMap;

/* loaded from: classes16.dex */
public final class XQH<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final XR6 LJLIL;

    public boolean wasEvicted() {
        return this.LJLIL.LIZJ();
    }

    public XR6 getCause() {
        return this.LJLIL;
    }

    public XQH(K k, V v, XR6 xr6) {
        super(k, v);
        xr6.getClass();
        this.LJLIL = xr6;
    }

    public static <K, V> XQH<K, V> create(K k, V v, XR6 xr6) {
        return new XQH<>(k, v, xr6);
    }
}
