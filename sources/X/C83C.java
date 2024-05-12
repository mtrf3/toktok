package X;

import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;

/* renamed from: X.83C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83C extends AbstractC65781Prl implements InterfaceC88471Ynr<BubbleListAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C83C LJLIL = new C83C();

    public C83C() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (X.AnonymousClass838.LIZ(((com.ss.android.ugc.aweme.feed.model.VideoItemParams) X.C51029K0z.LJIILLIIL(r7)).getAweme(), r1) == true) goto L10;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem r7, X.C43I<? extends java.lang.Integer> r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem r7 = (com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem) r7
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            if (r8 != 0) goto Lc
        L9:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc:
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r1 = r0.baseFeedPageParams
            r3 = 0
            if (r1 == 0) goto Lbc
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r1 = X.AnonymousClass838.LIZ(r0, r1)
            r0 = 1
            if (r1 != r0) goto Lbc
        L28:
            r5 = 0
            if (r0 == 0) goto Lb0
            X.Ol8 r0 = r7.LL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility) r0
            if (r0 == 0) goto L38
            r0.U00(r7, r5, r5)
        L38:
            X.8Jg r0 = r7.LLF
            if (r0 != 0) goto L82
            X.79T r4 = new X.79T
            android.view.View r2 = r7.getContainerView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            androidx.fragment.app.Fragment r1 = r0.fragment
            java.lang.String r0 = "item.fragment"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.<init>(r2, r1)
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.baseFeedPageParams
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.eventType
        L60:
            r4.LIZJ = r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.baseFeedPageParams
            if (r0 == 0) goto L72
            int r0 = r0.pageType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L72:
            r4.LIZLLL = r5
            com.ss.android.ugc.aweme.comment.services.CommentService r1 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            X.79S r0 = r4.LIZ()
            X.79R r0 = r1.LJJJJLI(r0)
            r7.LLF = r0
        L82:
            android.view.View r0 = r7.getContainerView()
            r0.setVisibility(r3)
            X.8Jg r0 = r7.LLF
            if (r0 == 0) goto L90
            r0.LJJII()
        L90:
            X.8Jg r2 = r7.LLF
            if (r2 == 0) goto La6
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            java.lang.String r0 = "item.aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LIZLLL(r1)
        La6:
            r0 = -1
            r7.LLFII = r0
            r7.e4()
            goto L9
        Lae:
            r0 = r5
            goto L60
        Lb0:
            android.view.View r1 = r7.getContainerView()
            r0 = 8
            r1.setVisibility(r0)
            r7.LLF = r5
            goto La6
        Lbc:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83C.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
