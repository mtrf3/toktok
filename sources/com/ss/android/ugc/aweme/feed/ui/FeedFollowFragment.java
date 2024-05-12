package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC54421LXl;
import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C00F;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C110544Vm;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C175046tw;
import X.C175336uP;
import X.C17N;
import X.C188727au;
import X.C1DH;
import X.C1JD;
import X.C221018lt;
import X.C29S;
import X.C2MA;
import X.C2U8;
import X.C31633CbF;
import X.C32151Nz;
import X.C35971E9v;
import X.C38987FRv;
import X.C3C5;
import X.C3SZ;
import X.C44938HkM;
import X.C45042Hm2;
import X.C47261Igj;
import X.C51697KQr;
import X.C53295Kvr;
import X.C53882LCs;
import X.C54067LJv;
import X.C54082LKk;
import X.C54251LQx;
import X.C54362LVe;
import X.C54409LWz;
import X.C54426LXq;
import X.C54427LXr;
import X.C54435LXz;
import X.C54444LYi;
import X.C54450LYo;
import X.C54492La4;
import X.C54502LaE;
import X.C54689LdF;
import X.C54883LgN;
import X.C55026Lig;
import X.C55068LjM;
import X.C55230Lly;
import X.C55723Ltv;
import X.C57738MlK;
import X.C61192ah;
import X.C62814Ol0;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C72253SXh;
import X.C73318Sq2;
import X.C73353Sqb;
import X.C76800UCe;
import X.C77317UWb;
import X.C77439UaJ;
import X.C78855Ux9;
import X.C78866UxK;
import X.C78929UyL;
import X.C87277YNd;
import X.C90903hW;
import X.EVM;
import X.FMX;
import X.FN6;
import X.HG3;
import X.IKD;
import X.IWF;
import X.InterfaceC36571c5;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC54054LJi;
import X.InterfaceC54422LXm;
import X.InterfaceC54434LXy;
import X.InterfaceC54978Lhu;
import X.InterfaceC55235Lm3;
import X.InterfaceC56322M8o;
import X.InterfaceC57543MiB;
import X.KL2;
import X.KRB;
import X.KUM;
import X.L7K;
import X.LAO;
import X.LEJ;
import X.LIQ;
import X.LJK;
import X.LMU;
import X.LNZ;
import X.LOJ;
import X.LSC;
import X.LWR;
import X.LWU;
import X.LX3;
import X.LX4;
import X.LXD;
import X.LXU;
import X.LXV;
import X.LY0;
import X.LY3;
import X.LYB;
import X.LYH;
import X.LYU;
import X.M89;
import X.MG5;
import X.NK1;
import X.O6R;
import X.QD3;
import X.QX2;
import X.RBX;
import X.X1D;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS28S0101000_10;
import Y.ACListenerS29S0101000_12;
import Y.ACallableS36S1100000_9;
import Y.ACallableS45S0201000_9;
import Y.ACallableS78S0101000_6;
import Y.AObjectS142S0100000_9;
import Y.AObjectS42S0101000_5;
import Y.AObjectS45S0101000_13;
import Y.AObjectS52S0101000_7;
import Y.AObserverS58S0101000_2;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS9S0101000_5;
import Y.IDTListenerS118S0100000_9;
import Y.IDiS271S0100000_9;
import Y.IDrS14S0000000_9;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.assem.GuideBackToFYPAssem;
import com.ss.android.ugc.aweme.feed.component.FollowFeedComponent;
import com.ss.android.ugc.aweme.feed.model.AutoRefreshFollowFeedLiveEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.vm.FollowFeedVM;
import com.ss.android.ugc.aweme.follow.controller.FollowTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes10.dex */
public class FeedFollowFragment extends BaseFeedListFragment implements InterfaceC53896LDg, InterfaceC57543MiB, LWU, NK1, InterfaceC40408FtU, LOJ, LY0, InterfaceC56322M8o {
    public static final /* synthetic */ int LLIILII = 0;
    public InterfaceC54422LXm LJLLL;
    public C110544Vm LJLLLL;
    public FrameLayout LJLLLLLL;
    public FrameLayout LJLZ;
    public TextView LJZ;
    public FollowSkyLightHelper LJZI;
    public View LLF;
    public AbstractC54421LXl LLIFFJFJJ;
    public FollowFeedVM LLIIII;
    public final C73318Sq2 LJLJLLL = new C73318Sq2();
    public int LJLL = -1;
    public int LJLLI = 0;
    public int LJLLILLLL = 0;
    public boolean LJLLJ = true;
    public boolean LJZL = false;
    public boolean LL = false;
    public boolean LLD = false;
    public boolean LLFF = true;
    public boolean LLFFF = false;
    public boolean LLFII = false;
    public final FollowFeedFragmentPanelMT LLFZ = new FollowFeedFragmentPanelMT();
    public final MineUserStoryFetcher LLI = new MineUserStoryFetcher();
    public LAO LLII = null;
    public InterfaceC54434LXy LLIIIILZ = null;
    public boolean LLIIIJ = true;
    public boolean LLIIIL = false;
    public boolean LLIIIZ = false;
    public boolean LLIIJI = true;
    public boolean LLIIJLIL = true;
    public boolean LLIIL = false;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "Following";
    }

    @Override // X.InterfaceC57543MiB
    public final boolean M1() {
        return true;
    }

    @Override // X.LY0
    public final void Y9() {
        this.LLFFF = true;
        if (Rl()) {
            Jl();
        }
        AbstractC54421LXl abstractC54421LXl = this.LLIFFJFJJ;
        if (abstractC54421LXl == null) {
            return;
        }
        T t = abstractC54421LXl.LIZ.LJLIL;
        if (!(t instanceof C54883LgN)) {
            return;
        }
        C54883LgN c54883LgN = (C54883LgN) t;
        Ql(c54883LgN);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        boolean isDataEmpty = c54883LgN.isDataEmpty();
        if (mo49getActivity != null) {
            IXTabScrollProfileStrategy Uj = LNZ.LIZIZ.getXTabScrollProfileVM(mo49getActivity).Uj();
            if (Uj != null) {
                Uj.LLZZLLIL(isDataEmpty);
            }
            if (this.LLIIII == null) {
                this.LLIIII = (FollowFeedVM) ViewModelProviders.of(requireActivity()).get(FollowFeedVM.class);
            }
            this.LLIIII.LJLIL = isDataEmpty;
        }
        if (isDataEmpty) {
            C10K.LIZIZ(new ACallableS78S0101000_6(0, this, 9), FMX.LIZIZ(), null);
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "follow_feed";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "FeedFollowFragment";
    }

    public static boolean Rl() {
        if (C00F.LIZ(31744, 0, "i18n_following_live_skylight_type", true) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final HomeFeedComponent Gl() {
        return new FollowFeedComponent();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jl() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper r0 = r5.LJZI
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.LLFF
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3e
            r5.LLFF = r2
            int r1 = X.C52931Kpz.LIZ()
            r0 = 2
            if (r1 == r0) goto L1b
            int r1 = X.C52931Kpz.LIZ()
            r0 = 4
            if (r1 != r0) goto L3e
        L1b:
            com.bytedance.ies.uikit.base.AbsFragment r1 = r5.LJLJJL
            boolean r0 = r1 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto L3c
            com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility r0 = X.C78929UyL.LJIILLIIL(r1)
            if (r0 == 0) goto L3c
            X.LMU r0 = r0.uu0()
            if (r0 == 0) goto L3c
            boolean r0 = r0.LJI
        L2f:
            r4 = r0 ^ 1
        L31:
            X.LXl r0 = r5.LLIFFJFJJ
            T extends X.K1b r0 = r0.LIZ
            T extends X.8BS r1 = r0.LJLIL
            boolean r0 = r1 instanceof X.C54883LgN
            if (r0 != 0) goto L40
            return
        L3c:
            r0 = 0
            goto L2f
        L3e:
            r4 = 1
            goto L31
        L40:
            X.K1g r1 = (X.AbstractC51036K1g) r1
            boolean r0 = r1.isDataEmpty()
            if (r0 == 0) goto L4c
            r5.Ll()
            return
        L4c:
            com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper r0 = r5.LJZI
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L58
            boolean r0 = r5.LLFFF
            if (r0 != 0) goto L5c
        L58:
            r5.Ll()
        L5b:
            return
        L5c:
            boolean r0 = r5.LJZL
            if (r0 != 0) goto L5b
            if (r4 == 0) goto L5b
            com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper r0 = r5.LJZI
            if (r0 == 0) goto L5b
            boolean r0 = r5.isViewValid()
            if (r0 == 0) goto L5b
            boolean r0 = Rl()
            if (r0 != 0) goto L73
            goto L5b
        L73:
            boolean r0 = r5.LLIIJI
            if (r0 != 0) goto L8d
            boolean r0 = r5.LLIIIZ
            if (r0 == 0) goto L8a
            java.lang.String r0 = "home_tab"
        L7d:
            r5.LLIIJI = r2
            r5.Tl(r0, r3, r2)
            android.widget.FrameLayout r0 = r5.LJLZ
            r5.Sl(r2, r0, r2)
            r5.LLIIIZ = r2
            goto L5b
        L8a:
            java.lang.String r0 = "pull"
            goto L7d
        L8d:
            java.lang.String r0 = "auto"
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.Jl():void");
    }

    public final boolean Kl() {
        AbstractC54421LXl abstractC54421LXl = this.LLIFFJFJJ;
        if (abstractC54421LXl == null) {
            return false;
        }
        return abstractC54421LXl.LIZJ();
    }

    public final void Ll() {
        if (this.LJZI == null || !isViewValid()) {
            return;
        }
        Tl("auto", false, false);
        Sl(false, this.LJLZ, false);
    }

    public final void Ml() {
        if (this.LJZI == null || !isViewValid()) {
            return;
        }
        Tl("", false, false);
        Sl(true, this.LJLZ, false);
    }

    public final void Ol() {
        int i = this.LJLLI;
        int i2 = this.LJLLILLLL;
        String str = "publish_landing";
        if (!o.LJ(LYU.LJI, "publish_landing")) {
            if (i == 0) {
                str = "click_story";
            } else if (i2 == 0) {
                str = "click_live";
            } else {
                str = "click_live_story";
            }
        }
        Tl(str, true, true);
        Sl(false, this.LJLZ, true);
    }

    @Override // X.NK1
    public final boolean cd() {
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = this.LLFZ;
        if (followFeedFragmentPanelMT != null && followFeedFragmentPanelMT.isShareDialogShowing()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57543MiB
    public final void Bb() {
        if (PZ() != null) {
            ((LoadMorePanelComponentTempHelper) PZ()).ug0();
        }
        this.LL = true;
    }

    @Override // X.InterfaceC57543MiB
    public final void Bk() {
        if (PZ() != null) {
            ((LoadMorePanelComponentTempHelper) PZ()).q1();
        }
        this.LL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.Gz();
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        return C54082LKk.LIZIZ(getContext(), mo49getActivity());
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && Hox.kv0(mo49getActivity()).wv0("Following")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        this.LJLJLLL.dispose();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AnimatorSet animatorSet;
        ActivityC45651qj activityC45651qj;
        Lifecycle lifecycle;
        ActivityC45651qj activityC45651qj2;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        ActivityC45651qj activityC45651qj3;
        MainActivityScope LJJLIIIJJI2;
        HomeTabAbility LJIL2;
        super.onDestroyView();
        this.LLFZ.onDestroyView();
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null) {
            List<FollowingInterestUser> list = FollowSkyLightHelper.LJIJJLI;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            LWR lwr = followSkyLightHelper.LIZIZ;
            if (lwr != null) {
                lwr.LIZIZ.dispose();
                WeakReference<ActivityC45651qj> weakReference = followSkyLightHelper.LJII;
                if (weakReference != null && (activityC45651qj3 = weakReference.get()) != null && (LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(activityC45651qj3)) != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJI2)) != null) {
                    LJIL2.a2(followSkyLightHelper.LJIILL);
                }
                WeakReference<ActivityC45651qj> weakReference2 = followSkyLightHelper.LJII;
                if (weakReference2 != null && (activityC45651qj2 = weakReference2.get()) != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj2)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                    LJIL.Q6(followSkyLightHelper.LJIILLIIL);
                }
                WeakReference<ActivityC45651qj> weakReference3 = followSkyLightHelper.LJII;
                if (weakReference3 != null && (activityC45651qj = weakReference3.get()) != null && (lifecycle = activityC45651qj.getLifecycle()) != null) {
                    lifecycle.removeObserver(followSkyLightHelper.LJIIZILJ);
                }
                followSkyLightHelper.LJIILIIL.clear();
                if (!L7K.LIZIZ) {
                    C54444LYi c54444LYi = followSkyLightHelper.LIZJ;
                    if (c54444LYi != null) {
                        C53882LCs c53882LCs = c54444LYi.getAdapter().LJLILLLLZI;
                        if (c53882LCs != null && (animatorSet = c53882LCs.LJIIIIZZ) != null) {
                            animatorSet.cancel();
                            c53882LCs.LJII = false;
                            c53882LCs.LIZLLL = false;
                        }
                    } else {
                        o.LJIJI("mListView");
                        throw null;
                    }
                }
                C73353Sqb.LJFF().LIZJ();
            } else {
                o.LJIJI("mPresenter");
                throw null;
            }
        }
        LAO lao = this.LLII;
        if (lao != null) {
            ((C77317UWb) lao).LIZ();
        }
        LYH.LIZJ(MG5.FOLLOW_FEED);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (LYU.LJ) {
            LYU.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AbsFragment absFragment;
        Class cls;
        String str;
        super.onResume();
        if (this.LJLL == -1) {
            this.LJLL = ((RBX) HG3.LJIILL()).getCurUser().getFollowingCount();
        }
        if (C53295Kvr.LIZIZ()) {
            boolean uv0 = Hox.kv0(mo49getActivity()).uv0(this);
            if (!this.LLIIJLIL && uv0) {
                FollowFeedFragmentPanelMT followFeedFragmentPanelMT = this.LLFZ;
                followFeedFragmentPanelMT.getClass();
                followFeedFragmentPanelMT.LLFFF = true;
                super.onResume();
                FollowFeedFragmentPanelMT followFeedFragmentPanelMT2 = this.LLFZ;
                followFeedFragmentPanelMT2.getClass();
                followFeedFragmentPanelMT2.LLFFF = false;
            } else {
                FollowFeedFragmentPanelMT followFeedFragmentPanelMT3 = this.LLFZ;
                followFeedFragmentPanelMT3.getClass();
                followFeedFragmentPanelMT3.LLFFF = false;
                super.onResume();
                FollowFeedFragmentPanelMT followFeedFragmentPanelMT4 = this.LLFZ;
                followFeedFragmentPanelMT4.getClass();
                followFeedFragmentPanelMT4.LLFFF = false;
            }
            setUserVisibleHint(true);
            this.LLFZ.setUserVisibleHint(true);
            if (getUserVisibleHint() && isResumed()) {
                C38987FRv.LJI(LSC.FOLLOW);
                C2U8.LIZ(new C55026Lig(1, this.LLFZ.getCurrentAweme(), this.LLFZ));
            }
            this.LLIIJLIL = false;
            return;
        }
        if (getUserVisibleHint() && isResumed() && (absFragment = this.LJLJJL) != null && !absFragment.isHidden() && ((cls = C78855Ux9.LJLILLLLZI) == null || cls == C78855Ux9.LJLJI)) {
            C38987FRv.LJI(LSC.FOLLOW);
            if (!this.LJLLJ) {
                InterfaceC36571c5 interfaceC36571c5 = this.LJLJJL;
                if (interfaceC36571c5 instanceof InterfaceC54054LJi) {
                    str = ((InterfaceC54054LJi) interfaceC36571c5).LLIIJI();
                } else {
                    str = null;
                }
                C10K.LIZIZ(new ACallableS36S1100000_9(this, str, 7), FMX.LIZIZ(), null);
            }
            this.LJLLJ = false;
        }
        mo49getActivity().getWindow().setBackgroundDrawableResource(R.color.b5);
        if (this.LLIIL) {
            this.LLFZ.getClass();
            this.LLIIL = false;
        }
        if (LYU.LJ) {
            LYU.LIZ();
            LYU.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null) {
            followSkyLightHelper.getClass();
            if (L7K.LIZIZ) {
                C54444LYi c54444LYi = followSkyLightHelper.LIZJ;
                if (c54444LYi != null) {
                    c54444LYi.getFollowLiveSkyLightRelatedVM().setState(C54450LYo.LJLIL);
                    return;
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            }
            C54444LYi c54444LYi2 = followSkyLightHelper.LIZJ;
            if (c54444LYi2 != null) {
                C54689LdF adapter = c54444LYi2.getAdapter();
                ViewWrapper viewWrapper = adapter.LJLJI;
                if (viewWrapper == null) {
                    return;
                }
                viewWrapper.setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                viewWrapper.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(64)));
                Float f = adapter.LJLJJL;
                if (f == null) {
                    return;
                }
                viewWrapper.getView().setAlpha(f.floatValue());
                return;
            }
            o.LJIJI("mListView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        registerComponents.append(C51697KQr.LIZJ, this.LLFZ);
        return registerComponents;
    }

    @Override // X.InterfaceC57543MiB
    public final boolean x1() {
        return this.LL;
    }

    public static boolean Il(Aweme aweme) {
        AwemeStatus status;
        if (C53295Kvr.LIZ()) {
            return true;
        }
        int followerCount = aweme.getAuthor().getFollowerCount();
        int LIZ = C00F.LIZ(31744, 0, "landing_page_optimization_experiment", false);
        if (LIZ == 0) {
            return true;
        }
        if ((LIZ == 1 || LIZ == 2) && ((status = aweme.getStatus()) == null || status.getPrivateStatus() != 0)) {
            return true;
        }
        if (C45042Hm2.LIZIZ()) {
            int LIZ2 = C00F.LIZ(31744, 0, "landing_page_optimization_experiment_v2", false);
            if (LIZ2 == 1) {
                if (followerCount > 1000) {
                    return true;
                }
            } else if (LIZ2 == 3 || LIZ2 == 4) {
                return true;
            }
        }
        return false;
    }

    public static void Ql(C54883LgN c54883LgN) {
        Aweme aweme;
        int i = c54883LgN.LJLJJL;
        List<Aweme> awemeList = c54883LgN.getAwemeList();
        if (i > 0 && awemeList != null && i < ((ArrayList) awemeList).size() && (aweme = (Aweme) ListProtector.get(awemeList, i)) != null) {
            String aid = aweme.getAid();
            o.LJIIIZ(aid, "<set-?>");
            GuideBackToFYPAssem.LLI = aid;
            c54883LgN.LJLJJL = -1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set guide index: ");
            LIZ.append(i);
            LIZ.append(",aid:");
            LIZ.append(aid);
            C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        KUM.LIZJ(this, bundle, "Following", new AObjectS45S0101000_13(2, this, 7));
        String string = bundle.getString("fromStart", "");
        String sv0 = Hox.kv0(mo49getActivity()).sv0("Following");
        String sv02 = Hox.kv0(mo49getActivity()).sv0(sv0);
        String sv03 = Hox.kv0(mo49getActivity()).sv0(sv02);
        if (string.equals("MainFragment") || bundle.getBoolean(sv0)) {
            this.LLFZ.setUserVisibleHint(false);
            C2U8.LIZ(new C61192ah(false));
            wl(false);
            return;
        }
        if (string.equals("MainPage") || bundle.getBoolean(sv02)) {
            this.LLFZ.setUserVisibleHint(false);
            wl(true);
        } else {
            if (!string.equals("RootNode") && !bundle.getBoolean(sv03)) {
                return;
            }
            C2MA m30 = m30();
            if (m30 != null) {
                m30.LJJIII(1);
            }
            Aweme aweme = C3SZ.LIZ(mo49getActivity()).LJLJLLL;
            if (aweme == null) {
                return;
            }
            C175336uP.LIZ.LIZ(aweme.getAid());
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle bundle) {
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        KUM.LIZIZ(this, bundle, "Following", new AObjectS42S0101000_5(3, this, 40));
        String string = bundle.getString("fromStart", "");
        String sv0 = Hox.kv0(mo49getActivity()).sv0("Following");
        String sv02 = Hox.kv0(mo49getActivity()).sv0(sv0);
        String sv03 = Hox.kv0(mo49getActivity()).sv0(sv02);
        if (C53295Kvr.LIZIZ()) {
            this.LLFZ.setUserVisibleHint(true);
            setUserVisibleHint(true);
            if (isResumed()) {
                C38987FRv.LJI(LSC.FOLLOW);
                LXD lxd = new LXD();
                lxd.LJIILJJIL = "homepage_follow";
                lxd.LJIILIIL();
            }
            b5(true);
            return;
        }
        if (string.equals("MainFragment") || bundle.getBoolean(sv0)) {
            this.LLFZ.setUserVisibleHint(true);
            if (isResumed() && (absFragment = this.LJLJJL) != null && !absFragment.isHidden()) {
                C38987FRv.LJI(LSC.FOLLOW);
                LXD lxd2 = new LXD();
                lxd2.LJIILJJIL = "homepage_follow";
                lxd2.LJIILIIL();
            }
            if (this.LJZL) {
                C2U8.LIZ(new C61192ah(true));
            }
            b5(false);
            return;
        }
        if (string.equals("MainPage") || bundle.getBoolean(sv02)) {
            this.LLFZ.setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LJLJJL) != null && !absFragment2.isHidden()) {
                C38987FRv.LJI(LSC.FOLLOW);
                LXD lxd3 = new LXD();
                lxd3.LJIILJJIL = "homepage_follow";
                lxd3.LJIILIIL();
            }
            if (this.LJZL) {
                C2U8.LIZ(new C61192ah(true));
            }
            b5(true);
            return;
        }
        if (!string.equals("RootNode") && !bundle.getBoolean(sv03)) {
            return;
        }
        this.LLFZ.setUserVisibleHint(true);
        if (isResumed() && (absFragment3 = this.LJLJJL) != null && !absFragment3.isHidden()) {
            C38987FRv.LJI(LSC.FOLLOW);
            LXD lxd4 = new LXD();
            lxd4.LJIILJJIL = "homepage_follow";
            lxd4.LJIILIIL();
        }
        if (this.LJZL) {
            C2U8.LIZ(new C61192ah(true));
        }
        b5(true);
        C2MA m30 = m30();
        if (m30 != null) {
            m30.LJJIII(1);
        }
        Aweme aweme = C3SZ.LIZ(mo49getActivity()).LJLJLLL;
        if (aweme == null) {
            return;
        }
        C175336uP.LIZ.LIZ(aweme.getAid());
    }

    public final void Nl(String str) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C3SZ.LIZ(mo49getActivity).LJLLLLLL.postValue(new C54067LJv("homepage_follow", str));
        }
    }

    public final void Pl(boolean z) {
        if (this.LLIIIILZ == null) {
            this.LLIIIILZ = LNZ.LIZIZ.getSlideGuideViewModel(requireActivity());
        }
        InterfaceC54434LXy interfaceC54434LXy = this.LLIIIILZ;
        if (interfaceC54434LXy != null) {
            interfaceC54434LXy.Wt0(z);
        }
    }

    public final void b5(boolean z) {
        boolean z2;
        AbstractC54421LXl abstractC54421LXl;
        AbstractC54421LXl abstractC54421LXl2;
        LYU.LIZ();
        if (getUserVisibleHint()) {
            C2U8.LIZ(new C55026Lig(1, this.LLFZ.getCurrentAweme(), this.LLFZ));
        }
        if (!getUserVisibleHint() || !isViewValid()) {
            return;
        }
        LXV.LJI.set(true);
        InterfaceC54422LXm interfaceC54422LXm = this.LJLLL;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.onResume();
        }
        Al();
        if (z) {
            this.LLFZ.tryResumePlay();
        } else if (RP() != null) {
            if (this.LJLL == 0 && ((RBX) HG3.LJIILL()).getCurUser().getFollowingCount() > 0 && (abstractC54421LXl2 = this.LLIFFJFJJ) != null && abstractC54421LXl2.LJFF()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || C54362LVe.LJIIZILJ(40) || C54362LVe.LJIIZILJ(41) || ((abstractC54421LXl = this.LLIFFJFJJ) != null && abstractC54421LXl.LJFF())) {
                ub(false);
                C54362LVe.LIZIZ(40);
                C54362LVe.LIZIZ(41);
                C2U8.LIZ(new C54251LQx(40));
                C2U8.LIZ(new C54251LQx(41));
            }
            this.LLFZ.handlePageResume();
        }
        C2MA m30 = m30();
        if (m30 != null) {
            m30.Z8();
            AnonymousClass901 j3 = m30.j3();
            if (j3 != null) {
                j3.Y2(z);
            }
        }
        if (this.LJZL) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LJIIIZ("is_live", "1");
            FMX.LJIIL("enter_following_window_feed", c188727au.LIZ);
        }
        qQ(false);
        mo49getActivity().getWindow().setBackgroundDrawableResource(R.color.b5);
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = this.LLFZ;
        if (followFeedFragmentPanelMT == null) {
            return;
        }
        C44938HkM.LJ = followFeedFragmentPanelMT.getCurrentAweme();
    }

    @QD3
    public void onAntiCrawlerEvent(QX2 qx2) {
        String str = qx2.LJLIL;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            EventBus.LIZJ().LIZIZ(qx2);
            ub(false);
        }
    }

    @QD3
    public void onAutoRefreshLive(AutoRefreshFollowFeedLiveEvent autoRefreshFollowFeedLiveEvent) {
        if (autoRefreshFollowFeedLiveEvent != null) {
            if (autoRefreshFollowFeedLiveEvent.isOpenWindow) {
                Tl("auto", true, true);
                Sl(false, this.LJLZ, true);
            }
            FollowSkyLightHelper followSkyLightHelper = this.LJZI;
            if (followSkyLightHelper != null && this.LLD && autoRefreshFollowFeedLiveEvent.isRefreshLive) {
                followSkyLightHelper.LJI("homepage_folllow_refresh", "auto");
            }
        }
    }

    @QD3
    public void onBlockUserEvent(C175046tw c175046tw) {
        User user = c175046tw.LJLIL;
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null && user != null && followSkyLightHelper.LIZ(user.getUid()) == 0) {
            Ml();
        }
    }

    @QD3
    public void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        InterfaceC54422LXm interfaceC54422LXm = this.LJLLL;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.LIZLLL(followStatusEvent);
        }
    }

    @QD3
    public void onLeaveFollowFeedPage(C54426LXq c54426LXq) {
        FollowSkyLightHelper followSkyLightHelper;
        if (this.LJZL && (followSkyLightHelper = this.LJZI) != null) {
            String uid = c54426LXq.LJLIL;
            o.LJIIIZ(uid, "uid");
            for (FollowingInterestUser followingInterestUser : followSkyLightHelper.LIZLLL) {
                if (ujb.o.LJJJJIZL(uid, followingInterestUser.getUser().getUid(), true)) {
                    followingInterestUser.setShowBluePoint(false);
                }
            }
            followSkyLightHelper.LIZIZ(new LY3(followSkyLightHelper.LIZLLL, followSkyLightHelper.LJ, 124));
        }
    }

    @QD3
    public void onLiveRoomScrollEvent(C54427LXr liveRoomScrollEvent) {
        List<FollowingInterestUser> data;
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null) {
            followSkyLightHelper.getClass();
            o.LJIIIZ(liveRoomScrollEvent, "liveRoomScrollEvent");
            C54444LYi c54444LYi = followSkyLightHelper.LIZJ;
            if (c54444LYi != null) {
                long j = liveRoomScrollEvent.LJLIL;
                if (j < 0 || (data = c54444LYi.getAdapter().getData()) == null) {
                    return;
                }
                int i = 0;
                for (FollowingInterestUser followingInterestUser : data) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        FollowingInterestUser followingInterestUser2 = followingInterestUser;
                        if ((followingInterestUser2 instanceof FollowingInterestUser) && followingInterestUser2.getUser().roomId == j) {
                            if (i > 0) {
                                c54444LYi.LIZJ(i - 1);
                                return;
                            } else {
                                c54444LYi.LIZJ(i);
                                return;
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mListView");
            throw null;
        }
    }

    @QD3
    public void onProfileFollow(C31633CbF c31633CbF) {
        InterfaceC54422LXm interfaceC54422LXm = this.LJLLL;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.LJ(c31633CbF);
        }
    }

    @QD3
    public void onProfileFollowEvent(C31633CbF c31633CbF) {
        Object obj;
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null && c31633CbF.LJLIL == 0 && (obj = c31633CbF.LJLILLLLZI) != null && (obj instanceof User) && followSkyLightHelper.LIZ(((User) obj).getUid()) == 0) {
            Ml();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006a  */
    @X.QD3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVideoPublishEvent(X.C50420Jqa r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.onVideoPublishEvent(X.Jqa):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void rY(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 62 || this.LLFZ == null) {
            return;
        }
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            this.LLFZ.showIvPlay();
        } else {
            IWF.LJJLIIIIJ().LIZIZ();
            this.LLFZ.hideIvPlay();
        }
    }

    @QD3
    public void receiveJumpToRecord(C54435LXz c54435LXz) {
        this.LLIIL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "6292991216165109520");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/feed/ui/FeedFollowFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/feed/ui/FeedFollowFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
        } else {
            super.setUserVisibleHint(z);
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/feed/ui/FeedFollowFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        String str;
        if (z) {
            str = "homepage_refresh";
        } else {
            str = "pull_refresh";
        }
        return Wl(str, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void wl(boolean z) {
        AnonymousClass901 j3;
        Dl();
        C2U8.LIZ(new C55026Lig(2, this.LLFZ.getCurrentAweme(), this.LLFZ));
        InterfaceC54422LXm interfaceC54422LXm = this.LJLLL;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.onPause();
        }
        this.LLFZ.handlePageStop(z);
        C2MA m30 = m30();
        if (m30 != null && (j3 = m30.j3()) != null) {
            j3.v2(z);
        }
        LXV.LJI.set(false);
        LYU.LJ = false;
        LYU.LIZIZ = System.currentTimeMillis();
        LYU.LJIIIIZZ = LYU.LJII;
    }

    public final void Vl(boolean z, boolean z2) {
        this.LLIIIL = z2;
        if (z) {
            Sl(false, this.LJLZ, false);
            Tl("", true, false);
        } else {
            if (this.LJLLI != 0 || this.LJLLILLLL != 0) {
                Sl(true, this.LJLZ, false);
            }
            Tl("", false, false);
        }
    }

    public final boolean Wl(String str, boolean z) {
        String str2;
        if ("refresh".equals(str)) {
            LYU.LJI = "following_tab";
            str2 = "click_top_icon";
        } else if ("homepage_refresh".equals(str)) {
            LYU.LJI = "home_tab";
            str2 = "click_button_icon";
        } else if ("pull_refresh".equals(str)) {
            str2 = "pull";
            LYU.LJI = "pull";
        } else {
            str2 = "";
        }
        InterfaceC54422LXm interfaceC54422LXm = this.LJLLL;
        if (interfaceC54422LXm != null) {
            interfaceC54422LXm.LIZIZ();
        }
        FollowSkyLightHelper followSkyLightHelper = this.LJZI;
        if (followSkyLightHelper != null && this.LLD) {
            followSkyLightHelper.LJI("homepage_folllow_refresh", str);
        }
        C10K.LIZIZ(new ACallableS45S0201000_9(1, this, str2, 1), FMX.LIZIZ(), null);
        C2U8.LIZ(new IKD());
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            this.LLFZ.Ne();
            C2U8.LIZ(new C54409LWz("HOME"));
            return false;
        }
        if (!super.ub(z)) {
            return false;
        }
        AbstractC54421LXl abstractC54421LXl = this.LLIFFJFJJ;
        if (abstractC54421LXl != null) {
            abstractC54421LXl.LJIIIZ(z);
        }
        C2U8.LIZ(new LJK(9));
        this.LJLL = ((RBX) HG3.LJIILL()).getCurUser().getFollowingCount();
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        MainBusinessAbility LJIL;
        ActivityC45651qj activityC45651qj;
        Lifecycle lifecycle;
        ActivityC45651qj activityC45651qj2;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL2;
        MainActivityScope LJJLIIIJJI2;
        HomeTabAbility LJIL3;
        if (this.LLIFFJFJJ == null) {
            this.LLIFFJFJJ = new LX4(this, new LX3(this));
        }
        this.LLIFFJFJJ = this.LLIFFJFJJ;
        super.onViewCreated(view, bundle);
        InterfaceC54422LXm LJIILJJIL = C57738MlK.LIZIZ.LJIILJJIL(this, this.LJLJI, this);
        this.LJLLL = LJIILJJIL;
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = this.LLFZ;
        followFeedFragmentPanelMT.LLIIZ = LJIILJJIL;
        followFeedFragmentPanelMT.addOnPageChangeListener(new IDiS271S0100000_9(this, 17));
        IFeedCleanAbility LJI = C1JD.LJI(this);
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.XX(new InterfaceC54978Lhu() { // from class: X.LXs
                @Override // X.InterfaceC54978Lhu
                public final void LJ() {
                    FeedFollowFragment.this.Nl("slide_down");
                }
            });
        }
        qQ(false);
        this.LJLLLL = (C110544Vm) view.findViewById(R.id.dde);
        this.LJLLLLLL = (FrameLayout) view.findViewById(R.id.dgq);
        this.LJLZ = (FrameLayout) view.findViewById(R.id.dgp);
        this.LJZ = (TextView) view.findViewById(R.id.mkl);
        C16880lQ.LJIILJJIL(this.LJLZ, new ACListenerS29S0101000_12(1, this, 4));
        if (LJI != null) {
            LJI.xT(this.LJLLLLLL);
            LJI.xT(this.LJLZ);
        }
        M89 m89 = new M89();
        m89.setEventType("homepage_follow");
        m89.setPageType(1);
        m89.setPreviousPagePosition("follow_button");
        this.LLFZ.setParam(m89);
        this.LLFZ.onViewCreated(view, bundle);
        this.LLFZ.DA(Hl());
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT2 = this.LLFZ;
        followFeedFragmentPanelMT2.LLIL = this;
        followFeedFragmentPanelMT2.setCheckLoadMoreListener(Hl());
        this.LLFZ.setDeleteItemListener(Hl());
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT3 = this.LLFZ;
        followFeedFragmentPanelMT3.LLILII = this;
        followFeedFragmentPanelMT3.LLILIL = this;
        this.LLIFFJFJJ.LIZIZ(followFeedFragmentPanelMT3);
        this.LLIFFJFJJ.LIZ.LJJI(this.LLFZ);
        this.LLIFFJFJJ.LIZ.LJJIII(this.LLFZ);
        this.LLIFFJFJJ.LIZ();
        AbsFragment absFragment = this.LJLJJL;
        if (absFragment instanceof InterfaceC54054LJi) {
            IMFSocialAbility LJIILLIIL = C78929UyL.LJIILLIIL(absFragment);
            if (LJIILLIIL != null) {
                LMU uu0 = LJIILLIIL.uu0();
                if (uu0 != null && uu0.LIZ == 1) {
                    str = uu0.LIZIZ;
                    uu0.LIZIZ = null;
                    str2 = uu0.LIZLLL;
                    uu0.LIZLLL = null;
                } else if (LJIILLIIL != null) {
                    str = LJIILLIIL.F80();
                    str2 = null;
                }
            }
            str = "";
            str2 = null;
        } else {
            str = null;
            str2 = null;
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            this.LLIFFJFJJ.LJII(str, LIQ.LIZ(), str2);
            Nl("slide_right");
        } else {
            this.LLFZ.Ne();
        }
        LXU.LIZ().LIZJ(false);
        boolean Rl = Rl();
        if (Rl) {
            LYU.LJI = "following_tab";
            Context context = view.getContext();
            FollowSkyLightHelper followSkyLightHelper = new FollowSkyLightHelper();
            this.LJZI = followSkyLightHelper;
            followSkyLightHelper.LJIIL = this;
            o.LJIIIZ(context, "context");
            followSkyLightHelper.LJIJ = true;
            C73353Sqb.LJFF().LJII();
            C73353Sqb.LJFF().LJIIIZ(0L);
            followSkyLightHelper.LIZIZ = new LWR(this);
            C54444LYi c54444LYi = new C54444LYi(context);
            followSkyLightHelper.LIZJ = c54444LYi;
            c54444LYi.setHelper(followSkyLightHelper);
            if (!L7K.LIZIZ) {
                C54444LYi c54444LYi2 = followSkyLightHelper.LIZJ;
                if (c54444LYi2 != null) {
                    c54444LYi2.getAdapter().LJLJJLL = followSkyLightHelper;
                    C54444LYi c54444LYi3 = followSkyLightHelper.LIZJ;
                    if (c54444LYi3 != null) {
                        C53882LCs c53882LCs = c54444LYi3.getAdapter().LJLILLLLZI;
                        if (c53882LCs != null) {
                            followSkyLightHelper.LJIILIIL.add(new AqS175S0100000_9(c53882LCs, 630));
                        }
                    } else {
                        o.LJIJI("mListView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            }
            FrameLayout frameLayout = this.LJLLLLLL;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                C54444LYi c54444LYi4 = followSkyLightHelper.LIZJ;
                if (c54444LYi4 != null) {
                    ViewGroup.LayoutParams layoutParams = c54444LYi4.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(context) + marginLayoutParams.topMargin;
                    FrameLayout frameLayout2 = this.LJLLLLLL;
                    C54444LYi c54444LYi5 = followSkyLightHelper.LIZJ;
                    if (c54444LYi5 != null) {
                        frameLayout2.addView(c54444LYi5, marginLayoutParams);
                    } else {
                        o.LJIJI("mListView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            }
            WeakReference<ActivityC45651qj> weakReference = new WeakReference<>(mo49getActivity());
            followSkyLightHelper.LJII = weakReference;
            ActivityC45651qj activityC45651qj3 = weakReference.get();
            if (activityC45651qj3 != null && (LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(activityC45651qj3)) != null && (LJIL3 = C87277YNd.LJIL(LJJLIIIJJI2)) != null) {
                LJIL3.na(followSkyLightHelper.LJIILL);
            }
            WeakReference<ActivityC45651qj> weakReference2 = followSkyLightHelper.LJII;
            if (weakReference2 != null && (activityC45651qj2 = weakReference2.get()) != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj2)) != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                LJIL2.b3(followSkyLightHelper.LJIILLIIL);
            }
            WeakReference<ActivityC45651qj> weakReference3 = followSkyLightHelper.LJII;
            if (weakReference3 != null && (activityC45651qj = weakReference3.get()) != null && (lifecycle = activityC45651qj.getLifecycle()) != null) {
                lifecycle.addObserver(followSkyLightHelper.LJIIZILJ);
            }
            C54444LYi c54444LYi6 = followSkyLightHelper.LIZJ;
            if (c54444LYi6 != null) {
                c54444LYi6.LIZ(new IDrS14S0000000_9(1));
                C54444LYi c54444LYi7 = followSkyLightHelper.LIZJ;
                if (c54444LYi7 != null) {
                    c54444LYi7.setViewOnTouchListener(new IDTListenerS118S0100000_9(followSkyLightHelper, 12));
                    FollowSkyLightHelper followSkyLightHelper2 = this.LJZI;
                    FrameLayout topContainer = this.LJLLLLLL;
                    FrameLayout bottomContainer = this.LJLZ;
                    followSkyLightHelper2.getClass();
                    o.LJIIIZ(topContainer, "topContainer");
                    o.LJIIIZ(bottomContainer, "bottomContainer");
                    ViewGroup.LayoutParams layoutParams2 = topContainer.getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    boolean LIZJ = LYU.LIZJ();
                    Context context2 = topContainer.getContext();
                    o.LJIIIIZZ(context2, "topContainer.context");
                    int LJJJJLI = C63081OpJ.LJJJJLI(context2);
                    if (LIZJ) {
                        marginLayoutParams2.height = C17N.LJIILL(180.0d) + LJJJJLI;
                    } else {
                        marginLayoutParams2.height = C17N.LJIILL(173.0d) + LJJJJLI;
                    }
                    topContainer.setLayoutParams(marginLayoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = bottomContainer.getLayoutParams();
                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.topMargin = C17N.LJIILL(58.0d) + LJJJJLI + marginLayoutParams3.topMargin;
                    bottomContainer.setLayoutParams(marginLayoutParams3);
                    this.LJLLLL.setScrollPredicate(new AObjectS142S0100000_9(this, 1));
                    this.LJLLLL.setCallBack(new AObjectS52S0101000_7(2, this, 26));
                    FollowSkyLightHelper followSkyLightHelper3 = this.LJZI;
                    if (followSkyLightHelper3 != null) {
                        followSkyLightHelper3.LJI("homepage_hot", "auto");
                    }
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            } else {
                o.LJIJI("mListView");
                throw null;
            }
        }
        if (L7K.LIZIZ) {
            Ll();
        }
        if (!Rl || !((RBX) HG3.LJIILL()).isLogin()) {
            Pl(true);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            LYB lyb = new LYB(mo49getActivity);
            FollowSkyLightHelper followSkyLightHelper4 = this.LJZI;
            if (followSkyLightHelper4 != null) {
                followSkyLightHelper4.LIZ = lyb;
            }
        }
        if (this.LLII == null && C1DH.LJIL()) {
            this.LLII = LEJ.LIZIZ(mo49getActivity(), view.findViewById(R.id.d8h));
        }
        LXV.LJI.set(true);
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (LJIL = C1JD.LJIL(C55230Lly.LIZJ(this, null))) != null && LJIL.D30(mo49getActivity2)) {
            final InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
            final FollowTabScrollProfileStrategy followTabScrollProfileStrategy = new FollowTabScrollProfileStrategy(mo49getActivity2);
            C62814Ol0.LJJIIJZLJL(LIZJ2, InterceptHomeViewPagerProtocol.class, C47261Igj.LJJIJIL(followTabScrollProfileStrategy));
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.utils.HomeViewPagerInterceptHelperKt$registerInterceptHomeViewPager$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, InterceptHomeViewPagerProtocol.class, followTabScrollProfileStrategy);
                        }
                    }
                });
            }
        }
        if (C35971E9v.LIZ()) {
            a.LJFF().LJFF().observe(this, new AObserverS58S0101000_2(0, this, 23));
        }
        if (C53295Kvr.LIZIZ()) {
            view.findViewById(R.id.bcu).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(3, this, 6), view.findViewById(R.id.exc));
            int LIZJ3 = (int) KL2.LIZJ(getContext(), 10.0f);
            C72253SXh.LIZ(view.findViewById(R.id.exc), LIZJ3, LIZJ3, LIZJ3, LIZJ3);
            C16880lQ.LJIIJ(new ACListenerS28S0101000_10(2, this, 0), view.findViewById(R.id.f_e));
            C72253SXh.LIZ(view.findViewById(R.id.f_e), LIZJ3, LIZJ3, LIZJ3, LIZJ3);
            C16880lQ.LJIIJ(new ACListenerS26S0101000_8(2, this, 0), view.findViewById(R.id.m76));
        } else {
            view.findViewById(R.id.bcu).setVisibility(8);
        }
        FN6.LIZJ(new ARunnableS12S0101000_8(2, this, 31));
        C55723Ltv.LIZIZ.LJIILJJIL().LJII(this, new AObjectS45S0101000_13(5, this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Sl(boolean r20, android.view.View r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.Sl(boolean, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
    
        if (r0.getRecycleViewContentWidth() > X.KL2.LJIIJJI(r2)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tl(java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.Tl(java.lang.String, boolean, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC54422LXm interfaceC54422LXm;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && (interfaceC54422LXm = this.LJLLL) != null) {
            interfaceC54422LXm.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C54502LaE.LIZ("homepage_follow");
        C54492La4.LIZ = SystemClock.elapsedRealtime();
        View LIZLLL = C16970lZ.LIZLLL((Activity) getContext(), R.layout.avq);
        if (((Boolean) C55068LjM.LJI.getValue()).booleanValue()) {
            EVM.LIZ(Process.myTid(), -20);
            FN6.LIZJ(new ARunnableS13S0000000_6(55));
        }
        if (((Boolean) C55068LjM.LIZIZ.getValue()).booleanValue()) {
            FN6.LIZJ(new ARunnableS9S0101000_5(3, this, 8));
        }
        if (C55068LjM.LIZIZ()) {
            IWF.LJJLIIIIJ().LJIJJLI();
        }
        C29S c29s = null;
        if (!(LIZLLL instanceof View)) {
            LIZLLL = null;
        }
        if (LIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZLLL, this);
                C10A.LIZIZ(LIZLLL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZLLL;
    }
}
