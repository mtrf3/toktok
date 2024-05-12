package X;

/* renamed from: X.RcA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69910RcA implements InterfaceC68402mK {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C9G2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C69913RcD
            if (r0 == 0) goto L41
            r4 = r6
            X.RcD r4 = (X.C69913RcD) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L5b
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse r3 = (com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse) r3
            int r0 = r3.statusCode
            r2 = 0
            if (r0 == 0) goto L47
            return r2
        L28:
            X.C141335gf.LIZJ(r3)
            X.RcF r0 = com.ss.android.ugc.aweme.rss.api.RssApi.LIZ
            r0.getClass()
            X.Ol8 r0 = X.C69915RcF.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.rss.api.RssApi r0 = (com.ss.android.ugc.aweme.rss.api.RssApi) r0
            r4.LJLJI = r1
            java.lang.Object r3 = r0.getRssUser(r4)
            if (r3 != r2) goto L20
            return r2
        L41:
            X.RcD r4 = new X.RcD
            r4.<init>(r5, r6)
            goto L12
        L47:
            X.9G2 r1 = new X.9G2
            java.util.List<com.ss.android.ugc.aweme.rss.api.models.Rss> r0 = r3.rssFeed
            if (r0 == 0) goto L57
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.rss.api.models.Rss r0 = (com.ss.android.ugc.aweme.rss.api.models.Rss) r0
            if (r0 == 0) goto L57
            java.lang.String r2 = r0.rssUrl
        L57:
            r1.<init>(r2)
            return r1
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69910RcA.LIZIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC68402mK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateRss(java.lang.String r7, X.InterfaceC67352kd<? super X.AJI> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C69912RcC
            if (r0 == 0) goto L44
            r5 = r8
            X.RcC r5 = (X.C69912RcC) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L4a
            java.lang.Object r7 = r5.LJLIL
            java.lang.String r7 = (java.lang.String) r7
            X.C141335gf.LIZJ(r4)
        L24:
            com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse r4 = (com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse) r4
            X.AJI r2 = new X.AJI
            java.lang.Integer r1 = r4.statusCode
            java.lang.String r0 = r4.msg
            r2.<init>(r7, r1, r0)
            return r2
        L30:
            X.C141335gf.LIZJ(r4)
            X.RcH r1 = new X.RcH
            r0 = 0
            r1.<init>(r7, r0)
            r5.LJLIL = r7
            r5.LJLJJI = r2
            java.lang.Object r4 = X.C74171T9b.LIZ(r1, r5)
            if (r4 != r3) goto L24
            return r3
        L44:
            X.RcC r5 = new X.RcC
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69910RcA.updateRss(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC68402mK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r21, java.lang.Integer r22, java.lang.String r23, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.models.RssArticle>> r24) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69910RcA.LIZ(java.lang.String, java.lang.Integer, java.lang.String, X.2kd):java.lang.Object");
    }
}
