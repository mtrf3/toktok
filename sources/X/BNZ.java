package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class BNZ extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_ranking_setting");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r1 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BTZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.content.Context r6, X.C28826BTa r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            android.app.Activity r0 = r0.getTopActivity()
            X.1qj r0 = defpackage.g0.LJIILL(r0)
            if (r0 == 0) goto L4c
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
            if (r4 == 0) goto L4c
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.BaP> r2 = X.C29033BaP.class
            android.net.Uri r1 = r7.LIZ
            if (r1 == 0) goto L2d
            java.lang.String r0 = "from"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r1 != 0) goto L2f
        L2d:
            java.lang.String r1 = "top_active_user_rank"
        L2f:
            X.Cps r0 = r3.gv0(r2)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r1
            java.lang.Class<com.bytedance.android.livesdk.rank.api.IRankService> r0 = com.bytedance.android.livesdk.rank.api.IRankService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.rank.api.IRankService r0 = (com.bytedance.android.livesdk.rank.api.IRankService) r0
            com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog r1 = r0.Xe0()
            if (r1 == 0) goto L4a
            java.lang.String r0 = "LiveNewRankSettingDialog"
            r1.show(r4, r0)
        L4a:
            r0 = 1
            return r0
        L4c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BNZ.LIZJ(android.content.Context, X.BTa, java.util.Map):boolean");
    }
}
