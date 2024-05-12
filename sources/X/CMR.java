package X;

/* loaded from: classes6.dex */
public final class CMR {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.ActivityC45651qj r4) {
        /*
            com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindRegionSetting r2 = com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindRegionSetting.INSTANCE
            boolean r0 = r2.getValue()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostUser> r0 = com.bytedance.android.livesdkapi.host.IHostUser.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostUser r0 = (com.bytedance.android.livesdkapi.host.IHostUser) r0
            java.lang.String r0 = r0.getEmail()
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto Ld7
        L1f:
            boolean r0 = r2.getValue()
            if (r0 == 0) goto Ld7
            r0 = 1
        L26:
            java.lang.String r2 = "showCount"
            if (r0 == 0) goto La6
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLJ
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            int r0 = r0.intValue()
            if (r0 >= r3) goto La6
            r2 = 1
        L3c:
            com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindingSchemaSetting r0 = com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindingSchemaSetting.INSTANCE
            java.lang.String r0 = r0.getEmailCollectUrl()
            X.Cn2 r3 = new X.Cn2
            r3.<init>(r0)
            java.lang.String r0 = "source"
            r3.LIZ(r1, r0)
            if (r2 == 0) goto L7c
            java.lang.String r0 = "step"
            r3.LIZ(r1, r0)
            java.lang.String r0 = r3.LIZLLL()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r4, r1)
            X.J0d<java.lang.Integer> r1 = X.InterfaceC30442Bx8.LLLJ
            java.lang.Object r0 = r1.LIZJ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZ(r0)
        L7b:
            return
        L7c:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostNetwork> r0 = com.bytedance.android.livesdkapi.host.IHostNetwork.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostNetwork r0 = (com.bytedance.android.livesdkapi.host.IHostNetwork) r0
            X.PfT r1 = r0.getHostRetrofit()
            if (r1 == 0) goto L7b
            java.lang.Class<com.bytedance.android.live.wallet.api.IapApi> r0 = com.bytedance.android.live.wallet.api.IapApi.class
            java.lang.Object r0 = r1.LIZ(r0)
            com.bytedance.android.live.wallet.api.IapApi r0 = (com.bytedance.android.live.wallet.api.IapApi) r0
            X.Svk r0 = r0.getUgEmailConsent()
            X.Svk r2 = X.C1EW.LIZ(r0)
            Y.AfS54S0200000_5 r1 = new Y.AfS54S0200000_5
            r0 = 4
            r1.<init>(r3, r4, r0)
            X.9Cd<T> r0 = new X.InterfaceC64592gB() { // from class: X.9Cd
                static {
                    /*
                        X.9Cd r0 = new X.9Cd
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9Cd<T>) X.9Cd.LJLIL X.9Cd
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C232919Cd.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C232919Cd.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C232919Cd.accept(java.lang.Object):void");
                }
            }
            r2.LJJJLIIL(r1, r0)
            goto L7b
        La6:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostUser> r0 = com.bytedance.android.livesdkapi.host.IHostUser.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostUser r0 = (com.bytedance.android.livesdkapi.host.IHostUser) r0
            java.lang.String r0 = r0.getEmail()
            if (r0 == 0) goto L7b
            int r0 = r0.length()
            if (r0 != 0) goto Lbb
            goto L7b
        Lbb:
            com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailUgConsentRegionSetting r0 = com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailUgConsentRegionSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L7b
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLJIL
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            int r0 = r0.intValue()
            if (r0 >= r3) goto L7b
            r2 = 0
            goto L3c
        Ld7:
            r0 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CMR.LIZ(X.1qj):void");
    }
}
