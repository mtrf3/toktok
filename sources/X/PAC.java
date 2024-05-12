package X;

import java.io.FileFilter;

/* loaded from: classes12.dex */
public final class PAC implements FileFilter {
    public final /* synthetic */ PAS LIZ;

    public PAC(PAS pas) {
        this.LIZ = pas;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accept(java.io.File r9) {
        /*
            r8 = this;
            java.lang.String r6 = r9.getName()
            X.PAS r0 = r8.LIZ
            r0.getClass()
            java.lang.String r2 = r9.getName()
            r7 = 1
            r5 = 0
            java.lang.String r0 = "_"
            int r1 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L36
            r0 = -1
            if (r1 == r0) goto L2d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r2.substring(r5, r1)     // Catch: java.lang.Exception -> L36
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L36
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            if (r0 == 0) goto L36
            X.OPR.LIZ(r9)
            return r5
        L36:
            java.lang.String r0 = ".log"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L3f
            return r7
        L3f:
            java.lang.String r0 = ".tmp"
            r6.endsWith(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAC.accept(java.io.File):boolean");
    }
}
