package com.ss.android.ugc.aweme.feed.component;

import X.ActivityC45651qj;
import X.C1DH;
import X.C221108m2;
import X.C25678A5y;
import X.C2M9;
import X.C2MA;
import X.C2NU;
import X.C34186DbK;
import X.C36922EeM;
import X.C39091FVv;
import X.C47957Irx;
import X.C51031K1b;
import X.C54980Lhw;
import X.C55017LiX;
import X.C56509MFt;
import X.C62822Ol8;
import X.C77439UaJ;
import X.EnumC111394Yt;
import X.LXM;
import X.LYH;
import X.MG5;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecommendFeedComponent extends HomeFeedComponent implements IRecommendFeedFragmentAbility {
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        ActivityC45651qj mo49getActivity;
        C36922EeM.LIZLLL(4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        AtomicBoolean atomicBoolean = C39091FVv.LIZLLL;
        if (atomicBoolean.get()) {
            C39091FVv.LIZ();
        }
        if (C39091FVv.LIZJ == 0) {
            C39091FVv.LIZJ = System.currentTimeMillis();
        }
        atomicBoolean.set(true);
        if (LYH.LIZ() && (mo49getActivity = ((Fragment) this.LJLLI.getValue()).mo49getActivity()) != null && !mo49getActivity.isFinishing() && C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
            LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = this.LJLJLLL;
            if (loadMorePanelComponentTempHelper != null) {
                loadMorePanelComponentTempHelper.resetLoadMoreState();
            }
            C25678A5y.LIZIZ(mo49getActivity, MG5.RECOMMEND_FEED, null, null);
            C39091FVv.LIZ();
            return;
        }
        if (C34186DbK.LIZ()) {
            ((FullFeedFragmentPanel) this.LJLLILLLL.getValue()).LJJJJLI();
        }
        A3().LJIILL(4, 0, 2);
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
        ((FeedRecommendFragment) this.LJLLI.getValue()).Nl("slide_up");
    }

    public RecommendFeedComponent() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 228));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 227));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 226));
    }

    public final C54980Lhw A3() {
        return (C54980Lhw) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C2MA m30() {
        return ((BaseListFragmentPanel) this.LJLLILLLL.getValue()).getCurFeedViewHolder();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJIILJJIL() {
        if (isLoading()) {
            return false;
        }
        T t = A3().LJLIL;
        if (t != 0 && !((C55017LiX) t).LJLJLLL) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJIJIIJI() {
        boolean z = true;
        A3().LJLJLJ = true;
        C54980Lhw A3 = A3();
        Object[] objArr = new Object[4];
        objArr[0] = 4;
        objArr[1] = Integer.valueOf(getPanelContext().LIZLLL);
        objArr[2] = 2;
        if (!C2M9.LIZ() || !C47957Irx.LIZJ()) {
            z = false;
        }
        objArr[3] = Boolean.valueOf(z);
        return A3.LJIILL(objArr);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, X.InterfaceC58812Sn
    public final void Lf() {
        C54980Lhw A3 = A3();
        T t = A3.LJLIL;
        if (t != 0) {
            C55017LiX.LJIILIIL(null);
            ((C55017LiX) t).LJLJLLL = true;
            A3.LJLIL.resetLoadingStatus(null);
        }
        A3().LJLJLJ = true;
        A3().LJIILL(16, Integer.valueOf(getPanelContext().LIZLLL), 2, 16);
        C54980Lhw A32 = A3();
        T t2 = A32.LJLIL;
        if (t2 != 0) {
            C55017LiX.LJIILIIL(null);
            ((C55017LiX) t2).LJLJLLL = true;
            A32.LJLIL.resetLoadingStatus(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C51031K1b Qv() {
        return A3();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility
    public final boolean k00() {
        return A3().LJIILL(4, Integer.valueOf(getPanelContext().LIZLLL), 2);
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        return LXM.LIZ(this, C56509MFt.LIZLLL(getPanelContext()));
    }

    @Override // X.InterfaceC57302Ms
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return LXM.LIZJ(this, aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility, X.InterfaceC57302Ms
    public final boolean deleteItem(String str) {
        return LXM.LIZIZ(this, str);
    }
}
