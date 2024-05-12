package X;

/* renamed from: X.Naz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59645Naz {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (android.text.TextUtils.equals("shopping_cart", r1) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L11
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L12
            int r1 = r0.getAnimationType()
            r0 = 2
            if (r1 != r0) goto L12
        L10:
            r2 = 1
        L11:
            return r2
        L12:
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = X.C63081OpJ.LJJIJIIJIL(r5)
            if (r0 == 0) goto L19
            goto L10
        L19:
            X.LSn r4 = X.C235779Nd.LIZ
            X.Ecj<java.lang.Boolean> r0 = r4.LJIIZILJ
            if (r0 != 0) goto L2a
            X.Ecj r3 = new X.Ecj
            java.lang.String r1 = "enable_shopping_total"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r1, r0)
            r4.LJIIZILJ = r3
        L2a:
            X.Ecj<java.lang.Boolean> r0 = r4.LJIIZILJ
            java.lang.Object r1 = r0.LIZ()
            java.lang.String r0 = "inst().enableShoppingTotal.cache"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r5.getStatus()
            if (r0 == 0) goto L89
            java.util.List r0 = r5.getPromotions()
            int r0 = r0.size()
            if (r0 <= 0) goto L89
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl.LJIIJ()
            com.ss.android.ugc.aweme.services.CommerceDataServiceImpl r0 = r0.LJFF()
            boolean r0 = r0.shouldShowCard()
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl.LJIIJ()
            X.CUi r0 = r0.LJI()
            r0.getClass()
            boolean r0 = r5.isAd()
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = r0.getDefaultCardInfo()
            if (r0 == 0) goto L84
            java.lang.String r1 = "ad_card"
        L7b:
            java.lang.String r0 = "shopping_cart"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L89
            goto L10
        L84:
            java.lang.String r1 = X.C59646Nb0.LIZ(r5, r2)
            goto L7b
        L89:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L11
            java.util.Map r1 = r0.getCardInfos()
            if (r1 == 0) goto L11
            java.lang.String r0 = "4"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L11
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59645Naz.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
