package X;

import java.util.Map;

/* loaded from: classes16.dex */
public final class XRP<K> implements Map.Entry<K, Object> {
    public final Map.Entry<K, XRQ> LJLIL;

    public XRP() {
        throw null;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LJLIL.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.LJLIL.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    public XRP(Map.Entry entry) {
        this.LJLIL = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof YIZ) {
            XRQ value = this.LJLIL.getValue();
            YIZ yiz = value.LIZ;
            value.LIZIZ = null;
            value.LIZ = (YIZ) obj;
            return yiz;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
