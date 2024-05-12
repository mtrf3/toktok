package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PmP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65449PmP<K, V> implements Map.Entry<K, V> {
    public final int LJLIL;
    public final /* synthetic */ C65446PmM LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final K getKey() {
        C65446PmM c65446PmM = this.LJLILLLLZI;
        int i = this.LJLIL;
        if (i >= 0) {
            if (i < c65446PmM.LJLIL) {
                return (K) c65446PmM.LJLILLLLZI[i << 1];
            }
        } else {
            c65446PmM.getClass();
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        int i;
        C65446PmM c65446PmM = this.LJLILLLLZI;
        int i2 = this.LJLIL;
        if (i2 >= 0) {
            if (i2 < c65446PmM.LJLIL && (i = (i2 << 1) + 1) >= 0) {
                return (V) c65446PmM.LJLILLLLZI[i];
            }
        } else {
            c65446PmM.getClass();
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return getKey().hashCode() ^ getValue().hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K key = getKey();
        Object key2 = entry.getKey();
        if (key == key2 || (key != null && key.equals(key2))) {
            V value = getValue();
            Object value2 = entry.getValue();
            if (value == value2) {
                return true;
            }
            if (value != null && value.equals(value2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2;
        C65446PmM c65446PmM = this.LJLILLLLZI;
        int i = this.LJLIL;
        int i2 = c65446PmM.LJLIL;
        if (i >= 0 && i < i2) {
            int i3 = (i << 1) + 1;
            if (i3 < 0) {
                v2 = null;
            } else {
                v2 = (V) c65446PmM.LJLILLLLZI[i3];
            }
            c65446PmM.LJLILLLLZI[i3] = v;
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }

    public C65449PmP(C65446PmM c65446PmM, int i) {
        this.LJLILLLLZI = c65446PmM;
        this.LJLIL = i;
    }
}
