package X;

import java.io.FileFilter;

/* loaded from: classes11.dex */
public final class OPQ implements FileFilter {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        if (r3 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r6 - r1) >= 604800000) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [long] */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accept(java.io.File r9) {
        /*
            r8 = this;
            r3 = 1
            r5 = 0
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = ".bin"
            int r1 = r2.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L22
            r0 = -1
            if (r1 == r0) goto L31
            java.lang.String r0 = r2.substring(r5, r1)     // Catch: java.lang.Throwable -> L22
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L22
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L25
            goto L29
        L22:
            if (r3 == 0) goto L53
            goto L31
        L25:
            r0 = 16
            long r1 = r3 >> r0
        L29:
            long r6 = r6 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L53
        L31:
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L50
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "deleteExpireHeader:"
            r1.append(r0)
            java.lang.String r0 = r9.getName()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "APM-Slardar"
            X.C64028PAy.LIZ(r0, r1)
        L50:
            X.OPR.LIZ(r9)
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPQ.accept(java.io.File):boolean");
    }
}
