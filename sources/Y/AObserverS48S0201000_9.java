package Y;

import X.A7Z;
import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C2U8;
import X.C46141I8z;
import X.C53282Kve;
import X.C54981Lhx;
import X.C55773Luj;
import X.C55786Luw;
import X.C78920UyC;
import X.CallableC55021Lib;
import X.OSJ;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AObserverS48S0201000_9 implements Observer {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS48S0201000_9 aObserverS48S0201000_9, Object obj) {
        boolean z;
        String str;
        C55773Luj LIZLLL;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        List<Aweme> Q8;
        String LLJJIJIIJIL;
        switch (aObserverS48S0201000_9.i2) {
            case 0:
                ((BaseListFragmentPanel) aObserverS48S0201000_9.l0).lambda$observerChangeTab$21((Activity) aObserverS48S0201000_9.l1, (String) obj);
                return;
            default:
                FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS48S0201000_9.l0;
                IRefreshAbility iRefreshAbility = (IRefreshAbility) aObserverS48S0201000_9.l1;
                ActivityC45651qj mo49getActivity = feedRecommendFragment.mo49getActivity();
                if (mo49getActivity == null) {
                    return;
                }
                SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper = feedRecommendFragment.LLFII;
                if (sharedVideoDeepLinkHelper == null) {
                    if (A7Z.LIZ()) {
                        sharedVideoDeepLinkHelper = new SharedVideoDeepLinkHelper(feedRecommendFragment.LJLL);
                        feedRecommendFragment.LLFII = sharedVideoDeepLinkHelper;
                    } else {
                        sharedVideoDeepLinkHelper = null;
                    }
                }
                if (sharedVideoDeepLinkHelper != null) {
                    sharedVideoDeepLinkHelper.onVideoFirstFrameRendered(null);
                    if (sharedVideoDeepLinkHelper.LIZ(mo49getActivity.getIntent(), false)) {
                        return;
                    }
                }
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(mo49getActivity.getIntent(), "gids");
                if (!TextUtils.isEmpty(LLJJIJIIJIL2) && LLJJIJIIJIL2.equals(feedRecommendFragment.LJLL.getCurrentAwemeId())) {
                    return;
                }
                if (RecFeedShareComponentController.LJ(mo49getActivity)) {
                    if (feedRecommendFragment.LLFFF == null) {
                        feedRecommendFragment.LLFFF = new RecFeedShareComponentController(feedRecommendFragment.LJLL);
                    }
                    RecFeedShareComponentController recFeedShareComponentController = feedRecommendFragment.LLFFF;
                    recFeedShareComponentController.LIZIZ();
                    recFeedShareComponentController.LJIIIZ(false);
                    feedRecommendFragment.Vl();
                    return;
                }
                Intent intent = mo49getActivity.getIntent();
                if (intent != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "gids")) != null && LLJJIJIIJIL.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean booleanValue = ((Boolean) C53282Kve.LIZ.getValue()).booleanValue();
                if (z || !booleanValue) {
                    if (!TextUtils.isEmpty(LLJJIJIIJIL2) && !LLJJIJIIJIL2.contains(",") && (recommendFeedFragmentPanel = feedRecommendFragment.LJLL) != null && (Q8 = recommendFeedFragmentPanel.getAdapter().Q8()) != null) {
                        Iterator<Aweme> it = Q8.iterator();
                        while (it.hasNext()) {
                            if (TextUtils.equals(it.next().getAid(), LLJJIJIIJIL2)) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("aweme://aweme/detail/");
                                LIZ.append(LLJJIJIIJIL2);
                                SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity, X1D.LIZIZ(LIZ));
                                buildRoute.withParam(C16880lQ.LLJJIJI(mo49getActivity.getIntent()));
                                buildRoute.open();
                                return;
                            }
                        }
                    }
                    String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(mo49getActivity.getIntent(), "gids");
                    boolean booleanExtra = mo49getActivity.getIntent().getBooleanExtra("onNewIntent", false);
                    String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(mo49getActivity.getIntent(), "push_params");
                    String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(mo49getActivity.getIntent(), "refer");
                    String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(mo49getActivity.getIntent(), "share_url");
                    int intExtra = mo49getActivity.getIntent().getIntExtra("share_link_mode", 0);
                    if (intExtra == 0) {
                        if (LLJJIJIIJIL3 == null || LLJJIJIIJIL3.length() == 0) {
                            return;
                        }
                    } else if (intExtra != 1 || LLJJIJIIJIL6 == null || LLJJIJIIJIL6.length() == 0) {
                        return;
                    }
                    if (!booleanExtra) {
                        return;
                    }
                    if (LLJJIJIIJIL3 == null || LLJJIJIIJIL3.length() == 0) {
                        str = null;
                    } else {
                        str = C78920UyC.LIZ('[', LLJJIJIIJIL3, ']');
                    }
                    C10K.LIZJ(new CallableC55021Lib(LLJJIJIIJIL3, str, LLJJIJIIJIL4, LLJJIJIIJIL5, LLJJIJIIJIL6, intExtra)).LJI(new C54981Lhx(feedRecommendFragment, intExtra), C10K.LJIIIIZZ, null);
                    mo49getActivity.getIntent().removeExtra("gids");
                    mo49getActivity.getIntent().removeExtra("onNewIntent");
                    if (iRefreshAbility != null) {
                        iRefreshAbility.N30(feedRecommendFragment.LJLLLLLL);
                        iRefreshAbility.setRefreshing(true);
                    }
                    ActivityC45651qj mo49getActivity2 = feedRecommendFragment.mo49getActivity();
                    if (mo49getActivity2 == null || mo49getActivity2.getIntent() == null || !mo49getActivity2.getIntent().getBooleanExtra("share_expose_sharer", false)) {
                        return;
                    }
                    if (feedRecommendFragment.LLFFF == null) {
                        feedRecommendFragment.LLFFF = new RecFeedShareComponentController(feedRecommendFragment.LJLL);
                    }
                    RecFeedShareComponentController recFeedShareComponentController2 = feedRecommendFragment.LLFFF;
                    recFeedShareComponentController2.LJIIIIZZ();
                    ActivityC45651qj mo49getActivity3 = feedRecommendFragment.mo49getActivity();
                    if (mo49getActivity3 != null) {
                        Intent intent2 = mo49getActivity3.getIntent();
                        if (intent2 != null && (LIZLLL = C55786Luw.LIZLLL(intent2)) != null) {
                            recFeedShareComponentController2.LJII(LIZLLL, LLJJIJIIJIL2);
                        }
                        Intent intent3 = mo49getActivity3.getIntent();
                        if (intent3 != null) {
                            intent3.removeExtra("share_expose_sharer");
                        }
                    }
                    feedRecommendFragment.Vl();
                    return;
                }
                feedRecommendFragment.Jl(Boolean.FALSE);
                return;
        }
    }

    public static final void onChanged$1(AObserverS48S0201000_9 aObserverS48S0201000_9, Object obj) {
        OSJ osj = (OSJ) obj;
        int intValue = ((Number) osj.getFirst()).intValue();
        ((Number) osj.getSecond()).floatValue();
        int intValue2 = ((Number) osj.getThird()).intValue();
        Aweme aweme = ((DetailPageComponent) aObserverS48S0201000_9.l0).LLFZ;
        if ((aweme != null && aweme.getPreviewData() != null) || intValue != ((ScrollSwitchStateManager) aObserverS48S0201000_9.l1).nv0("page_feed")) {
            return;
        }
        DetailPageComponent detailPageComponent = (DetailPageComponent) aObserverS48S0201000_9.l0;
        if (!detailPageComponent.LLF) {
            detailPageComponent.LLF = true;
            C2U8.LIZ(new C46141I8z());
        }
        if (intValue2 > aObserverS48S0201000_9.i2) {
            DetailFragmentPanel detailFragmentPanel = ((DetailPageComponent) aObserverS48S0201000_9.l0).LJZL;
            if (detailFragmentPanel == null) {
                return;
            }
            detailFragmentPanel.LJLZ(false);
            return;
        }
        DetailFragmentPanel detailFragmentPanel2 = ((DetailPageComponent) aObserverS48S0201000_9.l0).LJZL;
        if (detailFragmentPanel2 == null) {
            return;
        }
        detailFragmentPanel2.LJLZ(true);
    }

    public AObserverS48S0201000_9(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
