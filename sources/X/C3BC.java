package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {206, 210, 211, 217}, m = "invokeSuspend")
/* renamed from: X.3BC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3BD LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJI;
    public final /* synthetic */ C3BJ<Object> LJLJJI;
    public final /* synthetic */ Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BC(C3BD c3bd, InterfaceC65462ha<Object> interfaceC65462ha, C3BJ<Object> c3bj, Object obj, InterfaceC67352kd<? super C3BC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3bd;
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = c3bj;
        this.LJLJJL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3BC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r7 = 4
            r2 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L18
            if (r0 == r3) goto L12
            if (r0 == r4) goto L4e
            if (r0 == r2) goto L12
            if (r0 != r7) goto L80
        L12:
            X.C141335gf.LIZJ(r9)
        L15:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L18:
            X.C141335gf.LIZJ(r9)
            X.3BD r1 = r8.LJLILLLLZI
            X.3BE r0 = X.C3BD.LIZ
            r0.getClass()
            X.3BF r0 = X.C3BE.LIZIZ
            if (r1 != r0) goto L33
            X.2ha<java.lang.Object> r1 = r8.LJLJI
            X.3BJ<java.lang.Object> r0 = r8.LJLJJI
            r8.LJLIL = r3
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r5) goto L15
            return r5
        L33:
            X.3BD r1 = r8.LJLILLLLZI
            X.3BG r0 = X.C3BE.LIZJ
            r6 = 0
            if (r1 != r0) goto L5e
            X.3BJ<java.lang.Object> r0 = r8.LJLJJI
            X.33R r1 = r0.LIZJ()
            X.2eB r0 = new X.2eB
            r0.<init>(r6)
            r8.LJLIL = r4
            java.lang.Object r0 = X.V1M.LJIILJJIL(r1, r0, r8)
            if (r0 != r5) goto L51
            return r5
        L4e:
            X.C141335gf.LIZJ(r9)
        L51:
            X.2ha<java.lang.Object> r1 = r8.LJLJI
            X.3BJ<java.lang.Object> r0 = r8.LJLJJI
            r8.LJLIL = r2
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r5) goto L15
            return r5
        L5e:
            X.3BJ<java.lang.Object> r0 = r8.LJLJJI
            X.33R r0 = r0.LIZJ()
            X.2ha r0 = r1.LIZ(r0)
            X.2ha r4 = X.V1M.LJIIJJI(r0)
            X.3BI r3 = new X.3BI
            X.2ha<java.lang.Object> r2 = r8.LJLJI
            X.3BJ<java.lang.Object> r1 = r8.LJLJJI
            java.lang.Object r0 = r8.LJLJJL
            r3.<init>(r2, r1, r0, r6)
            r8.LJLIL = r7
            java.lang.Object r0 = X.V1M.LJIIIIZZ(r4, r3, r8)
            if (r0 != r5) goto L15
            return r5
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
