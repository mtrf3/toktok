package com.bytedance.tux.picker;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TuxWheelPickerFragment extends Fragment implements InterfaceC219588ja {
    public int LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = "";
        c235119Kp.LIZJ = c9kf;
        C234529Ii c234529Ii = new C234529Ii();
        int i = this.LJLIL;
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = i;
        c234529Ii.LIZIZ(new AqS151S0100000_1(this, 36));
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, new int[]{R.attr.ts, R.attr.tt, R.attr.tu}, R.attr.ky, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "requireContext().obtainS…erSheetStyle, 0\n        )");
        this.LJLIL = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        View v = C16880lQ.LLLLIILL(inflater, R.layout.cs, viewGroup, false);
        o.LJIIIIZZ(v, "v");
        try {
            ViewTreeLifecycleOwner.set(v, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(v, this);
            C10A.LIZIZ(v, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return v;
    }
}
