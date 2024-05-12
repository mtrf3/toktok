package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84393Sx extends C3UY {
    public final String LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84393Sx)) {
            return false;
        }
        C84393Sx c84393Sx = (C84393Sx) obj;
        return o.LJ(this.LIZLLL, c84393Sx.LIZLLL) && o.LJ(this.LJ, c84393Sx.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZLLL.hashCode() * 31;
        Long l = this.LJ;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterStickerInputPanelEventBody(scene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stickerSetId=");
        return JBR.LJ(LIZ, this.LJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84393Sx(java.lang.String r5, java.lang.Long r6) {
        /*
            r4 = this;
            java.lang.String r0 = "scene"
            java.util.Map r3 = X.E2C.LIZJ(r0, r5)
            if (r6 == 0) goto L25
            long r0 = r6.longValue()
        Lc:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "sticker_set_id"
            r1.<init>(r0, r2)
            java.util.Map r2 = X.C51029K0z.LJJIIZI(r1)
            r1 = 2
            r0 = 0
            r4.<init>(r3, r0, r2, r1)
            r4.LIZLLL = r5
            r4.LJ = r6
            return
        L25:
            r0 = -1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84393Sx.<init>(java.lang.String, java.lang.Long):void");
    }
}
