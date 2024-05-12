package X;

import java.util.Map;

/* loaded from: classes15.dex */
public final class VKT implements Map.Entry, Comparable {
    public final Comparable LJLIL;
    public Object LJLILLLLZI;
    public final /* synthetic */ VKV LJLJI;

    public VKT(VKV vkv, Comparable comparable, Object obj) {
        this.LJLJI = vkv;
        this.LJLIL = comparable;
        this.LJLILLLLZI = obj;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.LJLIL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.LJLIL;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return String.valueOf(this.LJLIL) + "=" + String.valueOf(this.LJLILLLLZI);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.LJLIL.compareTo(((VKT) obj).LJLIL);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.LJLIL;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.LJLILLLLZI;
            Object value = entry.getValue();
            if (obj2 != null ? obj2.equals(value) : value == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.LJLJI.LJI();
        Object obj2 = this.LJLILLLLZI;
        this.LJLILLLLZI = obj;
        return obj2;
    }
}
