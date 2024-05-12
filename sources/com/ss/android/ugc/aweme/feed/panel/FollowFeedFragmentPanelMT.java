package com.ss.android.ugc.aweme.feed.panel;

import X.AbstractC54421LXl;
import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C116694i1;
import X.C232659Bd;
import X.C2MA;
import X.C2U8;
import X.C50420Jqa;
import X.C53295Kvr;
import X.C53578L1a;
import X.C54492La4;
import X.C54502LaE;
import X.C54742Le6;
import X.C54838Lfe;
import X.C54883LgN;
import X.C55068LjM;
import X.C55723Ltv;
import X.C59219NLz;
import X.C5S1;
import X.C73305Spp;
import X.C73340SqO;
import X.C78996UzQ;
import X.C79004UzY;
import X.C84193Sd;
import X.C8JF;
import X.EnumC1804076e;
import X.EnumC54493La5;
import X.FN7;
import X.FOE;
import X.IKF;
import X.InterfaceC2302191t;
import X.InterfaceC54422LXm;
import X.InterfaceC54976Lhs;
import X.InterfaceC72642tA;
import X.LNM;
import X.LNZ;
import X.LXU;
import X.QD3;
import Y.ARunnableS12S0201000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public class FollowFeedFragmentPanelMT extends FullFeedFragmentPanel {
    public boolean LLIILZL;
    public InterfaceC54422LXm LLIIZ;
    public FeedFollowFragment LLIL;
    public FeedFollowFragment LLILII;
    public FeedFollowFragment LLILIL;
    public boolean LLILL;

    public FollowFeedFragmentPanelMT() {
        super("homepage_follow", 1);
        this.LLIILZL = true;
    }

    public final void LJLIL() {
        View view;
        if (FollowFeedCombineOptimizeExpObject.INSTANCE.isHit()) {
            if (getFragment() != null) {
                Fragment fragment = getFragment();
                if ((fragment instanceof FeedFollowFragment) && (view = ((FeedFollowFragment) fragment).LLF) != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        View LJLIIL = LJLIIL();
        if (LJLIIL == null) {
            return;
        }
        LJLIIL.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onResume() {
        Aweme LJII;
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ() && TextUtils.equals(getEventType(), "homepage_follow")) {
            Aweme item = this.mAdapter.getItem(0);
            if (C78996UzQ.LJJIIZI(item) && C54838Lfe.LJJ(item) && (LJII = C55723Ltv.LIZIZ.LJIL().LJII(item.getAuthorUid())) != null && LJII != item) {
                ListProtector.set(this.mAdapter.LJJIL(), 0, LJII);
                C2MA outerViewHolderByAwemeId = getOuterViewHolderByAwemeId(LJII.getAid());
                if (outerViewHolderByAwemeId != null) {
                    outerViewHolderByAwemeId.LIZLLL(LJII);
                }
            }
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final boolean CP() {
        return super.CP();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void LJII() {
        super.LJII();
        LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void LJJZ() {
        View LJLIIL = LJLIIL();
        if (LJLIIL != null) {
            LJLIIL.setVisibility(0);
        }
    }

    public final View LJLIIL() {
        InterfaceC54422LXm interfaceC54422LXm;
        View view = null;
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            if (fragment instanceof FeedFollowFragment) {
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) fragment;
                if (feedFollowFragment.LLF == null && feedFollowFragment.getContext() != null && (interfaceC54422LXm = feedFollowFragment.LJLLL) != null && interfaceC54422LXm.LIZ() != null) {
                    InterfaceC54422LXm interfaceC54422LXm2 = feedFollowFragment.LJLLL;
                    if (interfaceC54422LXm2 != null) {
                        view = interfaceC54422LXm2.LIZ();
                    }
                    feedFollowFragment.LLF = view;
                    ((LoadMorePanelComponentTempHelper) feedFollowFragment.PZ()).addView(feedFollowFragment.LLF, new FrameLayout.LayoutParams(-1, -1));
                }
                return feedFollowFragment.LLF;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void Ne() {
        C73305Spp IK;
        Activity activity;
        super.Ne();
        if (getUserVisibleHint() && (activity = this.activity) != null) {
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(false);
        }
        AbstractC55082Lja abstractC55082Lja = this.mAdapter;
        if (abstractC55082Lja != null && abstractC55082Lja.getCount() > 0) {
            if (getUserVisibleHint()) {
                stopPlayer();
            }
            this.mAdapter.setData(Collections.emptyList());
            this.mAdapter.LJLLL = false;
            PlayButtonComponentTemp playButtonComponentTemp = this.playButtonComponentTemp;
            if (playButtonComponentTemp != null) {
                playButtonComponentTemp.es0();
            }
            C2U8.LIZ(new C8JF(true, getCurrentAwemeId(), true));
        }
        LJJZ();
        IPageStateAbility iPageStateAbility = this.pageStateAbility;
        if (iPageStateAbility != null && (IK = iPageStateAbility.IK()) != null) {
            IK.setVisibility(8);
        }
        InterfaceC54422LXm interfaceC54422LXm = this.LLIIZ;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.LJI((InterfaceC54976Lhs) getViewRoot().findViewById(R.id.itq));
        }
        FeedFollowFragment feedFollowFragment = this.LLILII;
        if (feedFollowFragment != null) {
            feedFollowFragment.Y9();
        }
        C54502LaE.LIZJ("homepage_follow", EnumC1804076e.SUCCESS, "empty");
        C54492La4.LIZIZ(EnumC54493La5.SUCCESS, "empty_page");
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageResume() {
        super.handlePageResume();
        if (this.mPageIsInvisible) {
            this.mPageIsInvisible = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void hideStatusView() {
        super.hideStatusView();
        LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        super.cb0(exc);
        LJLIL();
        EnumC1804076e result = EnumC1804076e.FAIL;
        o.LJIIIZ(result, "result");
        C54502LaE.LIZLLL("homepage_follow", result, 4);
        C54492La4.LIZIZ(EnumC54493La5.FAIL, "follow_page");
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageStop(boolean z) {
        super.handlePageStop(z);
        if (!this.mPageResumed) {
            this.mPageIsInvisible = true;
        } else {
            this.mPageIsInvisible = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void nc(Exception exc) {
        super.nc(exc);
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZJ(R.string.rjt);
        c5s1.LJ();
    }

    @QD3
    public void onAdTabChangedEvent(LNM lnm) {
        C2MA curViewHolder;
        AnonymousClass901 j3;
        boolean equals = TextUtils.equals(lnm.LJLIL, "Following");
        C73340SqO.LJIJ().LIZ(getContext(), getOmSdkAdView(getCurViewHolder()), getCurrentAweme(), equals);
        if (!equals && (curViewHolder = getCurViewHolder()) != null && (j3 = curViewHolder.j3()) != null) {
            j3.e3(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Number) FOE.LIZ.getValue()).intValue();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onFollowCleanModeChangedEvent(IKF ikf) {
        boolean z = LXU.LIZ().LIZIZ;
        for (int i = 0; i < this.mViewPager.getChildCount(); i++) {
            C2MA curViewHolderByPosition = getCurViewHolderByPosition(i);
            if (curViewHolderByPosition != null) {
                curViewHolderByPosition.b2(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        super.onFollowSuccess(followStatus);
        if (followStatus != null && followStatus.followStatus == 0) {
            String uid = followStatus.userId;
            if (C79004UzY.LJJIFFI(this.mAdapter.Q8()) || TextUtils.isEmpty(uid)) {
                return;
            }
            AbstractC55082Lja abstractC55082Lja = this.mAdapter;
            abstractC55082Lja.getClass();
            o.LJIIIZ(uid, "uid");
            List<Aweme> LJJIL = abstractC55082Lja.LJJIL();
            int size = LJJIL.size() - 1;
            boolean z = false;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                if (TextUtils.equals(uid, ((Aweme) ListProtector.get(LJJIL, size)).getAuthorUid())) {
                    abstractC55082Lja.LJJIJL(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
            if (!z) {
                return;
            }
            abstractC55082Lja.notifyDataSetChanged();
            doUnSelect(this.viewPagerComponent.K80(), true);
            handleAfterDeletion();
            LJL();
            invokeSelectCallback(this.mViewPager.getCurrentItem());
        }
    }

    @QD3
    public void onLandPagePopupWebShowEvent(C59219NLz c59219NLz) {
        Activity activity;
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        if (curFeedViewHolder != null && curFeedViewHolder.j3() != null && (activity = this.activity) != null && (activity instanceof ActivityC45651qj) && Hox.kv0((ActivityC45651qj) activity).vv0("Following")) {
            curFeedViewHolder.j3().Q2(c59219NLz);
        }
    }

    @QD3
    public void onLandPagePopupWebShowPauseEvent(C232659Bd c232659Bd) {
        Activity activity;
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        if (curFeedViewHolder != null && curFeedViewHolder.j3() != null && (activity = this.activity) != null && (activity instanceof ActivityC45651qj) && Hox.kv0((ActivityC45651qj) activity).vv0("Following")) {
            curFeedViewHolder.j3().j3(c232659Bd);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        if (!this.LLILL) {
            this.LLILL = true;
            C54502LaE.LIZIZ("homepage_follow");
            C54492La4.LIZIZ(EnumC54493La5.SUCCESS, "follow_page");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        Activity activity;
        if (((Boolean) C55068LjM.LJ.getValue()).booleanValue()) {
            FN7.LIZJ(Boolean.FALSE);
        }
        InterfaceC54422LXm interfaceC54422LXm = this.LLIIZ;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.LIZIZ();
        }
        Activity activity2 = this.activity;
        if (activity2 instanceof ActivityC45651qj) {
            ViewModelProviders.of((ActivityC45651qj) activity2).get(FollowPageFirstFrameViewModel.class).getClass();
        }
        LiveOuterService.LJJJLL().LJJIZ().getClass();
        C54742Le6.LIZIZ.LIZ.remove("homepage_follow");
        super.J5(list, z);
        if (!this.LLIILZL) {
            if (!C79004UzY.LJJIFFI(list)) {
                handlePageChange((Aweme) ListProtector.get(list, 0));
            }
            this.LLIILZL = false;
        }
        if (getUserVisibleHint() && (activity = this.activity) != null) {
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(!C79004UzY.LJJIFFI(this.mAdapter.Q8()));
        }
        FeedFollowFragment feedFollowFragment = this.LLIL;
        if (feedFollowFragment != null && feedFollowFragment.Kl()) {
            int currentItem = this.mViewPager.getCurrentItem();
            this.mViewPager.post(new ARunnableS12S0201000_9(currentItem, this, this.mAdapter.getItem(currentItem), 2));
        } else {
            if (this.activity != null) {
                try {
                    if (C53295Kvr.LIZIZ()) {
                        if (TextUtils.equals(C116694i1.LIZ((ActivityC45651qj) this.activity).nv0(), "Following")) {
                            C5S1 c5s1 = new C5S1(this.activity);
                            c5s1.LIZJ(R.string.ect);
                            c5s1.LJ();
                        }
                    } else if (TextUtils.equals(Hox.kv0((ActivityC45651qj) this.activity).ov0("HOME"), "Following")) {
                        C5S1 c5s12 = new C5S1(this.activity);
                        c5s12.LIZJ(R.string.ect);
                        c5s12.LJ();
                    }
                } catch (Exception unused) {
                }
            }
            FeedFollowFragment feedFollowFragment2 = this.LLILII;
            if (feedFollowFragment2 != null) {
                feedFollowFragment2.Y9();
            }
        }
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.activity;
        if (activityC45651qj != null) {
            LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0().LJJI("Following");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        AbstractC54421LXl abstractC54421LXl;
        ILoadMoreAbility iLoadMoreAbility;
        super.j0(list, z);
        if (!z && (iLoadMoreAbility = this.loadMoreAbility) != null) {
            iLoadMoreAbility.showLoadMoreEmpty();
        }
        FeedFollowFragment feedFollowFragment = this.LLILIL;
        if (feedFollowFragment == null || (abstractC54421LXl = feedFollowFragment.LLIFFJFJJ) == null) {
            return;
        }
        T t = abstractC54421LXl.LIZ.LJLIL;
        if (!(t instanceof C54883LgN)) {
            return;
        }
        FeedFollowFragment.Ql((C54883LgN) t);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC51033K1d
    public final void onItemInserted(List<Aweme> list, int i) {
        if (this.mAdapter.getCount() == 0) {
            this.mAdapter.setData(list);
        } else {
            this.mAdapter.LJJJIL(i, 1, list);
        }
        if (i >= 0 && i < this.mAdapter.getCount()) {
            this.mViewPager.setCurrentItem(i);
            Aweme item = this.mAdapter.getItem(i);
            if (C54838Lfe.LJJ(item)) {
                getCurViewHolder().LLLZ(i, item);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater layoutInflater, final InterfaceC72642tA<C50420Jqa> interfaceC72642tA, final Fragment fragment, final View.OnTouchListener onTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t interfaceC2302191t) {
        return new FullFeedPagerAdapter(context, layoutInflater, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t) { // from class: X.3DR
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "follow_feed";
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final C55136LkS LJJJ() {
                final C3DS c3ds = C3DS.LJLIL;
                return new C55136LkS(c3ds) { // from class: X.3DT
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(C3DU.LIZ, c3ds);
                        o.LJIIIZ(c3ds, "producer");
                    }
                };
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, layoutInflater, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(layoutInflater, "inflater");
                o.LJIIIZ(interfaceC72642tA, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(onTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(interfaceC2302191t, "iHandlePlay");
            }
        };
    }
}
