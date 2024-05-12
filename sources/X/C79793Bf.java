package X;

/* renamed from: X.3Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79793Bf<T> extends C79783Be<T> {
    public final InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> LJLILLLLZI;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C79783Be, X.AbstractC79813Bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectTo(X.C3CK<? super T> r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C79803Bg
            if (r0 == 0) goto L39
            r4 = r7
            X.3Bg r4 = (X.C79803Bg) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L47
            X.3CK r6 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            boolean r0 = r6.LJII()
            if (r0 == 0) goto L3f
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r6
            r4.LJLJJI = r0
            java.lang.Object r0 = super.collectTo(r6, r4)
            if (r0 != r2) goto L22
            return r2
        L39:
            X.3Bg r4 = new X.3Bg
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r1.<init>(r0)
            throw r1
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79793Bf.collectTo(X.3CK, X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC79813Bh
    public final AbstractC79813Bh<T> create(MBA mba, int i, XKI xki) {
        return new C79793Bf(this.LJLILLLLZI, mba, i, xki);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79793Bf(InterfaceC88471Ynr<? super C3CK<? super T>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, MBA mba, int i, XKI xki) {
        super(interfaceC88471Ynr, mba, i, xki);
        this.LJLILLLLZI = interfaceC88471Ynr;
    }
}
