package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.compose.TuxTextKt$TuxText$7$1$1$1", f = "TuxText.kt", l = {165, 175}, m = "invokeSuspend")
/* renamed from: X.V0e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79036V0e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC88471Ynr LJLIL;
    public C08410Ur LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ InterfaceC37501da LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<C0VG> LJLJJL;
    public final /* synthetic */ C08440Uu LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<C08410Ur<String>, Boolean, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79036V0e(InterfaceC37501da interfaceC37501da, InterfaceC35811ar<C0VG> interfaceC35811ar, C08440Uu c08440Uu, InterfaceC88471Ynr<? super C08410Ur<String>, ? super Boolean, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C79036V0e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC37501da;
        this.LJLJJL = interfaceC35811ar;
        this.LJLJJLL = c08440Uu;
        this.LJLJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C79036V0e(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJI
            r6 = 0
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L31
            if (r0 != r5) goto L9e
            X.0Ur r4 = r12.LJLILLLLZI
            X.Ynr r2 = r12.LJLIL
            X.C141335gf.LIZJ(r13)
        L14:
            if (r13 == 0) goto L1b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r4, r0)
        L1b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1e:
            X.C141335gf.LIZJ(r13)
            X.1da r1 = r12.LJLJJI
            X.V0i r0 = new X.V0i
            r0.<init>(r6)
            r12.LJLJI = r2
            java.lang.Object r13 = r1.LJIJJLI(r0, r12)
            if (r13 != r7) goto L34
            return r7
        L31:
            X.C141335gf.LIZJ(r13)
        L34:
            X.11P r13 = (X.C11P) r13
            X.1ar<X.0VG> r0 = r12.LJLJJL
            java.lang.Object r2 = r0.getValue()
            X.0VG r2 = (X.C0VG) r2
            if (r2 == 0) goto La6
            long r0 = r13.LIZJ
            int r10 = r2.LJIIL(r0)
            X.0Uu r0 = r12.LJLJJLL
            java.util.List<X.0Ur<? extends java.lang.Object>> r9 = r0.LJLJJI
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r9.size()
            r8.<init>(r0)
            int r4 = r9.size()
            r3 = 0
        L58:
            if (r3 >= r4) goto L77
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r3)
            r11 = r2
            X.0Ur r11 = (X.C08410Ur) r11
            T r0 = r11.LIZ
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L74
            int r1 = r11.LIZIZ
            int r0 = r11.LIZJ
            boolean r0 = X.C08460Uw.LIZIZ(r10, r10, r1, r0)
            if (r0 == 0) goto L74
            r8.add(r2)
        L74:
            int r3 = r3 + 1
            goto L58
        L77:
            java.lang.Object r4 = X.ORZ.LJLLLL(r8)
            X.0Ur r4 = (X.C08410Ur) r4
            if (r4 == 0) goto L1b
            X.1da r3 = r12.LJLJJI
            X.Ynr<X.0Ur<java.lang.String>, java.lang.Boolean, X.UCe> r2 = r12.LJLJL
            boolean r1 = r13.LIZLLL
            boolean r0 = r13.LJI
            if (r1 == r0) goto L8c
            r13.LIZ()
        L8c:
            X.V0h r0 = new X.V0h
            r0.<init>(r6)
            r12.LJLIL = r2
            r12.LJLILLLLZI = r4
            r12.LJLJI = r5
            java.lang.Object r13 = r3.LJIJJLI(r0, r12)
            if (r13 != r7) goto L14
            return r7
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79036V0e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
