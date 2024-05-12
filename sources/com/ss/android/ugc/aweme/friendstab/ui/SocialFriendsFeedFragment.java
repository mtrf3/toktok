package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C141335gf;
import X.C16880lQ;
import X.C175046tw;
import X.C175336uP;
import X.C1DH;
import X.C2304092m;
import X.C2KC;
import X.C2KG;
import X.C2L4;
import X.C2MA;
import X.C2U8;
import X.C2US;
import X.C32151Nz;
import X.C34166Db0;
import X.C35971E9v;
import X.C36922EeM;
import X.C38987FRv;
import X.C3C5;
import X.C3SZ;
import X.C45804HyK;
import X.C47261Igj;
import X.C50420Jqa;
import X.C51031K1b;
import X.C51697KQr;
import X.C53976LGi;
import X.C54024LIe;
import X.C54029LIj;
import X.C54081LKj;
import X.C54082LKk;
import X.C54153LNd;
import X.C54280LSa;
import X.C54385LWb;
import X.C54396LWm;
import X.C54397LWn;
import X.C54400LWq;
import X.C54404LWu;
import X.C54405LWv;
import X.C54407LWx;
import X.C54408LWy;
import X.C54423LXn;
import X.C54838Lfe;
import X.C54851Lfr;
import X.C55026Lig;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55723Ltv;
import X.C57619MjP;
import X.C57738MlK;
import X.C62814Ol0;
import X.C63081OpJ;
import X.C65661Ppp;
import X.C70672pz;
import X.C70792qB;
import X.C73318Sq2;
import X.C76800UCe;
import X.C76965UIn;
import X.C77317UWb;
import X.C77439UaJ;
import X.C80S;
import X.C8VV;
import X.C90053g9;
import X.C9CI;
import X.EnumC54377LVt;
import X.EnumC62042c4;
import X.FMX;
import X.HG3;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC54401LWr;
import X.InterfaceC55143LkZ;
import X.InterfaceC55235Lm3;
import X.InterfaceC56322M8o;
import X.J9A;
import X.KNV;
import X.KRB;
import X.KUM;
import X.L10;
import X.L1F;
import X.L7K;
import X.LAO;
import X.LEJ;
import X.LHM;
import X.LIA;
import X.LIJ;
import X.LIO;
import X.LIP;
import X.LLC;
import X.LSC;
import X.LWX;
import X.LX1;
import X.LXD;
import X.LXS;
import X.LXU;
import X.LXV;
import X.LY0;
import X.LYH;
import X.M89;
import X.MG5;
import X.NK1;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.X1D;
import X.XKX;
import Y.IDiS271S0100000_9;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.component.FriendsFeedComponent;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner$fragmentLifeCycle$1;
import com.ss.android.ugc.aweme.friendstab.tab.TopFriendsFeedScrollProfileStrategy;
import com.ss.android.ugc.aweme.friendstab.utils.FriendsFeedScope;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponentTemp;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class SocialFriendsFeedFragment extends BaseFeedListFragment implements InterfaceC53896LDg, NK1, InterfaceC40408FtU, LY0, LIJ, InterfaceC56322M8o, C2KG<Aweme>, IFriendsSkylightAbility, C2L4 {
    public C54396LWm LJLLILLLL;
    public LAO LJLLJ;
    public FrameLayout LJLLL;
    public long LJLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public C54385LWb LJZI;
    public long LL;
    public ObjectAnimator LLD;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public final C73318Sq2 LJLJLLL = new C73318Sq2();
    public String LJLL = "";
    public final FriendsFeedFragmentPanel LJLLI = new FriendsFeedFragmentPanel();
    public String LJLLLLLL = "auto";
    public long LJZL = -1;
    public final String LLF = "friends";

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility
    public final void D00() {
        Ql(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Dl() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility
    public final void Yf0() {
        Ql(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
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
        return "SocialFriendsFeedFragment";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility
    public final void ql0() {
        this.LJLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final HomeFeedComponent Gl() {
        return new FriendsFeedComponent();
    }

    public final void Jl() {
        if (L7K.LIZJ && System.currentTimeMillis() - this.LJLLLL >= J9A.LIZIZ("skylight_warm_start_refresh_interval", 30000L) && this.LJLLI.getViewPager().getCurrentItem() == 0) {
            C54423LXn.LIZIZ.LIZ().LIZLLL(this, "auto");
            this.LJLLLL = System.currentTimeMillis();
        }
    }

    @Override // X.LIJ
    public final boolean LJJLIIIJLJLI() {
        if ((this.LJLLI.getCurViewHolder() instanceof C54851Lfr) || this.LJLLI.LLIIZ) {
            return true;
        }
        return false;
    }

    public final void Ll() {
        long j;
        SingleTabCounter singleTabCounter;
        int i;
        String str;
        int i2;
        boolean z;
        boolean z2;
        if (this.LJLILLLLZI != -1) {
            j = (System.currentTimeMillis() - this.LJLILLLLZI) - this.LL;
            if (j > 0) {
                getContext();
                FMX.LJIIIIZZ("stay_time", this.LJLJI, j);
                xl(j);
            }
            this.LJLILLLLZI = -1L;
            this.LJZL = -1L;
            this.LL = 0L;
        } else {
            j = 0;
        }
        if (C54029LIj.LIZIZ.LJJIZ() && j > 0) {
            if (!LX1.LJIILIIL) {
                LX1.LJIILJJIL = 1;
            }
            Iterator<SingleTabCounter> it = LHM.LIZIZ.LIZ().multiCounterSnapshot().iterator();
            while (true) {
                if (it.hasNext()) {
                    singleTabCounter = it.next();
                    if (o.LJ(singleTabCounter.getTag(), "FRIENDS_FEED")) {
                        break;
                    }
                } else {
                    singleTabCounter = null;
                    break;
                }
            }
            SingleTabCounter singleTabCounter2 = singleTabCounter;
            if (singleTabCounter2 != null) {
                if (singleTabCounter2.getShowRedDot() && singleTabCounter2.getNumberCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (singleTabCounter2.getShowRedDot() && singleTabCounter2.getNumberCount() <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = singleTabCounter2.getNumberCount();
                if (z || z2) {
                    i2 = 1;
                    if (z2) {
                        str = "red_dot";
                    } else {
                        if (z) {
                            str = "number_dot";
                        }
                        str = "";
                    }
                    FMX.LJIILL("exit_homepage_friends", new OSZ(Integer.valueOf(i2), "enter_with_notice"), new OSZ(str, "notice_type"), new OSZ(Integer.valueOf(i), "number_cnt"), new OSZ(Long.valueOf(j), "stay_duration_ms"), C54024LIe.LIZ());
                }
            } else {
                i = 0;
            }
            i2 = 0;
            str = "";
            FMX.LJIILL("exit_homepage_friends", new OSZ(Integer.valueOf(i2), "enter_with_notice"), new OSZ(str, "notice_type"), new OSZ(Integer.valueOf(i), "number_cnt"), new OSZ(Long.valueOf(j), "stay_duration_ms"), C54024LIe.LIZ());
        }
    }

    public final C54396LWm Nl() {
        C54396LWm c54396LWm = this.LJLLILLLL;
        if (c54396LWm != null) {
            return c54396LWm;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final void Pl() {
        List items;
        C54408LWy Ml;
        if (L7K.LIZJ && C2304092m.LIZ()) {
            C54423LXn.LIZIZ.LIZ().LJII(this);
        }
        if (!L1F.LIZIZ()) {
            return;
        }
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        Aweme aweme = (Aweme) ORZ.LLFII(c55723Ltv.LJIILJJIL().LIZJ());
        if (aweme == null) {
            return;
        }
        Story story = aweme.getStory();
        if (story != null && !story.isPublishing()) {
            return;
        }
        Aweme R1 = AwemeService.LIZ().R1(aweme);
        if (C54838Lfe.LJIILIIL(R1)) {
            C54408LWy Ml2 = Ml();
            if (Ml2 != null && (items = ((AbstractC51036K1g) Ml2.LJLIL).getItems()) != null && ORZ.LJLLLL(items) != null && (Ml = Ml()) != null) {
                Ml.LJJIIZI(new AqS132S0200000_1(this, R1, 6));
            }
            Aweme LJI = c55723Ltv.LJIL().LJI();
            if (C80S.LJFF(LJI)) {
                return;
            }
            Nl().LIZ(LJI);
            IPageStateAbility RP = RP();
            if (RP != null) {
                RP.A9(true);
            }
        }
    }

    @Override // X.NK1
    public final boolean cd() {
        return this.LJLLI.isShareDialogShowing();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(FriendsFeedScope.class);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility
    public final boolean lb() {
        if (this.LJLLI.getViewPager().getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        if (C54029LIj.LIZIZ.LJJI()) {
            this.LJLLI.LLFF = true;
            super.onResume();
            this.LJLLI.LLFF = false;
            setUserVisibleHint(true);
            this.LJLLI.setUserVisibleHint(true);
            if (getUserVisibleHint() && isResumed()) {
                C38987FRv.LJI(LSC.FRIENDS_TAB);
                C2U8.LIZ(new C55026Lig(1, this.LJLLI.getCurrentAweme(), this.LJLLI));
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                window.setBackgroundDrawableResource(R.color.b5);
            }
            Kl();
            if (this.LJLZ) {
                Jl();
            }
        } else {
            this.LJLLI.LLFF = false;
            super.onResume();
            setUserVisibleHint(false);
            this.LJLLI.setUserVisibleHint(false);
        }
        if (AVExternalServiceImpl.LIZ().publishService().enablePreviewPublishVideo() && this.LJZ) {
            this.LJZ = false;
            C2MA curViewHolder = this.LJLLI.getCurViewHolder();
            if (curViewHolder != null) {
                curViewHolder.l8(this.LJLLI.getCurIndex());
            }
        }
        if (this.LJZL != -1) {
            this.LL = (System.currentTimeMillis() - this.LJZL) + this.LL;
            this.LJZL = -1L;
        }
    }

    @Override // X.LIJ
    public final void Bi() {
        Nl().LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.Gz();
        }
    }

    public final void Kl() {
        Context context;
        ActivityC45651qj LJJIFFI;
        LifecycleCoroutineScope lifecycleScope;
        if (L10.LIZ() && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C70672pz(this, null), 3);
        }
    }

    public final C54408LWy Ml() {
        C51031K1b<?> c51031K1b;
        HomeFeedComponent Hl = Hl();
        if (Hl != null) {
            c51031K1b = Hl.Qv();
        } else {
            c51031K1b = null;
        }
        if (!(c51031K1b instanceof C54408LWy)) {
            return null;
        }
        return (C54408LWy) c51031K1b;
    }

    public final boolean Ol() {
        T t = Nl().LIZJ.LJLIL;
        if (t != 0 && ((LWX) t).LJLLILLLL) {
            return true;
        }
        return false;
    }

    @Override // X.LIJ
    public final void S7() {
        if (!LJJLIIIJLJLI()) {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LJLLI;
            friendsFeedFragmentPanel.showCommentFragment(friendsFeedFragmentPanel.getCurrentPlayAweme(), (String) null, false, "tab_friends", true);
        }
    }

    @Override // X.LY0
    public final void Y9() {
        if (!LJJLIIIJLJLI() && L7K.LIZJ) {
            C54407LWx.LIZIZ.LIZLLL(this, this.LJLLLLLL);
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.LIJ
    public final boolean hasMore() {
        T t = Nl().LIZJ.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (mo49getActivity() == null) {
            return false;
        }
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        this.LJLJLLL.dispose();
        C55723Ltv.LIZIZ.LJIILJJIL().LIZLLL("FriendsFeedFragment");
        if (L7K.LIZJ) {
            C55096Ljo.LJIILLIIL(this, FriendsFeedScope.class, IFriendsSkylightAbility.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLLI.onDestroyView();
        LAO lao = this.LJLLJ;
        if (lao != null) {
            o.LJI(lao);
            ((C77317UWb) lao).LIZ();
        }
        LYH.LIZJ(MG5.TAB_FRIENDS);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LJLILLLLZI != -1 && this.LJZL == -1) {
            this.LJZL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(C51697KQr.LIZJ, this.LJLLI);
        return registerComponents;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.LIJ
    public final int Bc(Aweme aweme) {
        T t = Nl().LIZJ.LJLIL;
        t.getClass();
        T t2 = t.mData;
        if (t2 != 0 && ((FriendsFeedResponse) t2).friendFeedData != null) {
            o.LJI(t2);
            List<FriendsFeed> list = ((FriendsFeedResponse) t2).friendFeedData;
            o.LJI(list);
            for (FriendsFeed friendsFeed : list) {
                Aweme aweme2 = friendsFeed.getAweme();
                int source = friendsFeed.getSource();
                if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                    return source;
                }
            }
        }
        return 0;
    }

    public final void Il(Bundle bundle) {
        String str;
        ActivityC45651qj LJJIFFI;
        Intent intent;
        Bundle LLJJIJI;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("push_label");
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        this.LJLL = valueOf;
        if (TextUtils.isEmpty(valueOf) || o.LJ("null", this.LJLL)) {
            Context context = getContext();
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (intent = LJJIFFI.getIntent()) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
                str2 = LLJJIJI.getString("push_label", "");
            }
            this.LJLL = String.valueOf(str2);
        }
        Aweme currentAweme = this.LJLLI.getCurrentAweme();
        if (currentAweme != null) {
            currentAweme.appendMobParam("push_label", this.LJLL);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        KUM.LIZLLL(this, bundle, new AqS175S0100000_9(this, 91));
        String string = bundle.getString("fromStart", "");
        boolean z = bundle.getBoolean("slide", false);
        boolean z2 = bundle.getBoolean("click_top_tab", false);
        if (bundle.getBoolean("manual", false)) {
            wl(false);
            Ll();
        } else if (o.LJ(string, "MainPage") || z || z2) {
            wl(true);
            Ll();
        } else if (o.LJ(string, "MainFragment")) {
            wl(false);
            Ll();
        } else if (o.LJ(string, "RootNode")) {
            C2MA m30 = m30();
            if (m30 != null) {
                m30.LJJIII(1);
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            Aweme aweme = C3SZ.LIZ(mo49getActivity).LJLJLLL;
            if (aweme != null) {
                C175336uP.LIZ.LIZ(aweme.getAid());
            }
            Ll();
        }
        setUserVisibleHint(false);
        this.LJLLI.setUserVisibleHint(false);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJFF();
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        FragmentTabHost fragmentTabHost;
        Window window;
        o.LJIIIZ(args, "args");
        String string = args.getString("fromStart", "");
        if ((string == null || string.length() == 0) && (fragmentTabHost = C116694i1.LIZ(mo49getActivity()).LJLIL) != null) {
            Iterator<LLC> it = fragmentTabHost.LJLILLLLZI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LLC next = it.next();
                if (next != null && TextUtils.equals(next.LIZ, "FRIENDS_TAB")) {
                    Bundle bundle = next.LIZJ;
                    if (bundle != null) {
                        args.putAll(bundle);
                    }
                }
            }
        }
        Il(args);
        if (getFragmentManager() == null) {
            C36922EeM.LJ("fragment detached just break logic");
            return;
        }
        IBottomTabLayoutAbility LJII = C53976LGi.LJII(this);
        if (LJII != null && LJII.Ke()) {
            args.putString("enter_method", "publish_landing");
            IBottomTabLayoutAbility LJII2 = C53976LGi.LJII(this);
            if (LJII2 != null) {
                LJII2.iJ(false);
            }
        }
        LIA.LIZ(args, mo49getActivity());
        setUserVisibleHint(true);
        this.LJLLI.setUserVisibleHint(true);
        if (isResumed()) {
            C38987FRv.LJI(LSC.FRIENDS_TAB);
            LXD lxd = new LXD();
            lxd.LJIILJJIL = "homepage_friends";
            lxd.LJIILIIL();
        }
        KUM.LIZLLL(this, args, new AqS175S0100000_9(this, 92));
        if (getUserVisibleHint() && isViewValid()) {
            LXV.LJIIIZ.set(true);
            Al();
            C2U8.LIZ(new C55026Lig(1, this.LJLLI.getCurrentAweme(), this.LJLLI));
            if (this.LJLZ) {
                Jl();
            }
            this.LJLLI.tryResumePlay();
            Aweme currentAweme = this.LJLLI.getCurrentAweme();
            if (currentAweme != null && C54029LIj.LIZIZ.LJJIJL()) {
                C9CI c9ci = new C9CI(currentAweme);
                c9ci.LJLILLLLZI = true;
                C2U8.LIZ(c9ci);
            }
            C2MA m30 = m30();
            if (m30 != null) {
                m30.Z8();
            }
            qQ(false);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                window.setBackgroundDrawableResource(R.color.b5);
            }
            CommentService LJJL = CommentServiceImpl.LJJL();
            Context context = getContext();
            Aweme currentAweme2 = this.LJLLI.getCurrentAweme();
            M89 param = this.LJLLI.getParam();
            o.LJIIIIZZ(param, "friendsFeedFragmentPanel.param");
            LJJL.LJJIJLIJ(context, currentAweme2, param, new AqS159S0100000_9(this, 813));
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJ();
        }
        RBX rbx = (RBX) HG3.LJIILL();
        String curUserId = rbx.getCurUserId();
        if (!rbx.isLogin() || curUserId == null || curUserId.length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tt_friends_tab_educate_");
        LIZ.append(curUserId);
        Keva.getRepo(X1D.LIZIZ(LIZ)).storeLong("key_visit_friends_feed_timestamp", System.currentTimeMillis());
    }

    public final void Ql(boolean z) {
        int i;
        float LJIIZILJ;
        ObjectAnimator objectAnimator;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            i = C63081OpJ.LJJJJLI(mo49getActivity);
        } else {
            i = 0;
        }
        float f = 0.0f;
        if (z) {
            LJIIZILJ = 0.0f;
            f = C32151Nz.LJIIZILJ(173) + i;
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(173) + i;
        }
        ObjectAnimator objectAnimator2 = this.LLD;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLD) != null) {
            objectAnimator.end();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLL, "translationY", LJIIZILJ, f);
        this.LLD = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300L);
            ofFloat.addListener(new C54280LSa(LJIIZILJ, f, this));
            ofFloat.start();
        }
    }

    @Override // X.C2KG
    public final void b1(C2KC<Aweme> c2kc) {
        C54408LWy Ml = Ml();
        if (Ml != null) {
            List<Aweme> list = c2kc.LIZ;
            int i = c2kc.LIZIZ;
            T t = Ml.LJLIL;
            if (t != 0) {
                ((AbstractC51036K1g) t).insertItemList(list, i);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockAccount(C175046tw event) {
        T t;
        o.LJIIIZ(event, "event");
        User user = event.LJLIL;
        if (user != null) {
            List<Aweme> LJLIIL = this.LJLLI.LJLIIL(user.getUid());
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJLIIL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((Aweme) next).isRecBigCardFakeAweme()) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                int LJJIJ = Nl().LIZJ.LJJIJ(arrayList);
                List<String> LJJIJIIJI = Nl().LIZJ.LJJIJIIJI();
                if (LJJIJIIJI != null && LJJIJ == LJJIJIIJI.size() && (t = Nl().LIZJ.LJLIL) != 0 && ((AbstractC51036K1g) t).isHasMore()) {
                    Nl().LIZIZ();
                }
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRemoveAwemesByUidEvent(C70792qB event) {
        T t;
        o.LJIIIZ(event, "event");
        Aweme aweme = event.LJLIL;
        if (aweme != null) {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LJLLI;
            List<Aweme> LJLIIL = friendsFeedFragmentPanel.LJLIIL(aweme.getAuthorUid());
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJLIIL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Aweme aweme2 = (Aweme) next;
                if (aweme2 == null || !aweme2.isRecBigCardFakeAweme()) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                int LJJIJ = Nl().LIZJ.LJJIJ(arrayList);
                List<String> LJJIJIIJI = Nl().LIZJ.LJJIJIIJI();
                if (LJJIJIIJI != null && LJJIJ == LJJIJIIJI.size() && (t = Nl().LIZJ.LJLIL) != 0 && ((AbstractC51036K1g) t).isHasMore()) {
                    Nl().LIZIZ();
                }
                friendsFeedFragmentPanel.LJJLIIJ(aweme.getAid());
            }
        }
    }

    @QD3
    public final void onVideoPublishEvent(C50420Jqa event) {
        IPageStateAbility RP;
        o.LJIIIZ(event, "event");
        if (C54029LIj.LIZIZ.LJJIIZ() && event.LJLIL == 15) {
            C90053g9.LIZIZ = true;
            Boolean bool = event.LJLLJ;
            o.LJIIIIZZ(bool, "event.fromPublishPreview");
            this.LJZ = bool.booleanValue();
            Object obj = event.LJLILLLLZI;
            if (obj instanceof Aweme) {
                IAwemeService LIZ = AwemeService.LIZ();
                Object obj2 = event.LJLILLLLZI;
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme R1 = LIZ.R1((Aweme) obj2);
                if (!C80S.LJFF(R1) && !C54838Lfe.LJJI(R1)) {
                    if (R1 != null) {
                        if (R1.isPaidContent) {
                            return;
                        } else {
                            Nl().LIZ(R1);
                        }
                    }
                    IPageStateAbility RP2 = RP();
                    if (RP2 != null) {
                        RP2.A9(true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                Iterator it = C65661Ppp.LIZJ((List) obj).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Aweme R12 = AwemeService.LIZ().R1((Aweme) it.next());
                    if (!C80S.LJFF(R12) && !C54838Lfe.LJJI(R12) && R12 != null && !R12.isPaidContent) {
                        Nl().LIZ(R12);
                        z = true;
                    }
                }
                if (z && (RP = RP()) != null) {
                    RP.A9(true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        String str;
        boolean z2;
        if (z) {
            str = "home_tab";
        } else {
            str = "pull";
        }
        this.LJLLLLLL = str;
        if (!super.ub(z)) {
            return false;
        }
        C54396LWm Nl = Nl();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || !KNV.LJFF(mo49getActivity, "page_feed") || !C54153LNd.LIZIZ(mo49getActivity)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = !z2;
        C54408LWy c54408LWy = Nl.LIZJ;
        LWX lwx = (LWX) c54408LWy.LJLIL;
        if (lwx != null) {
            lwx.LJLIL = z;
        }
        c54408LWy.LJLJJL = z;
        c54408LWy.LJLJLLL = z3;
        C54408LWy c54408LWy2 = Nl.LIZJ;
        boolean z4 = Nl.LIZIZ;
        c54408LWy2.getClass();
        LIP LIZ = LIO.LIZ();
        ActivityC45651qj activityC45651qj = null;
        String consume$default = FeedInsertRelationManager.consume$default(FeedInsertRelationManager.INSTANCE, false, 1, null);
        int type = EnumC54377LVt.REFRESH.getType();
        String LJ = C2US.LIZJ("feed").LJ();
        o.LJIIIIZZ(LJ, "getInstance(FeedImpressi…eys.KEY_FEED).toReportIds");
        C54397LWn c54397LWn = new C54397LWn(1, type, LJ);
        c54397LWn.LJI = LIZ.LIZ;
        c54397LWn.LJII = consume$default;
        c54397LWn.LJIIJJI = LIZ.LIZIZ;
        c54397LWn.LJIIL = z4;
        c54408LWy.LJIILL(1, c54397LWn.LIZ());
        MG5 mg5 = MG5.TAB_FRIENDS;
        Fragment fragment = Nl.LIZ;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        }
        LYH.LIZLLL(mg5, activityC45651qj);
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
        if (!z) {
            LHM.LIZIZ.LIZIZ().visitSocial2Tab("FRIENDS_FEED");
        }
        C2U8.LIZ(new C54404LWu());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void wl(boolean z) {
        C2U8.LIZ(new C55026Lig(2, this.LJLLI.getCurrentAweme(), this.LJLLI));
        this.LJLLI.handlePageStop(z);
        LXV.LJIIIZ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object LIZ;
        Aweme aweme;
        Story story;
        String str;
        ActivityC45651qj activityC45651qj;
        IFriendsTabDebugService iFriendsTabDebugService;
        o.LJIIIZ(view, "view");
        this.LJLLILLLL = new C54396LWm(this);
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (c54029LIj.LJJIJL()) {
            StateOwner.LJLIL.getClass();
            getLifecycle().addObserver(new StateOwner$fragmentLifeCycle$1());
        }
        super.onViewCreated(view, bundle);
        qQ(false);
        this.LJLLL = (FrameLayout) view.findViewById(R.id.bps);
        ScreenAdaptionComponentTemp screenAdaptionComponentTemp = this.LJLLI.mScreenAdaptionComponentTemp;
        if (screenAdaptionComponentTemp != null) {
            screenAdaptionComponentTemp.gj();
        }
        if (L7K.LIZJ) {
            C55096Ljo.LJIILIIL(this, FriendsFeedScope.class, this, IFriendsSkylightAbility.class);
            C54407LWx c54407LWx = C54407LWx.LIZIZ;
            C54405LWv c54405LWv = new C54405LWv();
            EnumC62042c4 itemType = EnumC62042c4.STORY_CREATE;
            o.LJIIIZ(itemType, "itemType");
            c54405LWv.LIZ.getClass();
            c54405LWv.LIZ.getClass();
            c54407LWx.LJI(this, c54405LWv.LIZ);
            this.LJLLLL = System.currentTimeMillis();
        }
        if (!c54029LIj.LJJIJL() && (iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class)) != null) {
            mo49getActivity();
            iFriendsTabDebugService.LIZJ();
        }
        if (this.LJLJJI == 0) {
            this.LJLJJI = 31;
            this.LJLJI = "homepage_friends";
        }
        FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LJLLI;
        M89 m89 = new M89();
        m89.setEventType(this.LJLJI);
        m89.setPageType(this.LJLJJI);
        friendsFeedFragmentPanel.setParam(m89);
        friendsFeedFragmentPanel.onViewCreated(view, bundle);
        friendsFeedFragmentPanel.DA(Hl());
        friendsFeedFragmentPanel.LLILIL = this;
        friendsFeedFragmentPanel.setCheckLoadMoreListener(Hl());
        friendsFeedFragmentPanel.setDeleteItemListener(Hl());
        friendsFeedFragmentPanel.LLILL = this;
        friendsFeedFragmentPanel.setUserVisibleHint(true);
        C54408LWy Ml = Ml();
        if (Ml != null) {
            Ml.LJLILLLLZI = this.LJLLI;
        }
        Nl().LIZJ.LJLJJLL = this.LJLLI;
        C54408LWy Ml2 = Ml();
        if (Ml2 != null) {
            Ml2.LJLJL = this.LJLLI;
        }
        Nl().LIZJ.LJJ(new LWX());
        if (((Boolean) C34166Db0.LIZIZ.getValue()).booleanValue()) {
            this.LJZI = new C54385LWb(Nl());
        }
        try {
            C54396LWm Nl = Nl();
            InterfaceC55143LkZ LJIIL = C57738MlK.LIZIZ.LJIIL();
            String eventType = this.LJLJI;
            o.LJIIIIZZ(eventType, "eventType");
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C57619MjP controller = LJIIL.LIZLLL(requireActivity, eventType);
            o.LJIIIZ(controller, "controller");
            C54408LWy c54408LWy = Nl.LIZJ;
            c54408LWy.getClass();
            LWX lwx = (LWX) c54408LWy.LJLIL;
            if (lwx != null) {
                lwx.LJLLLLLL = controller;
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("TTRecUser FriendsFeedPresenter setRecUserBigCardController fail ");
            LIZ2.append(m10exceptionOrNullimpl);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (L1F.LIZIZ() && C54029LIj.LIZIZ.LIZ()) {
                ArrayList<Aweme> arrayList = LIO.LIZJ;
                arrayList.clear();
                C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
                InterfaceC54401LWr LJIILJJIL = c55723Ltv.LJIILJJIL();
                if (LJIILJJIL.isPublishing() && (aweme = (Aweme) ORZ.LLFII(LJIILJJIL.LIZJ())) != null && (((story = aweme.getStory()) == null || story.isPublishing()) && C54838Lfe.LJIILIIL(AwemeService.LIZ().R1(aweme)))) {
                    Aweme LJI = c55723Ltv.LJIL().LJI();
                    if (!C80S.LJFF(LJI)) {
                        arrayList.add(LJI);
                    }
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("consume aweme ");
            ArrayList<Aweme> arrayList2 = LIO.LIZJ;
            Aweme aweme2 = (Aweme) ORZ.LJLLLL(arrayList2);
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            LIZ3.append(str);
            X1D.LIZIZ(LIZ3);
            C54396LWm Nl2 = Nl();
            if (!arrayList2.isEmpty()) {
                C54408LWy c54408LWy2 = Nl2.LIZJ;
                c54408LWy2.getClass();
                LWX lwx2 = (LWX) c54408LWy2.LJLIL;
                if (lwx2 != null) {
                    lwx2.LJLZ = arrayList2;
                }
            }
            LIP LIZ4 = LIO.LIZ();
            LIZ4.LIZJ = FeedInsertRelationManager.consume$default(FeedInsertRelationManager.INSTANCE, false, 1, null);
            C54396LWm Nl3 = Nl();
            int type = EnumC54377LVt.REFRESH.getType();
            String LJ = C2US.LIZJ("feed").LJ();
            o.LJIIIIZZ(LJ, "getInstance(FeedImpressi…eys.KEY_FEED).toReportIds");
            C54397LWn c54397LWn = new C54397LWn(1, type, LJ);
            c54397LWn.LJI = LIZ4.LIZ;
            c54397LWn.LJII = LIZ4.LIZJ;
            c54397LWn.LJIIJJI = LIZ4.LIZIZ;
            c54397LWn.LJIIL = Nl3.LIZIZ;
            Nl3.LIZJ.LJIILL(1, c54397LWn.LIZ());
            Nl3.LIZIZ = false;
            MG5 mg5 = MG5.TAB_FRIENDS;
            Fragment fragment = Nl3.LIZ;
            if (fragment != null) {
                activityC45651qj = fragment.mo49getActivity();
            } else {
                activityC45651qj = null;
            }
            LYH.LIZLLL(mg5, activityC45651qj);
        } else {
            this.LJLLI.Ne();
        }
        if (this.LJLLJ == null && C1DH.LJIL()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            View findViewById = view.findViewById(R.id.d8h);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.feed_root_layout)");
            this.LJLLJ = LEJ.LIZIZ(mo49getActivity, findViewById);
        }
        LXV.LJIIIZ.set(true);
        LXS LIZ5 = LXU.LIZ();
        if (LIZ5 != null) {
            LIZ5.LIZLLL(false);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        C55723Ltv c55723Ltv2 = C55723Ltv.LIZIZ;
        if (c55723Ltv2.LJIILJJIL().isPublishing()) {
            Pl();
        }
        c55723Ltv2.LJIILJJIL().LJIIL("FriendsFeedFragment", new C54400LWq(this));
        this.LJLLI.addOnPageChangeListener(new IDiS271S0100000_9(this, 5));
        if (C54029LIj.LIZIZ.LJJIJL()) {
            final InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            final TopFriendsFeedScrollProfileStrategy topFriendsFeedScrollProfileStrategy = new TopFriendsFeedScrollProfileStrategy(requireActivity2);
            C62814Ol0.LJJIIJZLJL(LIZJ, InterceptHomeViewPagerProtocol.class, C47261Igj.LJJIJIL(topFriendsFeedScrollProfileStrategy));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment$onViewCreated$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, InterceptHomeViewPagerProtocol.class, topFriendsFeedScrollProfileStrategy);
                        }
                    }
                });
            }
        }
        this.LJLLI.setInsertItemListener(this);
        if (C35971E9v.LIZ()) {
            C8VV.LIZ(this, false, new AqS140S0200000_9(this, view, 10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r2 == null) goto L24;
     */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            boolean r0 = X.LX1.LJIILIIL
            r4 = 0
            if (r0 != 0) goto L3e
            java.util.HashMap<java.lang.String, java.lang.String> r9 = X.LX1.LIZ
            java.lang.String r1 = "tab_position"
            java.lang.Object r0 = r9.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L1c
            int r0 = r0.length()
            if (r0 != 0) goto Lab
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L3e
            X.LIj r0 = X.C54029LIj.LIZIZ
            boolean r0 = r0.LJJIJL()
            if (r0 == 0) goto L3e
            long r5 = android.os.SystemClock.elapsedRealtime()
            X.LX1.LIZIZ = r5
            java.lang.String r0 = "HomeTopTab"
            r9.put(r1, r0)
            X.FAM r0 = X.C56662Kg.LIZ()
            long r7 = r0.LJIIJJI
            java.lang.String r10 = "start_time_from_open_app"
            X.C7MY.LJFF(r5, r7, r9, r10)
        L3e:
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2$FriendsTabPerfOptConfig r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2.LIZ()
            boolean r0 = r0.fetchFeedOpt
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling r0 = com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling.LJLIL
            r0.getClass()
            X.SrX r0 = com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling.LJLILLLLZI
            if (r0 == 0) goto L52
            r0.dispose()
        L52:
            java.lang.String r0 = "homepage_friends"
            X.C54502LaE.LIZ(r0)
            long r5 = android.os.SystemClock.elapsedRealtime()
            X.1qj r2 = r11.mo49getActivity()
            r3 = 0
            r1 = 2131560626(0x7f0d08b2, float:1.874663E38)
            if (r2 == 0) goto L73
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2$FriendsTabPerfOptConfig r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2.LIZ()
            boolean r0 = r0.viewInflateOpt
            if (r0 == 0) goto La9
            android.view.View r2 = X.C16970lZ.LIZJ(r1, r2, r13, r4)
        L71:
            if (r2 != 0) goto L77
        L73:
            android.view.View r2 = X.C16880lQ.LLLLIILL(r12, r1, r13, r4)
        L77:
            boolean r0 = X.LX1.LJIILIIL
            if (r0 != 0) goto L8e
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r5
            X.LX1.LJI = r0
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.LKc r0 = new X.LKc
            r0.<init>(r2)
            r1.addOnPreDrawListener(r0)
        L8e:
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2$FriendsTabPerfOptConfig r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2.LIZ()
            boolean r0 = r0.respToFirstFrameOpt
            if (r0 == 0) goto La0
            Y.ARunnableS45S0100000_9 r1 = new Y.ARunnableS45S0100000_9
            r0 = 49
            r1.<init>(r11, r0)
            X.FN6.LIZJ(r1)
        La0:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto La7
        La4:
            if (r2 == 0) goto Lc9
            goto Lae
        La7:
            r2 = r3
            goto La4
        La9:
            r2 = r3
            goto L71
        Lab:
            r0 = 0
            goto L1d
        Lae:
            androidx.lifecycle.LifecycleOwner r0 = r11.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> Lcf
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> Lcf
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r11)     // Catch: java.lang.Throwable -> Lcf
            X.C10A.LIZIZ(r2, r11)     // Catch: java.lang.Throwable -> Lcf
            X.1qj r1 = r11.mo49getActivity()     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = r1 instanceof X.C29S     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc6
            r3 = r1
            X.29S r3 = (X.C29S) r3     // Catch: java.lang.Throwable -> Lcf
        Lc6:
            X.C90903hW.LIZ(r3)     // Catch: java.lang.Throwable -> Lcf
        Lc9:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lcf
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lcf
            goto Ld7
        Lcf:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Ld7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
