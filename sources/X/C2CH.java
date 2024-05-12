package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {452, 454, 461, 462, 471}, m = "invokeSuspend")
/* renamed from: X.2CH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1N5 LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C1OH LJLJJLL;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CH(C1N5 c1n5, long j, C1OH c1oh, InterfaceC35811ar<C1OJ> interfaceC35811ar, InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y8, InterfaceC67352kd<? super C2CH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c1n5;
        this.LJLJJL = j;
        this.LJLJJLL = c1oh;
        this.LJLJL = interfaceC35811ar;
        this.LJLJLJ = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CH c2ch = new C2CH(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c2ch.LJLJI = obj;
        return c2ch;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r4 = r14.LJLILLLLZI
            r0 = 5
            r2 = 4
            r5 = 3
            r6 = 2
            r1 = 1
            r13 = 0
            if (r4 == 0) goto L21
            if (r4 == r1) goto L46
            if (r4 == r6) goto L66
            if (r4 == r5) goto L86
            if (r4 == r2) goto L16
            if (r4 != r0) goto Lbf
        L16:
            X.C141335gf.LIZJ(r15)
        L19:
            X.1ar<X.1OJ> r0 = r14.LJLJL
            r0.setValue(r13)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            X.C141335gf.LIZJ(r15)
            java.lang.Object r0 = r14.LJLJI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            X.2CG r7 = new X.2CG
            X.0y8<X.Pro<java.lang.Boolean>> r8 = r14.LJLJLJ
            long r9 = r14.LJLJJL
            X.1OH r11 = r14.LJLJJLL
            X.1ar<X.1OJ> r12 = r14.LJLJL
            r7.<init>(r8, r9, r11, r12, r13)
            X.XKQ r4 = X.XKX.LIZLLL(r0, r13, r13, r7, r5)
            X.1N5 r0 = r14.LJLJJI
            r14.LJLJI = r4
            r14.LJLILLLLZI = r1
            java.lang.Object r15 = r0.LJJJLIIL(r14)
            if (r15 != r3) goto L4d
            return r3
        L46:
            java.lang.Object r4 = r14.LJLJI
            X.V4o r4 = (X.InterfaceC79150V4o) r4
            X.C141335gf.LIZJ(r15)
        L4d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r1 = r15.booleanValue()
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L9a
            r14.LJLJI = r13
            r14.LJLIL = r1
            r14.LJLILLLLZI = r6
            java.lang.Object r0 = X.C79146V4k.LJIJI(r4, r14)
            if (r0 != r3) goto L6b
            return r3
        L66:
            boolean r1 = r14.LJLIL
            X.C141335gf.LIZJ(r15)
        L6b:
            if (r1 == 0) goto L19
            X.1OJ r4 = new X.1OJ
            long r0 = r14.LJLJJL
            r4.<init>(r0)
            X.1OK r1 = new X.1OK
            r1.<init>(r4)
            X.1OH r0 = r14.LJLJJLL
            r14.LJLJI = r1
            r14.LJLILLLLZI = r5
            java.lang.Object r0 = r0.LIZIZ(r4, r14)
            if (r0 != r3) goto L8d
            return r3
        L86:
            java.lang.Object r1 = r14.LJLJI
            X.1OK r1 = (X.C1OK) r1
            X.C141335gf.LIZJ(r15)
        L8d:
            X.1OH r0 = r14.LJLJJLL
            r14.LJLJI = r13
            r14.LJLILLLLZI = r2
            java.lang.Object r0 = r0.LIZIZ(r1, r14)
            if (r0 != r3) goto L19
            return r3
        L9a:
            X.1ar<X.1OJ> r0 = r14.LJLJL
            java.lang.Object r0 = r0.getValue()
            X.1OJ r0 = (X.C1OJ) r0
            if (r0 == 0) goto L19
            X.1OH r2 = r14.LJLJJLL
            if (r1 == 0) goto Lb9
            X.1OK r1 = new X.1OK
            r1.<init>(r0)
        Lad:
            r14.LJLJI = r13
            r0 = 5
            r14.LJLILLLLZI = r0
            java.lang.Object r0 = r2.LIZIZ(r1, r14)
            if (r0 != r3) goto L19
            return r3
        Lb9:
            X.1OI r1 = new X.1OI
            r1.<init>(r0)
            goto Lad
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
