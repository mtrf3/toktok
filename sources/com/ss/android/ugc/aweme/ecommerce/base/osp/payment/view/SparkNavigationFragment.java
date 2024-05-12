package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view;

import X.ActivityC45651qj;
import X.C109464Ri;
import X.C10A;
import X.C117144ik;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78983UzD;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC27499Aql;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkNavigationFragment extends Fragment implements InterfaceC27499Aql {
    public SparkFragment LJLIL;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public boolean LJLJJL = true;

    @Override // X.InterfaceC27499Aql
    public final boolean enableDragClose() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        C1B3 c1b3;
        SparkFragment sparkFragment2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        IAdSparkUtils LJFF = AdSparkUtils.LJFF();
        if (LJFF == null || (sparkFragment = LJFF.LIZJ(false)) == null) {
            sparkFragment = new SparkFragment();
        }
        this.LJLIL = sparkFragment;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(this.LJLILLLLZI);
        SparkFragment sparkFragment3 = this.LJLIL;
        View view2 = null;
        if (sparkFragment3 != null) {
            Bundle bundle2 = new Bundle();
            C109464Ri.LIZ.getClass();
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(sparkContext);
            bundle2.putString("SparkContextContainerId", sparkContext.containerId);
            sparkFragment3.setArguments(bundle2);
            try {
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                c1b3 = new C1B3(childFragmentManager);
                sparkFragment2 = this.LJLIL;
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            if (sparkFragment2 != null) {
                c1b3.LJIIJ(sparkFragment2, null, R.id.dbo);
                c1b3.LJI();
                C235119Kp c235119Kp = new C235119Kp();
                c235119Kp.LIZLLL = true;
                C234529Ii c234529Ii = new C234529Ii();
                c234529Ii.LIZLLL = true;
                c234529Ii.LIZIZ(new AqS160S0100000_10(this, 171));
                if (this.LJLJJI) {
                    c234529Ii.LIZJ();
                    c234529Ii.LIZJ = R.raw.icon_x_mark;
                    c235119Kp.LIZIZ(c234529Ii);
                }
                if (this.LJLJJL) {
                    c234529Ii.LIZJ();
                    c234529Ii.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                    c235119Kp.LIZLLL(c234529Ii);
                }
                C9KF c9kf = new C9KF();
                c9kf.LIZ(this.LJLJI);
                c235119Kp.LIZJ = c9kf;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
                View view3 = (View) linkedHashMap.get(Integer.valueOf(R.id.gwf));
                if (view3 == null) {
                    View view4 = getView();
                    if (view4 != null && (view3 = view4.findViewById(R.id.gwf)) != null) {
                        linkedHashMap.put(Integer.valueOf(R.id.gwf), view3);
                    }
                    ((C252709vu) view2).setNavActions(c235119Kp);
                    return;
                }
                view2 = view3;
                ((C252709vu) view2).setNavActions(c235119Kp);
                return;
            }
            o.LJIJI("sparkContainerFragment");
            throw null;
        }
        o.LJIJI("sparkContainerFragment");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a1w, viewGroup, false);
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
