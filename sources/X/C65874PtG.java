package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.PtG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65874PtG<K, V> extends LinkedHashMap<K, V> {
    public static final C65874PtG LJLILLLLZI;
    public boolean LJLIL;

    public final void zzara() {
        this.LJLIL = false;
    }

    static {
        C65874PtG c65874PtG = new C65874PtG();
        LJLILLLLZI = c65874PtG;
        c65874PtG.LJLIL = false;
    }

    public final void LIZ() {
        if (this.LJLIL) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C65874PtG() {
        this.LJLIL = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZ();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += LIZIZ(entry.getValue()) ^ LIZIZ(entry.getKey());
        }
        return i;
    }

    public final C65874PtG<K, V> zzaul() {
        if (isEmpty()) {
            return new C65874PtG<>();
        }
        return new C65874PtG<>(this);
    }

    public static <K, V> C65874PtG<K, V> zzauk() {
        return LJLILLLLZI;
    }

    public final boolean isMutable() {
        return this.LJLIL;
    }

    public C65874PtG(java.util.Map<K, V> map) {
        super(map);
        this.LJLIL = true;
    }

    public static int LIZIZ(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof InterfaceC87191YJv)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        LIZ();
        for (K k : map.keySet()) {
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LIZ();
        return (V) super.remove(obj);
    }

    public final void zza(C65874PtG<K, V> c65874PtG) {
        LIZ();
        if (!c65874PtG.isEmpty()) {
            putAll(c65874PtG);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        LIZ();
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }
}
