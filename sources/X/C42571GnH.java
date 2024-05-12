package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42571GnH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42571GnH)) {
            return false;
        }
        C42571GnH c42571GnH = (C42571GnH) obj;
        return o.LJ(this.LIZ, c42571GnH.LIZ) && o.LJ(this.LIZIZ, c42571GnH.LIZIZ) && o.LJ(this.LIZJ, c42571GnH.LIZJ) && this.LIZLLL == c42571GnH.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorDataDiffReport(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", info=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shouldShowWarning=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C42571GnH(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
