package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.3BW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BW<T> implements InterfaceC64672gJ<T> {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ C3BY LJLJI;
    public final /* synthetic */ InterfaceC64672gJ LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C3BX
            if (r0 == 0) goto L61
            r3 = r10
            X.3BX r3 = (X.C3BX) r3
            int r2 = r3.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r3.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r3.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLILLLLZI
            r7 = 1
            if (r0 == 0) goto L3d
            if (r0 != r7) goto L67
            java.lang.Object r9 = r3.LJLJJL
            X.3BW r0 = r3.LJLJJI
            X.C141335gf.LIZJ(r1)
        L24:
            X.2mC r6 = r0.LJLIL
            X.2pa r5 = r0.LJLILLLLZI
            X.XKY r4 = X.XKY.UNDISPATCHED
            X.3BU r3 = new X.3BU
            X.3BY r2 = r0.LJLJI
            X.2gJ r1 = r0.LJLJJI
            r0 = 0
            r3.<init>(r2, r1, r9, r0)
            X.XKQ r0 = X.XKX.LIZLLL(r5, r0, r4, r3, r7)
            r6.element = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3d:
            X.C141335gf.LIZJ(r1)
            X.2mC r0 = r8.LJLIL
            T r1 = r0.element
            X.V4o r1 = (X.InterfaceC79150V4o) r1
            if (r1 != 0) goto L4a
        L48:
            r0 = r8
            goto L24
        L4a:
            X.3C2 r0 = new X.3C2
            r0.<init>()
            r1.LIZIZ(r0)
            r3.LJLJJI = r8
            r3.LJLJJL = r9
            r3.LJLJJLL = r1
            r3.LJLILLLLZI = r7
            java.lang.Object r0 = r1.LJJJJ(r3)
            if (r0 != r2) goto L48
            return r2
        L61:
            X.3BX r3 = new X.3BX
            r3.<init>(r8, r10)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BW.emit(java.lang.Object, X.2kd):java.lang.Object");
    }

    public C3BW(C68322mC c68322mC, InterfaceC70422pa interfaceC70422pa, C3BY c3by, InterfaceC64672gJ interfaceC64672gJ) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = c3by;
        this.LJLJJI = interfaceC64672gJ;
    }
}
