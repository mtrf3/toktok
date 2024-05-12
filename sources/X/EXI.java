package X;

/* loaded from: classes7.dex */
public final class EXI {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto Lb
            java.lang.String r0 = android.app.Application.getProcessName()
            return r0
        Lb:
            r3 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r1 = r4.getMethod(r1, r0)     // Catch: java.lang.Exception -> L28
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L28
            return r0
        L28:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            java.lang.String r0 = "/proc/self/cmdline"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L57
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L57
            if (r0 != 0) goto L59
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L57
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L57
            if (r0 != 0) goto L59
            r2.close()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r1
        L4c:
            r0 = move-exception
            goto L50
        L4e:
            r0 = move-exception
            r2 = r3
        L50:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.lang.Exception -> L55
        L55:
            throw r0
        L56:
            r2 = r3
        L57:
            if (r2 == 0) goto L5c
        L59:
            r2.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXI.LIZ():java.lang.String");
    }

    public static boolean LIZIZ() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }
}
