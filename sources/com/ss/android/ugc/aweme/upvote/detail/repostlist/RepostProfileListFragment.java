package com.ss.android.ugc.aweme.upvote.detail.repostlist;

import X.ActivityC45651qj;
import X.AnonymousClass781;
import X.AnonymousClass784;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1808677y;
import X.C1808777z;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C55230Lly;
import X.C55247LmF;
import X.C56412MCa;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC87073YFh;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RepostProfileListFragment extends ProfileListFragment implements KPL, InterfaceC87073YFh {
    public static final /* synthetic */ int LJLLI = 0;
    public View LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJLJ;
    public final C214378bB LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLJL = true;

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
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

    @Override // X.InterfaceC87073YFh
    public final void m4(MiniUser miniUser) {
    }

    @Override // X.InterfaceC87073YFh
    public final void onScrollEnd() {
    }

    public RepostProfileListFragment() {
        AqS60S0110000_3 LJJ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1180);
        C65776Prg LIZ = C65352Pkq.LIZ(RepostListViewModel.class);
        C1808777z c1808777z = C1808777z.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJLLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c1808777z, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    public final RepostListViewModel Hl() {
        return (RepostListViewModel) this.LJLJLLL.getValue();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.ixj));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.ixj)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.ixj), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // X.InterfaceC87073YFh
    public final void LJ() {
        if (isViewValid()) {
            Hl().setState(C1808677y.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
        RepostListViewModel Hl = Hl();
        Hl.getClass();
        Hl.setStateImmediate(new AqS28S0001000_3(22));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        if (!isViewValid()) {
            return false;
        }
        return Hl().isDataEmpty();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return this.LJLJL;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        isViewValid();
    }

    @Override // X.InterfaceC87073YFh
    public final void E5(String feedId) {
        o.LJIIIZ(feedId, "feedId");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("enter_from");
        } else {
            str = null;
        }
        this.LJLJLJ = str;
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        String str2 = this.LJLJLJ;
        if (str2 == null) {
            str2 = "";
        }
        C55247LmF.LIZIZ(LIZJ, new AnonymousClass781(str2), AnonymousClass781.class, "source_default_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8944562190791201441");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/upvote/detail/repostlist/RepostProfileListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/upvote/detail/repostlist/RepostProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (!isViewValid()) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/upvote/detail/repostlist/RepostProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        if (z) {
            RepostListViewModel Hl = Hl();
            Hl.getClass();
            Hl.setStateImmediate(new AqS28S0001000_3(22));
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/upvote/detail/repostlist/RepostProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = view.findViewById(R.id.ixl);
        if ((o.LJ(this.LJLJLJ, "others_homepage") || AnonymousClass784.LIZ()) && (view2 = this.LJLJJI) != null) {
            view2.setVisibility(8);
        }
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 527));
        RepostListViewModel Hl = Hl();
        String str = this.LJLJJL;
        if (str == null) {
            str = "";
        }
        Hl.getClass();
        Hl.LJLILLLLZI = str;
        C8YN.LJII(this, Hl(), new TBT() { // from class: X.77x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                AnonymousClass783 anonymousClass783 = (AnonymousClass783) obj;
                anonymousClass783.getClass();
                return C208708Ha.LIZ(anonymousClass783);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 112), 4);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ye(String str, String str2) {
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        if (!TextUtils.equals(str, str) && !TextUtils.equals(this.LJLJJLL, str2)) {
            this.LJLJL = true;
        }
        if (isViewValid()) {
            RepostListViewModel Hl = Hl();
            if (str == null) {
                str = "";
            }
            Hl.getClass();
            Hl.LJLILLLLZI = str;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dr9, viewGroup, false);
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
