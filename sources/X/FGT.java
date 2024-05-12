package X;

/* loaded from: classes7.dex */
public final class FGT {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static boolean LIZ() {
        if (!LIZJ) {
            boolean z = false;
            if (C00F.LIZ(31744, 0, "optimize_push_process_v2", true) == 1) {
                z = true;
            }
            LIZLLL = z;
            LIZJ = true;
        }
        return LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if (X.FTB.LIZJ() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r4) {
        /*
            boolean r0 = X.FGT.LIZIZ
            if (r0 != 0) goto L74
            java.lang.Class<X.FGT> r3 = X.FGT.class
            monitor-enter(r3)
            boolean r0 = X.FGT.LIZIZ     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6f
            r2 = 1
            if (r4 == 0) goto L6d
            boolean r0 = X.C36839Ed1.LIZIZ(r4)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L6d
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "optimize_push_process"
            r0.getClass()     // Catch: java.lang.Throwable -> L69
            r0 = 31744(0x7c00, float:4.4483E-41)
            int r1 = X.FFL.LJIIJ(r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L69
            r0 = 4
            if (r1 != r0) goto L45
            X.FGT.LIZ = r2     // Catch: java.lang.Throwable -> L69
        L28:
            boolean r0 = LIZ()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L30
            X.FGT.LIZ = r2     // Catch: java.lang.Throwable -> L69
        L30:
            boolean r0 = X.FGT.LIZ     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L65
            java.lang.Boolean r0 = X.C38987FRv.LIZLLL()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L63
            boolean r0 = X.C63081OpJ.LJZ()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L63
            goto L65
        L45:
            if (r1 == r2) goto L28
            X.FTB.LIZ(r4)     // Catch: java.lang.Throwable -> L69
            r0 = 3
            if (r1 != r0) goto L54
            boolean r0 = X.C16880lQ.LLLZLL()     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L5d
            goto L5f
        L54:
            r0 = 2
            if (r1 != r0) goto L5f
            boolean r0 = X.FTB.LIZJ()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L5f
        L5d:
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            X.FGT.LIZ = r0     // Catch: java.lang.Throwable -> L69
            goto L28
        L63:
            r0 = 0
            goto L66
        L65:
            r0 = 1
        L66:
            X.FGT.LIZ = r0     // Catch: java.lang.Throwable -> L69
            goto L6a
        L69:
            r2 = 0
        L6a:
            X.FGT.LIZIZ = r2     // Catch: java.lang.Throwable -> L71
            goto L6f
        L6d:
            X.FGT.LIZIZ = r2     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L74
        L71:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r0
        L74:
            boolean r0 = X.FGT.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.LIZIZ(android.content.Context):boolean");
    }
}
