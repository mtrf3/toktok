package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {179, 181, 183, 184, 186}, m = "invokeSuspend")
/* renamed from: X.3BN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BN extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super C3BM>, Integer, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ int LJLJI;
    public final /* synthetic */ C3BO LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BN(C3BO c3bo, InterfaceC67352kd<? super C3BN> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = c3bo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r4 = 5
            r6 = 4
            r9 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L15
            if (r0 == r2) goto L3e
            if (r0 == r9) goto L5a
            if (r0 == r6) goto L6e
            if (r0 != r4) goto L81
        L15:
            X.C141335gf.LIZJ(r11)
        L18:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1b:
            X.C141335gf.LIZJ(r11)
            X.2gJ r3 = r10.LJLILLLLZI
            int r0 = r10.LJLJI
            if (r0 <= 0) goto L2f
            X.3BM r0 = X.C3BM.START
            r10.LJLIL = r1
            java.lang.Object r0 = r3.emit(r0, r10)
            if (r0 != r5) goto L18
            return r5
        L2f:
            X.3BO r0 = r10.LJLJJI
            long r0 = r0.LIZIZ
            r10.LJLILLLLZI = r3
            r10.LJLIL = r2
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r10)
            if (r0 != r5) goto L43
            return r5
        L3e:
            X.2gJ r3 = r10.LJLILLLLZI
            X.C141335gf.LIZJ(r11)
        L43:
            X.3BO r0 = r10.LJLJJI
            long r1 = r0.LIZJ
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L73
            X.3BM r0 = X.C3BM.STOP
            r10.LJLILLLLZI = r3
            r10.LJLIL = r9
            java.lang.Object r0 = r3.emit(r0, r10)
            if (r0 != r5) goto L5f
            return r5
        L5a:
            X.2gJ r3 = r10.LJLILLLLZI
            X.C141335gf.LIZJ(r11)
        L5f:
            X.3BO r0 = r10.LJLJJI
            long r0 = r0.LIZJ
            r10.LJLILLLLZI = r3
            r10.LJLIL = r6
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r10)
            if (r0 != r5) goto L73
            return r5
        L6e:
            X.2gJ r3 = r10.LJLILLLLZI
            X.C141335gf.LIZJ(r11)
        L73:
            X.3BM r1 = X.C3BM.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r10.LJLILLLLZI = r0
            r10.LJLIL = r4
            java.lang.Object r0 = r3.emit(r1, r10)
            if (r0 != r5) goto L18
            return r5
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super C3BM> interfaceC64672gJ, Integer num, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        int intValue = num.intValue();
        C3BN c3bn = new C3BN(this.LJLJJI, interfaceC67352kd);
        c3bn.LJLILLLLZI = interfaceC64672gJ;
        c3bn.LJLJI = intValue;
        return c3bn.invokeSuspend(C76800UCe.LIZ);
    }
}
