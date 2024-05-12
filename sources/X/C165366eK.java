package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.utils.FileCopyUtilsKt$copyFileToGallery$2", f = "FileCopyUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165366eK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC165396eN>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165366eK(String str, InterfaceC67352kd<? super C165366eK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C165366eK c165366eK = new C165366eK(this.LJLILLLLZI, interfaceC67352kd);
        c165366eK.LJLIL = obj;
        return c165366eK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (X.C39579Fg7.LIZLLL(r13.LJLILLLLZI, r4) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if ((true ^ X.C39579Fg7.LIZLLL(r13.LJLILLLLZI, r4)) == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, android.net.Uri] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.C141335gf.LIZJ(r14)
            android.content.Context r7 = X.EF7.LIZIZ()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = X.C163296az.LIZIZ()
            r2.append(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r13.LJLILLLLZI
            r1.<init>(r0)
            java.lang.String r0 = r1.getName()
            r2.append(r0)
            java.lang.String r4 = X.X1D.LIZIZ(r2)
            X.34K r6 = new X.34K
            r6.<init>()
            r3 = 1
            r6.element = r3
            X.2mC r2 = new X.2mC
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L6e
            java.lang.String r5 = r13.LJLILLLLZI
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L56
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r0.getName()     // Catch: java.lang.Throwable -> L56
            r0 = 0
            android.net.Uri r0 = X.C268613q.LJIIIIZZ(r7, r5, r0)     // Catch: java.lang.Throwable -> L56
            r2.element = r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            r6.element = r0     // Catch: java.lang.Throwable -> L56
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L56
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L56
            goto L5e
        L56:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L5e:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 != 0) goto L65
            goto L76
        L65:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r0.exists()
            goto L76
        L6e:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r0.exists()
        L76:
            boolean r0 = r6.element
            if (r0 != 0) goto L84
            X.6eM r1 = new X.6eM
            T r0 = r2.element
            android.net.Uri r0 = (android.net.Uri) r0
            r1.<init>(r0)
            return r1
        L84:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto La3
            java.lang.String r8 = r13.LJLILLLLZI     // Catch: java.lang.Exception -> Laf
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = r13.LJLILLLLZI     // Catch: java.lang.Exception -> Laf
            r1.<init>(r0)     // Catch: java.lang.Exception -> Laf
            java.lang.String r9 = r1.getName()     // Catch: java.lang.Exception -> Laf
            r10 = 0
            java.lang.String r11 = "image/png"
            r12 = 32
            android.net.Uri r0 = X.C44694HgQ.LJJI(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Laf
            r2.element = r0     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto Lac
            goto Lb8
        La3:
            java.lang.String r0 = r13.LJLILLLLZI
            boolean r0 = X.C39579Fg7.LIZLLL(r0, r4)
            if (r0 != 0) goto Lac
            goto Lb8
        Lac:
            X.6eL r1 = new X.AbstractC165396eN() { // from class: X.6eL
                static {
                    /*
                        X.6eL r0 = new X.6eL
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.6eL) X.6eL.LIZ X.6eL
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C165376eL.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C165376eL.<init>():void");
                }
            }
            goto Lc1
        Laf:
            java.lang.String r0 = r13.LJLILLLLZI
            boolean r0 = X.C39579Fg7.LIZLLL(r0, r4)
            r3 = r3 ^ r0
            if (r3 == 0) goto Lac
        Lb8:
            X.6eM r1 = new X.6eM
            T r0 = r2.element
            android.net.Uri r0 = (android.net.Uri) r0
            r1.<init>(r0)
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165366eK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AbstractC165396eN> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
