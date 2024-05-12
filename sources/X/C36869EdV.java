package X;

/* renamed from: X.EdV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36869EdV {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:35:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.io.InputStream r6) {
        /*
            java.lang.String r2 = "UTF-8"
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.lang.String r1 = ""
            java.lang.CharSequence r0 = ujb.s.LJZI(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r0 == 0) goto L1e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L23
        L1e:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
        L23:
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4a
        L27:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4a
            r0 = -1
            if (r0 == r1) goto L33
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4a
            goto L27
        L33:
            r3.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3b:
            java.lang.String r0 = r5.toString()
            return r0
        L40:
            r0 = move-exception
            goto L46
        L42:
            r1 = move-exception
            goto L4c
        L44:
            r0 = move-exception
            r3 = r4
        L46:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L4a
            goto L57
        L4a:
            r1 = move-exception
            r4 = r3
        L4c:
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L56:
            throw r1
        L57:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36869EdV.LIZ(java.io.InputStream):java.lang.String");
    }
}
