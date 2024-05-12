package X;

/* renamed from: X.Nyl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61119Nyl {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C61048Nxc LIZ(android.view.View r13) {
        /*
            X.Nxc r3 = new X.Nxc
            r3.<init>()
            if (r13 == 0) goto L15
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L19
        L15:
            r0 = 3
            r3.LIZ = r0
            return r3
        L19:
            boolean r4 = r13.isDrawingCacheEnabled()
            r7 = 0
            r0 = 1
            if (r4 != 0) goto L24
            r13.setDrawingCacheEnabled(r0)     // Catch: java.lang.Throwable -> L85
        L24:
            android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L85
            android.graphics.Bitmap r5 = r13.getDrawingCache()     // Catch: java.lang.Throwable -> L85
            android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L85
            r2 = 2
            if (r5 == 0) goto L7d
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> L85
            int r0 = r5.getHeight()     // Catch: java.lang.Throwable -> L85
            r5.getConfig()     // Catch: java.lang.Throwable -> L85
            if (r1 <= 0) goto L7d
            if (r0 <= 0) goto L7d
            int r0 = r5.getPixel(r7, r7)     // Catch: java.lang.Throwable -> L85
            int r8 = r5.getWidth()     // Catch: java.lang.Throwable -> L85
            int r2 = r5.getHeight()     // Catch: java.lang.Throwable -> L85
            if (r8 <= 0) goto L74
            if (r2 <= 0) goto L74
            if (r0 != 0) goto L56
            int r0 = r5.getPixel(r7, r7)     // Catch: java.lang.Throwable -> L85
        L56:
            int[] r1 = new int[r8]     // Catch: java.lang.Throwable -> L85
            java.util.Arrays.fill(r1, r0)     // Catch: java.lang.Throwable -> L85
            int[] r6 = new int[r8]     // Catch: java.lang.Throwable -> L85
            r10 = 0
        L5e:
            r8 = r8
            r12 = 1
            r9 = r7
            r11 = r8
            r5.getPixels(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
            boolean r0 = java.util.Arrays.equals(r1, r6)     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L6c
            goto L74
        L6c:
            int r10 = r10 + 1
            r8 = r8
            if (r10 >= r2) goto L72
            goto L5e
        L72:
            r0 = 1
            goto L75
        L74:
            r0 = 2
        L75:
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L7c
            r13.setDrawingCacheEnabled(r7)
        L7c:
            return r3
        L7d:
            if (r4 != 0) goto L82
            r13.setDrawingCacheEnabled(r7)
        L82:
            r3.LIZ = r2
            return r3
        L85:
            r0 = 3
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r0 = move-exception
            if (r4 != 0) goto L8f
            r13.setDrawingCacheEnabled(r7)
        L8f:
            throw r0
        L90:
            if (r4 != 0) goto L95
            r13.setDrawingCacheEnabled(r7)
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61119Nyl.LIZ(android.view.View):X.Nxc");
    }
}
