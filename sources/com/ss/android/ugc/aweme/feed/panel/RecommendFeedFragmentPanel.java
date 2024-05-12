package com.ss.android.ugc.aweme.feed.panel;

import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.AnonymousClass901;
import X.C00F;
import X.C16880lQ;
import X.C221018lt;
import X.C2302491w;
import X.C232659Bd;
import X.C26045AKb;
import X.C2MA;
import X.C2QE;
import X.C33726DLm;
import X.C34333Ddh;
import X.C53052Krw;
import X.C54742Le6;
import X.C54838Lfe;
import X.C54999LiF;
import X.C55007LiN;
import X.C55010LiQ;
import X.C55014LiU;
import X.C55096Ljo;
import X.C55108Lk0;
import X.C56186M3i;
import X.C57122Ma;
import X.C57738MlK;
import X.C59219NLz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73340SqO;
import X.C77266UUc;
import X.C78996UzQ;
import X.C79540VJo;
import X.C80796VnM;
import X.C8RO;
import X.HG3;
import X.IKJ;
import X.InterfaceC55018LiY;
import X.InterfaceC55235Lm3;
import X.LNM;
import X.LXU;
import X.MLK;
import X.MLL;
import X.QD3;
import X.RBX;
import X.T5Z;
import X.X1D;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.prompt.AccountShowConfirmPromptServiceImpl;
import com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public class RecommendFeedFragmentPanel extends FullFeedFragmentPanel {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public long LLIILZL;
    public long LLIIZ;
    public int LLIL;
    public final C8RO LLILII;
    public FeedRecommendFragment LLILIL;
    public InterfaceC55018LiY LLILL;
    public IPipAbility LLILLIZIL;

    public RecommendFeedFragmentPanel() {
        super("homepage_hot", 0);
        this.LLILII = new C8RO("RecommendFeedFragmentPanel");
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void LJJJJJL() {
        boolean z;
        C56186M3i LIZIZ = C77266UUc.LIZIZ.getRelationService().LIZIZ(getFragment().requireActivity(), getCurrentAweme(), AnonymousClass036.LIZJ("enter_from", "homepage_hot", "method", "cold_launch"));
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        }
        if (!((Boolean) C33726DLm.LIZJ.getValue()).booleanValue() && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.LiM
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    RecommendFeedFragmentPanel recommendFeedFragmentPanel = RecommendFeedFragmentPanel.this;
                    recommendFeedFragmentPanel.LJLILLLLZI();
                    if (((Number) C53052Krw.LIZ.getValue()).intValue() == 1) {
                        recommendFeedFragmentPanel.LLILL.LIZ();
                    }
                    return false;
                }
            });
        } else {
            LJLILLLLZI();
            if (((Number) C53052Krw.LIZ.getValue()).intValue() == 1) {
                this.LLILL.LIZ();
            }
        }
        if (getFragment() != null && !((RBX) HG3.LJIILL()).isLogin()) {
            Aweme currentAweme = getCurrentAweme();
            ActivityC45651qj requireActivity = getFragment().requireActivity();
            if (currentAweme != null && requireActivity != null) {
                if (!C57122Ma.LIZ || currentAweme.isAd() || C63081OpJ.LLIIII(currentAweme)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("swipe up show=");
                    if (!C57122Ma.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ.append(z);
                    LIZ.append("; ad aweme=");
                    LIZ.append(currentAweme.isAd());
                    LIZ.append("; splash ad=");
                    LIZ.append(C63081OpJ.LLIIII(currentAweme));
                    C221018lt.LJFF("motivate login", X1D.LIZIZ(LIZ));
                } else {
                    C55007LiN.LIZIZ.LIZ.LIZ(requireActivity);
                }
            }
        }
        if (getFragment() != null && HG3.LJFF().emailPopUpFunctionSwitch() && HG3.LJFF().shouldShowEmailPopUp(0, null) && HG3.LJFF().shouldShowEmailPopUpInFeed()) {
            HG3.LJFF().showEmailPopUp(getFragment().requireActivity(), 0, null);
        }
        if (getFragment() == null) {
            return;
        }
        IAccountShowBindPromptApi LIZJ = AccountShowConfirmPromptServiceImpl.LIZJ();
        if (!LIZJ.LIZ()) {
            return;
        }
        LIZJ.LIZIZ(getFragment().requireActivity(), "homepage_hot", null);
    }

    public final void LJLIL() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            if (C55014LiU.LIZJ || C55014LiU.LIZLLL) {
                if (C55014LiU.LIZJ) {
                    C26045AKb c26045AKb = new C26045AKb(getFragment());
                    c26045AKb.LJIIIIZZ(R.string.gpv);
                    c26045AKb.LJIIJ();
                    C55014LiU.LIZJ = false;
                }
                if (C55014LiU.LIZLLL) {
                    C26045AKb c26045AKb2 = new C26045AKb(getFragment());
                    c26045AKb2.LJIIIIZZ(R.string.gpw);
                    c26045AKb2.LJIIJ();
                    C55014LiU.LIZLLL = false;
                }
            }
        }
    }

    public final void LJLILLLLZI() {
        if (getFragment() == null) {
            return;
        }
        C57738MlK.LIZIZ.LIZLLL(getFragment().requireActivity(), getCurrentAweme()).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        super.onPageSelected();
        if (!C2QE.LIZ()) {
            if (getCurrentAweme() != null) {
                LocationServiceImpl.LJIJJ().LJI(getFragment(), getCurrentAwemeId(), getCurrentAweme().isAd());
                return;
            }
            return;
        }
        this.mViewPager.post(new ARunnableS45S0100000_9(this, 36));
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onResume() {
        super.onResume();
        IPipAbility iPipAbility = this.LLILLIZIL;
        if (iPipAbility != null) {
            iPipAbility.d5();
        }
        C80796VnM c80796VnM = this.mViewPager;
        if (c80796VnM != null) {
            c80796VnM.post(new ARunnableS14S0101000_10(4, this, 8));
        }
    }

    @QD3
    public void onAdTabChangedEvent(LNM lnm) {
        AnonymousClass901 j3;
        boolean equals = TextUtils.equals(lnm.LJLIL, "For You");
        C73340SqO.LJIJ().LIZ(getContext(), getOmSdkAdView(getCurViewHolder()), getCurrentAweme(), equals);
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder == null || (j3 = curViewHolder.j3()) == null) {
            return;
        }
        j3.T2(equals);
        if (!equals) {
            j3.e3(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onFriendsTabCleanModeChangedEvent(IKJ ikj) {
        boolean z = LXU.LIZ().LIZLLL;
        for (int i = 0; i < this.mViewPager.getChildCount(); i++) {
            C2MA curViewHolderByPosition = getCurViewHolderByPosition(i);
            if (curViewHolderByPosition != null) {
                curViewHolderByPosition.b2(z);
            }
        }
    }

    @QD3
    public void onLandPagePopupWebShowEvent(C59219NLz c59219NLz) {
        Activity activity;
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        if (curFeedViewHolder != null && curFeedViewHolder.j3() != null && (activity = this.activity) != null && (activity instanceof ActivityC45651qj) && Hox.kv0((ActivityC45651qj) activity).vv0("For You")) {
            curFeedViewHolder.j3().Q2(c59219NLz);
        }
    }

    @QD3
    public void onLandPagePopupWebShowPauseEvent(C232659Bd c232659Bd) {
        Activity activity;
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        if (curFeedViewHolder != null && curFeedViewHolder.j3() != null && (activity = this.activity) != null && (activity instanceof ActivityC45651qj) && Hox.kv0((ActivityC45651qj) activity).vv0("For You")) {
            curFeedViewHolder.j3().j3(c232659Bd);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        User curUser;
        String aid;
        super.onRenderFirstFrame(str);
        if (C79540VJo.LIZIZ >= 5 || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme != null && !currentAweme.isAd() && (aid = currentAweme.getAid()) != null) {
            C62822Ol8 c62822Ol8 = C79540VJo.LIZ;
            if (!((HashSet) c62822Ol8.getValue()).contains(aid)) {
                ((HashSet) c62822Ol8.getValue()).add(aid);
                C79540VJo.LIZIZ++;
            }
        }
        if (C79540VJo.LIZIZ < 5 || !SmartLockService.createISmartLockServicebyMonsterPlugin(false).shouldShowOnFyp() || C79540VJo.LIZIZ != 5 || (curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null || TextUtils.isEmpty(curUser.getUniqueId())) {
            return;
        }
        MLK mlk = new MLK();
        mlk.LIZJ(((RBX) HG3.LJIILL()).getCurUserId());
        mlk.LIZLLL(((RBX) HG3.LJIILL()).getCurUser().getUniqueId());
        mlk.LIZIZ(((RBX) HG3.LJIILL()).getNickName());
        mlk.LIZ(((RBX) HG3.LJIILL()).getAvatarUrl());
        MLL mll = mlk.LIZ;
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).tryShowAuthorityDialog(this.activity, mll, 1, new C55010LiQ(this, mll));
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        LiveOuterService.LJJJLL().LJJIZ().getClass();
        C54742Le6.LIZIZ.LIZ.remove("homepage_hot");
        super.J5(list, z);
        if (!isViewValid()) {
            return;
        }
        LJLIL();
        if (this.LLILL == null) {
            return;
        }
        try {
            if (((Number) C53052Krw.LIZ.getValue()).intValue() == 1) {
                if (this.mFirstRenderReady) {
                    this.LLILL.LIZ();
                }
            } else {
                this.LLILL.LIZ();
            }
        } catch (Exception e) {
            C221018lt.LIZLLL("TTRecUser", e);
        }
    }

    public final void LJLIIL(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        IRefreshAbility iRefreshAbility = this.refreshAbility;
        if (iRefreshAbility != null) {
            iRefreshAbility.setRefreshing(false);
        }
        this.mAdapter.LJLLL = z;
        if (!z) {
            this.loadMoreAbility.showLoadMoreEmpty();
        } else {
            this.loadMoreAbility.resetLoadMoreState();
        }
        Aweme item = this.mAdapter.getItem(this.mViewPager.getCurrentItem());
        int count = this.mAdapter.getCount();
        list.size();
        int LJJI = C78996UzQ.LJJI(item, list) + 1;
        for (int i = 0; i < count - LJJI && LJJI < list.size(); i++) {
            ListProtector.remove(list, LJJI);
        }
        this.mAdapter.setData(list);
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

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIILZL = new Date().getTime();
        this.LLIL = -1;
        this.activity.getWindow().setBackgroundDrawableResource(R.color.b5);
        if (C00F.LIZ(31744, 0, "enable_feed_replace_unseen_video", true) == 1) {
            this.mViewPager.LJI(new C54999LiF(this));
        }
        if (getParentScope() != null) {
            InterfaceC55235Lm3 scope = getParentScope();
            o.LJIIIZ(scope, "scope");
            this.LLILLIZIL = (IPipAbility) C55096Ljo.LIZ(scope, IPipAbility.class, null);
        }
        T5Z.LJIILL = ((Boolean) C34333Ddh.LIZ.getValue()).booleanValue();
        View findViewById = view.findViewById(R.id.g99);
        if (findViewById != null && C2302491w.LIZ()) {
            findViewById.setBackground(null);
        }
        if (C2302491w.LIZ() && (findViewById instanceof C55108Lk0)) {
            ((C55108Lk0) findViewById).setEnableOverdarwOpt(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void mobScroll(boolean z, Aweme aweme, Aweme aweme2) {
        IPipAbility iPipAbility = this.LLILLIZIL;
        if (iPipAbility != null && iPipAbility.rh0()) {
            return;
        }
        super.mobScroll(z, aweme, aweme2);
    }
}
