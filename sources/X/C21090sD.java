package X;

/* renamed from: X.0sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21090sD {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static Boolean LIZLLL;

    public static boolean LIZIZ() {
        String LJJII = C86793Y4n.LJJII("ro.build.characteristics");
        if (LJJII != null && "tablet".equalsIgnoreCase(LJJII)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r3 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r7) {
        /*
            java.lang.String r5 = "Process"
            java.lang.String r4 = X.C21090sD.LIZJ
            boolean r0 = X.C38354F3m.LJ(r4)
            if (r0 != 0) goto L16
        La:
            r1 = 0
            if (r4 == 0) goto Lcf
            java.lang.String r0 = ":"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto Lc4
            return r1
        L16:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L5a
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r7, r0)     // Catch: java.lang.Exception -> L5a
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L5a
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L5a
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> L5a
        L2a:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L5a
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L5a
            int r0 = r2.pid     // Catch: java.lang.Exception -> L5a
            if (r0 != r3) goto L2a
            boolean r0 = X.C0NB.LIZJ()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L55
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L5a
            java.lang.String r0 = "processName = "
            r1.append(r0)     // Catch: java.lang.Exception -> L5a
            java.lang.String r0 = r2.processName     // Catch: java.lang.Exception -> L5a
            r1.append(r0)     // Catch: java.lang.Exception -> L5a
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L5a
            X.C0NB.LIZIZ(r5, r0)     // Catch: java.lang.Exception -> L5a
        L55:
            java.lang.String r4 = r2.processName     // Catch: java.lang.Exception -> L5a
            X.C21090sD.LIZJ = r4     // Catch: java.lang.Exception -> L5a
            goto La
        L5a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L5e:
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Lc0
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Lc0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> Lc0
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Lc0
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "iso-8859-1"
            r6.<init>(r2, r0)     // Catch: java.lang.Exception -> Lc0
            r3.<init>(r6)     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
        L8e:
            int r0 = r3.read()     // Catch: java.lang.Throwable -> Lbb
            if (r0 <= 0) goto L99
            char r0 = (char) r0     // Catch: java.lang.Throwable -> Lbb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L8e
        L99:
            boolean r0 = X.C0NB.LIZJ()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lb6
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "get processName = "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbb
            X.C0NB.LIZIZ(r5, r0)     // Catch: java.lang.Throwable -> Lbb
        Lb6:
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            goto Lbd
        Lbb:
            if (r3 == 0) goto Lc0
        Lbd:
            r3.close()
        Lc0:
            X.C21090sD.LIZJ = r4
            goto La
        Lc4:
            java.lang.String r0 = r7.getPackageName()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lcf
            r1 = 1
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21090sD.LIZ(android.content.Context):boolean");
    }
}
