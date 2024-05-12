package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42576GnM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42576GnM)) {
            return false;
        }
        C42576GnM c42576GnM = (C42576GnM) obj;
        return o.LJ(this.LIZ, c42576GnM.LIZ) && o.LJ(this.LIZIZ, c42576GnM.LIZIZ) && o.LJ(this.LIZJ, c42576GnM.LIZJ) && this.LIZLLL == c42576GnM.LIZLLL;
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
        LIZ.append("CommerceTransDataDiffReport(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", oriId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", finalId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shouldShowWarning=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C42576GnM(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
