package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.OPZ;
import X.SFD;
import X.SGK;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateMonthFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 160));

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

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLL) {
            ((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLL = true;
            OPZ.LIZJ("month");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(requireContext().getResources().getString(R.string.dxf), requireContext().getResources().getString(R.string.dxe), requireContext().getResources().getString(R.string.dxi), requireContext().getResources().getString(R.string.dxb), requireContext().getResources().getString(R.string.dxj), requireContext().getResources().getString(R.string.dxh), requireContext().getResources().getString(R.string.dxg), requireContext().getResources().getString(R.string.dxc), requireContext().getResources().getString(R.string.dxm), requireContext().getResources().getString(R.string.dxl), requireContext().getResources().getString(R.string.dxk), requireContext().getResources().getString(R.string.dxd));
        GridView gridView = (GridView) _$_findCachedViewById(R.id.dyj);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        gridView.setAdapter((ListAdapter) new SFD(requireContext, LJJIJIIJI, requireActivity, new SGK(this, LJJIJIIJI)));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b1s), new ACListenerS32S0100000_12(this, 38));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gu, viewGroup, false);
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
