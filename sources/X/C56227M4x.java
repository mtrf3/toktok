package X;

/* renamed from: X.M4x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56227M4x extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "webview");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r4 != null) goto L14;
     */
    @Override // X.M56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LIZ(android.app.Activity r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "host"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "fromTokenType"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            com.ss.android.ugc.aweme.deeplink.IDeepLinkService r0 = com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl.LIZ()
            boolean r0 = r0.LJIIJJI()
            if (r0 == 0) goto L36
            X.Nx7 r0 = X.C61017Nx7.LIZ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L36
            java.lang.String r0 = "//main"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r8, r0)
            r0.open()
        L36:
            r0 = r13 ^ 1
            android.content.Intent r4 = X.C57422MgE.LIZ(r8, r9, r0, r13)
            r5 = 1
            r3 = 0
            java.lang.String r6 = "referral"
            java.lang.String r2 = "url"
            if (r13 == 0) goto L60
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r9, r2)
            if (r0 == 0) goto L9e
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r9, r2)
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = ujb.s.LJJJLZIJ(r0, r6, r3)
            if (r0 == 0) goto L9e
            if (r4 == 0) goto L60
        L59:
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification"
            r4.putExtra(r1, r0)
        L60:
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r9, r2)
            if (r0 == 0) goto L73
            boolean r0 = ujb.s.LJJJLZIJ(r0, r6, r3)
            if (r0 == 0) goto L73
            if (r4 == 0) goto L73
            java.lang.String r0 = "bundle_from_referral"
            r4.putExtra(r0, r5)
        L73:
            X.M62 r1 = X.M62.LIZIZ
            java.lang.String r0 = "h5"
            r1.LIZIZ(r9, r0, r13)
            java.lang.String r0 = "media_source"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r9, r0)
            boolean r0 = X.C26408AYa.LIZ(r0)
            if (r0 == 0) goto L9d
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r9, r2)
            if (r2 == 0) goto L9d
            if (r4 == 0) goto L94
            java.lang.String r0 = "intercept_by_incentive"
            r4.putExtra(r0, r5)
        L94:
            java.lang.String r1 = "onelink"
            X.C247779nx.LIZ(r2, r1)
            r0 = 0
            X.C250729si.LIZ(r8, r2, r1, r0, r3)
        L9d:
            return r4
        L9e:
            if (r4 == 0) goto L60
            java.lang.String r0 = "hide_more"
            r4.putExtra(r0, r3)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56227M4x.LIZ(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
    }
}
