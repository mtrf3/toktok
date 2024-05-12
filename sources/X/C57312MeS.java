package X;

/* renamed from: X.MeS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57312MeS extends F9E implements XGE {
    public final java.util.Map<String, String> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(3, 3000L, true);
    }

    public C57312MeS(java.util.Map<String, String> map) {
        this.LJLIL = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r6, X.InterfaceC67352kd<? super X.C57311MeR> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C57313MeT
            if (r0 == 0) goto L3b
            r4 = r7
            X.MeT r4 = (X.C57313MeT) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L41
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.relation.follow.model.RelationStatus r1 = (com.ss.android.ugc.aweme.relation.follow.model.RelationStatus) r1
            X.MeR r0 = new X.MeR
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi> r0 = com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi.class
            java.lang.Object r1 = X.C05L.LIZIZ(r1, r6, r0)
            com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi r1 = (com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi) r1
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.LJLIL
            r4.LJLJI = r2
            java.lang.Object r1 = r1.followOffline(r0, r4)
            if (r1 != r3) goto L20
            return r3
        L3b:
            X.MeT r4 = new X.MeT
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57312MeS.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
