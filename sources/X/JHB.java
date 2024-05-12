package X;

/* loaded from: classes9.dex */
public final class JHB {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r14 > (-1)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment r20) {
        /*
            r1 = r20
            com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco r0 = X.C49218JTi.LIZIZ(r1)
            r5 = 0
            if (r0 == 0) goto L28
            X.JQq r2 = r0.LIZLLL()
        Ld:
            boolean r0 = r2 instanceof X.JQX
            if (r0 == 0) goto L26
            X.JQX r2 = (X.JQX) r2
            if (r2 == 0) goto L26
            X.JHj r2 = r2.getPlayerView()
        L19:
            boolean r0 = r2 instanceof X.JRJ
            if (r0 == 0) goto L23
            X.JRJ r2 = (X.JRJ) r2
            X.JHj r2 = r2.getPlayerView()
        L23:
            if (r2 != 0) goto L2a
            return
        L26:
            r2 = r5
            goto L19
        L28:
            r2 = r5
            goto Ld
        L2a:
            boolean r0 = r2 instanceof X.C48887JGp
            r10 = 0
            r3 = 1
            if (r0 == 0) goto Lb6
            X.JGp r2 = (X.C48887JGp) r2
            X.JGI r0 = r2.getCore()
            if (r0 == 0) goto Lb4
            boolean r0 = r0.isPlaying()
            if (r0 != r3) goto Lb4
        L3e:
            X.JGj r2 = r2.getDataProvider()
        L42:
            if (r3 == 0) goto L46
            if (r2 != 0) goto L47
        L46:
            return
        L47:
            X.JGi r0 = r2.LJI()
            r8 = -1
            if (r0 == 0) goto Lb1
            long r14 = r0.LIZJ
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb1
        L55:
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L46
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = r2.LJJIIZI
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto Lae
            long r6 = r2.LJJIJ
            long r3 = r3 - r14
            long r3 = r3 + r6
        L67:
            long r16 = X.C48893JGv.LJII
            long r18 = X.C48893JGv.LJIIIZ
            long r18 = r18 + r3
            X.JQA r0 = r2.LJIJJLI
            if (r0 == 0) goto L73
            java.lang.String r5 = r0.LJFF
        L73:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r12 = ""
            if (r0 == 0) goto La4
            java.lang.String r13 = r2.LJIILLIIL
        L7d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZJ
            if (r0 == 0) goto L87
            java.lang.String r0 = r0.getGroupId()
            if (r0 != 0) goto La2
        L87:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZJ
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L95
            int r10 = r0.getDuration()
        L95:
            com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo r11 = new com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo
            java.lang.Integer r20 = java.lang.Integer.valueOf(r10)
            r11.<init>(r12, r13, r14, r16, r18, r20)
            X.JHF.LIZ(r1, r11)
            goto L46
        La2:
            r12 = r0
            goto L87
        La4:
            X.JQA r0 = r2.LJIJJLI
            if (r0 == 0) goto Lac
            java.lang.String r13 = r0.LJFF
            if (r13 != 0) goto L7d
        Lac:
            r13 = r12
            goto L7d
        Lae:
            long r3 = r2.LJJIJ
            goto L67
        Lb1:
            long r14 = r2.LJJIJIL
            goto L55
        Lb4:
            r3 = 0
            goto L3e
        Lb6:
            boolean r0 = r2 instanceof X.JHN
            if (r0 == 0) goto L46
            X.JHN r2 = (X.JHN) r2
            X.JGI r0 = r2.getCore()
            if (r0 == 0) goto Lce
            boolean r0 = r0.isPlaying()
            if (r0 != r3) goto Lce
        Lc8:
            X.JGj r2 = r2.getDataProvider()
            goto L42
        Lce:
            r3 = 0
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JHB.LIZ(com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment):void");
    }
}
