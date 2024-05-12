package X;

import java.util.Map;

/* renamed from: X.ZbY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90256ZbY implements Map.Entry, Comparable<C90256ZbY> {
    public final Comparable LJLIL;
    public Object LJLILLLLZI;
    public final /* synthetic */ C90284Zc0 LJLJI;

    public C90256ZbY(C90284Zc0 c90284Zc0, Comparable comparable, Object obj) {
        this.LJLJI = c90284Zc0;
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
        String valueOf = String.valueOf(this.LJLIL);
        String valueOf2 = String.valueOf(this.LJLILLLLZI);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C90256ZbY c90256ZbY) {
        return this.LJLIL.compareTo(c90256ZbY.LJLIL);
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
