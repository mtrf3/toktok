package com.ss.android.ugc.aweme.journey.step.lynx;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C31968Cge;
import X.C35878E6g;
import X.C36222EJm;
import X.C3C5;
import X.C40751Fz1;
import X.C40765FzF;
import X.C40879G2p;
import X.C60322Nlu;
import X.C68322mC;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C84763XOl;
import X.C90903hW;
import X.EnumC40761FzB;
import X.FMX;
import X.G0D;
import X.G1X;
import X.G2H;
import X.G2N;
import X.G2P;
import X.HG3;
import X.InterfaceC31964Cga;
import X.InterfaceC40806Fzu;
import X.QD3;
import X.RBX;
import X.T16;
import X.V2B;
import X.VNS;
import Y.AfS55S0200000_6;
import Y.AfS58S0100000_6;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes7.dex */
public final class LynxExperienceFragment extends NUJComponentFragment {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public long LJLJJLL;
    public C73411SrX LJLJL;
    public String LJLJLJ;
    public C73411SrX LJLJLLL;
    public C31968Cge LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public long LJLJJL = System.currentTimeMillis();

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    public static C31968Cge Al() {
        InterfaceC40806Fzu interfaceC40806Fzu;
        C35878E6g.LIZ();
        G0D LIZ = C40751Fz1.LIZ();
        if (LIZ != null && (interfaceC40806Fzu = (InterfaceC40806Fzu) LIZ.LIZ(InterfaceC40806Fzu.class)) != null) {
            return interfaceC40806Fzu.R4();
        }
        return null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC31964Cga interfaceC31964Cga;
        InterfaceC31964Cga interfaceC31964Cga2;
        super.onDestroy();
        C31968Cge c31968Cge = this.LJLL;
        if (c31968Cge != null && (interfaceC31964Cga2 = c31968Cge.LIZIZ) != null) {
            interfaceC31964Cga2.destroy();
        }
        C31968Cge Al = Al();
        if (Al != null && (interfaceC31964Cga = Al.LIZIZ) != null) {
            interfaceC31964Cga.destroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJLLL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        EventBus.LIZJ().LJIJ(this);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLJJLL = (System.currentTimeMillis() - this.LJLJJL) + this.LJLJJLL;
        this.LJLJL = (C73411SrX) C84763XOl.LJFF().LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 7));
        this.LJLJLLL = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), G2N.LJLIL).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 8));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLJJL = System.currentTimeMillis();
        this.LJLJLLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 9));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(G2P event) {
        o.LJIIIZ(event, "event");
        Dl(event.LJLIL, false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C40879G2p event) {
        o.LJIIIZ(event, "event");
        vl(Boolean.TRUE);
    }

    public final void Dl(String str, boolean z) {
        this.LJLJJLL = (System.currentTimeMillis() - this.LJLJJL) + this.LJLJJLL;
        if (!z) {
            G2H g2h = G2H.CHOOSE_CONTENT_LANGUAGE_POPUP;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLJLJ);
            c188727au.LJIIIZ("language_type", str);
            c188727au.LJIIIZ("type", "lynx");
            c188727au.LJ(this.LJLJJLL, "stay_time");
            Map<String, String> mobExitChooseContentLanguage$lambda$2 = c188727au.LIZ;
            o.LJIIIIZZ(mobExitChooseContentLanguage$lambda$2, "mobExitChooseContentLanguage$lambda$2");
            V2B.LJIJ(mobExitChooseContentLanguage$lambda$2);
            C36222EJm.LIZIZ(g2h, mobExitChooseContentLanguage$lambda$2);
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", this.LJLJLJ);
        c188727au2.LJIIIZ("type", "lynx");
        c188727au2.LJ(this.LJLJJLL, "duration");
        FMX.LJIIL("popup_duration", c188727au2.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.3kP] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Application application;
        Integer num;
        VNS vns;
        String str;
        String str2;
        InterfaceC40806Fzu interfaceC40806Fzu;
        InterfaceC40806Fzu interfaceC40806Fzu2;
        WeakReference<VNS> v80;
        String str3;
        InterfaceC40806Fzu interfaceC40806Fzu3;
        G1X g1x;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        VNS vns2 = null;
        if (mo49getActivity != null && (application = mo49getActivity.getApplication()) != null) {
            C60322Nlu.LIZ(application);
            C35878E6g.LIZ();
            C40765FzF c40765FzF = EnumC40761FzB.Companion;
            G0D LIZ = C40751Fz1.LIZ();
            if (LIZ != null && (g1x = (G1X) LIZ.LIZ(G1X.class)) != null) {
                num = Integer.valueOf(g1x.c60());
            } else {
                num = null;
            }
            c40765FzF.getClass();
            this.LJLJLJ = C40765FzF.LIZIZ(num);
            C31968Cge Al = Al();
            if (Al != null && o.LJ(Al.LIZJ, Boolean.FALSE)) {
                C35878E6g.LIZ();
                G0D LIZ2 = C40751Fz1.LIZ();
                if (LIZ2 != null && (interfaceC40806Fzu3 = (InterfaceC40806Fzu) LIZ2.LIZ(InterfaceC40806Fzu.class)) != null) {
                    str3 = interfaceC40806Fzu3.a7();
                } else {
                    str3 = null;
                }
                if (o.LJ(str3, "lynx_v1")) {
                    vl(Boolean.FALSE);
                    return;
                }
            }
            C35878E6g.LIZ();
            G0D LIZ3 = C40751Fz1.LIZ();
            if (LIZ3 != null && (interfaceC40806Fzu2 = (InterfaceC40806Fzu) LIZ3.LIZ(InterfaceC40806Fzu.class)) != null && (v80 = interfaceC40806Fzu2.v80()) != null) {
                vns = v80.get();
            } else {
                vns = null;
            }
            if (vns == null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "new_user_journey");
                FMX.LJIIL("lynx_content_language_creator_null", c188727au.LIZ);
                C35878E6g.LIZ();
                G0D LIZ4 = C40751Fz1.LIZ();
                if (LIZ4 != null && (interfaceC40806Fzu = (InterfaceC40806Fzu) LIZ4.LIZ(InterfaceC40806Fzu.class)) != null) {
                    str2 = interfaceC40806Fzu.a7();
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, "lynx_v2")) {
                    if (Al() == null) {
                        this.LJLL = new C31968Cge(getContext());
                        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bs8);
                        C31968Cge c31968Cge = this.LJLL;
                        if (c31968Cge != null) {
                            vns2 = c31968Cge.LIZIZ();
                        }
                        viewGroup.addView(vns2);
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.bs8);
                        C31968Cge Al2 = Al();
                        if (Al2 != null) {
                            vns2 = Al2.LIZIZ();
                        }
                        viewGroup2.addView(vns2);
                    }
                } else {
                    vl(Boolean.FALSE);
                }
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "new_user_journey");
                FMX.LJIIL("lynx_content_language_preload_success", c188727au2.LIZ);
                ((ViewGroup) view.findViewById(R.id.bs8)).addView(vns);
            }
            G2H g2h = G2H.SHOW_CONTENT_LANGUAGE_POPUP;
            C188727au c188727au3 = new C188727au();
            c188727au3.LJIIIZ("enter_from", this.LJLJLJ);
            if (((RBX) HG3.LJIILL()).isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au3.LJIIIZ("is_login", str);
            c188727au3.LJ(System.currentTimeMillis() - this.LJLJJL, "page_show_cost");
            Map<String, String> onViewCreated$lambda$1 = c188727au3.LIZ;
            o.LJIIIIZZ(onViewCreated$lambda$1, "onViewCreated$lambda$1");
            V2B.LJIJ(onViewCreated$lambda$1);
            C36222EJm.LIZIZ(g2h, onViewCreated$lambda$1);
        } else {
            vl(Boolean.FALSE);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = AbstractC73638SvC.LJIJ(a.LJIJJ()).LJJIIJ(T16.LIZ()).LJJIIJZLJL().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0200000_6(this, c68322mC, 4));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.beu, viewGroup, false);
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
}
