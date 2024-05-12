package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photodownload.DownloadPhotoGlobal$copyToGalley$2", f = "DownloadPhotoGlobal.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6eO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165406eO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super android.net.Uri>, Object> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165406eO(boolean z, InterfaceC67352kd<? super C165406eO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165406eO(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.net.Uri] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.C141335gf.LIZJ(r16)
            X.34K r3 = new X.34K
            r3.<init>()
            X.2mC r2 = new X.2mC
            r2.<init>()
            java.util.Set<java.lang.String> r0 = X.C44896Hjg.LJIILJJIL
            boolean r1 = r15.LJLIL
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r8 = r0.iterator()
        L17:
            boolean r4 = r8.hasNext()
            r0 = 0
            if (r4 == 0) goto La5
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            android.content.Context r9 = X.EF7.LIZIZ()
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r4 = X.C163296az.LIZIZ()
            r5.append(r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r10)
            java.lang.String r4 = r4.getName()
            r5.append(r4)
            java.lang.String r4 = X.X1D.LIZIZ(r5)
            r12 = 0
            r7 = 1
            r6 = 29
            if (r1 != 0) goto L64
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L68
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L5d
            r5.<init>(r10)     // Catch: java.lang.Exception -> L5d
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L5d
            android.net.Uri r0 = X.C268613q.LJIIIIZZ(r9, r5, r0)     // Catch: java.lang.Exception -> L5d
            r2.element = r0     // Catch: java.lang.Exception -> L5d
            goto L62
        L5d:
            boolean r0 = X.C1B6.LIZIZ(r4)
            goto L6c
        L62:
            if (r0 != 0) goto L66
        L64:
            r0 = 1
            goto L6e
        L66:
            r0 = 0
            goto L6e
        L68:
            boolean r0 = X.C1B6.LIZIZ(r4)
        L6c:
            r0 = r0 ^ 1
        L6e:
            if (r0 == 0) goto La1
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L94
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8d
            r0.<init>(r10)     // Catch: java.lang.Exception -> L8d
            java.lang.String r11 = r0.getName()     // Catch: java.lang.Exception -> L8d
            java.lang.String r13 = "image/png"
            r14 = 32
            android.net.Uri r0 = X.C44694HgQ.LJJI(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L8d
            r2.element = r0     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L8a
            r12 = 1
        L8a:
            r3.element = r12     // Catch: java.lang.Exception -> L8d
            goto L17
        L8d:
            boolean r0 = X.C39579Fg7.LIZLLL(r10, r4)
            r3.element = r0
            goto L17
        L94:
            boolean r0 = X.C39579Fg7.LIZLLL(r10, r4)
            r3.element = r0
            if (r0 == 0) goto L17
            X.C1E4.LJJIIZI(r9, r4)
            goto L17
        La1:
            r3.element = r7
            goto L17
        La5:
            boolean r1 = r3.element
            if (r1 == 0) goto Lab
            T r0 = r2.element
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165406eO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super android.net.Uri> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
