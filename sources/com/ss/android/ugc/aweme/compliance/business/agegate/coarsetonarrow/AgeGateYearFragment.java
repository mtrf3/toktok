package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.OPZ;
import X.SFD;
import X.SGM;
import X.SY4;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateYearFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 162));

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
        if (!vl().LJLJLLL) {
            vl().LJLJLLL = true;
            OPZ.LIZJ("year");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList();
        int min$compliance_business_release = vl().LJLLJ.getMin$compliance_business_release();
        int max$compliance_business_release = vl().LJLLJ.getMax$compliance_business_release();
        if (min$compliance_business_release <= max$compliance_business_release) {
            while (true) {
                arrayList.add(String.valueOf(Calendar.getInstance().get(1) - min$compliance_business_release));
                if (min$compliance_business_release == max$compliance_business_release) {
                    break;
                } else {
                    min$compliance_business_release++;
                }
            }
        }
        GridView gridView = (GridView) _$_findCachedViewById(R.id.nki);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        gridView.setAdapter((ListAdapter) new SFD(requireContext, arrayList, requireActivity, new SGM(this)));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b1s), new ACListenerS32S0100000_12(this, 46));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gw, viewGroup, false);
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
