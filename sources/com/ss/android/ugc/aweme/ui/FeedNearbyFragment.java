package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass901;
import X.C10A;
import X.C116694i1;
import X.C141335gf;
import X.C16970lZ;
import X.C175336uP;
import X.C188787b0;
import X.C1DH;
import X.C204027za;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C2MA;
import X.C2U8;
import X.C33Q;
import X.C38987FRv;
import X.C3C5;
import X.C3C8;
import X.C3SZ;
import X.C40443Fu3;
import X.C43694HCw;
import X.C44938HkM;
import X.C45804HyK;
import X.C50420Jqa;
import X.C51697KQr;
import X.C52818KoA;
import X.C54045LIz;
import X.C54485LZx;
import X.C54502LaE;
import X.C54850Lfq;
import X.C55026Lig;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65661Ppp;
import X.C76800UCe;
import X.C76965UIn;
import X.C8DO;
import X.C8YZ;
import X.C90053g9;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC36571c5;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC54049LJd;
import X.InterfaceC54054LJi;
import X.InterfaceC55058LjC;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KRB;
import X.KUM;
import X.LJ1;
import X.LJ5;
import X.LJA;
import X.LQA;
import X.LSC;
import X.LXD;
import X.LXF;
import X.LXG;
import X.LXH;
import X.LXI;
import X.LXL;
import X.LXV;
import X.LY0;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBW;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
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
import com.ss.android.ugc.aweme.component.NearbyFeedComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.scope.FeedNearbyFragmentScope;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class FeedNearbyFragment extends BaseFeedListFragment implements KPL, InterfaceC53896LDg, InterfaceC40408FtU, LXL, LY0, C8DO, INearbyFeedAbility, C2L4 {
    public long LJLJLLL;
    public final C204027za LJLL;
    public final LXH LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public View LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility
    public final void Kr() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

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

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "NearByFragment";
    }

    public FeedNearbyFragment() {
        C62822Ol8 c62822Ol8 = C52818KoA.LIZ;
        this.LJLL = new C204027za(new AqS153S0100000_3(this, 1131), ((Boolean) c62822Ol8.getValue()).booleanValue());
        boolean booleanValue = ((Boolean) c62822Ol8.getValue()).booleanValue();
        LXI initializer = LXI.LJLIL;
        o.LJIIIZ(initializer, "initializer");
        this.LJLLI = new LXH(initializer, booleanValue);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 681));
        this.LJLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment
    public final HomeFeedComponent Gl() {
        return new NearbyFeedComponent();
    }

    public final NearbyFeedListViewModel Il() {
        return (NearbyFeedListViewModel) this.LJLL.getValue();
    }

    public final NearbyFeedFragmentPanel Jl() {
        return (NearbyFeedFragmentPanel) this.LJLLI.getValue();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(FeedNearbyFragmentScope.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
        IRefreshAbility YE = YE();
        if (YE != null) {
            YE.Gz();
        }
    }

    @Override // X.LXL
    public final void Sf() {
        NearbyFeedFragmentPanel Jl = Jl();
        LXF lxf = new LXF(this);
        ILoadMoreAbility iLoadMoreAbility = Jl.loadMoreAbility;
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.showLoadMoreEmpty();
        }
        ILoadMoreAbility iLoadMoreAbility2 = Jl.loadMoreAbility;
        if (iLoadMoreAbility2 != null) {
            iLoadMoreAbility2.fy();
        }
        ILoadMoreAbility iLoadMoreAbility3 = Jl.loadMoreAbility;
        if (iLoadMoreAbility3 != null) {
            iLoadMoreAbility3.Up0(lxf);
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility
    public final void Sl0() {
        if (!X8()) {
            ub(true);
        }
    }

    @Override // X.C8DO
    public final boolean X8() {
        LJ1 LJII;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || !NearbyTabConfig.LIZLLL() || (LJII = LJ5.LJII(mo49getActivity)) == null || !LJII.LJLJJI) {
            return false;
        }
        C54045LIz.LIZ.getClass();
        if (!C54045LIz.LIZIZ() || !NearbyTabConfig.LJI()) {
            return false;
        }
        NearbyRegionListFragment.wl(new NearbyRegionListFragment(), mo49getActivity, new AqS159S0100000_9(mo49getActivity, 682));
        LJ5.LJ(mo49getActivity);
        return true;
    }

    @Override // X.LY0
    public final void Y9() {
        C212418Vh.LJIIJJI(Il(), new AqS175S0100000_9(this, 331));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(mo49getActivity, null), INearbyFeedAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ActivityC45651qj LJJIFFI;
        boolean z;
        InterfaceC54054LJi interfaceC54054LJi;
        boolean uv0;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        if (NearbyFeedServiceImpl.LJJI().LJI()) {
            if (LJA.LIZIZ.get()) {
                uv0 = o.LJ(C116694i1.LIZ(mo49getActivity()).nv0(), "Nearby");
            } else {
                uv0 = Hox.LJLLI.LIZ(mo49getActivity).uv0(this);
            }
            if (uv0) {
                setUserVisibleHint(true);
                Jl().setUserVisibleHint(true);
            } else {
                setUserVisibleHint(false);
                Jl().setUserVisibleHint(false);
            }
            if (!this.LJLLL && uv0) {
                Jl().LLFII = true;
                super.onResume();
                Jl().LLFII = false;
            } else {
                Jl().LLFII = false;
                super.onResume();
                Jl().LLFII = false;
            }
            if (getUserVisibleHint() && isResumed()) {
                C38987FRv.LJI(LSC.NEARBY);
                C2U8.LIZ(new C55026Lig(1, Jl().getCurrentAweme(), Jl()));
            }
            Window window = mo49getActivity.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d4, mo49getActivity)));
            }
            this.LJLLL = false;
            return;
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        int length = activityStack.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Activity activity = activityStack[i];
            if (activity instanceof InterfaceC55058LjC) {
                if (activity != null && (LJJIFFI = C45804HyK.LJJIFFI(activity)) != null) {
                    String nv0 = C116694i1.LIZ(LJJIFFI).nv0();
                    InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LJJIFFI).Ja("HOME");
                    if ((Ja instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) Ja) != null) {
                        z = interfaceC54054LJi.oc();
                    } else {
                        z = false;
                    }
                    if (o.LJ(nv0, "HOME") && z) {
                        Jl().LLFII = true;
                        super.onResume();
                        Jl().LLFII = false;
                        setUserVisibleHint(true);
                        Jl().setUserVisibleHint(true);
                        if (getUserVisibleHint() && isResumed()) {
                            C38987FRv.LJI(LSC.NEARBY);
                            C2U8.LIZ(new C55026Lig(1, Jl().getCurrentAweme(), Jl()));
                        }
                        Window window2 = mo49getActivity.getWindow();
                        if (window2 == null) {
                            return;
                        }
                        window2.setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d4, mo49getActivity)));
                        return;
                    }
                }
            } else {
                i++;
            }
        }
        Jl().LLFII = false;
        super.onResume();
        setUserVisibleHint(false);
        Jl().setUserVisibleHint(false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(C51697KQr.LIZJ, Jl());
        return registerComponents;
    }

    @Override // X.C8DO
    public final Aweme ya() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            return C3SZ.LIZ(mo49getActivity).LJLJLLL;
        }
        return null;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        KUM.LIZJ(this, bundle, "Nearby", new AqS175S0100000_9(this, 329));
        String string = bundle.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0("nearby");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        String sv02 = c188787b0.LIZ(mo49getActivity2).sv0(sv0);
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        o.LJI(mo49getActivity3);
        String sv03 = c188787b0.LIZ(mo49getActivity3).sv0(sv02);
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
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            o.LJI(mo49getActivity4);
            Aweme aweme = C3SZ.LIZ(mo49getActivity4).LJLJLLL;
            if (aweme != null) {
                C175336uP.LIZ.LIZ(aweme.getAid());
            }
        }
        setUserVisibleHint(false);
        Jl().setUserVisibleHint(false);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        o.LJIIIZ(args, "args");
        KUM.LIZIZ(this, args, "Nearby", new AqS175S0100000_9(this, 330));
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0("Nearby");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        String sv02 = c188787b0.LIZ(mo49getActivity2).sv0(sv0);
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        o.LJI(mo49getActivity3);
        String sv03 = c188787b0.LIZ(mo49getActivity3).sv0(sv02);
        C54485LZx.LIZIZ();
        if (NearbyFeedServiceImpl.LJJI().LJI()) {
            Jl().setUserVisibleHint(true);
            setUserVisibleHint(true);
            if (isResumed()) {
                C38987FRv.LJI(LSC.NEARBY);
                LXD lxd = new LXD();
                lxd.LJIILJJIL = "homepage_nearby";
                lxd.LJIILIIL();
            }
            b5(true);
            return;
        }
        if (o.LJ(string, "MainFragment") || args.getBoolean(sv0)) {
            Jl().setUserVisibleHint(true);
            setUserVisibleHint(true);
            if (isResumed() && (absFragment = this.LJLJJL) != null && !absFragment.isHidden()) {
                C38987FRv.LJI(LSC.NEARBY);
                LXD lxd2 = new LXD();
                lxd2.LJIILJJIL = "homepage_nearby";
                lxd2.LJIILIIL();
            }
            b5(false);
            return;
        }
        if (o.LJ(string, "MainPage") || args.getBoolean(sv02)) {
            Jl().setUserVisibleHint(true);
            setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LJLJJL) != null && !absFragment2.isHidden()) {
                C38987FRv.LJI(LSC.NEARBY);
                LXD lxd3 = new LXD();
                lxd3.LJIILJJIL = "homepage_nearby";
                lxd3.LJIILIIL();
            }
            b5(true);
            return;
        }
        if (!o.LJ(string, "RootNode") && !args.getBoolean(sv03)) {
            return;
        }
        Jl().setUserVisibleHint(true);
        setUserVisibleHint(true);
        if (isResumed() && (absFragment3 = this.LJLJJL) != null && !absFragment3.isHidden()) {
            C38987FRv.LJI(LSC.NEARBY);
            LXD lxd4 = new LXD();
            lxd4.LJIILJJIL = "homepage_nearby";
            lxd4.LJIILIIL();
        }
        b5(true);
        C2MA m30 = m30();
        if (m30 != null) {
            m30.LJJIII(1);
        }
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        o.LJI(mo49getActivity4);
        Aweme aweme = C3SZ.LIZ(mo49getActivity4).LJLJLLL;
        if (aweme == null) {
            return;
        }
        C175336uP.LIZ.LIZ(aweme.getAid());
    }

    @Override // com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility
    public final void Nc0(Aweme aweme) {
        Jl().LJJJJZI(Jl().getIndexByAweme(aweme), aweme);
    }

    public final void b5(boolean z) {
        C54850Lfq c54850Lfq;
        Window window;
        if (!getUserVisibleHint() || !isViewValid()) {
            return;
        }
        LXV.LJIIJJI.set(true);
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
            window.setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d4, mo49getActivity)));
        }
        C2MA m30 = m30();
        if (m30 != null) {
            if ((m30 instanceof C54850Lfq) && (c54850Lfq = (C54850Lfq) m30) != null) {
                c54850Lfq.LJJIJIIJIL(0);
            }
            AnonymousClass901 j3 = m30.j3();
            if (j3 != null) {
                j3.Y2(z);
                j3.e3(false);
            }
        }
        C44938HkM.LJ = Jl().getCurrentAweme();
        INearbyToFYPAssemAbility iNearbyToFYPAssemAbility = (INearbyToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), INearbyToFYPAssemAbility.class, null);
        if (iNearbyToFYPAssemAbility == null || !iNearbyToFYPAssemAbility.LJJLIIIJILLIZJL()) {
            return;
        }
        C2U8.LIZ(new C55026Lig(2, Jl().getCurrentAweme(), Jl(), Boolean.FALSE));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(mo49getActivity, null), this, INearbyFeedAbility.class, null);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPublishStatus(C43694HCw event) {
        o.LJIIIZ(event, "event");
        if (LQA.LIZIZ.LIZJ() && event.LJLIL == 9) {
            LJA.LIZIZ.set(false);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRegionChange(RoamingLocationInfo event) {
        o.LJIIIZ(event, "event");
        String str = Il().LJLJL;
        Il().LJLJL = event.getManualRegion();
        if (!event.isManual()) {
            Il().LJLJJLL = null;
        } else {
            Il().LJLJJLL = event.getManualRegion();
        }
        if (!o.LJ(str, event.getManualRegion())) {
            C212418Vh.LJIIJJI(Il(), new AqS175S0100000_9(this, 332));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C54045LIz.LIZ.getClass();
        if (C54045LIz.LIZIZ()) {
            INearbyCurrentRegionAbility iNearbyCurrentRegionAbility = (INearbyCurrentRegionAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), INearbyCurrentRegionAbility.class, null);
            if (iNearbyCurrentRegionAbility != null && iNearbyCurrentRegionAbility.Q5()) {
                LJ5.LJ(mo49getActivity);
            } else {
                LJ5.LJIIJJI(mo49getActivity);
            }
        }
    }

    @QD3
    public final void onVideoPublishEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        InterfaceC54049LJd LJIJ = LQA.LIZIZ.LJIJ();
        if (LJIJ != null && LJIJ.LIZLLL() && event.LJLIL == 15) {
            C90053g9.LIZIZ = true;
            Object obj = event.LJLILLLLZI;
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    Jl().LJLIIL(aweme, new AqS191S0100000_9(this, 56));
                }
                IPageStateAbility RP = RP();
                if (RP != null) {
                    RP.A9(true);
                }
            } else if (obj instanceof List) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                for (Aweme awemeItem : C65661Ppp.LIZJ((List) obj)) {
                    NearbyFeedFragmentPanel Jl = Jl();
                    o.LJIIIIZZ(awemeItem, "awemeItem");
                    Jl.LJLIIL(awemeItem, new AqS191S0100000_9(this, 57));
                }
            }
            LJA.LIZIZ.set(false);
            IPageStateAbility RP2 = RP();
            if (RP2 != null) {
                RP2.A9(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        INearbyContentAssemAbility iNearbyContentAssemAbility;
        if (!NearbyTabConfig.LJFF()) {
            IRefreshAbility YE = YE();
            if (YE != null) {
                YE.setRefreshing(true);
            }
            Jl().postDelayed(new ARunnableS45S0100000_9(this, 101), 1500L);
            return true;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (iNearbyContentAssemAbility = (INearbyContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), INearbyContentAssemAbility.class, null)) != null) {
            iNearbyContentAssemAbility.LJJJZ();
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
        LXV.LJIIJJI.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.FeedNearbyFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C40443Fu3.LIZ("homepage_nearby_launch").start();
        C1DH.LJJIJIIJIL(5000L, LXG.LJLIL);
        Il().LJLJLJ = "page_create";
        C54502LaE.LIZ("homepage_nearby");
        this.LJLJLLL = System.currentTimeMillis();
        View LIZLLL = C16970lZ.LIZLLL((Activity) getContext(), R.layout.bw8);
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
