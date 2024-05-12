package com.ss.android.ugc.aweme.journey.step.slogan;

import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C35828E4i;
import X.C35845E4z;
import X.C35878E6g;
import X.C36222EJm;
import X.C3C5;
import X.C40751Fz1;
import X.C56662Kg;
import X.C5H3;
import X.C76800UCe;
import X.C84763XOl;
import X.C88547Yp5;
import X.C90903hW;
import X.E59;
import X.E5B;
import X.E6T;
import X.EnumC221088m0;
import X.EnumC35839E4t;
import X.EnumC40761FzB;
import X.FNP;
import X.G08;
import X.G0D;
import X.G2D;
import X.G2E;
import X.G2F;
import X.G2H;
import X.G2I;
import X.G2J;
import X.InterfaceC18010nF;
import X.V2B;
import Y.ARunnableS8S0000100_6;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import defpackage.s1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class SloganFragment extends NUJComponentFragment implements InterfaceC18010nF {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public long LJLJJLL = SystemClock.elapsedRealtime();
    public final C5H3 LJLJL = C221108m2.LIZ(EnumC221088m0.NONE, G2D.LJLIL);

    public void Al() {
    }

    public abstract View Dl(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b87967";
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLJJLL = SystemClock.elapsedRealtime();
        C12460eI.LJIIIIZZ(this, mo49getActivity());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C84763XOl.LJIIJJI) {
            IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get()\n                .g…LoginService::class.java)");
            if (!createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false)) {
                Gl(Boolean.TRUE);
            }
        }
    }

    public final void Gl(Boolean bool) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_type", (String) this.LJLJL.getValue());
        c188727au.LIZLLL(o.LJ(bool, Boolean.TRUE) ? 1 : 0, "is_background");
        c188727au.LJ(SystemClock.elapsedRealtime() - this.LJLJJLL, "duration");
        if (C88547Yp5.LIZIZ.LJJII()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("if_send_fake_feed", str);
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        C36222EJm.LIZ(c188727au);
        G2H g2h = G2H.EXIT_SLOGAN_PAGE;
        Map<String, String> mobExitSlogan$lambda$4 = c188727au.LIZ;
        o.LJIIIIZZ(mobExitSlogan$lambda$4, "mobExitSlogan$lambda$4");
        V2B.LJIJ(mobExitSlogan$lambda$4);
        C36222EJm.LIZIZ(g2h, mobExitSlogan$lambda$4);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        G2J g2j;
        int i;
        G08 g08;
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_SLOGAN_ID);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onCreate(bundle);
        this.LJLJJLL = SystemClock.elapsedRealtime();
        AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(this, 101);
        C35878E6g.LIZ();
        G0D LIZ2 = C40751Fz1.LIZ();
        if (LIZ2 != null && (g08 = (G08) LIZ2.LIZ(G08.class)) != null) {
            g08.zz(aqS156S0100000_6);
            g08.Fn0(SystemClock.elapsedRealtime());
        }
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        G2H g2h = G2H.SHOW_SLOGAN_PAGE;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_type", (String) this.LJLJL.getValue());
        c188727au.LIZLLL(i, "is_ab_backend_resp_received");
        c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        C36222EJm.LIZ(c188727au);
        Map<String, String> onCreate$lambda$1 = c188727au.LIZ;
        o.LJIIIIZZ(onCreate$lambda$1, "onCreate$lambda$1");
        V2B.LJIJ(onCreate$lambda$1);
        C36222EJm.LIZIZ(g2h, onCreate$lambda$1);
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            Set<String> set = G2F.LIZ;
            String str = G2F.LIZIZ;
            if (set.contains(str)) {
                G2F.LIZ(G2F.LJ, "client_local_experiment_exposed_android");
            }
            if (set.contains(str)) {
                G2F.LIZ(G2F.LJ, "client_local_flag_experiment_exposed_android");
            }
            G2F.LIZIZ("hybrid_ab_experiment_exposed_app_launch_android");
            G2F.LIZIZ("client_general_experiment_exposed_app_launch_android");
            G2F.LIZIZ("absdk_experiment_exposed_app_launch_android");
            Iterator<Long> it = G2F.LIZJ.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS8S0000100_6(longValue, 8), longValue);
            }
        }
        G2I LIZ3 = G2E.LIZ(EnumC40761FzB.JOURNEY_SLOGAN_ID);
        if (LIZ3 != null) {
            g2j2 = LIZ3.LJLJJI;
        }
        G2E.LIZIZ(g2j2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FNP.LIZ(2100);
        C56662Kg.LIZ().LIZJ("interest_slogan_fragment_viewcreated", false);
        E5B.LIZJ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveFirstPluginData(EnumC35839E4t.REVERSE_NUJ_DATA, C35828E4i.LJLIL);
        C35845E4z c35845E4z = new C35845E4z();
        E59.LIZIZ = c35845E4z;
        PluginService.createIPluginServicebyMonsterPlugin(false).observeInitialLaunchRequestResult(this, c35845E4z);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        G2J g2j;
        G2J g2j2;
        o.LJIIIZ(inflater, "inflater");
        C56662Kg.LIZ().LJFF("interest_window_focus_changed_to_slogan_fragment", false);
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SLOGAN_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        C29S c29s = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        C56662Kg.LIZ().LIZJ("interest_slogan_fragment_creaetview", false);
        View Dl = Dl(inflater, viewGroup);
        C56662Kg.LIZ().LJFF("interest_slogan_fragment_creaetview", false);
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        if (!(Dl instanceof View)) {
            Dl = null;
        }
        if (Dl != null) {
            try {
                ViewTreeLifecycleOwner.set(Dl, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Dl, this);
                C10A.LIZIZ(Dl, this);
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
        return Dl;
    }
}
