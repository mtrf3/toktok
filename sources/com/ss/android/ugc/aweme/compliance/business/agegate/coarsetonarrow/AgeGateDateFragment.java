package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C43286Gyo;
import X.C62822Ol8;
import X.C76800UCe;
import X.C85990Xow;
import X.C87093YGb;
import X.C90903hW;
import X.OPZ;
import X.SFD;
import X.SGO;
import X.SY4;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateDateFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 158));

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

    public final AgeGateCTNViewModel vl() {
        return (AgeGateCTNViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!vl().LJLLI) {
            vl().LJLLI = true;
            OPZ.LIZJ("day");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, vl().LJLJJLL);
        C43286Gyo.LIZ.getClass();
        int i = 1;
        ((TextView) _$_findCachedViewById(R.id.lu2)).setText(getResources().getString(R.string.bix, new SimpleDateFormat("MMMM", new Locale(C87093YGb.LIZ(), C85990Xow.LIZ())).format(calendar.getTime())));
        ArrayList arrayList = new ArrayList();
        int actualMaximum = new GregorianCalendar(vl().LJLJJL, vl().LJLJJLL, 1).getActualMaximum(5);
        if (1 <= actualMaximum) {
            while (true) {
                arrayList.add(String.valueOf(i));
                if (i == actualMaximum) {
                    break;
                } else {
                    i++;
                }
            }
        }
        GridView gridView = (GridView) _$_findCachedViewById(R.id.dyj);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        gridView.setAdapter((ListAdapter) new SFD(requireContext, arrayList, requireActivity, new SGO(this)));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b1s), new ACListenerS32S0100000_12(this, 37));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gs, viewGroup, false);
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
