package com.ss.android.ugc.aweme.profile.effect;

import X.AMD;
import X.AML;
import X.AV1;
import X.AbstractC030309z;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C1JI;
import X.C221108m2;
import X.C25903AEp;
import X.C29S;
import X.C33675DJn;
import X.C3C5;
import X.C45804HyK;
import X.C53378KxC;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73174Sni;
import X.C73221SoT;
import X.C73223SoV;
import X.C73224SoW;
import X.C73225SoX;
import X.C73228Soa;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C90903hW;
import X.ES4;
import X.ESA;
import X.HG3;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.LCX;
import X.LFH;
import X.RBX;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import X.YFG;
import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S0200000_12;
import Y.IDcS10S0200000_12;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class EffectProfileListFragment extends ProfileListFragment implements InterfaceC151715xP, AMD<C25903AEp>, YFG {
    public static final /* synthetic */ int LJZ = 0;
    public final lifecycleAwareLazy LJLJJL;
    public C73228Soa LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C25903AEp LJLJJI = new C25903AEp();

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

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

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public EffectProfileListFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(EffectProfileListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 841);
        this.LJLJJL = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, C73221SoT.INSTANCE, 19));
        this.LJLL = true;
        this.LJLLL = -1;
        this.LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 839));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 840));
    }

    public final EffectProfileListViewModel Hl() {
        return (EffectProfileListViewModel) this.LJLJJL.getValue();
    }

    public final int Il() {
        return LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(2, 0);
    }

    @Override // X.OGG
    public final View LJIJJ() {
        return _$_findCachedViewById(R.id.j_w);
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        if (!isViewValid()) {
            this.LJLIL = true;
        } else if (this.LJLLI || this.LJLLILLLL || this.LJLLJ) {
            Ne();
        } else {
            Hl().refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
        if (isViewValid() && ((ViewGroup) _$_findCachedViewById(R.id.j_w)).getChildCount() > 0) {
            ((RecyclerView) _$_findCachedViewById(R.id.j_w)).LJLIL(0);
        }
    }

    @Override // X.YFG
    public final boolean LLLZI() {
        if (!isViewValid()) {
            return false;
        }
        ((RecyclerView) _$_findCachedViewById(R.id.j_w)).LJLI(0);
        Hl().refresh();
        return true;
    }

    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setStatus((C73306Spq) this.LJLLLL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        C73228Soa c73228Soa;
        if (!isViewValid() || (c73228Soa = this.LJLJJLL) == null) {
            return false;
        }
        o.LJI(c73228Soa);
        if (c73228Soa.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        User LIZIZ = AV1.LIZIZ();
        if (this.LJLJL && C53378KxC.LIZIZ()) {
            Boolean isFeatureVideoChanged = LIZIZ.getIsFeatureVideoChanged();
            o.LJIIIIZZ(isFeatureVideoChanged, "user.getIsFeatureVideoChanged()");
            if (isFeatureVideoChanged.booleanValue()) {
                Hl().refresh();
                LIZIZ.setIsFeatureVideoChanged(Boolean.FALSE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final int wl() {
        if (!isViewValid()) {
            return super.wl();
        }
        if (_$_findCachedViewById(R.id.kf_).getVisibility() == 0) {
            View status_view = _$_findCachedViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            return C1JI.LJIILIIL(status_view);
        }
        if (_$_findCachedViewById(R.id.j_w).getVisibility() == 0 && ((ViewGroup) _$_findCachedViewById(R.id.j_w)).getChildCount() > 0) {
            View childAt = ((ViewGroup) _$_findCachedViewById(R.id.j_w)).getChildAt(((ViewGroup) _$_findCachedViewById(R.id.j_w)).getChildCount() - 1);
            if (childAt == null) {
                return super.wl();
            }
            return C1JI.LJIILIIL(childAt);
        }
        return super.wl();
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return this.LJLL;
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void H5(boolean z) {
        this.LJLLI = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void K7(boolean z) {
        this.LJLLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Kh(boolean z) {
        this.LJLLILLLL = z;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_w);
        C0A2 c0a2 = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if ((c0a2 instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) c0a2) != null) {
            gridLayoutManager.LLJLIL(Il());
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j_w);
            if (recyclerView2 != null) {
                recyclerView2.LJJJJZI();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "5511392177828901685");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/effect/EffectProfileListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/effect/EffectProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z && this.LJLJL) {
            LLLZI();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            if (z && (C00F.LIZ(31744, 0, "ame_profile_page_entry_variant", true) == 1 || C00F.LIZ(31744, 0, "ame_profile_page_entry_variant", true) == 2)) {
                ESA.LIZ.getClass();
                if (ESA.LIZ() && ES4.LIZ() && !AV1.LJIIJJI() && ((RBX) HG3.LJIILL()).isLogin()) {
                    ViewStub viewStub = (ViewStub) mo49getActivity.findViewById(R.id.nby);
                    if (viewStub != null && viewStub.getParent() != null) {
                        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(mo49getActivity, 185), viewStub.inflate().findViewById(R.id.bys));
                    } else {
                        View findViewById = mo49getActivity.findViewById(R.id.bys);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                        }
                    }
                }
            }
            View findViewById2 = mo49getActivity.findViewById(R.id.bys);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/effect/EffectProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C73228Soa c73228Soa;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLJL = arguments.getBoolean("is_me", false);
            this.LJLJLJ = arguments.getString("user_id");
            this.LJLJLLL = arguments.getString("sec_user_id");
            EffectProfileListViewModel Hl = Hl();
            boolean z = this.LJLJL;
            String str = this.LJLJLJ;
            Hl.LJLJLLL = z;
            Hl.LJLL = str;
            this.LJLLL = arguments.getInt("bottom_bar_height", -1);
        }
        if (this.LJLJLLL != null) {
            c73228Soa = new C73228Soa(this, this.LJLJL);
        } else {
            c73228Soa = null;
        }
        this.LJLJJLL = c73228Soa;
        getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(Il(), 1, false);
        C73228Soa c73228Soa2 = this.LJLJJLL;
        if (c73228Soa2 != null) {
            c73228Soa2.setLoadMoreListener(new C73174Sni(Hl()));
            wrapGridLayoutManager.LLIILII = new IDcS10S0200000_12(c73228Soa2, this, 4);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_w);
        recyclerView.setAdapter(this.LJLJJLL);
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        recyclerView.LJII(new AbstractC030309z() { // from class: X.4DQ
            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view2, RecyclerView parent, C0AC state) {
                C1BU c1bu;
                GridLayoutManager gridLayoutManager;
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view2, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (!(layoutParams instanceof C1BU) || (c1bu = (C1BU) layoutParams) == null) {
                    return;
                }
                C0A2 layoutManager = parent.getLayoutManager();
                if (!(layoutManager instanceof WrapGridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                    return;
                }
                if (c1bu.LJLIL % gridLayoutManager.LLIIIL != 0) {
                    if (C90193gN.LIZIZ(view2.getContext())) {
                        outRect.right = C17N.LJIILL(0.5d);
                    } else {
                        outRect.left = C17N.LJIILL(0.5d);
                    }
                } else if (C90193gN.LIZIZ(view2.getContext())) {
                    outRect.left = C17N.LJIILL(0.5d);
                } else {
                    outRect.right = C17N.LJIILL(0.5d);
                }
                outRect.bottom = C17N.LJIILL(1.0d);
            }
        }, -1);
        recyclerView.setItemAnimator(null);
        int i = this.LJLLL;
        if (i > 0) {
            recyclerView.setPadding(0, 0, 0, i);
        }
        ListViewModel.Mv0(Hl(), this, this.LJLJJLL, new C73224SoW(new AqS178S0100000_12(this, 686), new AqS194S0100000_12(this, 264), LCX.INSTANCE), new C73223SoV(new AqS178S0100000_12(this, 687), new AqS194S0100000_12(this, 265), new AqS194S0100000_12(this, 266)), 240);
        C73156SnQ.LJIIIIZZ(this, Hl(), new TBT() { // from class: X.RrB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EffectProfileState) obj).getSubstate();
            }
        }, new AqS194S0100000_12(this, 263));
        if (this.LJLIL) {
            Hl().refresh();
        }
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LIZIZ(new C73225SoX(this));
        if (!C53378KxC.LIZIZ() || !this.LJLJL || !C53378KxC.LIZIZ() || !C33675DJn.LIZ.getBoolean("FEATURE_VIDEO_TAB", true)) {
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.d5q);
        viewStub.inflate();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.mnb);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.f0h);
        C45804HyK.LJJLIIIJ(UserLevelGeckoUpdateSetting.DEFAULT, _$_findCachedViewById(R.id.j_w));
        C16880lQ.LJJJ(tuxIconView, new ACListenerS46S0200000_12(viewStub, this, 57));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS46S0200000_12(viewStub, this, 58));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ye(String str, String str2) {
        if (!TextUtils.equals(this.LJLJLJ, str) && !TextUtils.equals(this.LJLJLLL, str2)) {
            this.LJLL = true;
        }
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
        try {
            EffectProfileListViewModel Hl = Hl();
            boolean z = this.LJLJL;
            String str3 = this.LJLJLJ;
            Hl.LJLJLLL = z;
            Hl.LJLL = str3;
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c40, viewGroup, false);
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

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
