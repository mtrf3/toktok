package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ecy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36836Ecy {
    public static String LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x009a, code lost:
    
        if (r4 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.String r0 = "application"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = X.C36836Ecy.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10
            java.lang.String r0 = X.C36836Ecy.LIZ
            return r0
        L10:
            r5 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1c
            r0 = 28
            if (r1 < r0) goto L1c
            java.lang.String r0 = android.app.Application.getProcessName()     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r0 = r5
        L1d:
            X.C36836Ecy.LIZ = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = X.C36836Ecy.LIZ
            return r0
        L28:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L42
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L42:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = r5
        L4b:
            X.C36836Ecy.LIZ = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L56
            java.lang.String r0 = X.C36836Ecy.LIZ
            return r0
        L56:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L99
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L99
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L99
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L99
            r1.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L99
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L99
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L99
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r1.<init>()     // Catch: java.lang.Throwable -> L9a
        L89:
            if (r0 <= 0) goto L94
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L9a
            r1.append(r0)     // Catch: java.lang.Throwable -> L9a
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L9a
            goto L89
        L94:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L99:
            r4 = r5
        L9a:
            if (r4 == 0) goto L9f
        L9c:
            r4.close()     // Catch: java.lang.Exception -> L9f
        L9f:
            X.C36836Ecy.LIZ = r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto Laa
            java.lang.String r0 = X.C36836Ecy.LIZ
            return r0
        Laa:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r6, r0)     // Catch: java.lang.Exception -> Le6
            if (r0 == 0) goto Lde
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> Le6
            java.util.List r1 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> Le6
            if (r1 == 0) goto Le6
            int r0 = r1.size()     // Catch: java.lang.Exception -> Le6
            if (r0 != 0) goto Lc1
            goto Le6
        Lc1:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> Le6
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Le6
        Lc9:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Le6
            if (r0 == 0) goto Le6
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Le6
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> Le6
            int r0 = r1.pid     // Catch: java.lang.Exception -> Le6
            if (r0 != r3) goto Lc9
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> Le6
            if (r0 == 0) goto Lc9
            goto Le8
        Lde:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> Le6
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            r1.<init>(r0)     // Catch: java.lang.Exception -> Le6
            throw r1     // Catch: java.lang.Exception -> Le6
        Le6:
            java.lang.String r0 = ""
        Le8:
            X.C36836Ecy.LIZ = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36836Ecy.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        String LIZ2 = LIZ(context);
        if (LIZ2 == null || s.LJJJLZIJ(LIZ2, ":", false)) {
            return false;
        }
        return o.LJ(LIZ2, context.getPackageName());
    }
}
