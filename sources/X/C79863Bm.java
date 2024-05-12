package X;

/* renamed from: X.3Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79863Bm<T> implements InterfaceC71762rk<T>, InterfaceC65462ha, InterfaceC79903Bq<T> {
    public final InterfaceC79150V4o LJLIL;
    public final /* synthetic */ InterfaceC71762rk<T> LJLILLLLZI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return this.LJLILLLLZI.collect(interfaceC64672gJ, interfaceC67352kd);
    }

    @Override // X.InterfaceC71762rk
    public final T getValue() {
        return this.LJLILLLLZI.getValue();
    }

    public C79863Bm(InterfaceC71762rk interfaceC71762rk, XKQ xkq) {
        this.LJLIL = xkq;
        this.LJLILLLLZI = interfaceC71762rk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
    
        if (r4 == X.XKI.DROP_OLDEST) goto L7;
     */
    @Override // X.InterfaceC79903Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65462ha<T> fuse(X.MBA r2, int r3, X.XKI r4) {
        /*
            r1 = this;
            if (r3 < 0) goto Lb
            r0 = 1
            if (r3 > r0) goto Lf
        L5:
            X.XKI r0 = X.XKI.DROP_OLDEST
            if (r4 != r0) goto Lf
        L9:
            r0 = r1
        La:
            return r0
        Lb:
            r0 = -2
            if (r3 != r0) goto Lf
            goto L5
        Lf:
            if (r3 == 0) goto L14
            r0 = -3
            if (r3 != r0) goto L19
        L14:
            X.XKI r0 = X.XKI.SUSPEND
            if (r4 != r0) goto L19
            goto L9
        L19:
            X.3BZ r0 = new X.3BZ
            r0.<init>(r3, r2, r4, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79863Bm.fuse(X.MBA, int, X.XKI):X.2ha");
    }
}
