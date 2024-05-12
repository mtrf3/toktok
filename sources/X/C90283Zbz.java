package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Zbz, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90283Zbz<K, V> extends LinkedHashMap<K, V> {
    public boolean LJLIL;

    public final void zzb() {
        this.LJLIL = false;
    }

    public final boolean zzd() {
        return this.LJLIL;
    }

    static {
        new C90283Zbz().LJLIL = false;
    }

    public final void LIZIZ() {
        if (this.LJLIL) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C90283Zbz() {
        this.LJLIL = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZIZ();
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
            i += LIZ(entry.getValue()) ^ LIZ(entry.getKey());
        }
        return i;
    }

    public final C90283Zbz<K, V> zza() {
        if (isEmpty()) {
            return new C90283Zbz<>();
        }
        return new C90283Zbz<>(this);
    }

    public C90283Zbz(java.util.Map<K, V> map) {
        super(map);
        this.LJLIL = true;
    }

    public static int LIZ(Object obj) {
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
        if (!(obj instanceof InterfaceC90320Zca)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                } else {
                    equals = value.equals(obj2);
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        LIZIZ();
        for (K k : map.keySet()) {
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LIZIZ();
        return (V) super.remove(obj);
    }

    public final void zzc(C90283Zbz<K, V> c90283Zbz) {
        LIZIZ();
        if (!c90283Zbz.isEmpty()) {
            putAll(c90283Zbz);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        LIZIZ();
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }
}
