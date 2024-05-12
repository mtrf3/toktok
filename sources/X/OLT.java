package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLT extends OFV {
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final List<String> LJLJJI;

    public OLT() {
        this(0, null, 7);
    }

    public final int hashCode() {
        return this.LJLJJI.hashCode() + C79062V1e.LJ(this.LJLJI, this.LJLILLLLZI * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinCancelResult(joinType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", logId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OLT)) {
            return false;
        }
        OLT olt = (OLT) obj;
        if (this.LJLILLLLZI == olt.LJLILLLLZI && o.LJ(this.LJLJI, olt.LJLJI) && o.LJ(this.LJLJJI, olt.LJLJJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OLT(int r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            java.lang.String r4 = ""
        Lb:
            r0 = r5 & 4
            if (r0 == 0) goto L25
            X.OQg r1 = X.C61878OQg.INSTANCE
        L11:
            java.lang.String r0 = "logId"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "sourceTrace"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r2.LJLJI = r4
            r2.LJLJJI = r1
            return
        L25:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLT.<init>(int, java.lang.String, int):void");
    }
}
