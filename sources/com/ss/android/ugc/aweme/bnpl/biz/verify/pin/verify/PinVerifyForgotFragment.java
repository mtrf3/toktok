package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify;

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
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import Y.IDCListenerS138S0100000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinVerifyForgotFragment extends Fragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        IDqS422S0100000_31 iDqS422S0100000_31 = new IDqS422S0100000_31(this, 118);
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(iDqS422S0100000_31);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gn);
        c235119Kp.LIZLLL(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
        ((TuxTextView) _$_findCachedViewById(R.id.go)).LJJJ(32.0f);
        _$_findCachedViewById(R.id.gl).getClass();
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.gl), new IDCListenerS138S0100000_31(this, 16));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.gk), new IDCListenerS138S0100000_31(this, 17));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.al, viewGroup, false);
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
