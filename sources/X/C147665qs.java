package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147665qs {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C147665qs)) {
            return false;
        }
        C147665qs c147665qs = (C147665qs) obj;
        return o.LJ(this.LIZ, c147665qs.LIZ) && o.LJ(this.LIZIZ, c147665qs.LIZIZ) && this.LIZJ == c147665qs.LIZJ && o.LJ(this.LIZLLL, c147665qs.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackgroundInfo(fileName=");
        LIZ.append(this.LIZ);
        LIZ.append(", filePath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textColor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", iconPath=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C147665qs(String str, String filePath, int i, String str2) {
        o.LJIIIZ(filePath, "filePath");
        this.LIZ = str;
        this.LIZIZ = filePath;
        this.LIZJ = i;
        this.LIZLLL = str2;
    }
}
