package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.ChP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32015ChP {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32015ChP)) {
            return false;
        }
        C32015ChP c32015ChP = (C32015ChP) obj;
        return o.LJ(this.LIZ, c32015ChP.LIZ) && o.LJ(this.LIZIZ, c32015ChP.LIZIZ) && o.LJ(this.LIZJ, c32015ChP.LIZJ) && o.LJ(this.LIZLLL, c32015ChP.LIZLLL) && o.LJ(this.LJ, c32015ChP.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        String str = this.LJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicALogParams(level=");
        LIZ.append(this.LIZ);
        LIZ.append(", tag=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", module=");
        LIZ.append(this.LIZJ);
        LIZ.append(", detail=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C32015ChP(String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str2, "tag", str3, "module", str4, "detail");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
