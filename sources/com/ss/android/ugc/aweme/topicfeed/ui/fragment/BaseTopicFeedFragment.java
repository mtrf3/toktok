package com.ss.android.ugc.aweme.topicfeed.ui.fragment;

import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C10A;
import X.C141335gf;
import X.C16970lZ;
import X.C175336uP;
import X.C184077Kh;
import X.C188727au;
import X.C188787b0;
import X.C1DH;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C2L4;
import X.C2MA;
import X.C2U8;
import X.C33Q;
import X.C38987FRv;
import X.C3C5;
import X.C3C8;
import X.C3SZ;
import X.C44938HkM;
import X.C47261Igj;
import X.C51697KQr;
import X.C54081LKj;
import X.C54082LKk;
import X.C54502LaE;
import X.C55026Lig;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C76965UIn;
import X.C77317UWb;
import X.C78926UyI;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC55235Lm3;
import X.InterfaceC56322M8o;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KNV;
import X.KPL;
import X.KRB;
import X.KUM;
import X.LAO;
import X.LEJ;
import X.LKB;
import X.LO7;
import X.LSC;
import X.LSN;
import X.LXB;
import X.LXC;
import X.LXD;
import X.LXS;
import X.LXU;
import X.LXV;
import X.M89;
import X.NK1;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.X1D;
import Y.IDiS271S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.topicfeed.component.TopicFeedComponent;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicEmptyAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicToFYPAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.utils.TopicFeedScrollProfileStrategy;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseTopicFeedFragment extends BaseFeedListFragment implements InterfaceC53896LDg, NK1, KPL, InterfaceC40408FtU, LKB, InterfaceC56322M8o, C2L4 {
    public final C214298b3 LJLJLLL;
    public TopicFeedFragmentPanel LJLL;
    public LAO LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public String LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "topic_feed";
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public BaseTopicFeedFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicFeedListViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 656);
        LXC lxc = LXC.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), lxc, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), lxc, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b3;
        this.LJLLL = "";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final HomeFeedComponent Gl() {
        return new TopicFeedComponent();
    }

    public final LSC Il() {
        switch (this.LJLJJI) {
            case 50:
                return LSC.TOPIC0;
            case 51:
                return LSC.TOPIC1;
            case 52:
                return LSC.TOPIC2;
            case 53:
                return LSC.TOPIC3;
            default:
                return LSC.NONE;
        }
    }

    public final TopicFeedFragmentPanel Jl() {
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LJLL;
        if (topicFeedFragmentPanel != null) {
            return topicFeedFragmentPanel;
        }
        o.LJIJI("topicFeedFragmentPanel");
        throw null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(TopicFeedFragmentScope.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.Gz();
        }
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EXTRA_TOPIC_TAB_HOX_TAG")) == null) {
            return "";
        }
        return string;
    }

    @Override // X.NK1
    public final boolean cd() {
        return Jl().isShareDialogShowing();
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return C54081LKj.LIZ(requireContext, requireActivity);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            C188787b0 c188787b0 = Hox.LJLLI;
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (c188787b0.LIZ(requireActivity).vv0(LO7.LIZIZ.M1(this.LJLJJI))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC40408FtU
    public final String og() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicFeedFragment");
        LIZ.append(this.LJLLILLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Jl().onDestroyView();
        LAO lao = this.LJLLI;
        if (lao != null) {
            ((C77317UWb) lao).LIZ();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C38987FRv.LJI(Il());
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.drawable.c9f);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        int i;
        int i2;
        String str;
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        Bundle arguments = getArguments();
        int i3 = 0;
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        } else {
            i = 0;
        }
        this.LJLJJI = i;
        Bundle arguments2 = getArguments();
        String str2 = null;
        if (arguments2 != null) {
            str2 = arguments2.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
        }
        this.LJLJI = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i2 = arguments3.getInt("EXTRA_TOPIC_FEED_ID", 0);
        } else {
            i2 = 0;
        }
        this.LJLLJ = i2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("EXTRA_TOPIC_WATCHED_ALL_STRING")) == null) {
            str = "";
        }
        this.LJLLL = str;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            i3 = arguments5.getInt("EXTRA_TOPIC_TAB_INDEX", 0);
        }
        this.LJLLILLLL = i3;
        String eventType = this.LJLJI;
        o.LJIIIIZZ(eventType, "eventType");
        this.LJLL = new TopicFeedFragmentPanel(eventType, this.LJLJJI);
        registerComponents.append(C51697KQr.LIZJ, Jl());
        return registerComponents;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        LO7 lo7 = LO7.LIZIZ;
        KUM.LIZJ(this, bundle, lo7.M1(this.LJLJJI), new AqS175S0100000_9(this, 300));
        String str = "";
        String string = bundle.getString("fromStart", "");
        String str2 = LSN.LIZ;
        LSN.LIZ = "click_tab";
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        String sv0 = c188787b0.LIZ(requireActivity).sv0(lo7.M1(this.LJLJJI));
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        String sv02 = c188787b0.LIZ(requireActivity2).sv0(sv0);
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        String sv03 = c188787b0.LIZ(requireActivity3).sv0(sv02);
        boolean z = false;
        if (o.LJ(string, "MainFragment") || bundle.getBoolean(sv0)) {
            Jl().setUserVisibleHint(false);
            wl(false);
        } else if (o.LJ(string, "MainPage") || bundle.getBoolean(sv02)) {
            wl(true);
        } else if (o.LJ(string, "RootNode") || bundle.getBoolean(sv03)) {
            C2MA m30 = m30();
            if (m30 != null) {
                m30.LJJIII(1);
            }
            ActivityC45651qj requireActivity4 = requireActivity();
            o.LJIIIIZZ(requireActivity4, "requireActivity()");
            Aweme aweme = C3SZ.LIZ(requireActivity4).LJLJLLL;
            if (aweme != null) {
                C175336uP.LIZ.LIZ(aweme.getAid());
            }
        }
        String eventType = this.LJLJI;
        o.LJIIIIZZ(eventType, "eventType");
        ActivityC45651qj requireActivity5 = requireActivity();
        o.LJIIIIZZ(requireActivity5, "requireActivity()");
        Aweme aweme2 = C3SZ.LIZ(requireActivity5).LJLJLLL;
        C188727au LIZLLL = KNV.LIZLLL(str2, "exitMethod");
        LIZLLL.LJIIIZ("enter_from", eventType);
        if (aweme2 != null && aweme2.getAwemeType() == 328) {
            z = true;
        }
        String str3 = null;
        if (!z) {
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
        }
        LIZLLL.LJIIIZ("group_id", str);
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        }
        LIZLLL.LJIIIZ("author_id", str3);
        LIZLLL.LJIIIZ("exit_method", str2);
        FMX.LJIIL("exit_topic_tab", LIZLLL.LIZ);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        ITopicEmptyAssemAbility iTopicEmptyAssemAbility;
        boolean z;
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        o.LJIIIZ(args, "args");
        LO7 lo7 = LO7.LIZIZ;
        KUM.LIZIZ(this, args, lo7.M1(this.LJLJJI), new AqS175S0100000_9(this, 301));
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        String sv0 = c188787b0.LIZ(requireActivity).sv0(lo7.M1(this.LJLJJI));
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        String sv02 = c188787b0.LIZ(requireActivity2).sv0(sv0);
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        String sv03 = c188787b0.LIZ(requireActivity3).sv0(sv02);
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ITopicToFYPAssemAbility.class, null);
        if ((iTopicToFYPAssemAbility != null && iTopicToFYPAssemAbility.LJJLIIIJILLIZJL()) || ((iTopicEmptyAssemAbility = (ITopicEmptyAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ITopicEmptyAssemAbility.class, null)) != null && iTopicEmptyAssemAbility.LLF())) {
            z = true;
        } else {
            z = false;
        }
        LXS LIZ = LXU.LIZ();
        if (LIZ != null) {
            LIZ.LJII(this.LJLJJI, z);
        }
        if (o.LJ(string, "MainFragment") || args.getBoolean(sv0)) {
            Jl().setUserVisibleHint(true);
            if (isResumed() && (absFragment = this.LJLJJL) != null && !absFragment.isHidden()) {
                C38987FRv.LJI(Il());
                LXD lxd = new LXD();
                lxd.LJIILJJIL = this.LJLJI;
                lxd.LJIILIIL();
            }
            b5(false);
            return;
        }
        if (o.LJ(string, "MainPage") || args.getBoolean(sv02)) {
            Jl().setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LJLJJL) != null && !absFragment2.isHidden()) {
                C38987FRv.LJI(Il());
                LXD lxd2 = new LXD();
                lxd2.LJIILJJIL = this.LJLJI;
                lxd2.LJIILIIL();
            }
            b5(true);
            return;
        }
        if (!o.LJ(string, "RootNode") && !args.getBoolean(sv03)) {
            return;
        }
        Jl().setUserVisibleHint(true);
        if (isResumed() && (absFragment3 = this.LJLJJL) != null && !absFragment3.isHidden()) {
            C38987FRv.LJI(Il());
            LXD lxd3 = new LXD();
            lxd3.LJIILJJIL = this.LJLJI;
            lxd3.LJIILIIL();
        }
        C2MA m30 = m30();
        if (m30 != null) {
            m30.LJJIJIIJIL(1);
        }
        b5(true);
    }

    public final void b5(boolean z) {
        AnonymousClass901 j3;
        Window window;
        if (!getUserVisibleHint() || !isViewValid()) {
            return;
        }
        LXV.LIZ(this.LJLJJI, Boolean.TRUE);
        Al();
        C2U8.LIZ(new C55026Lig(1, Jl().getCurrentAweme(), Jl()));
        if (z) {
            Jl().tryResumePlay();
        } else {
            Jl().handlePageResume();
        }
        qQ(false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.drawable.c9f);
        }
        C2MA m30 = m30();
        if (m30 != null && (j3 = m30.j3()) != null) {
            j3.Y2(z);
            j3.e3(false);
        }
        C44938HkM.LJ = Jl().getCurrentAweme();
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ITopicToFYPAssemAbility.class, null);
        if (iTopicToFYPAssemAbility == null || !iTopicToFYPAssemAbility.LJJLIIIJILLIZJL()) {
            return;
        }
        C2U8.LIZ(new C55026Lig(2, Jl().getCurrentAweme(), Jl(), Boolean.FALSE));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        ITopicContentAssemAbility iTopicContentAssemAbility = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility != null) {
            iTopicContentAssemAbility.LJJJZ();
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void wl(boolean z) {
        AnonymousClass901 j3;
        Dl();
        C2U8.LIZ(new C55026Lig(2, Jl().getCurrentAweme(), Jl()));
        Jl().handlePageStop(z);
        C2MA m30 = m30();
        if (m30 != null && (j3 = m30.j3()) != null) {
            j3.v2(z);
        }
        LXV.LIZ(this.LJLJJI, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        M89 m89 = new M89();
        m89.setEventType(this.LJLJI);
        m89.setPageType(this.LJLJJI);
        Jl().setParam(m89);
        Jl().setCheckLoadMoreListener(Hl());
        Jl().setDeleteItemListener(Hl());
        if (this.LJLLI == null && C1DH.LJIL()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            View findViewById = view.findViewById(R.id.d8h);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.feed_root_layout)");
            this.LJLLI = LEJ.LIZIZ(mo49getActivity, findViewById);
        }
        LXV.LIZ(this.LJLJJI, Boolean.TRUE);
        qQ(false);
        ((TopicFeedListViewModel) this.LJLJLLL.getValue()).LJLILLLLZI = this.LJLLJ;
        TopicFeedListViewModel topicFeedListViewModel = (TopicFeedListViewModel) this.LJLJLLL.getValue();
        String str = this.LJLLL;
        o.LJIIIZ(str, "<set-?>");
        topicFeedListViewModel.LJLJI = str;
        Jl().onViewCreated(getView(), bundle);
        Jl().DA(Hl());
        Jl().addOnPageChangeListener(new IDiS271S0100000_9(this, 11));
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 496));
        final InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        final TopicFeedScrollProfileStrategy topicFeedScrollProfileStrategy = new TopicFeedScrollProfileStrategy(this.LJLJJI, requireActivity);
        C62814Ol0.LJJIIJZLJL(LIZJ, InterceptHomeViewPagerProtocol.class, C47261Igj.LJJIJIL(topicFeedScrollProfileStrategy));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment$assembleViews$lambda$0$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, InterceptHomeViewPagerProtocol.class, topicFeedScrollProfileStrategy);
                    }
                }
            });
        }
        ILoadMoreAbility PZ = PZ();
        if (PZ != null) {
            ((LoadMorePanelComponentTempHelper) PZ).Up0(new LXB(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        String eventType = this.LJLJI;
        o.LJIIIIZZ(eventType, "eventType");
        C54502LaE.LIZ(eventType);
        View LIZLLL = C16970lZ.LIZLLL((Activity) getContext(), R.layout.csj);
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

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
