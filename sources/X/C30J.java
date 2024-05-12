package X;

import java.util.Objects;

/* renamed from: X.30J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30J extends C3UY {
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(this.LJFF), Boolean.valueOf(this.LJI), this.LJII, this.LJIIIIZZ, Boolean.valueOf(this.LJIIIZ), this.LJIIJ, this.LJIIJJI};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30J) {
            return C78966Uyw.LJIIIZ(((C30J) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ImageShowEventBody:%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30J(java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, java.lang.String r26, java.lang.String r27, int r28, int r29, boolean r30, int r31) {
        /*
            r21 = this;
            r6 = r28
            r8 = r24
            r1 = r31
            r5 = r29
            r7 = r26
            r0 = r1 & 1
            r14 = 0
            if (r0 == 0) goto L10
            r8 = 0
        L10:
            r0 = r1 & 2
            if (r0 == 0) goto L15
            r6 = -1
        L15:
            r0 = r1 & 4
            if (r0 == 0) goto L1a
            r5 = -1
        L1a:
            r0 = r1 & 128(0x80, float:1.8E-43)
            java.lang.String r4 = ""
            if (r0 == 0) goto L21
            r7 = r4
        L21:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lca
        L25:
            java.lang.String r3 = "scene"
            java.lang.String r18 = "failureReason"
            java.lang.String r20 = "errorMsg"
            r15 = r22
            r19 = r4
            r17 = r7
            r16 = r3
            X.HH1.LIZ(r15, r16, r17, r18, r19, r20)
            r0 = 6
            X.OSZ[] r12 = new X.OSZ[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "animate"
            r1.<init>(r0, r2)
            r12[r14] = r1
            r10 = r25
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "is_success"
            r1.<init>(r0, r2)
            r13 = 1
            r12[r13] = r1
            X.OSZ r0 = new X.OSZ
            r0.<init>(r3, r15)
            r3 = 2
            r12[r3] = r0
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "failure_reason"
            r1.<init>(r0, r7)
            r11 = 3
            r12[r11] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "error_msg"
            r1.<init>(r0, r4)
            r0 = 4
            r12[r0] = r1
            r9 = r30
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "from_cache"
            r1.<init>(r0, r2)
            r0 = 5
            r12[r0] = r1
            java.util.Map r2 = X.C113554cx.LJJL(r12)
            X.OSZ[] r12 = new X.OSZ[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "width"
            r1.<init>(r0, r11)
            r12[r14] = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "height"
            r1.<init>(r0, r11)
            r12[r13] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "url"
            r11 = r23
            r1.<init>(r0, r11)
            r12[r3] = r1
            java.util.Map r1 = X.C113554cx.LJJL(r12)
            r0 = 0
            r12 = r21
            r12.<init>(r2, r0, r1, r3)
            r12.LIZLLL = r8
            r12.LJ = r6
            r12.LJFF = r5
            r12.LJI = r10
            r12.LJII = r15
            r12.LJIIIIZZ = r11
            r12.LJIIIZ = r9
            r12.LJIIJ = r7
            r12.LJIIJJI = r4
            return
        Lca:
            r4 = r27
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30J.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, int, boolean, int):void");
    }
}
