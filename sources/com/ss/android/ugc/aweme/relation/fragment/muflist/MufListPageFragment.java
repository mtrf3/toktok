package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.AbstractC57781Mm1;
import X.AbstractC58014Mpm;
import X.ActivityC45651qj;
import X.C06F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C1B3;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C25770A9m;
import X.C25771A9n;
import X.C26420AYm;
import X.C29S;
import X.C32151Nz;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C40443Fu3;
import X.C45621qg;
import X.C53299Kvv;
import X.C56412MCa;
import X.C57792MmC;
import X.C57800MmK;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57887Mnj;
import X.C57930MoQ;
import X.C57934MoU;
import X.C58035Mq7;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C72444Sbw;
import X.C72450Sc2;
import X.C72451Sc3;
import X.C72452Sc4;
import X.C72459ScB;
import X.C72460ScC;
import X.C72472ScO;
import X.C72502Scs;
import X.C73305Spp;
import X.C76800UCe;
import X.C77266UUc;
import X.C78926UyI;
import X.C80217Ve1;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C94293mz;
import X.C99W;
import X.C9BD;
import X.C9BE;
import X.EnumC51135K5b;
import X.EnumC72483ScZ;
import X.GAR;
import X.GEI;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC57784Mm4;
import X.InterfaceC72447Sbz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K5T;
import X.KPL;
import X.L03;
import X.MG5;
import X.MGN;
import X.MZ7;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SI3;
import X.SIT;
import X.SYL;
import X.SYS;
import X.SZZ;
import X.T5T;
import X.TBT;
import X.TBW;
import Y.ACListenerS32S0100000_12;
import Y.AObserverS80S0100000_12;
import Y.ARunnableS9S1300000_12;
import Y.IDObjectS183S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS55S0400000_9;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MufListPageFragment extends BaseFragment implements KPL {
    public static final Gson LJZ = GsonHolder.LIZLLL().LIZ();
    public AbstractC58014Mpm LJLJJLL;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final C214298b3 LJLLLL;
    public long LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 883));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 884));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 881));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 886));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 539));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 882));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C58035Mq7.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 540));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C72451Sc3.LJLIL);
    public boolean LJLLI = true;
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C72452Sc4.LJLIL);

    public final void Al() {
        vl(true);
        ((K5T) _$_findCachedViewById(R.id.je_)).setSearchBarHeight(EnumC51135K5b.HIGH);
        T5T editTextView = ((K5T) _$_findCachedViewById(R.id.je_)).getEditTextView();
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-searchHintText>(...)");
        editTextView.setHint((String) value);
        if (C99W.LIZ) {
            ((K5T) _$_findCachedViewById(R.id.je_)).setEditBackgroundRadius(C32151Nz.LJIIZILJ(6));
        }
        ((K5T) _$_findCachedViewById(R.id.je_)).setOnClickClearListener(new ACListenerS32S0100000_12(this, 78));
        ((K5T) _$_findCachedViewById(R.id.je_)).getEditTextView().addTextChangedListener(new IDObjectS183S0100000_12(this, 2));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MufListPageFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MufListPageViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 885);
        C72450Sc2 c72450Sc2 = C72450Sc2.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72450Sc2, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72450Sc2, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLLL = c214298b3;
    }

    public final C72444Sbw Dl() {
        return (C72444Sbw) this.LJLJL.getValue();
    }

    public final EnumC72483ScZ Gl() {
        return (EnumC72483ScZ) this.LJLIL.getValue();
    }

    public final MufListPageViewModel Hl() {
        return (MufListPageViewModel) this.LJLLLL.getValue();
    }

    public final void Jl() {
        InterfaceC88472Yns<SZZ, C76800UCe> interfaceC88472Yns;
        Lifecycle lifecycle;
        List<SIT> allChunks = ((SYL) _$_findCachedViewById(R.id.i04)).getAllChunks();
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJJLL;
        if (abstractC58014Mpm != null) {
            if (allChunks.contains(abstractC58014Mpm)) {
                SYL syl = (SYL) _$_findCachedViewById(R.id.i04);
                AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJJLL;
                if (abstractC58014Mpm2 != null) {
                    PowerAdapter powerAdapter = syl.LLLF;
                    powerAdapter.getClass();
                    PowerStub LJFF = abstractC58014Mpm2.LJFF();
                    ((ArrayList) powerAdapter.LJLJI).remove(LJFF);
                    ((HashMap) powerAdapter.LJLJL).remove(LJFF);
                    abstractC58014Mpm2.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                    ((MZ7) LJFF.LJLLI.getValue()).LIZ.removeObserver(LJFF);
                    LifecycleOwner lifecycleOwner = LJFF.LJLZ;
                    if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.removeObserver(LJFF);
                    }
                    LJFF.LJLZ = null;
                    PowerPageLoader<?> powerPageLoader = powerAdapter.LJLJLJ;
                    if (powerPageLoader != null && o.LJ(powerPageLoader.LJLJLJ, abstractC58014Mpm2.LJFF())) {
                        SYS sys = powerPageLoader.LJLLL;
                        if (sys != null && (interfaceC88472Yns = sys.LJLJI) != null) {
                            interfaceC88472Yns.invoke(SZZ.LJLJI);
                        }
                        PowerPageLoader<?> powerPageLoader2 = powerAdapter.LJLJLJ;
                        if (powerPageLoader2 != null) {
                            powerPageLoader2.onDestroy();
                        }
                        powerAdapter.LJLJLJ = null;
                    }
                    powerAdapter.LLIILZL(new SI3(false, powerAdapter, false));
                    return;
                }
                o.LJIJI("mafListChunk");
                throw null;
            }
            return;
        }
        o.LJIJI("mafListChunk");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC72447Sbz iv0 = Hl().iv0();
        if (iv0 != null) {
            iv0.k0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLLI) {
            this.LJLLI = false;
            refresh();
        }
        Hl().gv0();
        InterfaceC72447Sbz iv0 = Hl().iv0();
        if (iv0 != null) {
            iv0.qy();
        }
    }

    public final void refresh() {
        this.LJLLLLLL = System.currentTimeMillis();
        Dl().LJLJJL.LJFF();
        MufListPageViewModel Hl = Hl();
        Hl.setState(C72460ScC.LJLIL);
        ((PowerPageSource) Hl.LJLJJL.getValue()).getOperator().refresh();
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJJLL;
        if (abstractC58014Mpm != null) {
            ((C57934MoU) abstractC58014Mpm).LJLJLJ(false);
        } else {
            o.LJIJI("mafListChunk");
            throw null;
        }
    }

    public final void wl() {
        FragmentManager supportFragmentManager;
        ((C45621qg) _$_findCachedViewById(R.id.bv4)).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
        if (!this.LJLLILLLL) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null || (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) == null) {
                return;
            }
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LIZIZ(R.id.dpa, (Fragment) this.LJLJLJ.getValue());
            c1b3.LJIILJJIL();
            this.LJLLILLLL = true;
        }
        _$_findCachedViewById(R.id.dpa).setVisibility(0);
    }

    public final void xl() {
        _$_findCachedViewById(R.id.dpa).setVisibility(8);
        ((C45621qg) _$_findCachedViewById(R.id.bv4)).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        if (C53299Kvv.LIZJ()) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setLayoutVariant(0);
        }
        MGN mgn = MGN.LJLILLLLZI;
        C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        o.LJIIIIZZ(status_view, "status_view");
        mgn.setStatusView(status_view, (MG5) this.LJLJLLL.getValue(), new AqS162S0100000_12(this, 880), (Exception) null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MufListPageViewModel Hl = Hl();
        EnumC72483ScZ scene = Gl();
        MufPageTrackInfo mufPageTrackInfo = (MufPageTrackInfo) this.LJLJJI.getValue();
        Hl.getClass();
        o.LJIIIZ(scene, "scene");
        Hl.setState(new AqS116S0300000_12(scene, mufPageTrackInfo, Hl, 42));
        ((ArrayList) C57800MmK.LIZ).clear();
        fragmentConfiguration(GEI.LJLIL);
    }

    public final void vl(boolean z) {
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.a6m).getLayoutParams();
        int i = 0;
        if (z) {
            layoutParams.height = -2;
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.fu7).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            C06F c06f = (C06F) layoutParams2;
            c06f.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            _$_findCachedViewById(R.id.fu7).setLayoutParams(c06f);
        } else {
            layoutParams.height = 0;
            ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R.id.fu7).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            C06F c06f2 = (C06F) layoutParams3;
            c06f2.LIZIZ(null);
            _$_findCachedViewById(R.id.fu7).setLayoutParams(c06f2);
        }
        _$_findCachedViewById(R.id.a6m).setLayoutParams(layoutParams);
        C80217Ve1 c80217Ve1 = (C80217Ve1) _$_findCachedViewById(R.id.a6m);
        if (!z) {
            i = 8;
        }
        c80217Ve1.setVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object LIZJ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((SYL) _$_findCachedViewById(R.id.i04)).LJLJJL(Dl());
        MufListPageViewModel Hl = Hl();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "personal_homepage";
        }
        Hl.getClass();
        Hl.LJLIL = str;
        InterfaceC72447Sbz iv0 = Hl().iv0();
        if (iv0 != null) {
            RecyclerView power_list = (RecyclerView) _$_findCachedViewById(R.id.i04);
            o.LJIIIIZZ(power_list, "power_list");
            iv0.lp(power_list);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = "";
        C68322mC c68322mC4 = new C68322mC();
        c68322mC4.element = "";
        Object value = this.LJLJI.getValue();
        if (o.LJ(value, "new_followers_page")) {
            c68322mC.element = "notification_page";
            c68322mC2.element = "new_followers";
            c68322mC3.element = "click_friends_list";
            c68322mC4.element = "notification_page";
        } else if (o.LJ(value, "relation_tab")) {
            c68322mC.element = "friends_list";
            c68322mC4.element = this.LJLILLLLZI.getValue();
        } else {
            c68322mC.element = "MUF-LIST Fragment<unknown>";
        }
        C57858MnG c57858MnG = new C57858MnG(null, this, 1);
        c57858MnG.LIZ(new AqS175S0100000_9(this, 519));
        c57858MnG.LIZJ(new AqS55S0400000_9(c68322mC, (C68322mC<String>) c68322mC2, (C68322mC<String>) c68322mC3, (C68322mC<String>) c68322mC4, (C68322mC<String>) 5));
        c57858MnG.LIZLLL(C26420AYm.LJLIL);
        c57858MnG.LIZIZ(C57887Mnj.LJLIL);
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
        C57867MnP c57867MnP = c57858MnG.LIZLLL;
        if (c57867MnP.LIZLLL == -1) {
            int i = c57858MnG.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c57867MnP.LIZLLL = i;
        }
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
            LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
            LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
            LIZJ = LIZ.LIZ(c57859MnH);
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
            LIZJ = LIZ.LIZJ(c57859MnH);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (LIZJ != null) {
            AbstractC58014Mpm abstractC58014Mpm = (AbstractC58014Mpm) LIZJ;
            this.LJLJJLL = abstractC58014Mpm;
            ((C57934MoU) abstractC58014Mpm).LJIILL(null);
            AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJJLL;
            if (abstractC58014Mpm2 != null) {
                ((C57934MoU) abstractC58014Mpm2).W7(new C72459ScB(this));
                ((SYL) _$_findCachedViewById(R.id.jgc)).LLLF.LJZL(MufSearchCell.class);
                ((RecyclerView) _$_findCachedViewById(R.id.jgc)).setItemAnimator(null);
                C8YN.LJIIJ(this, Hl(), new TBT() { // from class: X.Sc8
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJJLL;
                    }
                }, new TBT() { // from class: X.ScN
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJL;
                    }
                }, C213688a4.LJ(), new IDqS436S0100000_12(this, 35), 8);
                getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment$initSearchModule$4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_RESUME) {
                            KeyboardUtils.LIZ(MufListPageFragment.this.getViewLifecycleOwner(), MufListPageFragment.this.getView(), new C72502Scs(MufListPageFragment.this));
                        }
                    }
                });
                MufListPageViewModel Hl2 = Hl();
                Hl2.getClass();
                AssemViewModel.selectSubscribe$default(Hl2, new TBT() { // from class: X.ScI
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJJI;
                    }
                }, C213688a4.LJ(), null, null, new AqS178S0100000_12(Hl2, 661), 12, null);
                AssemViewModel.selectSubscribe$default(Hl2, new TBT() { // from class: X.Sc6
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJLJ;
                    }
                }, C213688a4.LJ(), null, null, new AqS178S0100000_12(Hl2, 662), 12, null);
                AssemViewModel.selectSubscribe$default(Hl2, new TBT() { // from class: X.ScG
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJJL;
                    }
                }, C213688a4.LJ(), null, null, new AqS178S0100000_12(Hl2, 663), 12, null);
                C8YN.LJII(this, Hl(), new TBT() { // from class: X.ScH
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJJI;
                    }
                }, C213688a4.LJ(), new AqS194S0100000_12(this, 256), 4);
                C8YN.LJII(this, Hl(), new TBT() { // from class: X.Sc5
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJLLL;
                    }
                }, C213688a4.LJ(), new AqS194S0100000_12(this, 257), 4);
                C8YN.LJII(this, Hl(), new TBT() { // from class: X.Sc7
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C72457Sc9) obj).LJLJI;
                    }
                }, C213688a4.LJ(), new AqS194S0100000_12(this, 258), 4);
                C77266UUc c77266UUc = C77266UUc.LIZIZ;
                c77266UUc.getRelationService().LJ().observe(this, new AObserverS80S0100000_12(this, 115));
                c77266UUc.getRelationService().LJFF().observe(this, new AObserverS80S0100000_12(this, 116));
                if (L03.LIZ() && o.LJ(this.LJLJI.getValue(), "new_followers_page")) {
                    C40443Fu3.LIZ("inbox_follower_page_friends_list").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.i04));
                    return;
                }
                return;
            }
            o.LJIJI("mafListChunk");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    public final void Il(Integer num, Integer num2, String str) {
        Object obj;
        C72444Sbw Dl = Dl();
        synchronized (Dl) {
            if (str != null) {
                Iterator it = ((ArrayList) Dl.LJLJJL.LJII()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                        if ((interfaceC57784Mm4 instanceof C57792MmC) && o.LJ(((C57792MmC) interfaceC57784Mm4).LJLIL.getUid(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) obj;
                if (interfaceC57784Mm42 != null) {
                    Dl.LJLJJL.LJIIL(interfaceC57784Mm42);
                }
                if (((ArrayList) Dl.LJLJJL.LJII()).isEmpty()) {
                    Dl.LJLJJL.LIZJ(new C72472ScO());
                }
            }
        }
        MufListPageViewModel Hl = Hl();
        Hl.getClass();
        if (str == null) {
            return;
        }
        ((ExecutorService) GAR.LIZ.getValue()).execute(new ARunnableS9S1300000_12(Hl, num, num2, str, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axu, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
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
