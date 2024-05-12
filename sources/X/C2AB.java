package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$updateFilter$1", f = "LiveEffectTestHelper.kt", l = {91, 97}, m = "invokeSuspend")
/* renamed from: X.2AB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AB(String str, int i, InterfaceC67352kd<? super C2AB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLIL
            java.lang.String r3 = "livefiltercomposer"
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 == r1) goto L42
            if (r0 != r5) goto L66
            X.C141335gf.LIZJ(r14)
        L11:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 != 0) goto L1e
            java.lang.String r0 = "update makeup fail"
            X.C30868C9o.LJI(r0)
        L1e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            X.C141335gf.LIZJ(r14)
            X.1KC r6 = X.C1KC.LIZ
            java.lang.String r0 = r13.LJLILLLLZI
            boolean r0 = r6.LIZIZ(r0, r3)
            if (r0 != 0) goto L52
            java.lang.String r7 = r13.LJLILLLLZI
            java.lang.String r8 = "livefiltercomposer"
            java.lang.String r9 = ""
            r10 = 0
            r14 = 120(0x78, float:1.68E-43)
            r13.LJLIL = r1
            r11 = r10
            r12 = r10
            java.lang.Object r14 = X.C0WK.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r14 != r4) goto L45
            return r4
        L42:
            X.C141335gf.LIZJ(r14)
        L45:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 != 0) goto L52
            java.lang.String r0 = "set makeup fail"
            X.C30868C9o.LJI(r0)
        L52:
            X.1KC r0 = X.C1KC.LIZ
            java.lang.String r2 = r13.LJLILLLLZI
            int r1 = r13.LJLJI
            r13.LJLIL = r5
            r0.getClass()
            java.lang.String r0 = ""
            java.lang.Object r14 = X.C1KC.LJIIJJI(r1, r2, r3, r0, r13)
            if (r14 != r4) goto L11
            return r4
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
