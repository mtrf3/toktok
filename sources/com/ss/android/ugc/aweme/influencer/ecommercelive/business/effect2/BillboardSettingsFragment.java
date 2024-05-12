package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C79045V0n;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BillboardSettingsFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.c8q);
        o.LJIIIIZZ(string, "getString(R.string.billboard_setting)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                c235119Kp.LIZJ(LJI.intValue());
            }
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 676));
        c235119Kp.LIZLLL(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS167S0100000_1(this, 181));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.apz, viewGroup, false);
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
