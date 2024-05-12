package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
/* renamed from: X.2BQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC169716lL LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC78936UyS<Object> LJLJJI;
    public final /* synthetic */ C07070Pn<Object, Object> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<C0Q2<Object>> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<Object, C76800UCe>> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2BQ(InterfaceC78936UyS<Object> interfaceC78936UyS, C07070Pn<Object, Object> c07070Pn, InterfaceC24760y8<? extends C0Q2<Object>> interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC88472Yns<Object, C76800UCe>> interfaceC24760y82, InterfaceC67352kd<? super C2BQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC78936UyS;
        this.LJLJJL = c07070Pn;
        this.LJLJJLL = interfaceC24760y8;
        this.LJLJL = interfaceC24760y82;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2BQ c2bq = new C2BQ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2bq.LJLJI = obj;
        return c2bq;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:5:0x0012). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L49
            if (r0 != r4) goto L5a
            X.6lL r0 = r12.LJLIL
            java.lang.Object r1 = r12.LJLJI
            X.2pa r1 = (X.InterfaceC70422pa) r1
            X.C141335gf.LIZJ(r13)
        L12:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r2 = r13.booleanValue()
            if (r2 == 0) goto L57
            java.lang.Object r7 = r0.next()
            X.UyS<java.lang.Object> r2 = r12.LJLJJI
            java.lang.Object r3 = r2.LJIJJLI()
            boolean r2 = r3 instanceof X.C3C0
            r11 = 0
            if (r2 != 0) goto L2b
            if (r3 != 0) goto L47
        L2b:
            X.2BP r6 = new X.2BP
            X.0Pn<java.lang.Object, java.lang.Object> r8 = r12.LJLJJL
            X.0y8<X.0Q2<java.lang.Object>> r9 = r12.LJLJJLL
            X.0y8<X.Yns<java.lang.Object, X.UCe>> r10 = r12.LJLJL
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = 3
            X.XKX.LIZLLL(r1, r11, r11, r6, r2)
        L3a:
            r12.LJLJI = r1
            r12.LJLIL = r0
            r12.LJLILLLLZI = r4
            java.lang.Object r13 = r0.LIZ(r12)
            if (r13 != r5) goto L12
            return r5
        L47:
            r7 = r3
            goto L2b
        L49:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r1 = r12.LJLJI
            X.2pa r1 = (X.InterfaceC70422pa) r1
            X.UyS<java.lang.Object> r0 = r12.LJLJJI
            X.6lL r0 = r0.iterator()
            goto L3a
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
