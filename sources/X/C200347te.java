package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200347te {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200347te)) {
            return false;
        }
        C200347te c200347te = (C200347te) obj;
        return o.LJ(this.LIZ, c200347te.LIZ) && this.LIZIZ == c200347te.LIZIZ && this.LIZJ == c200347te.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeDiggDisplayState(displayCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", displayVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C200347te(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
