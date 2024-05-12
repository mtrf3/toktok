package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;

/* renamed from: X.83n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051983n extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C2051983n LJLIL = new C2051983n();

    public C2051983n() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (X.C8P4.LIZ(r1, r3) == false) goto L41;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem r5, X.C43I<? extends java.lang.Integer> r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem r5 = (com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem) r5
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r6 != 0) goto Lc
        L9:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc:
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r3 = 0
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.getDesc()
        L23:
            r2 = 0
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 != 0) goto Lbd
        L2c:
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L4a
            java.lang.CharSequence r0 = r0.getPhotoModeTitleLine()
            if (r0 == 0) goto L4a
            int r0 = r0.length()
            if (r0 != 0) goto Lbd
        L4a:
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto La0
            X.Ol8 r0 = r5.LLIFFJFJJ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.mix.services.IMixFeedService r1 = (com.ss.android.ugc.aweme.mix.services.IMixFeedService) r1
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L74:
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Ld3
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            if (r1 == 0) goto Ld3
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r5.r4()
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r3 = r0.baseFeedPageParams
        L9a:
            boolean r0 = X.C8P4.LIZ(r1, r3)
            if (r0 != 0) goto Lbd
        La0:
            android.widget.FrameLayout r0 = r5.q4()
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = X.C52552Kjs.LIZ()
            if (r0 == 0) goto L9
            android.view.View r0 = r5.getContainerView()
            r0.setVisibility(r1)
            goto L9
        Lb8:
            r0 = r3
            goto L74
        Lba:
            r0 = r3
            goto L23
        Lbd:
            android.widget.FrameLayout r0 = r5.q4()
            r0.setVisibility(r2)
            boolean r0 = X.C52552Kjs.LIZ()
            if (r0 == 0) goto L9
            android.view.View r0 = r5.getContainerView()
            r0.setVisibility(r2)
            goto L9
        Ld3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2051983n.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
