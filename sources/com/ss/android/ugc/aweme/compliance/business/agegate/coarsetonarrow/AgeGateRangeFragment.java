package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.ActivityC45651qj;
import X.C0H1;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import Y.ACListenerS32S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.common.lib.AppLogNewUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateRangeFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 161));

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
        if (!vl().LJLJLJ) {
            vl().LJLJLJ = true;
            try {
                AppLogNewUtils.LIZJ("age_range_select_show", C0H1.LIZ("user_type", "existing"));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void wl() {
        _$_findCachedViewById(R.id.ilz).setClickable(false);
        _$_findCachedViewById(R.id.im0).setClickable(false);
        _$_findCachedViewById(R.id.im1).setClickable(false);
        _$_findCachedViewById(R.id.im2).setClickable(false);
        _$_findCachedViewById(R.id.im3).setClickable(false);
        _$_findCachedViewById(R.id.im4).setClickable(false);
        _$_findCachedViewById(R.id.im5).setClickable(false);
        vl().gv0(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ilz), new ACListenerS32S0100000_12(this, 39));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im0), new ACListenerS32S0100000_12(this, 40));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im1), new ACListenerS32S0100000_12(this, 41));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im2), new ACListenerS32S0100000_12(this, 42));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im3), new ACListenerS32S0100000_12(this, 43));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im4), new ACListenerS32S0100000_12(this, 44));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.im5), new ACListenerS32S0100000_12(this, 45));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gv, viewGroup, false);
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
