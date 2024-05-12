package com.ss.android.ugc.aweme.bnpl.biz.bill.detail;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C39647FhD;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.C91924a2S;
import X.C92213a77;
import X.C92217a7B;
import X.C92528aCC;
import X.C92529aCD;
import X.C92530aCE;
import X.C92531aCF;
import X.C92532aCG;
import X.C92533aCH;
import X.C9KF;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.QD3;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class DetailsFragment extends BaseFragment implements JBS {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public DetailsFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C92529aCD.LJLIL, "bill_month", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C92528aCC.LJLIL, "bill_id", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C92533aCH.LJLIL, "previous_page_id", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, C92530aCE.LJLIL, "is_from_push", Boolean.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, C92531aCF.LJLIL, "no_animation", Boolean.class);
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        if (o.LJ(this.LJLJJI.getValue(), Boolean.TRUE)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//bnpl/bill/homepage");
            buildRoute.withParam("no_animation", true);
            buildRoute.withParam("previous_page_id", "bnpl_statement_details");
            buildRoute.open();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        JBR.LIZIZ(this);
    }

    public final C92213a77 vl() {
        String str = (String) this.LJLIL.getValue();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) this.LJLILLLLZI.getValue();
        if (str3 != null) {
            str2 = str3;
        }
        return new C92213a77(str, str2, (String) this.LJLJI.getValue());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C92532aCG.LJLIL);
        Boolean bool = (Boolean) this.LJLJJL.getValue();
        if (bool != null) {
            activityConfiguration(new IDqS2S0010000_31(bool.booleanValue(), 0));
        }
        C91924a2S.LIZ.LIZIZ("bnpl_statement_details", (String) this.LJLJI.getValue());
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C92213a77 vl = vl();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 74));
        C234529Ii c234529Ii2 = new C234529Ii();
        c234529Ii2.LIZJ();
        c234529Ii2.LIZJ = R.raw.icon_headset;
        c234529Ii2.LIZIZ(new IDqS422S0100000_31(this, 73));
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZIZ(c234529Ii2);
        c235119Kp.LIZLLL = false;
        C9KF c9kf = new C9KF();
        c9kf.LIZIZ = "billDetailTitleTag";
        String string = getString(R.string.jpa);
        o.LJIIIIZZ(string, "getString(R.string.pipo_common_statement_details)");
        if (vl().LJLIL.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(vl().LJLIL);
            LIZ.append(' ');
            LIZ.append(string);
            c9kf.LIZ(X1D.LIZIZ(LIZ));
        } else {
            c9kf.LIZJ = string;
        }
        c235119Kp.LIZJ = c9kf;
        ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavActions(c235119Kp);
        C8VV.LIZ(this, false, new IDqS174S0200000_31(this, vl, 4));
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0, viewGroup, false);
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
