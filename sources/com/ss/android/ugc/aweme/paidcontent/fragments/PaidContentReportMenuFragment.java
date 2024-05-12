package com.ss.android.ugc.aweme.paidcontent.fragments;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import Y.ACListenerS21S0100000_1;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReportMenuFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes2.dex */
public final class PaidContentReportMenuFragment extends Fragment {
    public PaidContentReportMenuFragment() {
        new LinkedHashMap();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final String str;
        final String str2;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        final String str3 = null;
        if (arguments != null) {
            str = arguments.getString("owner_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("aweme_id");
        } else {
            str2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("enter_from");
        }
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.aej), new ACListenerS21S0100000_1(this, 109));
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.3e7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PaidContentReportMenuFragment paidContentReportMenuFragment = PaidContentReportMenuFragment.this;
                String str4 = str2;
                String str5 = str;
                String str6 = str3;
                paidContentReportMenuFragment.getClass();
                a.LJIILLIIL().LIZIZ(paidContentReportMenuFragment.mo49getActivity(), new Uri.Builder().appendQueryParameter("report_type", "paid_video").appendQueryParameter("object_id", str4).appendQueryParameter("owner_id", str5));
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("author_id", str5);
                c188727au.LJIIIZ("object_id", str4);
                c188727au.LJIIIZ("object_type", "paid_video");
                c188727au.LJIIIZ("enter_from", str6);
                c188727au.LIZLLL(1, "is_collection_item");
                FMX.LJIIL("click_report", c188727au.LIZ);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("author_id", str5);
                c188727au2.LJIIIZ("enter_from", str6);
                c188727au2.LJIIIZ("group_id", str4);
                c188727au2.LJIIIZ("panel_source", "long_press");
                c188727au2.LJIIIZ("enter_method", "long_press");
                c188727au2.LIZLLL(1, "is_collection_item");
                FMX.LJIIL("report", c188727au2.LIZ);
            }
        }, view.findViewById(R.id.iwz));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aj5, viewGroup, false);
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
