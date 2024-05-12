package com.ss.android.ugc.aweme.core;

import X.C214788bq;
import X.C215488cy;
import X.C215498cz;
import X.C215518d1;
import X.C215798dT;
import X.C2Y0;
import X.C33Q;
import X.C47261Igj;
import X.C62623Ohv;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.LandscapeVideoPlayEndEvent;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* loaded from: classes4.dex */
public final class DanmakuViewModel extends FeedBaseViewModel<C215798dT> {
    public C215498cz LJLL;
    public C215518d1 LJLLI;
    public boolean LJLLJ;
    public C215488cy LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public long LJLJLLL = -1;
    public long LJLLILLLL = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C215798dT(0);
    }

    public final void mv0() {
        Aweme aweme;
        Aweme aweme2;
        String str;
        int i;
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        if (c62623Ohv.LJFF(aweme) && this.LJLLLLLL && !this.LJLLLL) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme2 = gv02.getAweme();
            } else {
                aweme2 = null;
            }
            VideoItemParams gv03 = gv0();
            if (gv03 == null || (str = gv03.mEventType) == null) {
                str = "";
            }
            C215488cy c215488cy = this.LJLLL;
            int i2 = 0;
            if (c215488cy != null) {
                i = c215488cy.LJLILLLLZI;
                i2 = c215488cy.LJLJI;
            } else {
                i = 0;
            }
            C214788bq.LIZ(new LandscapeVideoPlayEndEvent(), C47261Igj.LJJIJ(new C2Y0(i, null, i2, 2)), aweme2, str);
            this.LJLLLL = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r8 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lv0(boolean r15) {
        /*
            r14 = this;
            boolean r0 = r14.LJLLLLLL
            if (r0 != 0) goto L5
            return
        L5:
            X.8cy r0 = r14.LJLLL
            r5 = 0
            if (r0 == 0) goto L12
            java.util.List<java.lang.String> r0 = r0.LJLJL
            int r1 = r0.size()
            if (r1 > 0) goto L13
        L12:
            return
        L13:
            if (r15 != 0) goto L1a
            r0 = 100
            if (r1 >= r0) goto L1a
            return
        L1a:
            java.lang.Object r0 = r14.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r7 = 0
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.getAweme()
        L27:
            java.lang.Object r0 = r14.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L33
            java.lang.String r6 = r0.mEventType
            if (r6 != 0) goto L35
        L33:
            java.lang.String r6 = ""
        L35:
            X.8cy r0 = r14.LJLLL
            if (r0 == 0) goto L6f
            int r4 = r0.LJLJJI
            java.util.List<java.lang.String> r8 = r0.LJLJL
            if (r8 != 0) goto L41
        L3f:
            X.OQg r8 = X.C61878OQg.INSTANCE
        L41:
            java.lang.String r9 = ","
            java.lang.String r10 = "["
            java.lang.String r11 = "]"
            X.8d3 r12 = X.C215538d3.LJLIL
            r13 = 24
            java.lang.String r3 = X.ORZ.LLD(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.eventtrack.eventfiles.DanmakuShowEvent r2 = new com.ss.android.ugc.aweme.eventtrack.eventfiles.DanmakuShowEvent
            r2.<init>()
            X.2Y0 r1 = new X.2Y0
            r0 = 4
            r1.<init>(r4, r3, r5, r0)
            java.util.List r0 = X.C47261Igj.LJJIJ(r1)
            X.C214788bq.LIZ(r2, r0, r7, r6)
            X.8cy r0 = r14.LJLLL
            if (r0 == 0) goto L6e
            r0.LJLJJI = r5
            r0.LJLJJL = r5
            java.util.List<java.lang.String> r0 = r0.LJLJL
            r0.clear()
        L6e:
            return
        L6f:
            r4 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.lv0(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kv0(long r16, boolean r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.kv0(long, boolean):void");
    }
}
