package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213648a0 implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C213648a0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213648a0)) {
            return false;
        }
        C213648a0 c213648a0 = (C213648a0) obj;
        return o.LJ(this.LJLIL, c213648a0.LJLIL) && o.LJ(this.LJLILLLLZI, c213648a0.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiSearchHierarchyData(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C213648a0(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
