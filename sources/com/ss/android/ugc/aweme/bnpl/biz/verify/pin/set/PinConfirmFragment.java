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
import X.C76800UCe;
import X.C77123UOp;
import X.C8VV;
import X.C90903hW;
import X.C92058a4c;
import X.C92217a7B;
import X.C92617aDd;
import X.C92618aDe;
import X.EnumC92072a4q;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.QD3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class PinConfirmFragment extends BaseFragment implements JBS {
    public EnumC92072a4q LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

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

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        String str;
        String str2;
        int i;
        int i2;
        EnumC92072a4q enumC92072a4q = this.LJLIL;
        if (enumC92072a4q != null) {
            EnumC92072a4q enumC92072a4q2 = EnumC92072a4q.REGISTER;
            if (enumC92072a4q == enumC92072a4q2) {
                str = "quit_pin_set";
            } else {
                str = "quit_pin_change";
            }
            Bundle arguments = getArguments();
            if (arguments == null || (str2 = arguments.getString("previous_page_id")) == null) {
                str2 = "";
            }
            C92058a4c.LJ("bnpl_pin_set", str2, "{1,continue; 2,discard_changes}", str);
            if (enumC92072a4q == enumC92072a4q2) {
                i = R.string.jsb;
            } else {
                i = R.string.jsf;
            }
            String string = getString(i);
            o.LJIIIIZZ(string, "getString(if (it == PinS…_wallet_set_pin_retrieve)");
            if (enumC92072a4q == enumC92072a4q2) {
                i2 = R.string.jsc;
            } else {
                i2 = R.string.jsg;
            }
            String string2 = getString(i2);
            o.LJIIIIZZ(string2, "getString(if (it == PinS…set_pin_retrieve_message)");
            Context context = getContext();
            if (context != null) {
                C26227ARb LIZ = C3AW.LIZ(context);
                LIZ.LJFF(string);
                LIZ.LIZIZ(string2);
                LIZ.LJII = false;
                C77123UOp.LJIILL(LIZ, new C92617aDd(this, enumC92072a4q, str));
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
        super.onCreate(bundle);
        fragmentConfiguration(C92618aDe.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
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
        Serializable serializable;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EnumC92072a4q enumC92072a4q = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                enumC92072a4q = (EnumC92072a4q) arguments.getSerializable("KEY_SET_MODE", EnumC92072a4q.class);
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("KEY_SET_MODE");
            } else {
                serializable = null;
            }
            if (serializable instanceof EnumC92072a4q) {
                enumC92072a4q = (EnumC92072a4q) serializable;
            }
        }
        this.LJLIL = enumC92072a4q;
        if (enumC92072a4q != null) {
            C8VV.LIZ(this, false, new IDqS174S0200000_31(this, enumC92072a4q, 6));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ah, viewGroup, false);
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
