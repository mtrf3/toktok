package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLS extends OFV {
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final List<String> LJLJJI;

    public OLS() {
        this(null, 0L, 7);
    }

    public final int hashCode() {
        return this.LJLJJI.hashCode() + JBR.LIZJ(this.LJLJI, this.LJLILLLLZI.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHLeaveResult(logId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", feedbackShowReason=");
        LIZ.append(this.LJLJI);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OLS)) {
            return false;
        }
        OLS ols = (OLS) obj;
        if (o.LJ(this.LJLILLLLZI, ols.LJLILLLLZI) && this.LJLJI == ols.LJLJI && o.LJ(this.LJLJJI, ols.LJLJJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OLS(java.lang.String r3, long r4, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r0 = r6 & 2
            if (r0 == 0) goto Lc
            r4 = 0
        Lc:
            r0 = r6 & 4
            if (r0 == 0) goto L26
            X.OQg r1 = X.C61878OQg.INSTANCE
        L12:
            java.lang.String r0 = "logId"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "sourceTrace"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r2.LJLJI = r4
            r2.LJLJJI = r1
            return
        L26:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLS.<init>(java.lang.String, long, int):void");
    }
}
