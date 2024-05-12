package X;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;

/* renamed from: X.19Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19Y<K, V> extends SafeIterableMap<K, V> {
    public final HashMap<K, C014303v<K, V>> LJLIL = new HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final C014303v<K, V> get(K k) {
        return this.LJLIL.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final V remove(K k) {
        V v = (V) super.remove(k);
        this.LJLIL.remove(k);
        return v;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final V putIfAbsent(K k, V v) {
        C014303v<K, V> c014303v = get(k);
        if (c014303v != null) {
            return c014303v.LJLILLLLZI;
        }
        this.LJLIL.put(k, put(k, v));
        return null;
    }
}
