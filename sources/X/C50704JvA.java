package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JvA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50704JvA implements InterfaceC50310Joo {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50704JvA)) {
            return false;
        }
        C50704JvA c50704JvA = (C50704JvA) obj;
        return this.LIZ == c50704JvA.LIZ && this.LIZIZ == c50704JvA.LIZIZ && o.LJ(this.LIZJ, c50704JvA.LIZJ) && o.LJ(this.LIZLLL, c50704JvA.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchUpdateBlankPageAction(launchTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", requestTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", blankPageEnterForm=");
        LIZ.append(this.LIZJ);
        LIZ.append(", blankPageEnterMethod=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C50704JvA(long j, long j2, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
