package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$2", f = "VideoFrameCache.kt", l = {84, 87, 88, 91}, m = "invokeSuspend")
/* renamed from: X.5Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131275Df extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C84657XKj LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C131235Db LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131275Df(C131235Db c131235Db, InterfaceC67352kd<? super C131275Df> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c131235Db;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131275Df(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0059, B:15:0x0071, B:19:0x007c, B:21:0x0082, B:28:0x0094, B:30:0x0098), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0059, B:15:0x0071, B:19:0x007c, B:21:0x0082, B:28:0x0094, B:30:0x0098), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004b -> B:5:0x0051). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r6 = 0
            r5 = 4
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L4e
            if (r0 == r3) goto L23
            if (r0 == r4) goto L1f
            if (r0 != r5) goto L17
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L2d
            goto L37
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L2d
            goto L7c
        L23:
            X.XKj r8 = r9.LJLIL
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L29:
            X.C141335gf.LIZJ(r10)
            goto L37
        L2d:
            r0 = move-exception
        L2e:
            java.lang.String r1 = "VideoFrameCache"
            java.lang.String r0 = r0.toString()
            X.C131935Ft.LIZLLL(r1, r0)
        L37:
            X.5Db r0 = r9.LJLJI
            X.XK4 r1 = r0.LJLLI
            r1.getClass()
            X.XK6 r0 = new X.XK6
            r0.<init>(r1)
            r9.LJLIL = r6
            r9.LJLILLLLZI = r2
            java.lang.Object r10 = r0.LIZ(r9)
            if (r10 != r7) goto L51
            return r7
        L4e:
            X.C141335gf.LIZJ(r10)
        L51:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto La5
            X.XKj r8 = X.C77275UUl.LIZ()     // Catch: java.lang.Throwable -> La0
            X.5Db r0 = r9.LJLJI     // Catch: java.lang.Throwable -> La0
            X.XK4 r1 = r0.LJLL     // Catch: java.lang.Throwable -> La0
            X.5Dp r0 = new X.5Dp     // Catch: java.lang.Throwable -> La0
            r0.<init>(r8)     // Catch: java.lang.Throwable -> La0
            r9.LJLIL = r8     // Catch: java.lang.Throwable -> La0
            r9.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r1.LJIIIZ(r0, r9)     // Catch: java.lang.Throwable -> La0
            if (r0 != r7) goto L71
            goto La2
        L71:
            r9.LJLIL = r6     // Catch: java.lang.Throwable -> La0
            r9.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r10 = r8.LJI(r9)     // Catch: java.lang.Throwable -> La0
            if (r10 != r7) goto L7c
            goto La3
        L7c:
            X.5Dy r10 = (X.InterfaceC131465Dy) r10     // Catch: java.lang.Throwable -> La0
            boolean r0 = r10 instanceof X.C131355Dn     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L94
            r0 = 0
            X.C5DZ.LIZIZ = r0     // Catch: java.lang.Throwable -> La0
            X.5Db r1 = r9.LJLJI     // Catch: java.lang.Throwable -> La0
            X.5Dn r10 = (X.C131355Dn) r10     // Catch: java.lang.Throwable -> La0
            boolean r0 = r10.LIZ     // Catch: java.lang.Throwable -> La0
            r9.LJLILLLLZI = r5     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r1.LJ(r0, r9)     // Catch: java.lang.Throwable -> La0
            if (r0 != r7) goto L37
            goto La4
        L94:
            boolean r0 = r10 instanceof X.C131405Ds     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L37
            X.C5DZ.LIZIZ = r2     // Catch: java.lang.Throwable -> La0
            X.5Db r0 = r9.LJLJI     // Catch: java.lang.Throwable -> La0
            r0.LIZLLL()     // Catch: java.lang.Throwable -> La0
            goto L37
        La0:
            r0 = move-exception
            goto L2e
        La2:
            return r7
        La3:
            return r7
        La4:
            return r7
        La5:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131275Df.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
