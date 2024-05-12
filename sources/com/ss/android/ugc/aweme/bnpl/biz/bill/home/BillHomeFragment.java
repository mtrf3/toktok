package com.ss.android.ugc.aweme.bnpl.biz.bill.home;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C32151Nz;
import X.C39647FhD;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.C91816a0i;
import X.C91891a1v;
import X.C91924a2S;
import X.C91930a2Y;
import X.C92208a72;
import X.C92217a7B;
import X.C92539aCN;
import X.C92540aCO;
import X.C92541aCP;
import X.C92542aCQ;
import X.EF7;
import X.InterfaceC61213O0r;
import X.KL2;
import X.O6R;
import X.QD3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.bnpl.utils.BillHomeArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class BillHomeFragment extends BaseFragment {
    public static final int LJLJJL;
    public static final int LJLJJLL;
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    static {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(52));
        LJLJJL = LJJIIZ;
        LJLJJLL = LJJIIZ;
    }

    public BillHomeFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C92539aCN.LJLIL, "no_animation", Boolean.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C92541aCP.LJLIL, "previous_page_id", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C92542aCQ.LJLIL, "report_landing_cost_time", Boolean.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C91891a1v.LIZLLL = 0;
        try {
            EventBus.LIZJ().LJIJ(this);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C92540aCO.LJLIL);
        Boolean noAnimation = new BillHomeArg((Boolean) this.LJLIL.getValue(), (String) this.LJLILLLLZI.getValue(), (Boolean) this.LJLJI.getValue()).getNoAnimation();
        if (noAnimation != null) {
            activityConfiguration(new IDqS2S0010000_31(noAnimation.booleanValue(), 1));
        }
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S.LIZ.LIZIZ("bnpl_account_home", (String) this.LJLILLLLZI.getValue());
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
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 12));
        Context LIZIZ = EF7.LIZIZ();
        _$_findCachedViewById(R.id.c4).getLayoutParams().height = KL2.LJIIL(LIZIZ);
        _$_findCachedViewById(R.id.i7).getLayoutParams().height = KL2.LJIIL(LIZIZ) + LJLJJL;
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 84));
        c234529Ii.LIZIZ = "billHomeBackTag";
        C234529Ii c234529Ii2 = new C234529Ii();
        c234529Ii2.LIZJ();
        c234529Ii2.LIZJ = R.raw.icon_headset;
        c234529Ii2.LIZIZ = "billHomeHelpTag";
        C234529Ii c234529Ii3 = new C234529Ii();
        c234529Ii3.LIZJ();
        c234529Ii3.LIZJ = R.raw.icon_gear;
        c234529Ii3.LIZIZ = "billHomeSettingTag";
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.hs);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZIZ(c234529Ii2, c234529Ii3);
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        C252709vu bnpl_title_layout = (C252709vu) _$_findCachedViewById(R.id.hs);
        o.LJIIIIZZ(bnpl_title_layout, "bnpl_title_layout");
        C91930a2Y.LIZ(bnpl_title_layout, getContext(), true);
        ((C91816a0i) _$_findCachedViewById(R.id.cq)).setOnScrollListener(new C92208a72(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.x, viewGroup, false);
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
