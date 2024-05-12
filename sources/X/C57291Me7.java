package X;

/* renamed from: X.Me7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57291Me7 implements InterfaceC64672gJ<XGX<C57311MeR>> {
    public final /* synthetic */ InterfaceC64672gJ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C57285Me1 LJLJI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.XGX<X.C57311MeR> r20, X.InterfaceC67352kd r21) {
        /*
            r19 = this;
            r4 = r20
            r6 = r21
            boolean r0 = r6 instanceof X.C57299MeF
            r5 = r19
            if (r0 == 0) goto Lbe
            r3 = r6
            X.MeF r3 = (X.C57299MeF) r3
            int r2 = r3.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbe
            int r2 = r2 - r1
            r3.LJLILLLLZI = r2
        L18:
            java.lang.Object r1 = r3.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLILLLLZI
            r7 = 1
            if (r0 == 0) goto L29
            if (r0 != r7) goto Lc5
            X.C141335gf.LIZJ(r1)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.2gJ r1 = r5.LJLIL
            X.XGX r4 = (X.XGX) r4
            boolean r0 = r4 instanceof X.XGW
            r13 = 0
            r12 = 0
            if (r0 == 0) goto L7b
            X.XGW r4 = (X.XGW) r4
            D extends X.MfB r0 = r4.LJ
            X.MeR r0 = (X.C57311MeR) r0
            com.ss.android.ugc.aweme.relation.follow.model.RelationStatus r0 = r0.LIZ
            int r6 = r0.getFollowStatus()
            X.MgR r0 = X.EnumC57435MgR.UNFOLLOW
            int r0 = r0.getValue()
            if (r6 != r0) goto L4f
            X.LWM r0 = X.LWM.LIZIZ
            r0.LJIIL()
        L4f:
            D extends X.MfB r0 = r4.LJ
            X.MeR r0 = (X.C57311MeR) r0
            com.ss.android.ugc.aweme.relation.follow.model.RelationStatus r0 = r0.LIZ
            int r0 = r0.getFollowStatus()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            long r9 = r5.LJLILLLLZI
            X.Me1 r0 = r5.LJLJI
            java.lang.String r11 = r0.LJFF
            X.C74332vt.LIZ(r7, r8, r9, r11, r12)
            X.7sr r5 = new X.7sr
            D extends X.MfB r0 = r4.LJ
            X.MeR r0 = (X.C57311MeR) r0
            com.ss.android.ugc.aweme.relation.follow.model.RelationStatus r0 = r0.LIZ
            r5.<init>(r0, r12, r13)
        L72:
            r3.LJLILLLLZI = r7
            java.lang.Object r0 = r1.emit(r5, r3)
            if (r0 != r2) goto L26
            return r2
        L7b:
            boolean r0 = r4 instanceof X.XGV
            if (r0 == 0) goto Lcd
            boolean r0 = X.C30581Hy.LJJI(r4)
            if (r0 != 0) goto Lb8
            X.XGV r4 = (X.XGV) r4
            X.MeH r0 = r4.LIZLLL
            X.F2r r0 = X.C57293Me9.LIZIZ(r0)
            if (r0 == 0) goto Lb6
            int r0 = r0.getErrorCode()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
        L98:
            X.Me1 r0 = r5.LJLJI
            int r0 = r0.LJIIIZ
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            long r15 = r5.LJLILLLLZI
            X.Me1 r0 = r5.LJLJI
            java.lang.String r0 = r0.LJFF
            r18 = r6
            r17 = r0
            X.C74332vt.LIZ(r13, r14, r15, r17, r18)
            X.7sr r5 = new X.7sr
            X.MeH r0 = r4.LIZLLL
            r5.<init>(r12, r0, r13)
            goto L72
        Lb6:
            r6 = r12
            goto L98
        Lb8:
            X.7sr r5 = new X.7sr
            r5.<init>(r12, r12, r7)
            goto L72
        Lbe:
            X.MeF r3 = new X.MeF
            r3.<init>(r5, r6)
            goto L18
        Lc5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lcd:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57291Me7.emit(java.lang.Object, X.2kd):java.lang.Object");
    }

    public C57291Me7(InterfaceC64672gJ interfaceC64672gJ, long j, C57285Me1 c57285Me1) {
        this.LJLIL = interfaceC64672gJ;
        this.LJLILLLLZI = j;
        this.LJLJI = c57285Me1;
    }
}
