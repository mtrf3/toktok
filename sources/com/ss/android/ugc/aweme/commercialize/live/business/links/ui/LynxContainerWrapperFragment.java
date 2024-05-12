package com.ss.android.ugc.aweme.commercialize.live.business.links.ui;

import X.ActivityC45651qj;
import X.C109464Ri;
import X.C10A;
import X.C117144ik;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.NGQ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxContainerWrapperFragment extends DialogFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public SparkFragment LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 32));

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.a5i;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        AdSparkContext adSparkContext;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        IAdSparkUtils LJFF = AdSparkUtils.LJFF();
        if (LJFF == null || (sparkFragment = LJFF.LIZJ(false)) == null) {
            sparkFragment = new SparkFragment();
        }
        IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
        if (LJFF2 != null) {
            String str2 = (String) this.LJLIL.getValue();
            if (str2 == null) {
                str2 = "about:blank";
            }
            adSparkContext = NGQ.LIZ(LJFF2, context, str2, null, false, 28);
        } else {
            adSparkContext = null;
        }
        Bundle bundle2 = new Bundle();
        C109464Ri.LIZ.getClass();
        if (adSparkContext != null) {
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(adSparkContext);
            str = adSparkContext.containerId;
        } else {
            str = null;
        }
        bundle2.putString("SparkContextContainerId", str);
        sparkFragment.setArguments(bundle2);
        this.LJLILLLLZI = sparkFragment;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        SparkFragment sparkFragment2 = this.LJLILLLLZI;
        if (sparkFragment2 != null) {
            LIZ.LJIIJ(sparkFragment2, null, R.id.spark_container);
            LIZ.LJI();
        } else {
            o.LJIJI("sparkContainerFragment");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axc, viewGroup, false);
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
