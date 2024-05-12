package X;

/* renamed from: X.Eek, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36946Eek {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = 0
            android.content.res.AssetManager r0 = r5.getAssets()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L31
            java.io.InputStream r3 = r0.open(r6)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L31
            int r0 = r3.available()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            r3.read(r2)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            java.lang.String r0 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            java.lang.String r0 = new java.lang.String     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2e
            r3.close()     // Catch: java.io.IOException -> L25
        L25:
            return r0
        L26:
            r0 = move-exception
            goto L2a
        L28:
            r0 = move-exception
            r3 = r4
        L2a:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L2e
            goto L38
        L2e:
            r0 = move-exception
            r4 = r3
            goto L32
        L31:
            r0 = move-exception
        L32:
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L37
        L37:
            throw r0
        L38:
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L3d
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36946Eek.LIZ(android.content.Context, java.lang.String):java.lang.String");
    }
}
