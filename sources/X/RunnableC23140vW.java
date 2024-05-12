package X;

/* renamed from: X.0vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC23140vW implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AbstractC35381aA LJLILLLLZI;

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r13 = this;
            X.1aA r5 = r13.LJLILLLLZI
            boolean r12 = r13.LJLIL
            X.1nu r5 = (X.C43901nu) r5
            r5.getClass()
            int r7 = android.os.Process.myPid()
            r6 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            r1.append(r7)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.lang.String r0 = "/stat"
            r1.append(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5b
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            r4.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            java.lang.String r0 = " "
            java.lang.String[] r3 = r1.split(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            r0 = 13
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            r2 = 14
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a
            goto L61
        L52:
            r0 = move-exception
            goto L56
        L54:
            r0 = move-exception
            r6 = r4
        L56:
            defpackage.g0.LJJIJL(r6)
            throw r0
        L5a:
            r6 = r4
        L5b:
            defpackage.g0.LJJIJL(r6)
            r0 = -1
            goto L65
        L61:
            long r0 = r0 + r2
            defpackage.g0.LJJIJL(r4)
        L65:
            long r2 = r5.LIZJ
            long r9 = r0 - r2
            r3 = 0
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L81
            X.IRT r6 = new X.IRT
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = r5.LIZIZ
            r6.<init>(r7, r9, r11, r12)
            X.0sU r2 = X.C21250sT.LIZ
            r2.LIZJ(r6)
            r5.LIZJ = r0
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC23140vW.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC23140vW(AbstractC35381aA abstractC35381aA, boolean z) {
        this.LJLILLLLZI = abstractC35381aA;
        this.LJLIL = z;
    }
}
