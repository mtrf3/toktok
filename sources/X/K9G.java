package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9G implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K9G)) {
            return false;
        }
        K9G k9g = (K9G) obj;
        return o.LJ(this.LJLIL, k9g.LJLIL) && o.LJ(this.LJLILLLLZI, k9g.LJLILLLLZI) && this.LJLJI == k9g.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSearchBarState(hint=");
        LIZ.append(this.LJLIL);
        LIZ.append(", defaultKeyword=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFeedBackShow=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public K9G(String hint, String str, boolean z) {
        o.LJIIIZ(hint, "hint");
        this.LJLIL = hint;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
