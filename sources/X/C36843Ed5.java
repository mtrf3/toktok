package X;

/* renamed from: X.Ed5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36843Ed5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r6) {
        /*
            r4 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L20
            r3 = 1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L20
            r0[r2] = r6     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L20
            goto L68
        L20:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.String r0 = "getprop "
            r1.append(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            r1.append(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.Process r0 = r2.exec(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.String r0 = "UTF-8"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5f
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            r3.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            r3.close()     // Catch: java.io.IOException -> L66
            goto L66
        L55:
            r0 = move-exception
            r4 = r3
            goto L59
        L58:
            r0 = move-exception
        L59:
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.io.IOException -> L5e
        L5e:
            throw r0
        L5f:
            r3 = r4
        L60:
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.io.IOException -> L67
            goto L67
        L66:
            r4 = r0
        L67:
            r0 = r4
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36843Ed5.LIZ(java.lang.String):java.lang.String");
    }
}
