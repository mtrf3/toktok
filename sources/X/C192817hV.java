package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192817hV implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    public C192817hV() {
        this(false, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192817hV)) {
            return false;
        }
        C192817hV c192817hV = (C192817hV) obj;
        return this.LJLIL == c192817hV.LJLIL && o.LJ(this.LJLILLLLZI, c192817hV.LJLILLLLZI) && this.LJLJI == c192817hV.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + (this.LJLJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(moveToCollection=");
        LIZ.append(this.LJLIL);
        LIZ.append(", excludeId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", useCache=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C192817hV(boolean z, String str, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = z2;
    }
}
