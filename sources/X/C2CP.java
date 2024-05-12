package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.FocusableKt$focusable$2$3$3$1", f = "Focusable.kt", l = {146}, m = "invokeSuspend")
/* renamed from: X.2CP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC13070fH LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC14660hq LJLJI;
    public final /* synthetic */ InterfaceC35811ar<InterfaceC13080fI> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CP(InterfaceC14660hq interfaceC14660hq, InterfaceC35811ar<InterfaceC13080fI> interfaceC35811ar, InterfaceC67352kd<? super C2CP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC14660hq;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CP(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            X.0fH r1 = r5.LJLIL
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> Lf
            goto L3a
        Lf:
            r0 = move-exception
            goto L46
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C141335gf.LIZJ(r6)
            r2 = 0
            X.1ar<X.0fI> r0 = r5.LJLJJI     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L42
            X.0fI r0 = (X.InterfaceC13080fI) r0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L2c
            X.0fH r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L42
            goto L2d
        L2c:
            r1 = r2
        L2d:
            X.0hq r0 = r5.LJLJI     // Catch: java.lang.Throwable -> L45
            r5.LJLIL = r1     // Catch: java.lang.Throwable -> L45
            r5.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.LIZ(r2, r5)     // Catch: java.lang.Throwable -> L45
            if (r0 != r4) goto L3a
            return r4
        L3a:
            if (r1 == 0) goto L3f
            r1.LIZ()
        L3f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L42:
            r0 = move-exception
            r1 = r2
            goto L46
        L45:
            r0 = move-exception
        L46:
            if (r1 == 0) goto L4b
            r1.LIZ()
        L4b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
