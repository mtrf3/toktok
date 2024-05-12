package X;

/* renamed from: X.Giu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42300Giu {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.graphics.Bitmap r4, java.io.File r5, int r6, android.graphics.Bitmap.CompressFormat r7) {
        /*
            r3 = 0
            r2 = 0
            boolean r0 = r4.isRecycled()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            if (r0 == 0) goto L9
            return r3
        L9:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r0.<init>(r5)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r1.<init>(r0)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r4.compress(r7, r6, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.flush()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.close()     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = 1
            goto L33
        L1e:
            r0 = move-exception
            goto L2d
        L20:
            r0 = move-exception
            r2 = r1
            goto L24
        L23:
            r0 = move-exception
        L24:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L28
            goto L31
        L28:
            r0 = move-exception
            r1 = r2
            if (r2 != 0) goto L2d
        L2c:
            throw r0
        L2d:
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L31:
            if (r2 != 0) goto L34
        L33:
            return r3
        L34:
            r2.close()     // Catch: java.lang.Throwable -> L33
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42300Giu.LIZ(android.graphics.Bitmap, java.io.File, int, android.graphics.Bitmap$CompressFormat):boolean");
    }
}
