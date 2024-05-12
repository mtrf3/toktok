package com.ss.android.ugc.aweme.popularfeed.panel;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C188787b0;
import X.C232659Bd;
import X.C2MA;
import X.C50420Jqa;
import X.C54502LaE;
import X.C54546Law;
import X.C54547Lax;
import X.C54548Lay;
import X.C54549Laz;
import X.C59219NLz;
import X.C73340SqO;
import X.FWC;
import X.InterfaceC2302191t;
import X.InterfaceC54540Laq;
import X.InterfaceC72642tA;
import X.LJK;
import X.LNM;
import X.NHG;
import X.NPC;
import X.ORZ;
import X.QD3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedFragmentPanel extends FullFeedFragmentPanel implements InterfaceC54540Laq {
    public int LLIILZL;
    public boolean LLIIZ;

    public PopularFeedFragmentPanel() {
        super("homepage_popular", 33);
        this.LLIILZL = -1;
    }

    @QD3
    public final void onAdTabChangedEvent(LNM event) {
        C2MA curViewHolder;
        AnonymousClass901 j3;
        o.LJIIIZ(event, "event");
        boolean equals = TextUtils.equals(event.LJLIL, "Popular");
        C73340SqO.LJIJ().LIZ(getContext(), getOmSdkAdView(getCurViewHolder()), getCurrentAweme(), equals);
        if (!equals && (curViewHolder = getCurViewHolder()) != null && (j3 = curViewHolder.j3()) != null) {
            j3.e3(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.LJ == true) goto L6;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleanModeChangedEvent(X.IKI r5) {
        /*
            r4 = this;
            X.LXS r0 = X.LXU.LIZ()
            r3 = 0
            if (r0 == 0) goto L22
            boolean r0 = r0.LJ
            r2 = 1
            if (r0 != r2) goto L22
        Lc:
            X.VnM r0 = r4.mViewPager
            if (r0 == 0) goto L24
            int r1 = r0.getChildCount()
        L14:
            if (r3 >= r1) goto L24
            X.2MA r0 = r4.getCurViewHolderByPosition(r3)
            if (r0 == 0) goto L1f
            r0.b2(r2)
        L1f:
            int r3 = r3 + 1
            goto L14
        L22:
            r2 = 0
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.popularfeed.panel.PopularFeedFragmentPanel.onCleanModeChangedEvent(X.IKI):void");
    }

    @QD3
    public final void onFeedRefreshEvent(LJK ljk) {
        int i;
        if (ljk != null) {
            i = ljk.LJLIL;
        } else {
            i = -1;
        }
        this.LLIILZL = i;
    }

    @QD3
    public final void onLandPagePopupWebShowEvent(C59219NLz c59219NLz) {
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        Activity activity = this.activity;
        if (activity != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (c188787b0.LIZ((ActivityC45651qj) activity).vv0("Popular") && curFeedViewHolder != null && curFeedViewHolder.j3() != null) {
                curFeedViewHolder.j3().Q2(c59219NLz);
            }
        }
    }

    @QD3
    public final void onLandPagePopupWebShowPauseEvent(C232659Bd c232659Bd) {
        if (c232659Bd == null) {
            return;
        }
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        Activity activity = this.activity;
        if (activity != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (c188787b0.LIZ((ActivityC45651qj) activity).vv0("Popular") && curFeedViewHolder != null && curFeedViewHolder.j3() != null) {
                curFeedViewHolder.j3().j3(c232659Bd);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        if (!this.LLIIZ) {
            this.LLIIZ = true;
            C54502LaE.LIZLLL("homepage_popular", null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<? extends Aweme> list, boolean z) {
        List<Aweme> list2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        NPC.LJIIJJI(getPageType(), list2, new C54547Lax());
        ((FWC) C73340SqO.LJIJJ()).LIZIZ(list2);
        NPC.LIZ(list2, new C54549Laz());
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LIZ.LJIILJJIL(getEventType(), list2);
        }
        super.J5(list2, z);
        if (z) {
            ILoadMoreAbility iLoadMoreAbility = this.loadMoreAbility;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.resetLoadMoreState();
                return;
            }
            return;
        }
        ILoadMoreAbility iLoadMoreAbility2 = this.loadMoreAbility;
        if (iLoadMoreAbility2 != null) {
            iLoadMoreAbility2.showLoadMoreEmpty();
        }
        ILoadMoreAbility iLoadMoreAbility3 = this.loadMoreAbility;
        if (iLoadMoreAbility3 == null) {
            return;
        }
        iLoadMoreAbility3.fy();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<? extends Aweme> list, boolean z) {
        List<Aweme> list2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        NPC.LJIIJJI(getPageType(), list2, new C54546Law());
        ((FWC) C73340SqO.LJIJJ()).LIZIZ(list2);
        NPC.LIZ(list2, new C54548Lay());
        super.j0(list2, z);
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LIZ.LJIILJJIL(getEventType(), list2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater inflater, final InterfaceC72642tA<C50420Jqa> listener, final Fragment fragment, final View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DD
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "popular_feed";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(inflater, "inflater");
                o.LJIIIZ(listener, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(tapTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(iHandlePlay, "iHandlePlay");
            }
        };
    }
}
