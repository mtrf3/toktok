package X;

import java.io.FileFilter;

/* loaded from: classes12.dex */
public final class PA9 implements FileFilter {
    public final /* synthetic */ PAB LIZ = PAA.LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if ((r5 - r1) >= 604800000) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r3 != 0) goto L17;
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
            X.PAB r0 = r8.LIZ
            r0.getClass()
            r7 = 0
            r3 = 1
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = ".bin"
            int r1 = r2.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L35
            r0 = -1
            if (r1 != r0) goto L15
            goto L44
        L15:
            java.lang.String r1 = r2.substring(r7, r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L35
            int r1 = r2.length     // Catch: java.lang.Throwable -> L35
            r0 = 2
            if (r1 >= r0) goto L24
            goto L44
        L24:
            r0 = r2[r3]     // Catch: java.lang.Throwable -> L35
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L35
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L38
            goto L3c
        L35:
            if (r3 == 0) goto L47
            goto L44
        L38:
            r0 = 16
            long r1 = r3 >> r0
        L3c:
            long r5 = r5 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
        L44:
            X.OPR.LIZ(r9)
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PA9.accept(java.io.File):boolean");
    }
}
