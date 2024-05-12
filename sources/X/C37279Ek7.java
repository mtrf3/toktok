package X;

/* renamed from: X.Ek7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37279Ek7 {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.C43247GyB r25) {
        /*
            r13 = 0
            r0 = r22
            java.util.List r1 = X.C36363EOx.extractImageUrlList(r0, r13)
            r9 = 0
            if (r1 == 0) goto L10
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
        L10:
            return r9
        L11:
            java.util.Iterator r8 = r1.iterator()
            r2 = 0
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L10
            java.lang.Object r4 = r8.next()
            X.EOy r4 = (X.C36364EOy) r4
            if (r4 != 0) goto L25
            goto L16
        L25:
            java.lang.String r11 = r4.LIZ
            boolean r0 = X.C38354F3m.LJ(r11)
            if (r0 == 0) goto L2e
            goto L16
        L2e:
            int r2 = r2 + 1
            r0 = 3
            if (r2 <= r0) goto L34
            goto L10
        L34:
            com.bytedance.common.utility.Logger.debug()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            int[] r1 = new int[r0]
            if (r21 == 0) goto L47
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L8d
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L8d
            if (r0 != 0) goto L47
            goto L10
        L47:
            java.util.List<X.QCp> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L8d
            r10 = 20971520(0x1400000, float:3.526483E-38)
            r12 = r23
            r15 = r25
            r14 = r24
            r16 = r14
            r17 = r13
            r18 = r0
            r19 = r3
            r20 = r1
            boolean r7 = com.ss.android.common.util.NetworkUtils.downloadFile(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8f
            if (r7 != 0) goto L62
            goto Lae
        L62:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> Lae
            r3.<init>(r12, r14)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            boolean r0 = r3.isFile()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            if (r0 == 0) goto Lae
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lae
            java.util.concurrent.atomic.AtomicLong r0 = X.XG3.LJLLI     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            r0.addAndGet(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            r0 = r1[r9]     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            if (r0 > 0) goto Lae
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lae
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            r1[r9] = r0     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> Lae
            goto Lae
        L8b:
            r1 = move-exception
            goto L90
        L8d:
            r1 = move-exception
            goto L90
        L8f:
            r1 = move-exception
        L90:
            boolean r0 = r1 instanceof java.net.SocketException
            if (r0 != 0) goto La0
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 != 0) goto La0
            boolean r0 = r1 instanceof java.net.SocketTimeoutException
            if (r0 != 0) goto La0
            boolean r0 = r1 instanceof X.C64923Pdv
            if (r0 == 0) goto Lb1
        La0:
            if (r21 != 0) goto La4
            goto L10
        La4:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L10
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L16
            goto L10
        Lae:
            r9 = r7
            goto L10
        Lb1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37279Ek7.LIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.String, X.GyB):boolean");
    }
}
