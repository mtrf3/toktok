package com.ss.android.ugc.aweme.setting.ui.beta;

import X.AEP;
import X.AG2;
import X.AIO;
import X.AIP;
import X.ActivityC45651qj;
import X.C025908h;
import X.C110614Vt;
import X.C113554cx;
import X.C16360ka;
import X.C16700l8;
import X.C16720lA;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C251929ue;
import X.C252709vu;
import X.C25851ACp;
import X.C26338AVi;
import X.C32151Nz;
import X.C61328O5c;
import X.C78897Uxp;
import X.C79045V0n;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.SY4;
import X.SY9;
import X.SYL;
import X.UPJ;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class BetaTesterInfoPage extends BasePage {
    public static final String LJLJJLL;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final Keva LJLJI = Keva.getRepo("beta_testing");
    public final Map<String, String> LJLJJI = C113554cx.LJJL(new OSZ("PH", "https://activity.tiktok.com/magic/eco/runtime/release/64f714b80e765003d607ed78?appType=tiktok&magic_page_no=1&use_spark=1"), new OSZ("MY", "https://activity.tiktok.com/magic/eco/runtime/release/64f717812600830acc9b2e45?appType=tiktok&magic_page_no=1&use_spark=1"), new OSZ("ID", "https://activity.tiktok.com/magic/eco/runtime/release/64f719fa0e765003d607ed86?appType=tiktok&magic_page_no=1&use_spark=1"), new OSZ("TH", "https://activity.tiktok.com/magic/eco/runtime/release/64f71b771b7428076200de49?appType=tiktok&magic_page_no=1&use_spark=1"));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cjv;
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feedback_");
        LIZ.append(EF7.LJI());
        LIZ.append('_');
        LJLJJLL = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = requireActivity().getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C16720lA.LIZ(window, false);
        } else {
            C16700l8.LIZ(window, false);
        }
        window.setStatusBarColor(0);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16360ka.LJIJJ(view.findViewById(R.id.n_p), AIP.LIZ);
        ((TuxTextView) view.findViewById(R.id.title)).LJJJ(32.0f);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(70));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e_q);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_tiktok_beta;
        c2068389v.LIZIZ = LJJIIZ;
        c2068389v.LIZJ = LJJIIZ;
        SY9 LIZJ = C025908h.LIZJ(view, "view.context", c2068389v);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d4);
        c110614Vt.LIZJ = C61328O5c.LIZJ(18);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        tuxIconView.setImageDrawable(C26338AVi.LJIIJ(LIZJ, c110614Vt.LIZ(context)));
        SY4 vInstall = (SY4) view.findViewById(R.id.aiu);
        SY4 vFeedback = (SY4) view.findViewById(R.id.d6s);
        int i = 8;
        float LJIIZILJ = C32151Nz.LJIIZILJ(8);
        o.LJIIIIZZ(vFeedback, "vFeedback");
        C78897Uxp.LJJJJJL(vFeedback, LJIIZILJ);
        vFeedback.setVisibility(0);
        Al(vFeedback, this.LJLJI.getBoolean(LJLJJLL, false), LJIIZILJ);
        C16880lQ.LJJIZ(vFeedback, new AIO(view, this, vFeedback, LJIIZILJ));
        o.LJIIIIZZ(vInstall, "vInstall");
        C78897Uxp.LJJJJJL(vInstall, LJIIZILJ);
        C16880lQ.LJJIZ(vInstall, new ACListenerS24S0100000_4(this, 180));
        Al(vInstall, false, LJIIZILJ);
        if (BetaAppExperiment.LJII) {
            i = 0;
        }
        vInstall.setVisibility(i);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
        c252709vu.LJIILJJIL(false);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 817));
        c235119Kp.LIZLLL(LIZJ2);
        c235119Kp.LIZJ(0);
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZLLL = C19N.LIZIZ(view, "view.context", R.attr.go);
        c2068389v2.LIZ = R.raw.icon_question_mark_circle_ltr;
        c234529Ii.LIZ(c2068389v2);
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 818));
        c235119Kp.LIZIZ(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
        View findViewById = view.findViewById(R.id.i04);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.power_list)");
        C25851ACp c25851ACp = new C25851ACp((SYL) findViewById);
        String string = getString(R.string.c6z);
        C2068389v LIZ = C251929ue.LIZ(string, "getString(R.string.beta_…pp_betaSettingsPage_btn2)");
        LIZ.LIZLLL = C19N.LIZIZ(view, "view.context", R.attr.gp);
        LIZ.LIZ = R.raw.icon_pen_on_doc_fill;
        c25851ACp.LIZ(new AG2(new AEP(string, LIZ, new ACListenerS24S0100000_4(this, 179), "learn_more", false, 8388592)));
        c25851ACp.LIZLLL();
        C188727au c188727au = new C188727au();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("enter_tiktok_beta_page", c188727au.LIZ);
    }

    public final void Al(SY4 sy4, boolean z, float f) {
        if (z) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = Float.valueOf(f);
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            sy4.setBackground(c110614Vt.LIZ(requireActivity));
            Context context = sy4.getContext();
            o.LJIIIIZZ(context, "button.context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            if (LJI != null) {
                sy4.setTextColor(LJI.intValue());
                return;
            }
            return;
        }
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt2.LIZJ = Float.valueOf(f);
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        sy4.setBackground(c110614Vt2.LIZ(requireActivity2));
        Context context2 = sy4.getContext();
        o.LJIIIIZZ(context2, "button.context");
        Integer LJI2 = C79045V0n.LJI(R.attr.dj, context2);
        if (LJI2 == null) {
            return;
        }
        sy4.setTextColor(LJI2.intValue());
    }
}
