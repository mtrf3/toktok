package X;

/* renamed from: X.Ecz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36837Ecz {
    public static String LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r5) {
        /*
            java.lang.String r1 = X.C36837Ecz.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            return r1
        L9:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r5, r0)     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L32
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L32
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L32
        L1d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L32
            int r0 = r1.pid     // Catch: java.lang.Exception -> L32
            if (r0 != r3) goto L1d
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L32
            X.C36837Ecz.LIZ = r0     // Catch: java.lang.Exception -> L32
            return r0
        L32:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L36:
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L76
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L76
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L76
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L76
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
        L66:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L77
            if (r0 <= 0) goto L71
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L77
            r1.append(r0)     // Catch: java.lang.Throwable -> L77
            goto L66
        L71:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L77
            goto L79
        L76:
            r4 = r5
        L77:
            if (r4 == 0) goto L7c
        L79:
            r4.close()     // Catch: java.lang.Exception -> L7c
        L7c:
            X.C36837Ecz.LIZ = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36837Ecz.LIZ(android.content.Context):java.lang.String");
    }
}
