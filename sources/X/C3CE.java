package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {132, 135, 135}, m = "invokeSuspend")
/* renamed from: X.3CE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CE extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC64672gJ LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ XKM<Object> LJLJI;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3CE(XKM<? extends Object> xkm, InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC88473Ynt<Object, Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, Object obj, InterfaceC67352kd<? super C3CE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = xkm;
        this.LJLJJI = interfaceC64672gJ;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3CE(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
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
            r7 = 0
            r6 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 == r1) goto L24
            if (r0 == r5) goto L51
            if (r0 != r6) goto L61
            X.C141335gf.LIZJ(r10)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r10)
            X.XKM<java.lang.Object> r0 = r9.LJLJI
            r9.LJLILLLLZI = r1
            java.lang.Object r4 = r0.LJIILJJIL(r9)
            if (r4 != r8) goto L2b
            return r8
        L24:
            X.C141335gf.LIZJ(r10)
            X.3Bx r10 = (X.C79973Bx) r10
            java.lang.Object r4 = r10.LIZ
        L2b:
            X.2gJ<java.lang.Object> r3 = r9.LJLJJI
            boolean r0 = r4 instanceof X.C3C0
            if (r0 == 0) goto L3d
            java.lang.Throwable r0 = X.C79973Bx.LIZ(r4)
            if (r0 != 0) goto L3c
            X.3CM r0 = new X.3CM
            r0.<init>(r3)
        L3c:
            throw r0
        L3d:
            X.Ynt<java.lang.Object, java.lang.Object, X.2kd<java.lang.Object>, java.lang.Object> r2 = r9.LJLJJL
            java.lang.Object r1 = r9.LJLJJLL
            X.3BS r0 = X.C94103mg.LIZ
            if (r4 != r0) goto L46
            r4 = r7
        L46:
            r9.LJLIL = r3
            r9.LJLILLLLZI = r5
            java.lang.Object r10 = r2.invoke(r1, r4, r9)
            if (r10 != r8) goto L56
            return r8
        L51:
            X.2gJ r3 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L56:
            r9.LJLIL = r7
            r9.LJLILLLLZI = r6
            java.lang.Object r0 = r3.emit(r10, r9)
            if (r0 != r8) goto L13
            return r8
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c76800UCe, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
