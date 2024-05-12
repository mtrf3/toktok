package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AV9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AV9)) {
            return false;
        }
        AV9 av9 = (AV9) obj;
        return o.LJ(this.LIZ, av9.LIZ) && o.LJ(this.LIZIZ, av9.LIZIZ) && o.LJ(this.LIZJ, av9.LIZJ) && o.LJ(this.LIZLLL, av9.LIZLLL) && o.LJ(this.LJ, av9.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, (LJ + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnalyticsMetadata(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", channel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sdkName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sdkVersion=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AV9(java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r3 = 0
            r0 = r9 & 8
            java.lang.String r5 = ""
            if (r0 == 0) goto L15
            r4 = r5
        L8:
            r0 = r9 & 16
            if (r0 == 0) goto L13
        Lc:
            r1 = r7
            r2 = r8
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L13:
            r5 = r3
            goto Lc
        L15:
            r4 = r3
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AV9.<init>(java.lang.String, java.lang.String, int):void");
    }

    public AV9(String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str2, "enterMethod", str4, "sdkName", str5, "sdkVersion");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
