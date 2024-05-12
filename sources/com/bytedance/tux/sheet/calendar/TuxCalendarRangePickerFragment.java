package com.bytedance.tux.sheet.calendar;

import X.ActivityC45651qj;
import X.C10A;
import X.C115884gi;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TuxCalendarRangePickerFragment extends Fragment implements InterfaceC219588ja {
    public int LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public TuxCalendarRangePickerFragment() {
        C221108m2.LIZIZ(C115884gi.LJLIL);
        Calendar.getInstance().getFirstDayOfWeek();
    }

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
        c234529Ii.LIZIZ(new AqS151S0100000_1(this, 37));
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZJ(0);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context == null) {
            LLLLIILL = null;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.mm, R.attr.mn, R.attr.mo, R.attr.mp, R.attr.mq, R.attr.mr, R.attr.ms, R.attr.mt, R.attr.mu, R.attr.mv, R.attr.mw}, R.attr.jp, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut…endarRangePickerStyle, 0)");
            C16880lQ.LLLZLZ(obtainStyledAttributes, 8);
            C16880lQ.LLLZLZ(obtainStyledAttributes, 5);
            C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
            this.LJLIL = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.getColor(4, 0);
            obtainStyledAttributes.getInt(9, 0);
            obtainStyledAttributes.getColor(10, 0);
            obtainStyledAttributes.getColor(2, 0);
            obtainStyledAttributes.getInt(3, 0);
            obtainStyledAttributes.getInt(6, 0);
            obtainStyledAttributes.getInt(7, 0);
            obtainStyledAttributes.recycle();
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bu, viewGroup, false);
        }
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
