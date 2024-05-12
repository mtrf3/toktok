package X;

/* renamed from: X.EMq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36304EMq implements F67 {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|(2:9|(7:13|14|15|16|(2:20|89)|18|19))|37|14|15|16|(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    @Override // X.F67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged() {
        /*
            r5 = this;
            X.EMo r0 = X.C36302EMo.LIZ
            r0.getClass()
            X.FFL r0 = X.FFL.LJIIIZ()
            java.lang.String r2 = "tt_is_ug_shoptab_new"
            r0.getClass()
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            int r0 = X.FFL.LJIIJ(r1, r0, r2, r0)
            X.C36302EMo.LIZJ = r0
            X.Ol8 r0 = X.C36302EMo.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = 1
            if (r0 == r4) goto L2a
            int r0 = X.C36302EMo.LIZJ
            if (r0 != r4) goto Lad
        L2a:
            r3 = 0
            X.C61275O3b.LIZIZ = r3
            android.app.Activity r2 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            boolean r0 = r2 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L5a
            X.1qj r2 = (X.ActivityC45651qj) r2
            X.Lm3 r1 = X.C55230Lly.LIZLLL(r2, r3)
            java.lang.Class<com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility> r0 = com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility r0 = (com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility) r0
            if (r0 == 0) goto L5a
            boolean r0 = r0.Tl0()
            if (r0 != r4) goto L5a
            java.lang.String r0 = r5.LJLIL
            X.C61275O3b.LIZ(r2, r0)
        L50:
            X.FH5 r2 = X.FH5.LIZIZ()
            java.lang.Class<X.EMo> r1 = X.C36302EMo.class
            r2.getClass()
            goto L5f
        L5a:
            java.lang.String r0 = r5.LJLIL
            X.C61275O3b.LIZIZ = r0
            goto L50
        L5f:
            X.FHD r0 = X.FHD.LIZLLL()     // Catch: java.lang.Exception -> L6a
            r0.getClass()     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = X.FHD.LJFF(r1)     // Catch: java.lang.Exception -> L6a
        L6a:
            if (r3 != 0) goto L87
        L6c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService r0 = com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService.v3()
            java.lang.String r1 = r0.i3()
            java.lang.String r0 = "enter_from"
            r2.put(r0, r1)
            X.C38583FCh.LIZ(r2)
            java.lang.String r0 = "riktokec_ug_allowlist_success"
            X.C76542zS.LIZ(r0, r2)
            return
        L87:
            java.util.Map<java.lang.String, java.util.List<X.F67>> r1 = r2.LJ
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.List<X.F67>> r0 = r2.LJ     // Catch: java.lang.Throwable -> Laa
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Laa
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L98
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laa
            goto L6c
        L98:
            r0.remove(r5)     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto La8
            java.util.Map<java.lang.String, java.util.List<X.F67>> r0 = r2.LJ     // Catch: java.lang.Throwable -> Laa
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> Laa
            r0.remove(r3)     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laa
            goto L6c
        Laa:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laa
            throw r0
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36304EMq.onChanged():void");
    }

    public C36304EMq(String str) {
        this.LJLIL = str;
    }
}
