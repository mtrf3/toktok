package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Prt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65789Prt implements java.util.Map, Serializable {
    public transient AbstractC65793Prx LJLIL;
    public transient AbstractC65793Prx LJLILLLLZI;
    public transient AbstractC65792Prw LJLJI;

    public abstract C65799Ps3 LIZ();

    public abstract C65791Prv LIZIZ();

    public abstract C65790Pru LIZJ();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        AbstractC65793Prx abstractC65793Prx = this.LJLILLLLZI;
        if (abstractC65793Prx == null) {
            C65790Pru LIZJ = LIZJ();
            this.LJLILLLLZI = LIZJ;
            return LIZJ;
        }
        return abstractC65793Prx;
    }

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final AbstractC65792Prw values() {
        AbstractC65792Prw abstractC65792Prw = this.LJLJI;
        if (abstractC65792Prw == null) {
            C65799Ps3 LIZ = LIZ();
            this.LJLJI = LIZ;
            return LIZ;
        }
        return abstractC65792Prw;
    }

    @Override // java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final AbstractC65793Prx entrySet() {
        AbstractC65793Prx abstractC65793Prx = this.LJLIL;
        if (abstractC65793Prx == null) {
            C65791Prv LIZIZ = LIZIZ();
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return abstractC65793Prx;
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
        throw new IllegalArgumentException(C64.LIZIZ("size cannot be negative but was: ", size));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
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
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
