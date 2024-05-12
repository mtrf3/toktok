package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.PtJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65877PtJ extends LinkedHashMap {
    public static final C65877PtJ LJLILLLLZI;
    public boolean LJLIL;

    public static C65877PtJ zza() {
        return LJLILLLLZI;
    }

    public final void zzc() {
        this.LJLIL = false;
    }

    public final boolean zze() {
        return this.LJLIL;
    }

    static {
        C65877PtJ c65877PtJ = new C65877PtJ();
        LJLILLLLZI = c65877PtJ;
        c65877PtJ.LJLIL = false;
    }

    public final void LIZ() {
        if (this.LJLIL) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C65877PtJ() {
        this.LJLIL = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZ();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                hashCode = bArr.length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length = bArr2.length;
                for (byte b2 : bArr2) {
                    length = (length * 31) + b2;
                }
                if (length != 0) {
                    i2 = length;
                }
            } else {
                i2 = value.hashCode();
            }
            i += i2 ^ hashCode;
        }
        return i;
    }

    public final C65877PtJ zzb() {
        if (isEmpty()) {
            return new C65877PtJ();
        }
        return new C65877PtJ(this);
    }

    public C65877PtJ(java.util.Map map) {
        super(map);
        this.LJLIL = true;
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
            for (Map.Entry entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
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
    public final void putAll(java.util.Map map) {
        LIZ();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        LIZ();
        return super.remove(obj);
    }

    public final void zzd(C65877PtJ c65877PtJ) {
        LIZ();
        if (!c65877PtJ.isEmpty()) {
            putAll(c65877PtJ);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        LIZ();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }
}
