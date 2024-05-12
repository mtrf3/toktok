package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLX extends OFU {
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final java.util.Map<String, Object> LJLJJL;
    public final String LJLJJLL;
    public final List<String> LJLJL;

    public OLX() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = (JBR.LIZJ(this.LJLJI, this.LJLILLLLZI.hashCode() * 31, 31) + this.LJLJJI) * 31;
        java.util.Map<String, Object> map = this.LJLJJL;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return this.LJLJL.hashCode() + C79062V1e.LJ(this.LJLJJLL, (LIZJ + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHLeaveParam(leaveSource=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", notSuggestToUid=");
        LIZ.append(this.LJLJI);
        LIZ.append(", leaveReason=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", custom=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", source=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OLX)) {
            return false;
        }
        OLX olx = (OLX) obj;
        if (o.LJ(this.LJLILLLLZI, olx.LJLILLLLZI) && this.LJLJI == olx.LJLJI && this.LJLJJI == olx.LJLJJI && o.LJ(this.LJLJJL, olx.LJLJJL) && o.LJ(this.LJLJJLL, olx.LJLJJLL) && o.LJ(this.LJLJL, olx.LJLJL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OLX(java.lang.String r5, long r6, int r8) {
        /*
            r4 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r6 = 0
        L6:
            r0 = r8 & 16
            r3 = 0
            if (r0 == 0) goto L30
            java.lang.String r2 = ""
        Ld:
            r0 = r8 & 32
            if (r0 == 0) goto L2e
            X.OQg r1 = X.C61878OQg.INSTANCE
        L13:
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "sourceTrace"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r4.<init>(r1)
            r4.LJLILLLLZI = r5
            r4.LJLJI = r6
            r0 = 0
            r4.LJLJJI = r0
            r4.LJLJJL = r3
            r4.LJLJJLL = r2
            r4.LJLJL = r1
            return
        L2e:
            r1 = r3
            goto L13
        L30:
            r2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLX.<init>(java.lang.String, long, int):void");
    }
}
