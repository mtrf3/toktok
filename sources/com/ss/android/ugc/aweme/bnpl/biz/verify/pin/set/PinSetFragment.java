package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C26227ARb;
import X.C29S;
import X.C39647FhD;
import X.C3AW;
import X.C3C5;
import X.C5H3;
import X.C68322mC;
import X.C76800UCe;
import X.C77123UOp;
import X.C8VV;
import X.C90903hW;
import X.C91924a2S;
import X.C92058a4c;
import X.C92217a7B;
import X.C92620aDg;
import X.EnumC92072a4q;
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
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS30S0300000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class PinSetFragment extends BaseFragment implements JBS {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final PinSetRouteArg vl() {
        return (PinSetRouteArg) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JBS
    public final void onBackPressed_Activity() {
        String str;
        int i;
        int i2;
        PinSetRouteArg vl = vl();
        if (vl != null) {
            PinSetRouteArg vl2 = vl();
            if (vl2 == null || (str = vl2.getPreviousPageId()) == null) {
                str = "";
            }
            String str2 = "quit_pin_set";
            C92058a4c.LJ("bnpl_pin_set", str, "{1,continue; 2,discard_changes}", "quit_pin_set");
            EnumC92072a4q pinSetMode = vl.getPinSetMode();
            EnumC92072a4q enumC92072a4q = EnumC92072a4q.REGISTER;
            if (pinSetMode == enumC92072a4q) {
                i = R.string.jsb;
            } else {
                i = R.string.jsf;
            }
            String string = getString(i);
            o.LJIIIIZZ(string, "getString(if (it.pinSetM…_wallet_set_pin_retrieve)");
            if (vl.getPinSetMode() == enumC92072a4q) {
                i2 = R.string.jsc;
            } else {
                i2 = R.string.jsg;
            }
            String string2 = getString(i2);
            o.LJIIIIZZ(string2, "getString(if (it.pinSetM…set_pin_retrieve_message)");
            Context context = getContext();
            if (context != null) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = "quit_pin_set";
                PinSetRouteArg vl3 = vl();
                if (vl3 != null) {
                    T t = str2;
                    if (vl3.getPinSetMode() != enumC92072a4q) {
                        t = "quit_pin_change";
                    }
                    c68322mC.element = t;
                }
                C26227ARb LIZ = C3AW.LIZ(context);
                LIZ.LJFF(string);
                LIZ.LIZIZ(string2);
                LIZ.LJII = false;
                C77123UOp.LJIILL(LIZ, new IDqS30S0300000_31(this, (PinSetFragment) vl, (PinSetRouteArg) c68322mC, (C68322mC<String>) 0));
                LIZ.LJI().LIZLLL();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        fragmentConfiguration(C92620aDg.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S c91924a2S = C91924a2S.LIZ;
        PinSetRouteArg vl = vl();
        if (vl != null) {
            str = vl.getPreviousPageId();
        } else {
            str = null;
        }
        c91924a2S.LIZIZ("bnpl_pin_set", str);
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
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 38));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ak, viewGroup, false);
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
