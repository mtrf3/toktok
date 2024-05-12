package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.G2y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40888G2y {
    public final String LIZ = "default";
    public final String LIZIZ = "default@email.com";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40888G2y)) {
            return false;
        }
        C40888G2y c40888G2y = (C40888G2y) obj;
        return o.LJ(this.LIZ, c40888G2y.LIZ) && o.LJ(this.LIZIZ, c40888G2y.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomType(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", email=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
