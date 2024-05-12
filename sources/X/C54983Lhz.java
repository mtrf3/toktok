package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;

/* renamed from: X.Lhz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54983Lhz implements C0C3 {
    public int LJLIL = -1;
    public final /* synthetic */ FeedRecommendFragment LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    public C54983Lhz(FeedRecommendFragment feedRecommendFragment) {
        this.LJLILLLLZI = feedRecommendFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r4 == (r3.LJLILLLLZI.LJLL.getAdapter().getCount() - 1)) goto L9;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r3.LJLILLLLZI
            r0.getClass()
            r3.LJLIL = r4
            boolean r0 = X.C1DH.LJIL()
            if (r0 == 0) goto L3d
            r1 = 1
            if (r4 == 0) goto L21
            if (r4 <= 0) goto L2d
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r3.LJLILLLLZI     // Catch: java.lang.Exception -> L39
            com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel r0 = r0.LJLL     // Catch: java.lang.Exception -> L39
            X.LjG r0 = r0.getAdapter()     // Catch: java.lang.Exception -> L39
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L39
            int r0 = r0 - r1
            if (r4 != r0) goto L2d
        L21:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L39
            boolean r0 = X.C1DH.LJIL()     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L2f
            goto L3d
        L2d:
            r1 = 0
            goto L21
        L2f:
            java.util.concurrent.atomic.AtomicBoolean r1 = X.LXV.LIZIZ     // Catch: java.lang.Exception -> L39
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L39
            r1.set(r0)     // Catch: java.lang.Exception -> L39
            goto L3d
        L39:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3d:
            com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService r1 = com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService.LJI()
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel r0 = r0.LJLL
            java.lang.String r0 = r0.getCurrentAwemeId()
            r1.LIZJ(r0)
            com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService r2 = com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService.LJI()
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r3.LJLILLLLZI
            X.1qj r1 = r0.mo49getActivity()
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r3.LJLILLLLZI
            r2.LIZLLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54983Lhz.onPageSelected(int):void");
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        AdHomePageDataVM adHomePageDataVM;
        if (this.LJLILLLLZI.LJLL.getCurrentAweme() != null && C63081OpJ.LLIIII(this.LJLILLLLZI.LJLL.getCurrentAweme()) && C63081OpJ.LJJJJZI(this.LJLILLLLZI.LJLL.getCurrentAweme()).getSwipeUpType() == 5 && (adHomePageDataVM = this.LJLILLLLZI.LJLLLL) != null && adHomePageDataVM.gv0()) {
            this.LJLILLLLZI.LJLLLL.LJLJI.setValue(Float.valueOf(i2));
        }
        if (i == this.LJLIL && f < 1.0E-10f) {
            this.LJLIL = -1;
        }
        C54972Lho c54972Lho = this.LJLILLLLZI.LJLLI;
        if (c54972Lho != null && f > 0.0f && (i3 = i + 1) > c54972Lho.LIZIZ) {
            c54972Lho.LIZIZ = i3;
        }
    }
}
