package com.ss.android.ugc.aweme.journey.step.contentlanguage;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C35656Dz2;
import X.C35878E6g;
import X.C36222EJm;
import X.C3C5;
import X.C40751Fz1;
import X.C40765FzF;
import X.C40787Fzb;
import X.C40868G2e;
import X.C40870G2g;
import X.C40872G2i;
import X.C40889G2z;
import X.C68322mC;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C84763XOl;
import X.C90903hW;
import X.C9KF;
import X.EnumC40761FzB;
import X.FMX;
import X.FNP;
import X.G0D;
import X.G1X;
import X.G2E;
import X.G2G;
import X.G2H;
import X.G2I;
import X.G2J;
import X.HG3;
import X.InterfaceC18010nF;
import X.KL2;
import X.RBX;
import X.T16;
import X.V2B;
import Y.ACListenerS26S0100000_6;
import Y.ACListenerS32S0300000_6;
import Y.AfS55S0200000_6;
import Y.AfS58S0100000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class ContentLanguageComponent extends JourneyBaseFragment implements InterfaceC18010nF {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public String LJLLJ;
    public C73411SrX LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b1466";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public ContentLanguageComponent() {
        G2J g2j;
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID);
        if (LIZ != null) {
            g2j = LIZ.LJLJLJ;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        G2J g2j;
        G2J g2j2;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j3 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onResume();
        this.LJLLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 4));
        C12460eI.LJIIIIZZ(this, mo49getActivity());
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j3 = LIZ3.LJLJLJ;
        }
        G2E.LIZIZ(g2j3);
        G2E.LIZLLL(enumC40761FzB);
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLLL = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), C40868G2e.LJLIL).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 3));
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        G2J g2j;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onCreate(bundle);
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJJI;
        }
        G2E.LIZIZ(g2j2);
    }

    public final void Hl(String str, boolean z) {
        this.LJLL = (System.currentTimeMillis() - this.LJLJL) + this.LJLL;
        if (!z) {
            G2H g2h = G2H.CHOOSE_CONTENT_LANGUAGE_POPUP;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLLJ);
            c188727au.LJIIIZ("language_type", str);
            c188727au.LJIIIZ("presentation_type", "native");
            c188727au.LJ(this.LJLL, "stay_duration");
            Map<String, String> mobExitChooseContentLanguage$lambda$4 = c188727au.LIZ;
            o.LJIIIIZZ(mobExitChooseContentLanguage$lambda$4, "mobExitChooseContentLanguage$lambda$4");
            V2B.LJIJ(mobExitChooseContentLanguage$lambda$4);
            C36222EJm.LIZIZ(g2h, mobExitChooseContentLanguage$lambda$4);
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", this.LJLLJ);
        c188727au2.LJIIIZ("presentation_type", "native");
        c188727au2.LJ(this.LJLL, "duration");
        FMX.LJIIL("popup_duration", c188727au2.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [T, X.3kP] */
    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        G2J g2j;
        C40870G2g c40870G2g;
        Integer num;
        String str;
        G1X g1x;
        C40787Fzb c40787Fzb;
        o.LJIIIZ(view, "view");
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJLL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onViewCreated(view, bundle);
        this.LJLJLJ = new AqS172S0100000_6(this, 22);
        C35878E6g.LIZ();
        C35656Dz2 wl = wl();
        if ((wl instanceof C40787Fzb) && (c40787Fzb = (C40787Fzb) wl) != null) {
            c40870G2g = c40787Fzb.LIZIZ;
        } else {
            c40870G2g = null;
        }
        C35878E6g.LIZ();
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        G0D LIZ2 = C40751Fz1.LIZ();
        if (LIZ2 != null && (g1x = (G1X) LIZ2.LIZ(G1X.class)) != null) {
            num = Integer.valueOf(g1x.c60());
        } else {
            num = null;
        }
        c40765FzF.getClass();
        this.LJLLJ = C40765FzF.LIZIZ(num);
        if (c40870G2g == null) {
            vl(Boolean.TRUE);
        } else {
            ViewGroup.LayoutParams layoutParams = Dl().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LIZJ = marginLayoutParams.leftMargin - ((int) KL2.LIZJ(Dl().getContext(), 4.0f));
            marginLayoutParams.leftMargin = LIZJ;
            marginLayoutParams.rightMargin = LIZJ;
            C40889G2z c40889G2z = new C40889G2z(c40870G2g.LJLIL, new AqS172S0100000_6(this, 146), c40870G2g.LJLILLLLZI);
            RecyclerView Dl = Dl();
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.LLIILII = new C40872G2i(c40889G2z);
            Dl.setLayoutManager(gridLayoutManager);
            Dl().setAdapter(c40889G2z);
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String str2 = c40889G2z.LJLIL;
            if (str2 == null) {
                str2 = "";
            }
            c9kf.LIZJ = str2;
            c235119Kp.LIZJ = c9kf;
            c252709vu.setNavActions(c235119Kp);
            C16880lQ.LJIJI(Al(), new ACListenerS32S0300000_6(this, c40889G2z, c40870G2g, 1));
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.k2f), new ACListenerS26S0100000_6(this, 9));
            G2G.LIZIZ.LIZ();
            G2H g2h = G2H.SHOW_CONTENT_LANGUAGE_POPUP;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLLJ);
            if (((RBX) HG3.LJIILL()).isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_login", str);
            c188727au.LJIIIZ("presentation_type", "native");
            c188727au.LJ(System.currentTimeMillis() - this.LJLJL, "page_show_cost");
            Map<String, String> createContentLanguage$lambda$3 = c188727au.LIZ;
            o.LJIIIIZZ(createContentLanguage$lambda$3, "createContentLanguage$lambda$3");
            V2B.LJIJ(createContentLanguage$lambda$3);
            C36222EJm.LIZIZ(g2h, createContentLanguage$lambda$3);
        }
        FNP.LIZ(2350);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = AbstractC73638SvC.LJIJ(a.LJIJJ()).LJJIIJ(T16.LIZ()).LJJIIJZLJL().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0200000_6(this, c68322mC, 2));
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j2 = LIZ3.LJLJJLL;
        }
        G2E.LIZIZ(g2j2);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        G2J g2j;
        G2J g2j2;
        o.LJIIIZ(inflater, "inflater");
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        C29S c29s = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
