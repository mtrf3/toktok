package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113624d4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113624d4)) {
            return false;
        }
        C113624d4 c113624d4 = (C113624d4) obj;
        return o.LJ(this.LIZ, c113624d4.LIZ) && o.LJ(this.LIZIZ, c113624d4.LIZIZ) && o.LJ(this.LIZJ, c113624d4.LIZJ) && o.LJ(this.LIZLLL, c113624d4.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClusterInfo(shortName=");
        LIZ.append(this.LIZ);
        LIZ.append(", fullName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", language=");
        LIZ.append(this.LIZJ);
        LIZ.append(", saucLanguage=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C113624d4(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "shortName", str2, "fullName", str3, "language", str4, "saucLanguage");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
