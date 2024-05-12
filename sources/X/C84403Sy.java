package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3Sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84403Sy extends C3UY {
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84403Sy)) {
            return false;
        }
        C84403Sy c84403Sy = (C84403Sy) obj;
        return o.LJ(this.LIZLLL, c84403Sy.LIZLLL) && o.LJ(this.LJ, c84403Sy.LJ) && o.LJ(this.LJFF, c84403Sy.LJFF);
    }

    public final int hashCode() {
        int hashCode = this.LIZLLL.hashCode() * 31;
        String str = this.LJ;
        return this.LJFF.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterStickerStoreEventBody(scene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", creatorUid=");
        LIZ.append(this.LJ);
        LIZ.append(", tab=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84403Sy(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r3 = 2
            X.OSZ[] r2 = new X.OSZ[r3]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "scene"
            r1.<init>(r0, r5)
            r0 = 0
            r2[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "tab"
            r1.<init>(r0, r7)
            r0 = 1
            r2[r0] = r1
            java.util.Map r2 = X.C113554cx.LJJL(r2)
            if (r6 != 0) goto L30
            java.lang.String r1 = ""
        L1f:
            java.lang.String r0 = "creator_user_id"
            java.util.Map r1 = X.E2C.LIZJ(r0, r1)
            r0 = 0
            r4.<init>(r2, r0, r1, r3)
            r4.LIZLLL = r5
            r4.LJ = r6
            r4.LJFF = r7
            return
        L30:
            r1 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84403Sy.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
