package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zdi, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90390Zdi<K, V> implements java.util.Map<K, V>, Serializable {
    public transient AbstractC90762Zji<Map.Entry<K, V>> LJLIL;
    public transient AbstractC90762Zji<K> LJLILLLLZI;
    public transient AbstractC90354Zd8<V> LJLJI;

    public static <K, V> AbstractC90390Zdi<K, V> zzc() {
        return C90679ZiN.LJLJJL;
    }

    public abstract C90887Zlj LIZ();

    public abstract C90883Zlf LIZIZ();

    public abstract C90886Zli LIZJ();

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        return v;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        AbstractC90762Zji<K> abstractC90762Zji = this.LJLILLLLZI;
        if (abstractC90762Zji == null) {
            C90886Zli LIZJ = LIZJ();
            this.LJLILLLLZI = LIZJ;
            return LIZJ;
        }
        return abstractC90762Zji;
    }

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final AbstractC90354Zd8<V> values() {
        AbstractC90354Zd8<V> abstractC90354Zd8 = this.LJLJI;
        if (abstractC90354Zd8 == null) {
            C90887Zlj LIZ = LIZ();
            this.LJLJI = LIZ;
            return LIZ;
        }
        return abstractC90354Zd8;
    }

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final AbstractC90762Zji<Map.Entry<K, V>> entrySet() {
        AbstractC90762Zji<Map.Entry<K, V>> abstractC90762Zji = this.LJLIL;
        if (abstractC90762Zji == null) {
            C90883Zlf LIZIZ = LIZIZ();
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return abstractC90762Zji;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        Iterator it = entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
