package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;

/* renamed from: X.8MX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MX extends AbstractC65781Prl implements InterfaceC88473Ynt<InteractBottomBannerComponent, C43I<? extends Integer>, C43I<? extends C70012ov>, C76800UCe> {
    public static final C8MX LJLIL = new C8MX();

    public C8MX() {
        super(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (X.C8MY.LIZ(r2, r3) != false) goto L5;
     */
    @Override // X.InterfaceC88473Ynt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent r9, X.C43I<? extends java.lang.Integer> r10, X.C43I<? extends X.C70012ov> r11) {
        /*
            r8 = this;
            com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent r9 = (com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent) r9
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r10 != 0) goto Le
            if (r11 != 0) goto Le
        Lb:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Le:
            X.8PV r0 = r9.p4()
            r0.LIZJ()
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r9)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            if (r2 == 0) goto Lb
            X.8O4 r0 = r9.a1()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r3 = r0.LJ
            boolean r0 = r2.isAd()
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L6c
            boolean r0 = X.C78996UzQ.LJJIJIL(r2)
            if (r0 == 0) goto L6c
            java.lang.String r5 = "bottom_banner_warning"
            java.lang.String r4 = "1"
        L39:
            boolean r0 = X.C8MY.LIZ(r2, r3)
            if (r0 == 0) goto Lb
            r0 = 3
            X.OSZ[] r3 = new X.OSZ[r0]
            java.lang.String r2 = r2.getGroupId()
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "group_id"
            r1.<init>(r0, r2)
            r3[r7] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "reason"
            r1.<init>(r0, r5)
            r3[r6] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "error_code"
            r1.<init>(r0, r4)
            r0 = 2
            r3[r0] = r1
            java.util.Map r1 = X.C113554cx.LJJL(r3)
            java.lang.String r0 = "trending_bar_show_but_not"
            X.FMX.LJIIL(r0, r1)
            goto Lb
        L6c:
            com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService r0 = yq4.a.LIZLLL()
            java.lang.Boolean r1 = r0.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L9a
            boolean r0 = r2.isProhibitedAndShouldTell()
            if (r0 != 0) goto L9a
            boolean r0 = X.C220858ld.LJII(r2)
            if (r0 != 0) goto L9a
            r0 = 1
        L8b:
            java.lang.String r4 = "-1"
            if (r0 == 0) goto La6
            boolean r0 = X.C8P4.LIZ(r2, r3)
            if (r0 == 0) goto L9c
            java.lang.String r5 = "bottom_banner_playlist"
            java.lang.String r4 = "3"
            goto L39
        L9a:
            r0 = 0
            goto L8b
        L9c:
            boolean r0 = X.C8MY.LIZ(r2, r3)
            java.lang.String r5 = ""
            if (r0 == 0) goto L39
            goto Lb
        La6:
            java.lang.String r5 = "no_match_condition"
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8MX.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
