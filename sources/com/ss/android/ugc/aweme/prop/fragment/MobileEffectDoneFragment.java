package com.ss.android.ugc.aweme.prop.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.GHB;
import Y.ACListenerS27S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MobileEffectDoneFragment extends Fragment implements GHB {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.GHB
    public final boolean onBackPressed() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setResult(-1);
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            mo49getActivity2.finish();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EffectDoneInitState effectDoneInitState;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (effectDoneInitState = (EffectDoneInitState) arguments.getParcelable("mobile_effect_done_state")) == null) {
            return;
        }
        C8VV.LIZ(this, false, new AqS143S0200000_12(this, effectDoneInitState, 54));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awp, viewGroup, false);
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 26), LLLLIILL.findViewById(R.id.bfh));
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
