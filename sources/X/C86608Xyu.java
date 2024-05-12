package X;

/* renamed from: X.Xyu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86608Xyu implements InterfaceC86633XzJ {
    public final /* synthetic */ RunnableC86598Xyk LIZ;

    public C86608Xyu(RunnableC86598Xyk runnableC86598Xyk) {
        this.LIZ = runnableC86598Xyk;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[Catch: IOException -> 0x00c2, TryCatch #4 {IOException -> 0x00c2, blocks: (B:42:0x00b4, B:44:0x00b9, B:46:0x00be), top: B:41:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[Catch: IOException -> 0x00c2, TRY_LEAVE, TryCatch #4 {IOException -> 0x00c2, blocks: (B:42:0x00b4, B:44:0x00b9, B:46:0x00be), top: B:41:0x00b4 }] */
    @Override // X.InterfaceC86633XzJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C86623Xz9 r14) {
        /*
            r13 = this;
            java.lang.String r3 = r14.LLLLZ()
            int r0 = r3.length()
            r5 = 0
            if (r0 <= 0) goto L39
            r0 = 1
        Lc:
            r6 = 0
            if (r0 == 0) goto L24
        Lf:
            java.io.InputStream r1 = r14.LLLLZLLIL()
            r7 = r13
            if (r1 != 0) goto L3b
            android.os.Handler r2 = X.VFS.LIZ()
            Y.ARunnableS16S1100000_15 r1 = new Y.ARunnableS16S1100000_15
            r0 = 3
            r1.<init>(r7, r3, r0)
            r2.post(r1)
            return
        L24:
            java.lang.Throwable r0 = r14.LLLLZIL()
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L37
            int r0 = r3.length()
            if (r0 <= 0) goto L37
            goto Lf
        L37:
            r3 = r6
            goto Lf
        L39:
            r0 = 0
            goto Lc
        L3b:
            X.2zl r0 = r14.LJLILLLLZI
            int r8 = r0.element
            java.util.LinkedHashMap r9 = r14.LJLIL
            X.2zl r0 = r14.LJLJI
            int r10 = r0.element
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> Lae
            X.2zl r0 = new X.2zl     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r0.<init>()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
        L58:
            int r1 = r4.read(r3)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r0 = -1
            if (r1 == r0) goto L63
            r2.write(r3, r5, r1)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            goto L58
        L63:
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r0 = 2
            java.lang.String r11 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            android.os.Handler r0 = X.VFS.LIZ()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            Y.ARunnableS1S1202000_15 r6 = new Y.ARunnableS1S1202000_15     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r12 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r0.post(r6)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lb0
            r14.LJLJI()     // Catch: java.io.IOException -> La9
            r4.close()     // Catch: java.io.IOException -> La9
            r2.close()     // Catch: java.io.IOException -> La9
            goto Lad
        L83:
            r3 = move-exception
            r6 = r2
            goto L8d
        L86:
            r3 = move-exception
            goto L8d
        L88:
            r1 = move-exception
            r0 = r6
            goto Lb4
        L8b:
            r3 = move-exception
            r4 = r6
        L8d:
            android.os.Handler r2 = X.VFS.LIZ()     // Catch: java.lang.Throwable -> Lae
            Y.ARunnableS34S0200000_15 r1 = new Y.ARunnableS34S0200000_15     // Catch: java.lang.Throwable -> Lae
            r0 = 51
            r1.<init>(r7, r3, r0)     // Catch: java.lang.Throwable -> Lae
            r2.post(r1)     // Catch: java.lang.Throwable -> Lae
            r14.LJLJI()     // Catch: java.io.IOException -> La9
            if (r4 == 0) goto La3
            r4.close()     // Catch: java.io.IOException -> La9
        La3:
            if (r6 == 0) goto Lad
            r6.close()     // Catch: java.io.IOException -> La9
            goto Lad
        La9:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lad:
            return
        Lae:
            r1 = move-exception
            goto Lb2
        Lb0:
            r1 = move-exception
            r6 = r2
        Lb2:
            r0 = r6
            r6 = r4
        Lb4:
            r14.LJLJI()     // Catch: java.io.IOException -> Lc2
            if (r6 == 0) goto Lbc
            r6.close()     // Catch: java.io.IOException -> Lc2
        Lbc:
            if (r0 == 0) goto Lc6
            r0.close()     // Catch: java.io.IOException -> Lc2
            goto Lc6
        Lc2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lc6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86608Xyu.LIZ(X.Xz9):void");
    }
}
