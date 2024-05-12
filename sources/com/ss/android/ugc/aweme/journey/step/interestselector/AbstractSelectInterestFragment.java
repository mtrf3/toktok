package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C0A6;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C34122DaI;
import X.C35656Dz2;
import X.C35878E6g;
import X.C36222EJm;
import X.C39032FTo;
import X.C39352FcS;
import X.C3C5;
import X.C40741Fyr;
import X.C40751Fz1;
import X.C40765FzF;
import X.C40788Fzc;
import X.C40865G2b;
import X.C56662Kg;
import X.C5H3;
import X.C62822Ol8;
import X.C68322mC;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C78920UyC;
import X.C84763XOl;
import X.C90903hW;
import X.E6T;
import X.EAV;
import X.EnumC221088m0;
import X.EnumC40761FzB;
import X.FNP;
import X.G0D;
import X.G1X;
import X.G2E;
import X.G2H;
import X.G2I;
import X.G2J;
import X.G2O;
import X.G2Q;
import X.InterfaceC18010nF;
import X.T16;
import X.V2B;
import X.X1D;
import Y.ACListenerS41S0200000_6;
import Y.AfS55S0200000_6;
import Y.AfS58S0100000_6;
import Y.IDhS99S0100000_6;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public abstract class AbstractSelectInterestFragment extends NUJComponentFragment implements InterfaceC18010nF {
    public C40865G2b LJLJJLL;
    public long LJLJLLL;
    public boolean LJLL;
    public C73411SrX LJLLI;
    public RecyclerView LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public String LJLLLL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public boolean LJLJJL = true;
    public long LJLJL = SystemClock.elapsedRealtime();
    public long LJLJLJ = SystemClock.elapsedRealtime();
    public int LJLLLLLL = 1;
    public final G2Q LJLZ = new G2Q(this);
    public final AqS172S0100000_6 LJZ = new AqS172S0100000_6(this, 23);
    public final C5H3 LJZI = C221108m2.LIZ(EnumC221088m0.NONE, C39352FcS.LJLIL);
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(EAV.LJLIL);

    public abstract C0A6 Hl();

    public abstract String Il();

    public abstract void Jl(int i, String str, String str2);

    public abstract C39032FTo Kl();

    public abstract void Ll(boolean z);

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LL;
        Integer valueOf = Integer.valueOf(R.id.j9c);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.j9c)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC18010nF
    public abstract /* synthetic */ String getBtmPageCode();

    public abstract int getLayout();

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public void Al() {
        Boolean bool;
        C40788Fzc c40788Fzc;
        List<TopicInterestCategoryStruct> list;
        Keva.getRepo("new_user_journey").storeLong("last_show_interest_select_time", System.currentTimeMillis());
        boolean z = Keva.getRepo("new_user_journey").getBoolean("is_first_seen_on_install", true);
        G2H g2h = G2H.SHOW_INTEREST_SELECTION;
        String str = this.LJLLLL;
        if (str != null) {
            C188727au LIZJ = C78920UyC.LIZJ(this.LJLJJL ? 1 : 0, "is_default_interests_list");
            LIZJ.LJIIIZ("enter_from", str);
            Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
            if (LIZIZ != null) {
                LIZJ.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            LIZJ.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
            LIZJ.LJIIIZ("user_type", (String) this.LJZI.getValue());
            LIZJ.LJ(SystemClock.elapsedRealtime() - this.LJLJLJ, "page_show_cost");
            LIZJ.LJIIIZ("selection_type", Il());
            LIZJ.LIZLLL(z ? 1 : 0, "is_first_seen_on_install");
            LIZJ.LIZLLL(AccountService.LJIJ().LJFF().isLogin() ? 1 : 0, "is_login");
            C36222EJm.LIZ(LIZJ);
            Map<String, String> createInterestSelect$lambda$3 = LIZJ.LIZ;
            o.LJIIIIZZ(createInterestSelect$lambda$3, "createInterestSelect$lambda$3");
            V2B.LJIJ(createInterestSelect$lambda$3);
            C36222EJm.LIZIZ(g2h, createInterestSelect$lambda$3);
            boolean booleanValue = ((Boolean) C34122DaI.LIZ.getValue()).booleanValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hybrid_uneven_test_experiment_interest_select get value:");
            LIZ.append(booleanValue);
            C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ));
            Keva.getRepo("new_user_journey").storeBoolean("is_first_seen_on_install", false);
            Keva.getRepo("new_user_journey").storeBoolean("last_show_interest_select_time", false);
            C35656Dz2 wl = wl();
            if ((wl instanceof C40788Fzc) && (c40788Fzc = (C40788Fzc) wl) != null && (list = c40788Fzc.LJ) != null) {
                bool = Boolean.valueOf(!list.isEmpty());
            } else {
                bool = null;
            }
            C16880lQ.LJIJI(Dl(), new ACListenerS41S0200000_6(this, bool, 2));
            TextView textView = this.LJLLL;
            if (textView != null) {
                C16880lQ.LJIJI(textView, new ACListenerS41S0200000_6(this, bool, 3));
                return;
            } else {
                o.LJIJI("finalSkip");
                throw null;
            }
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    public final TextView Dl() {
        TextView textView = this.LJLLJ;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("finalNext");
        throw null;
    }

    public final RecyclerView Gl() {
        RecyclerView recyclerView = this.LJLLILLLL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("infoListView");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LJLJLLL = (SystemClock.elapsedRealtime() - this.LJLJL) + this.LJLJLLL;
        if (!this.LJLL) {
            C39032FTo Kl = Kl();
            Jl(Kl.LIZJ, "background", Kl.LIZIZ);
        }
        super.onStop();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLLI = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), G2O.LJLIL).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 5));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLLI = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 6));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLJL = elapsedRealtime;
        this.LJLJLJ = elapsedRealtime;
        C12460eI.LJIIIIZZ(this, mo49getActivity());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.3kP] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C40788Fzc c40788Fzc;
        G1X g1x;
        o.LJIIIZ(view, "view");
        C56662Kg.LIZ().LIZJ("interest_fragment_viewcreated", false);
        super.onViewCreated(view, bundle);
        FNP.LIZ(2330);
        RecyclerView rv = (RecyclerView) _$_findCachedViewById(R.id.j9c);
        o.LJIIIIZZ(rv, "rv");
        this.LJLLILLLL = rv;
        Integer num = null;
        Gl().setItemAnimator(null);
        C35878E6g.LIZ();
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        G0D LIZ = C40751Fz1.LIZ();
        if (LIZ != null && (g1x = (G1X) LIZ.LIZ(G1X.class)) != null) {
            num = Integer.valueOf(g1x.c60());
        }
        c40765FzF.getClass();
        String LIZIZ = C40765FzF.LIZIZ(num);
        o.LJIIIZ(LIZIZ, "<set-?>");
        this.LJLLLL = LIZIZ;
        C35656Dz2 wl = wl();
        if ((wl instanceof C40788Fzc) && (c40788Fzc = (C40788Fzc) wl) != null) {
            this.LJLJJL = c40788Fzc.LIZIZ;
            this.LJLJJLL = c40788Fzc.LIZJ;
        }
        Al();
        Ll(false);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = AbstractC73638SvC.LJIJ(a.LJIJJ()).LJJIIJ(T16.LIZ()).LJJIIJZLJL().LJJLIIIIJ(new IDhS99S0100000_6(this, 0)).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0200000_6(this, c68322mC, 3));
        Gl().LJIIJJI(Hl());
        C56662Kg.LIZ().LJFF("interest_fragment_viewcreated", false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        G2J g2j;
        G2J g2j2;
        o.LJIIIZ(inflater, "inflater");
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_INTERESTS_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        C29S c29s = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        C56662Kg.LIZ().LJFF("interest_slogan_viewcreated_to_interest_fragment_create", false);
        C56662Kg.LIZ().LIZJ("interest_fragment_createview", false);
        G2H g2h = G2H.INTEREST_SELECTION_DID_LOAD;
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
        c188727au.LJIIIZ("vid", (String) this.LJZL.getValue());
        Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …d)\n            .builder()");
        C36222EJm.LIZIZ(g2h, map);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, getLayout(), viewGroup, false);
        C56662Kg.LIZ().LJFF("interest_fragment_createview", false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onCreateView view:");
        LIZ2.append(LLLLIILL);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j2 = LIZ3.LJLJJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
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
}
