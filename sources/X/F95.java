package X;

/* loaded from: classes7.dex */
public final class F95 {
    public static boolean LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r2.canWrite() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return new java.io.File(r2, ".dump.hporf");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r2.exists() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r2.canWrite() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r2.exists() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File LIZ(android.content.Context r5, boolean r6) {
        /*
            r4 = 0
            if (r6 != 0) goto L54
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L42
        L9:
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "liko"
            java.io.File r3 = X.C16880lQ.LLIIJI(r5, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "leakcanary-"
            r1.append(r0)
            java.lang.String r0 = r5.getPackageName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r3, r0)
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L34
            boolean r0 = r2.exists()
            if (r0 == 0) goto L74
        L34:
            boolean r0 = r2.canWrite()
            if (r0 == 0) goto L74
        L3a:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = ".dump.hporf"
            r1.<init>(r2, r0)
            return r1
        L42:
            boolean r0 = X.F95.LIZ
            if (r0 == 0) goto L47
            goto L9
        L47:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = r5.checkSelfPermission(r0)
            if (r0 != 0) goto L72
            r0 = 1
        L50:
            X.F95.LIZ = r0
            if (r0 != 0) goto L9
        L54:
            java.io.File r2 = new java.io.File
            java.io.File r1 = X.C16880lQ.LLIIJLIL(r5)
            java.lang.String r0 = "leakcanary"
            r2.<init>(r1, r0)
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L6b
            boolean r0 = r2.exists()
            if (r0 == 0) goto L74
        L6b:
            boolean r0 = r2.canWrite()
            if (r0 == 0) goto L74
            goto L3a
        L72:
            r0 = 0
            goto L50
        L74:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F95.LIZ(android.content.Context, boolean):java.io.File");
    }
}
