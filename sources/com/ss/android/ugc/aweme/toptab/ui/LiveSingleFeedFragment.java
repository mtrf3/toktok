package com.ss.android.ugc.aweme.toptab.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16970lZ;
import X.C175336uP;
import X.C188787b0;
import X.C1DH;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C28289B8j;
import X.C29S;
import X.C2MA;
import X.C2U8;
import X.C33Q;
import X.C38987FRv;
import X.C3C5;
import X.C3C8;
import X.C3SZ;
import X.C51697KQr;
import X.C54502LaE;
import X.C55026Lig;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C76800UCe;
import X.C77317UWb;
import X.C8DK;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KRB;
import X.KUM;
import X.LAO;
import X.LEJ;
import X.LSC;
import X.LXA;
import X.LXD;
import X.LXV;
import X.M89;
import X.NK1;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import Y.IDiS271S0100000_9;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.toptab.component.LiveSingleFeedComponent;
import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveSingleFeedFragment extends BaseFeedListFragment implements InterfaceC53896LDg, NK1, KPL, InterfaceC40408FtU, C8DK {
    public LiveSingleFeedFragmentPanel LJLJLLL;
    public LAO LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
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

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "LiveFeedFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final HomeFeedComponent Gl() {
        return new LiveSingleFeedComponent();
    }

    public final LiveSingleFeedFragmentPanel Il() {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LJLJLLL;
        if (liveSingleFeedFragmentPanel != null) {
            return liveSingleFeedFragmentPanel;
        }
        o.LJIJI("liveFeedFragmentPanel");
        throw null;
    }

    public final boolean Jl() {
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        boolean vv0 = c188787b0.LIZ(requireActivity).vv0("HOME");
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        boolean LJ = o.LJ(c188787b0.LIZ(requireActivity2).ov0("HOME"), "Live");
        if (vv0 && LJ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.Gz();
        }
    }

    public final void Kl() {
        if (Il().LLIL > 0) {
            if (System.currentTimeMillis() - Il().LLIL > 60000) {
                ub(false);
            }
            Il().LLIL = 0L;
        }
    }

    @Override // X.NK1
    public final boolean cd() {
        return Il().isShareDialogShowing();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Il().onDestroyView();
        LAO lao = this.LJLL;
        if (lao != null) {
            ((C77317UWb) lao).LIZ();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (Jl()) {
            Il().LLIL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C38987FRv.LJI(LSC.LIVE);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            C28289B8j.LIZIZ(-16777216, window);
        }
        if (Jl()) {
            Kl();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        this.LJLJI = "homepage_live";
        String eventType = this.LJLJI;
        o.LJIIIIZZ(eventType, "eventType");
        this.LJLJLLL = new LiveSingleFeedFragmentPanel(eventType);
        registerComponents.append(C51697KQr.LIZJ, Il());
        return registerComponents;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        KUM.LIZJ(this, bundle, "Live", new AqS175S0100000_9(this, 311));
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Aweme aweme = C3SZ.LIZ(requireActivity).LJLJLLL;
        String string = bundle.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        String sv0 = c188787b0.LIZ(requireActivity2).sv0("Live");
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        String sv02 = c188787b0.LIZ(requireActivity3).sv0(sv0);
        ActivityC45651qj requireActivity4 = requireActivity();
        o.LJIIIIZZ(requireActivity4, "requireActivity()");
        String sv03 = c188787b0.LIZ(requireActivity4).sv0(sv02);
        if (o.LJ(string, "MainFragment") || bundle.getBoolean(sv0)) {
            Il().setUserVisibleHint(false);
            wl(false);
        } else if (o.LJ(string, "MainPage") || bundle.getBoolean(sv02)) {
            wl(true);
        } else if (o.LJ(string, "RootNode") || bundle.getBoolean(sv03)) {
            C2MA m30 = m30();
            if (m30 != null) {
                m30.LJJIII(1);
            }
            if (aweme != null) {
                C175336uP.LIZ.LIZ(aweme.getAid());
            }
        }
        Il().LLIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        o.LJIIIZ(args, "args");
        KUM.LIZIZ(this, args, "Live", new AqS175S0100000_9(this, 312));
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        String sv0 = c188787b0.LIZ(requireActivity).sv0("Live");
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        String sv02 = c188787b0.LIZ(requireActivity2).sv0(sv0);
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        String sv03 = c188787b0.LIZ(requireActivity3).sv0(sv02);
        if (o.LJ(string, "MainFragment") || args.getBoolean(sv0)) {
            Il().setUserVisibleHint(true);
            if (isResumed() && (absFragment = this.LJLJJL) != null && !absFragment.isHidden()) {
                C38987FRv.LJI(LSC.LIVE);
                LXD lxd = new LXD();
                lxd.LJIILJJIL = this.LJLJI;
                lxd.LJIILIIL();
            }
            b5(false);
        } else if (o.LJ(string, "MainPage") || args.getBoolean(sv02)) {
            Il().setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LJLJJL) != null && !absFragment2.isHidden()) {
                C38987FRv.LJI(LSC.LIVE);
                LXD lxd2 = new LXD();
                lxd2.LJIILJJIL = this.LJLJI;
                lxd2.LJIILIIL();
            }
            b5(true);
        } else if (o.LJ(string, "RootNode") || args.getBoolean(sv03)) {
            Il().setUserVisibleHint(true);
            if (isResumed() && (absFragment3 = this.LJLJJL) != null && !absFragment3.isHidden()) {
                C38987FRv.LJI(LSC.LIVE);
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
        Kl();
    }

    public final void b5(boolean z) {
        Window window;
        if (!getUserVisibleHint() || !isViewValid()) {
            return;
        }
        LXV.LJIILLIIL.set(true);
        Al();
        C2U8.LIZ(new C55026Lig(1, Il().getCurrentAweme(), Il()));
        if (z) {
            Il().tryResumePlay();
        } else {
            Il().handlePageResume();
        }
        qQ(false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (window = mo49getActivity.getWindow()) == null) {
            return;
        }
        C28289B8j.LIZIZ(-16777216, window);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        ILiveSingleFeedContentAssemAbility iLiveSingleFeedContentAssemAbility = (ILiveSingleFeedContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ILiveSingleFeedContentAssemAbility.class, null);
        if (iLiveSingleFeedContentAssemAbility != null) {
            iLiveSingleFeedContentAssemAbility.LJJJZ();
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void wl(boolean z) {
        Dl();
        C2U8.LIZ(new C55026Lig(2, Il().getCurrentAweme(), Il()));
        Il().handlePageStop(z);
        LXV.LJIILLIIL.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        M89 m89 = new M89();
        m89.setEventType("homepage_live");
        m89.setPageType(37);
        LiveSingleFeedFragmentPanel Il = Il();
        Il.setParam(m89);
        Il.setCheckLoadMoreListener(Hl());
        Il.setDeleteItemListener(Hl());
        if (this.LJLL == null && C1DH.LJIL()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            View findViewById = view.findViewById(R.id.d8h);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.feed_root_layout)");
            this.LJLL = LEJ.LIZIZ(mo49getActivity, findViewById);
        }
        LXV.LJIILLIIL.set(true);
        qQ(false);
        Il().onViewCreated(getView(), bundle);
        Il().DA(Hl());
        Il().addOnPageChangeListener(new IDiS271S0100000_9(this, 16));
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 313));
        ILoadMoreAbility PZ = PZ();
        if (PZ != null) {
            ((LoadMorePanelComponentTempHelper) PZ).Up0(new LXA());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C54502LaE.LIZ("homepage_live");
        View LIZLLL = C16970lZ.LIZLLL(mo49getActivity(), R.layout.bqz);
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
