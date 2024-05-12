package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.FocusableKt$focusable$2$3$3$2", f = "Focusable.kt", l = {154, 158}, m = "invokeSuspend")
/* renamed from: X.2CR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OD> LJLJI;
    public final /* synthetic */ C1OH LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CR(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = c1oh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CR(this.LJLJJI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 == r4) goto L3c
            if (r0 != r5) goto L5b
            java.lang.Object r1 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L11:
            X.1ar<X.1OD> r0 = r7.LJLJI
            r0.setValue(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r8)
            X.1ar<X.1OD> r0 = r7.LJLJI
            java.lang.Object r3 = r0.getValue()
            X.1OD r3 = (X.C1OD) r3
            if (r3 == 0) goto L47
            X.1OH r2 = r7.LJLJJI
            X.1ar<X.1OD> r1 = r7.LJLJI
            X.1OE r0 = new X.1OE
            r0.<init>(r3)
            if (r2 == 0) goto L43
            r7.LJLIL = r1
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = r2.LIZIZ(r0, r7)
            if (r0 != r6) goto L43
            return r6
        L3c:
            java.lang.Object r1 = r7.LJLIL
            X.1ar r1 = (X.InterfaceC35811ar) r1
            X.C141335gf.LIZJ(r8)
        L43:
            r0 = 0
            r1.setValue(r0)
        L47:
            X.1OD r1 = new X.1OD
            r1.<init>()
            X.1OH r0 = r7.LJLJJI
            if (r0 == 0) goto L11
            r7.LJLIL = r1
            r7.LJLILLLLZI = r5
            java.lang.Object r0 = r0.LIZIZ(r1, r7)
            if (r0 != r6) goto L11
            return r6
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
