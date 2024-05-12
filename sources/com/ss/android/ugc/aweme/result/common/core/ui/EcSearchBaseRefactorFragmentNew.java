package com.ss.android.ugc.aweme.result.common.core.ui;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C50321Joz;
import X.C50431Jql;
import X.C50438Jqs;
import X.C50583JtD;
import X.C50585JtF;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50865Jxl;
import X.C51214K8c;
import X.C56412MCa;
import X.C65300Pk0;
import X.C76800UCe;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC51505KJh;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KE0;
import X.KEA;
import X.KEP;
import X.KES;
import X.KEU;
import X.KEW;
import X.KEZ;
import X.KFQ;
import X.KFY;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class EcSearchBaseRefactorFragmentNew extends SearchVisibilityDetectFragmentNew implements KPL, InterfaceC51505KJh, KEU {
    public KE0 LJLL;
    public KEP LJLLI;
    public final Gson LJLLILLLL;
    public C50865Jxl LJLLJ;
    public KFQ LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final boolean LJLZ;
    public SearchResultParam LJZ;
    public int LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();

    public void Il(KFY kfy) {
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJZL;
        Integer valueOf = Integer.valueOf(R.id.ck3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ck3)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
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

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object vl() {
        return null;
    }

    public EcSearchBaseRefactorFragmentNew() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLLILLLL = LIZ;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJLZ = true;
    }

    @Override // X.KEU
    public final void LLZZJLIL() {
        C50652JuK.Companion.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(this);
        if (LJFF != null) {
            LJFF.setLastShowingPageIndex(this.LJZI);
        }
        C50431Jql LJFF2 = C50651JuJ.LJFF(this);
        if (LJFF2 != null) {
            LJFF2.setSearchLastShowPageIndex(this.LJZI);
        }
        C17N.LJJJJJL(this).j4(new KEZ(this.LJZI));
        SearchResultParam searchResultParam = this.LJZ;
        if (searchResultParam == null) {
            return;
        }
        searchResultParam.setIndex(this.LJZI);
    }

    public void refreshData() {
        KFQ kfq = this.LJLLL;
        if (kfq != null) {
            kfq.LIZLLL = System.currentTimeMillis();
        }
        KEP kep = this.LJLLI;
        if (kep != null) {
            kep.LJII(mo49getActivity());
        }
    }

    public final void Kl() {
        if (isViewValid() && getUserVisibleHint() && this.LJLLLLLL && this.LJLLLL) {
            refreshData();
            this.LJLLLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        KEW LIZJ;
        super.onDestroyView();
        C50865Jxl c50865Jxl = this.LJLLJ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c50865Jxl != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
        }
        KEP kep = this.LJLLI;
        if (kep != null && (LIZJ = kep.LIZJ()) != null) {
            LIZJ.LIZIZ(this);
        }
        KFQ kfq = this.LJLLL;
        if (kfq != null) {
            kfq.LJ("search_exit");
        }
        _$_clearFindViewByIdCache();
    }

    @Override // X.KEU
    public final void Z0() {
        Kl();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LJLZ;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int xl() {
        return this.LJZI;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Dl(int i) {
        String str;
        KEA LIZIZ;
        this.LJZI = i;
        this.LJLJJI.setTabIndex(i);
        C50321Joz c50321Joz = this.LJLJJI;
        KEP kep = this.LJLLI;
        if (kep == null || (LIZIZ = kep.LIZIZ()) == null || (str = LIZIZ.LJ(i)) == null) {
            str = "";
        }
        c50321Joz.setSearchPosition(str);
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Gl(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        this.LJLLLL = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable("search_key", searchResultParam);
                return;
            }
            return;
        }
        this.LJZ = searchResultParam;
        Kl();
    }

    public final void Jl(boolean z) {
        int i;
        this.LJLJJI.setFragmentVisible(z);
        C17N.LJJJJJL(this).j4(new C50583JtD(z));
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("active", i);
            if (z) {
                jSONObject.put("from_search_subtab", C51214K8c.LJ(C17N.LJJJJJL(this).Te().LIZJ().LJLILLLLZI));
            }
            C50865Jxl c50865Jxl = this.LJLLJ;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("changePageActive", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        KEA LIZIZ;
        super.onActivityCreated(bundle);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(mo49getActivity);
        if (LJIIJ == null) {
            return;
        }
        C50651JuJ.LIZ(this, C50652JuK.copy$default(LJIIJ, null, C50438Jqs.copy$default(LJIIJ.getMutableData(), this.LJLJJI, null, 2, null), 1, null));
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL(this);
        int i = this.LJZI;
        KEP kep = this.LJLLI;
        if (kep == null || (LIZIZ = kep.LIZIZ()) == null || (str = LIZIZ.LJ(this.LJZI)) == null) {
            str = "";
        }
        LJJJJJL.j4(new C50585JtF(i, str));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        KEP kep;
        KEW LIZJ;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            this.LJZ = (SearchResultParam) serializable;
        }
        KEP kep2 = this.LJLLI;
        if (kep2 != null) {
            kep2.LJFF(this, mo49getActivity(), this);
        }
        if (mo49getActivity() != null && (kep = this.LJLLI) != null && (LIZJ = kep.LIZJ()) != null) {
            LIZJ.LIZ(this.LJZI, this);
        }
        this.LJLJLJ.add(new KES(this));
        this.LJLLL = new KFQ(this.LJLL, this.LJLLI, this.LJZI);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8150769235465014573");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/EcSearchBaseRefactorFragmentNew", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/EcSearchBaseRefactorFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        KFQ kfq = this.LJLLL;
        if (kfq != null) {
            kfq.LJII = z;
        }
        KEP kep = this.LJLLI;
        if (kep != null) {
            kep.LJI(z, this);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/EcSearchBaseRefactorFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        if (r3 == false) goto L15;
     */
    @Override // X.KEU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Me(java.lang.Integer r2, boolean r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            boolean r0 = r1.LJLLLLLL
            if (r0 != 0) goto L1b
            if (r3 == 0) goto L1d
            r0 = 1
            r1.LJLLLLLL = r0
            boolean r0 = r1.LJLLLL
            if (r0 == 0) goto L13
            r1.Kl()
        L13:
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto L1a
            r1.Jl(r3)
        L1a:
            return
        L1b:
            if (r3 != 0) goto L13
        L1d:
            r0 = 0
            r1.LJLLLLLL = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew.Me(java.lang.Integer, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C50865Jxl c50865Jxl = new C50865Jxl(requireContext, this);
        this.LJLLJ = c50865Jxl;
        ViewGroup dynamic_fragment = (ViewGroup) _$_findCachedViewById(R.id.ck3);
        o.LJIIIIZZ(dynamic_fragment, "dynamic_fragment");
        c50865Jxl.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), dynamic_fragment);
        _$_findCachedViewById(R.id.ck3).setVisibility(0);
        C50865Jxl c50865Jxl2 = this.LJLLJ;
        if (c50865Jxl2 == null) {
            return;
        }
        Il(c50865Jxl2);
        KEP kep = this.LJLLI;
        if (kep != null) {
            kep.LJ(this);
        }
        Kl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), R.layout.aor, viewGroup, false);
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