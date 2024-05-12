package ms.bd.o;

import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class l0 extends b.a {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ms.bd.o.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r21, int r23, java.lang.String r24, java.lang.Object r25) {
        /*
            r20 = this;
            ms.bd.o.a r0 = ms.bd.o.a.LIZIZ
            android.content.Context r4 = r0.LIZ
            r13 = 0
            r11 = 2
            r10 = 3
            r3 = 1
            r9 = 255(0xff, float:3.57E-43)
            r8 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r5.<init>()     // Catch: java.lang.Throwable -> L96
            java.io.File r0 = X.C16880lQ.LLIIJLIL(r4)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L96
            r5.append(r0)     // Catch: java.lang.Throwable -> L96
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            java.lang.String r16 = "e4ca19"
            byte[] r1 = new byte[r3]     // Catch: java.lang.Throwable -> L96
            r0 = 59
            r1[r13] = r0     // Catch: java.lang.Throwable -> L96
            r17 = r1
            java.lang.Object r0 = ms.bd.o.k.a(r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L96
            r5.append(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = ms.bd.o.p2.LIZ     // Catch: java.lang.Throwable -> L96
            r5.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L96
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L96
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L4c
            X.C16880lQ.LLLZZIL(r1)     // Catch: java.lang.Throwable -> L98
            r9 = 2
        L4c:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Throwable -> L96
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L96
            java.io.InputStream r2 = r0.open(r2)     // Catch: java.lang.Throwable -> L96
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L9a
            r6.<init>()     // Catch: java.lang.Throwable -> L9a
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r5]     // Catch: java.lang.Throwable -> L94
        L61:
            int r1 = r2.read(r4, r13, r5)     // Catch: java.lang.Throwable -> L94
            r0 = -1
            if (r1 == r0) goto L6c
            r6.write(r4, r13, r1)     // Catch: java.lang.Throwable -> L94
            goto L61
        L6c:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L94
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L94
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L94
            r1.write(r0)     // Catch: java.lang.Throwable -> L94
            r1.close()     // Catch: java.lang.Throwable -> L94
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L94
            if (r0 > 0) goto L83
            r13 = 3
            goto L90
        L83:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L94
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L94
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L8f
            goto L90
        L8f:
            r13 = r9
        L90:
            r2.close()     // Catch: java.lang.Throwable -> Lc6
            goto Lc6
        L94:
            r8 = r6
            goto L9a
        L96:
            r2 = r8
            goto L9a
        L98:
            r2 = r8
            r9 = 2
        L9a:
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            java.lang.String r18 = "7f6cc3"
            r0 = 4
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> Lcf
            r0 = 39
            r1[r13] = r0     // Catch: java.lang.Throwable -> Lcf
            r0 = 103(0x67, float:1.44E-43)
            r1[r3] = r0     // Catch: java.lang.Throwable -> Lcf
            r0 = 122(0x7a, float:1.71E-43)
            r1[r11] = r0     // Catch: java.lang.Throwable -> Lcf
            r0 = 16
            r1[r10] = r0     // Catch: java.lang.Throwable -> Lcf
            r19 = r1
            java.lang.Object r0 = ms.bd.o.k.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lcf
            if (r2 == 0) goto Lc2
            r2.close()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            if (r8 == 0) goto Lca
            r13 = r9
            r6 = r8
        Lc6:
            r6.close()     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r9 = r13
        Lca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            return r0
        Lcf:
            r0 = move-exception
            if (r2 == 0) goto Ld5
            r2.close()     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            if (r8 == 0) goto Lda
            r8.close()     // Catch: java.lang.Throwable -> Lda
        Lda:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.l0.LIZIZ(long, int, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
