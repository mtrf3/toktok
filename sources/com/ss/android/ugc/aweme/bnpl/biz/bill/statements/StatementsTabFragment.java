package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

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
import X.C74053T4n;
import X.C76800UCe;
import X.C90903hW;
import X.C91924a2S;
import X.C92172a6S;
import X.C92217a7B;
import X.C92349a9J;
import X.C92569aCr;
import X.C92570aCs;
import X.C92571aCt;
import X.C92572aCu;
import X.C92573aCv;
import X.C9KF;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.QD3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class StatementsTabFragment extends BaseFragment implements JBS {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    public StatementsTabFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C92569aCr.LJLIL, "statements_tab", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C92570aCs.LJLIL, "is_from_push", Boolean.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C92571aCt.LJLIL, "no_animation", Boolean.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, C92573aCv.LJLIL, "previous_page_id", String.class);
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        if (o.LJ(this.LJLILLLLZI.getValue(), Boolean.TRUE)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//bnpl/bill/homepage");
            buildRoute.withParam("no_animation", false);
            buildRoute.withParam("previous_page_id", "bnpl_all_statements");
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C92572aCu.LJLIL);
        Boolean bool = (Boolean) this.LJLJI.getValue();
        if (bool != null) {
            activityConfiguration(new IDqS2S0010000_31(bool.booleanValue(), 2));
        }
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S.LIZ.LIZIZ("bnpl_all_statements", (String) this.LJLJJI.getValue());
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
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 103));
        C9KF c9kf = new C9KF();
        String string = getString(R.string.jna);
        o.LJIIIIZZ(string, "getString(R.string.pipo_bill_list_title)");
        c9kf.LIZJ = string;
        C234529Ii c234529Ii2 = new C234529Ii();
        c234529Ii2.LIZJ();
        c234529Ii2.LIZJ = R.raw.icon_headset;
        c234529Ii2.LIZIZ(new IDqS422S0100000_31(this, 102));
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(c234529Ii2);
        c235119Kp.LIZLLL = false;
        ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavActions(c235119Kp);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.do);
        Context context = getContext();
        String str = (String) this.LJLJJI.getValue();
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        viewPager.setAdapter(new C92349a9J(context, childFragmentManager, str));
        C74053T4n bnpl_bill_statements_tabbar = (C74053T4n) _$_findCachedViewById(R.id.dn);
        o.LJIIIIZZ(bnpl_bill_statements_tabbar, "bnpl_bill_statements_tabbar");
        C74053T4n.LJIILJJIL(bnpl_bill_statements_tabbar, (ViewPager) _$_findCachedViewById(R.id.do));
        ((ViewPager) _$_findCachedViewById(R.id.do)).setCurrentItem(o.LJ(this.LJLIL.getValue(), "paid") ? 1 : 0);
        ((ViewPager) _$_findCachedViewById(R.id.do)).addOnPageChangeListener(new C92172a6S(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a6, viewGroup, false);
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
