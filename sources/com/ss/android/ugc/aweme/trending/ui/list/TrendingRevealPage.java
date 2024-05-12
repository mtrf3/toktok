package com.ss.android.ugc.aweme.trending.ui.list;

import X.A7I;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C188727au;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C78496UrM;
import X.C90903hW;
import X.FMX;
import X.InterfaceC60761Nsz;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.MB3;
import X.O6R;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ql1.IDbS494S0100000_4;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class TrendingRevealPage extends Fragment implements JBS {
    public InterfaceC60761Nsz LJLIL;
    public int LJLILLLLZI;
    public C252709vu LJLJI;
    public long LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLJJL = RouteArgExtension.INSTANCE.requiredArg(this, A7I.LJLIL, "trending_entrance", String.class);

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJI(true);
        }
        if (this.LJLJJI > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
            String str = (String) this.LJLJJL.getValue();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            c188727au.LJIIIZ("trending_entrance", str);
            c188727au.LJ(currentTimeMillis, "inflow_stay_duration");
            FMX.LJIIL("show_about_trending", c188727au.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZLLL(R.color.ey);
        LIZIZ.LJI(R.color.ey);
        LIZIZ.LIZ(true);
        LIZIZ.LIZJ();
        this.LJLJJI = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        int identifier;
        Resources resources2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LJ = Integer.valueOf(R.attr.cl);
        View findViewById = view.findViewById(R.id.gwg);
        C252709vu c252709vu = (C252709vu) findViewById;
        int i = 0;
        c252709vu.LJIILJJIL(false);
        c252709vu.setNavBackground(0);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 893));
        c235119Kp.LIZLLL(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxNav…,\n            )\n        }");
        this.LJLJI = (C252709vu) findViewById;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (identifier = resources.getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            Context context2 = getContext();
            if (context2 != null && (resources2 = context2.getResources()) != null) {
                i = resources2.getDimensionPixelSize(identifier);
            }
            C252709vu c252709vu2 = this.LJLJI;
            if (c252709vu2 != null) {
                C26338AVi.LJI(c252709vu2, 0, Integer.valueOf(i), 0, 0, false, 16);
            } else {
                o.LJIJI("navBar");
                throw null;
            }
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIFFI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)) + i, "navHeight");
        sparkContext.LJJIJLIJ("aweme://lynxview/?hide_nav_bar=1&channel=trends_transparency&bundle=pages%2Ftrends_transparency%2Ftemplate.js&dynamic=1&group=trends_transparency");
        sparkContext.LJJI(new IDbS494S0100000_4(this, 1));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.spark_container);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(requireContext, sparkContext));
        LIZ.LJIIJJI(sparkContext);
        LIZ.LIZIZ();
        viewGroup.addView(LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ctu, viewGroup, false, "inflater.inflate(R.layou…reveal, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
