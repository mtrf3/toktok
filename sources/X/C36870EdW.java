package X;

/* renamed from: X.EdW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36870EdW {
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777269), block:B:29:0x0035 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "utf-8"
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
        L11:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
            r0 = -1
            if (r0 == r1) goto L1d
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
            goto L11
        L1d:
            r3.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L25:
            java.lang.String r0 = r5.toString()
            return r0
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r1 = move-exception
            goto L36
        L2e:
            r0 = move-exception
            r3 = r4
        L30:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L34
            goto L41
        L34:
            r1 = move-exception
            r4 = r3
        L36:
            if (r4 == 0) goto L40
            r4.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L40:
            throw r1
        L41:
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36870EdW.LIZ(java.io.InputStream):java.lang.String");
    }
}
