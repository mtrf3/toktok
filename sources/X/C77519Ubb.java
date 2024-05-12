package X;

/* renamed from: X.Ubb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77519Ubb extends AbstractC77511UbT {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r2 != null) goto L10;
     */
    @Override // X.AbstractC77511UbT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC77501UbJ LIZIZ(android.content.Context r6, X.C77518Uba r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            X.UIH r0 = X.UIG.LIZ()
            return r0
        L7:
            X.Udf r1 = X.C77607Ud1.LIZLLL()
            java.lang.String r0 = r7.LIZIZ
            com.bytedance.android.live.network.response.BaseResponse r2 = r1.LIZIZ(r0)
            r3 = 0
            if (r2 == 0) goto La7
            R extends com.bytedance.android.livesdk.model.Extra r0 = r2.extra
            com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra r0 = (com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra) r0
            if (r0 == 0) goto La7
            boolean r0 = r0.isWebappRechargeRedirectEnabled
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L20:
            R extends com.bytedance.android.livesdk.model.Extra r0 = r2.extra
            com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra r0 = (com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra) r0
            if (r0 == 0) goto L28
            com.bytedance.android.live.wallet.data.recharge.IapFailExtra r3 = r0.iapFailExtra
        L28:
            com.bytedance.android.livesdk.livesetting.recharge.LiveWalletWebAppGuideAvailable r0 = com.bytedance.android.livesdk.livesetting.recharge.LiveWalletWebAppGuideAvailable.INSTANCE
            boolean r0 = r0.isBuyAvailable()
            if (r0 == 0) goto Lac
            boolean r0 = X.C29306Beo.LJJIFFI(r1)
            if (r0 == 0) goto Lac
            if (r3 == 0) goto Lac
            android.os.Handler r2 = X.C46529INx.LIZ
            Y.ARunnableS32S0200000_13 r1 = new Y.ARunnableS32S0200000_13
            r0 = 124(0x7c, float:1.74E-43)
            r1.<init>(r3, r5, r0)
            r2.post(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.LJFF
            java.lang.String r0 = "request_page"
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r4 = r1.get(r0)
            if (r4 != 0) goto L52
            java.lang.String r4 = "unknown"
        L52:
            java.lang.String r1 = r3.webappSchema
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.Cn0 r3 = new X.Cn0
            r3.<init>(r1)
            r0 = 1062836634(0x3f59999a, float:0.85)
            r3.LIZJ = r0
            X.Cn2 r1 = r3.LIZ
            java.lang.String r0 = "keyboard_compat"
            r2 = 1
            r1.LIZ(r2, r0)
            X.Cn2 r1 = r3.LIZ
            java.lang.String r0 = "keyboard_adjust"
            r1.LIZ(r2, r0)
            X.Cn2 r2 = r3.LIZ
            java.lang.String r1 = "type"
            java.lang.String r0 = "popup"
            r2.LIZJ(r1, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "inapp_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.Cn2 r1 = r3.LIZIZ
            java.lang.String r0 = "enter_source"
            r1.LIZJ(r0, r2)
            X.5H3 r0 = X.C77607Ud1.LJ
            java.lang.Object r0 = r0.getValue()
            X.Cmz r0 = (X.InterfaceC32361Cmz) r0
            r0.LIZIZ(r6, r3)
            X.UIH r0 = X.UIG.LIZIZ()
            return r0
        La7:
            r1 = r3
            if (r2 == 0) goto L28
            goto L20
        Lac:
            X.UIH r0 = X.UIG.LIZ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77519Ubb.LIZIZ(android.content.Context, X.Uba):X.UbJ");
    }
}
