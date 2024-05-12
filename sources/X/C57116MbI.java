package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.MbI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57116MbI {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57116MbI)) {
            return false;
        }
        C57116MbI c57116MbI = (C57116MbI) obj;
        return o.LJ(this.LIZ, c57116MbI.LIZ) && o.LJ(this.LIZIZ, c57116MbI.LIZIZ) && o.LJ(this.LIZJ, c57116MbI.LIZJ);
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
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NavigateAwemeDetailData(awemeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", questionId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", content=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C57116MbI(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
