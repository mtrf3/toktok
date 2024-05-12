package X;

import android.content.Context;

/* renamed from: X.Ed1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36839Ed1 {
    public static String LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.String r0 = X.C79081V1x.LJIILJJIL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            java.lang.String r5 = X.C36839Ed1.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L17
        L12:
            X.C79081V1x.LJLILLLLZI = r5
        L14:
            java.lang.String r0 = X.C79081V1x.LJLILLLLZI
            return r0
        L17:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r6, r0)     // Catch: java.lang.Exception -> L40
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L40
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L40
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L40
        L2b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L44
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L40
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L40
            int r0 = r1.pid     // Catch: java.lang.Exception -> L40
            if (r0 != r3) goto L2b
            java.lang.String r5 = r1.processName     // Catch: java.lang.Exception -> L40
            X.C36839Ed1.LIZ = r5     // Catch: java.lang.Exception -> L40
            goto L12
        L40:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L44:
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L84
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L84
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L84
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L84
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
        L74:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L85
            if (r0 <= 0) goto L7f
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L85
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            goto L74
        L7f:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L85
            goto L87
        L84:
            r4 = r5
        L85:
            if (r4 == 0) goto L8a
        L87:
            r4.close()     // Catch: java.lang.Exception -> L8a
        L8a:
            X.C36839Ed1.LIZ = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36839Ed1.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        String LIZ2 = LIZ(context);
        if (LIZ2 == null || LIZ2.contains(":") || !LIZ2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }
}
