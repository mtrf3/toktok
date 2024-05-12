package X;

import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;

/* renamed from: X.8S5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8S5 extends AbstractC65781Prl implements InterfaceC88471Ynr<TakoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8S5 LJLIL = new C8S5();

    public C8S5() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6.getPlaylistPreviousPage(), "general_search") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r5.equals("homepage_hot") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r5.equals("general_search") == false) goto L20;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem r8, X.C43I<? extends java.lang.Integer> r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem r8 = (com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem) r8
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r4 = 0
            if (r9 == 0) goto L62
            com.ss.android.ugc.aweme.search.ISearchService r3 = r8.r4()
            if (r3 == 0) goto L62
            boolean r0 = r8.LLIIIL
            if (r0 == 0) goto L62
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r8)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.baseFeedPageParams
            if (r0 == 0) goto L3d
            X.M89 r6 = r0.param
            if (r6 == 0) goto L3d
            java.lang.String r5 = r6.getEventType()
            if (r5 == 0) goto L3d
            int r1 = r5.hashCode()
            r0 = 998835423(0x3b8904df, float:0.004181489)
            java.lang.String r2 = "general_search"
            if (r1 == r0) goto L9c
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 == r0) goto L93
            r0 = 1879474642(0x700681d2, float:1.6651174E29)
            if (r1 == r0) goto L7f
        L3d:
            java.lang.String r2 = ""
        L3f:
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r8)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getGroupId()
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r8)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.baseFeedPageParams
            if (r0 == 0) goto L7d
            X.M89 r0 = r0.param
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.getSearchId()
        L5f:
            r3.LLJJJJLIIL(r2, r1, r0)
        L62:
            java.lang.Boolean r1 = r8.LLII
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7a
            X.2gm r3 = r8.LLIIIJ
            X.UtN r2 = X.C36636EZk.LIZ
            X.8SB r1 = new X.8SB
            r1.<init>(r8, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7d:
            r0 = r4
            goto L5f
        L7f:
            java.lang.String r0 = "playlist"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L88
            goto L3d
        L88:
            java.lang.String r0 = r6.getPlaylistPreviousPage()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L3d
            goto L3f
        L93:
            java.lang.String r2 = "homepage_hot"
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L3f
            goto L3d
        L9c:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L3f
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8S5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
