package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.Xyr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86605Xyr implements InterfaceC86633XzJ {
    public final /* synthetic */ CompletionBlock<InterfaceC86614Xz0> LIZ;

    public C86605Xyr(CompletionBlock<InterfaceC86614Xz0> completionBlock) {
        this.LIZ = completionBlock;
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
            java.lang.String r5 = r14.LLLLZ()
            int r0 = r5.length()
            r4 = 0
            if (r0 <= 0) goto L3a
            r0 = 1
        Lc:
            r6 = 0
            if (r0 == 0) goto L25
        Lf:
            java.io.InputStream r1 = r14.LLLLZLLIL()
            if (r1 != 0) goto L3c
            android.os.Handler r3 = X.VFS.LIZ()
            Y.ARunnableS11S1100000_10 r2 = new Y.ARunnableS11S1100000_10
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.Xz0> r1 = r13.LIZ
            r0 = 6
            r2.<init>(r1, r5, r0)
            r3.post(r2)
            return
        L25:
            java.lang.Throwable r0 = r14.LLLLZIL()
            if (r0 == 0) goto L38
            java.lang.String r5 = r0.getMessage()
            if (r5 == 0) goto L38
            int r0 = r5.length()
            if (r0 <= 0) goto L38
            goto Lf
        L38:
            r5 = r6
            goto Lf
        L3a:
            r0 = 0
            goto Lc
        L3c:
            X.2zl r0 = r14.LJLILLLLZI
            int r8 = r0.element
            java.util.LinkedHashMap r9 = r14.LJLIL
            X.2zl r0 = r14.LJLJI
            int r10 = r0.element
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lae
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
        L54:
            int r1 = r5.read(r3)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            r0 = -1
            if (r1 == r0) goto L5f
            r2.write(r3, r4, r1)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            goto L54
        L5f:
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            r0 = 2
            java.lang.String r11 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            android.os.Handler r0 = X.VFS.LIZ()     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            Y.ARunnableS1S1202000_15 r6 = new Y.ARunnableS1S1202000_15     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.Xz0> r7 = r13.LIZ     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            r0.post(r6)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> Lb0
            r14.LJLJI()     // Catch: java.io.IOException -> La9
            r5.close()     // Catch: java.io.IOException -> La9
            r2.close()     // Catch: java.io.IOException -> La9
            goto Lad
        L81:
            r4 = move-exception
            r6 = r2
            goto L8b
        L84:
            r4 = move-exception
            goto L8b
        L86:
            r1 = move-exception
            r0 = r6
            goto Lb4
        L89:
            r4 = move-exception
            r5 = r6
        L8b:
            android.os.Handler r3 = X.VFS.LIZ()     // Catch: java.lang.Throwable -> Lae
            Y.ARunnableS29S0200000_10 r2 = new Y.ARunnableS29S0200000_10     // Catch: java.lang.Throwable -> Lae
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.Xz0> r1 = r13.LIZ     // Catch: java.lang.Throwable -> Lae
            r0 = 39
            r2.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> Lae
            r3.post(r2)     // Catch: java.lang.Throwable -> Lae
            r14.LJLJI()     // Catch: java.io.IOException -> La9
            if (r5 == 0) goto La3
            r5.close()     // Catch: java.io.IOException -> La9
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
            r6 = r5
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
        throw new UnsupportedOperationException("Method not decompiled: X.C86605Xyr.LIZ(X.Xz9):void");
    }
}