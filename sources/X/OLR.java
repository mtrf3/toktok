package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLR extends OFV {
    public final String LJLILLLLZI;
    public final List<String> LJLJI;

    public OLR() {
        this(null, 3);
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + (this.LJLILLLLZI.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHQuickPairResult(logId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OLR)) {
            return false;
        }
        OLR olr = (OLR) obj;
        if (o.LJ(this.LJLILLLLZI, olr.LJLILLLLZI) && o.LJ(this.LJLJI, olr.LJLJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OLR(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto L1e
            X.OQg r1 = X.C61878OQg.INSTANCE
        Lc:
            java.lang.String r0 = "logId"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "sourceTrace"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r2.LJLJI = r1
            return
        L1e:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLR.<init>(java.lang.String, int):void");
    }
}
