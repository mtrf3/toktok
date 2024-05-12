package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
/* renamed from: X.2FJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FJ(InterfaceC35811ar<C1OJ> interfaceC35811ar, long j, C1OH c1oh, InterfaceC67352kd<? super C2FJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = j;
        this.LJLJJL = c1oh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FJ(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
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
            if (r0 != r5) goto L5d
            java.lang.Object r2 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L11:
            X.1ar<X.1OJ> r0 = r7.LJLJI
            r0.setValue(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r8)
            X.1ar<X.1OJ> r0 = r7.LJLJI
            java.lang.Object r3 = r0.getValue()
            X.1OJ r3 = (X.C1OJ) r3
            if (r3 == 0) goto L47
            X.1OH r2 = r7.LJLJJL
            X.1ar<X.1OJ> r1 = r7.LJLJI
            X.1OI r0 = new X.1OI
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
            X.1OJ r2 = new X.1OJ
            long r0 = r7.LJLJJI
            r2.<init>(r0)
            X.1OH r0 = r7.LJLJJL
            if (r0 == 0) goto L11
            r7.LJLIL = r2
            r7.LJLILLLLZI = r5
            java.lang.Object r0 = r0.LIZIZ(r2, r7)
            if (r0 != r6) goto L11
            return r6
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2FJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
