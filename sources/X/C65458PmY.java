package X;

import java.util.Map;

/* renamed from: X.PmY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65458PmY implements Map.Entry<String, Object> {
    public Object LJLIL;
    public final C65454PmU LJLILLLLZI;
    public final /* synthetic */ C65452PmS LJLJI;

    @Override // java.util.Map.Entry
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final String getKey() {
        String str = this.LJLILLLLZI.LIZJ;
        if (this.LJLJI.LJLILLLLZI.LIZIZ) {
            return str.toLowerCase();
        }
        return str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return getKey().hashCode() ^ this.LJLIL.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LJLIL;
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
        if (getKey().equals(entry.getKey()) && this.LJLIL.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.LJLIL;
        obj.getClass();
        this.LJLIL = obj;
        this.LJLILLLLZI.LIZLLL(this.LJLJI.LJLIL, obj);
        return obj2;
    }

    public C65458PmY(C65452PmS c65452PmS, C65454PmU c65454PmU, Object obj) {
        this.LJLJI = c65452PmS;
        this.LJLILLLLZI = c65454PmU;
        obj.getClass();
        this.LJLIL = obj;
    }
}
