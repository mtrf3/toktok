package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EiF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37163EiF {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37163EiF)) {
            return false;
        }
        C37163EiF c37163EiF = (C37163EiF) obj;
        return this.LIZ == c37163EiF.LIZ && o.LJ(this.LIZIZ, c37163EiF.LIZIZ) && o.LJ(this.LIZJ, c37163EiF.LIZJ) && o.LJ(this.LIZLLL, c37163EiF.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LIZLLL.hashCode() + ((LJ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestInput(flag=");
        LIZ.append(this.LIZ);
        LIZ.append(", method=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZJ);
        LIZ.append(", headers=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C37163EiF(java.util.Map headers, String str, int i, String str2) {
        o.LJIIIZ(headers, "headers");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = headers;
    }
}
