package X;

import java.util.HashMap;

/* loaded from: classes16.dex */
public final class XRT<K, V> {
    public final HashMap<K, V> LIZ = new HashMap<>();

    public final <T> T LIZ(K k) {
        V v = this.LIZ.get(k);
        if (v != null) {
            return v;
        }
        return null;
    }

    public final void LIZIZ(Object obj, Object obj2) {
        this.LIZ.put(obj, obj2);
    }
}
