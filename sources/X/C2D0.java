package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {222, 228}, m = "invokeSuspend")
/* renamed from: X.2D0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2D0 extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C42091kz LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2D0(InterfaceC88473Ynt<? super C1N5, ? super C10370av, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC70422pa interfaceC70422pa, C42091kz c42091kz, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C2D0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c42091kz;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2D0 c2d0 = new C2D0(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2d0.LJLJI = obj;
        return c2d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r7 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L3b
            if (r0 == r5) goto L4f
            if (r0 != r7) goto L79
            X.C141335gf.LIZJ(r10)
        L10:
            X.11P r10 = (X.C11P) r10
            if (r10 != 0) goto L20
            X.1kz r0 = r9.LJLJJLL
            r0.LJLJI = r5
            X.XJO r0 = r0.LJLJJI
            r0.LIZIZ(r6)
        L1d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L20:
            r10.LIZ()
            X.1kz r0 = r9.LJLJJLL
            r0.LJLILLLLZI = r5
            X.XJO r0 = r0.LJLJJI
            r0.LIZIZ(r6)
            X.Yns<X.0av, X.UCe> r3 = r9.LJLJL
            if (r3 == 0) goto L1d
            long r1 = r10.LIZJ
            X.0av r0 = new X.0av
            r0.<init>(r1)
            r3.invoke(r0)
            goto L1d
        L3b:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r4 = r9.LJLJI
            X.1dX r4 = (X.InterfaceC37471dX) r4
            r9.LJLJI = r4
            r9.LJLILLLLZI = r5
            X.11I r0 = X.C11I.Main
            java.lang.Object r10 = X.C0UM.LIZIZ(r4, r0, r5, r9)
            if (r10 != r8) goto L56
            return r8
        L4f:
            java.lang.Object r4 = r9.LJLJI
            X.1dX r4 = (X.InterfaceC37471dX) r4
            X.C141335gf.LIZJ(r10)
        L56:
            X.11P r10 = (X.C11P) r10
            r10.LIZ()
            X.Ynt<X.1N5, X.0av, X.2kd<? super X.UCe>, java.lang.Object> r3 = r9.LJLJJI
            X.2Cv r0 = X.C0UM.LIZ
            if (r3 == r0) goto L6e
            X.2pa r2 = r9.LJLJJL
            X.2Cz r1 = new X.2Cz
            X.1kz r0 = r9.LJLJJLL
            r1.<init>(r3, r0, r10, r6)
            r0 = 3
            X.XKX.LIZLLL(r2, r6, r6, r1, r0)
        L6e:
            r9.LJLJI = r6
            r9.LJLILLLLZI = r7
            java.lang.Object r10 = X.C0UM.LIZLLL(r4, r9)
            if (r10 != r8) goto L10
            return r8
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2D0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
