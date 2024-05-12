package com.bytedance.android.livesdk.settings;

import X.ActivityC45651qj;
import X.B8R;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C29S;
import X.C2A7;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CustomSettingFragment extends BaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    public final void vl(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (!fragment.isAdded()) {
            LIZ.LJIIIIZZ(R.id.bs8, 1, fragment, fragment.getClass().getName());
            LIZ.LJI();
        } else {
            LIZ.LJIIL(fragment);
            LIZ.LJI();
        }
        getChildFragmentManager().LJJIL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.jr4), new ACListenerS25S0100000_5(this, 247));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.fds), new ACListenerS25S0100000_5(this, 248));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.g9x), B8R.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bk0, viewGroup, false);
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
