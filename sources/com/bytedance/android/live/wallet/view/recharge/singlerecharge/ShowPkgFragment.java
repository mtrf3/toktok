package com.bytedance.android.live.wallet.view.recharge.singlerecharge;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C73028SlM;
import X.C73039SlX;
import X.C76800UCe;
import X.C90903hW;
import X.CCJ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShowPkgFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJI = 0;
    public C73039SlX LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C73039SlX c73039SlX = this.LJLIL;
        if (c73039SlX != null) {
            long j = c73039SlX.LIZIZ;
            Diamond diamond = c73039SlX.LIZ;
            int i = diamond.count;
            String str = diamond.price;
            o.LJIIIIZZ(str, "data.recommendPackage.price");
            C73028SlM c73028SlM = new C73028SlM(i, j, str);
            Drawable LJI = C15380j0.LJI(R.drawable.cub);
            int LIZ = C15380j0.LIZ(16.0f);
            if (LJI != null) {
                LJI.setBounds(0, 0, LIZ, LIZ);
            }
            if (CCJ.LIZ(getContext())) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.m5e);
                if (appCompatTextView != null) {
                    appCompatTextView.setCompoundDrawables(null, null, LJI, null);
                }
            } else {
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.m5e);
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setCompoundDrawables(LJI, null, null, null);
                }
            }
            String quantityString = getResources().getQuantityString(R.plurals.kl, (int) c73028SlM.LIZ);
            o.LJIIIIZZ(quantityString, "resources\n            .g…howData.curCoins.toInt())");
            ((TextView) _$_findCachedViewById(R.id.mlu)).setText(ujb.o.LJJJJZ(quantityString, "{number}", String.valueOf(c73028SlM.LIZ), false));
            ((TextView) _$_findCachedViewById(R.id.m5e)).setText(String.valueOf(c73028SlM.LIZIZ));
            ((TextView) _$_findCachedViewById(R.id.mes)).setText(c73028SlM.LIZJ);
            return;
        }
        o.LJIJI("data");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5f, viewGroup, false);
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
