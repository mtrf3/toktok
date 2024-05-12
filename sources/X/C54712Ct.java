package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {262}, m = "invokeSuspend")
/* renamed from: X.2Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54712Ct extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC37501da LJLJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<C11P, Boolean>> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJJL;
    public final /* synthetic */ C0UT LJLJJLL;
    public final /* synthetic */ InterfaceC78936UyS<C0UQ> LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54712Ct(InterfaceC37501da interfaceC37501da, InterfaceC24760y8<? extends InterfaceC88472Yns<? super C11P, Boolean>> interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y82, C0UT c0ut, InterfaceC78936UyS<C0UQ> interfaceC78936UyS, boolean z, InterfaceC67352kd<? super C54712Ct> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC37501da;
        this.LJLJJI = interfaceC24760y8;
        this.LJLJJL = interfaceC24760y82;
        this.LJLJJLL = c0ut;
        this.LJLJL = interfaceC78936UyS;
        this.LJLJLJ = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54712Ct c54712Ct = new C54712Ct(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c54712Ct.LJLILLLLZI = obj;
        return c54712Ct;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 != r1) goto L13
            java.lang.Object r4 = r11.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.C141335gf.LIZJ(r12)     // Catch: java.util.concurrent.CancellationException -> L11
            goto L46
        L11:
            r1 = move-exception
            goto L40
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r4 = r11.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.1da r0 = r11.LJLJI     // Catch: java.util.concurrent.CancellationException -> L3f
            X.2Cs r3 = new X.2Cs     // Catch: java.util.concurrent.CancellationException -> L3f
            X.0y8<X.Yns<X.11P, java.lang.Boolean>> r5 = r11.LJLJJI     // Catch: java.util.concurrent.CancellationException -> L3f
            X.0y8<X.Pro<java.lang.Boolean>> r6 = r11.LJLJJL     // Catch: java.util.concurrent.CancellationException -> L3f
            X.0UT r7 = r11.LJLJJLL     // Catch: java.util.concurrent.CancellationException -> L3f
            X.UyS<X.0UQ> r8 = r11.LJLJL     // Catch: java.util.concurrent.CancellationException -> L3f
            boolean r9 = r11.LJLJLJ     // Catch: java.util.concurrent.CancellationException -> L3f
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L3f
            r11.LJLILLLLZI = r4     // Catch: java.util.concurrent.CancellationException -> L3f
            r11.LJLIL = r1     // Catch: java.util.concurrent.CancellationException -> L3f
            java.lang.Object r0 = r0.LJIJJLI(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L3f
            if (r0 != r2) goto L46
            return r2
        L3f:
            r1 = move-exception
        L40:
            boolean r0 = X.C48841JEv.LJIILLIIL(r4)
            if (r0 == 0) goto L49
        L46:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L49:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54712Ct.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
