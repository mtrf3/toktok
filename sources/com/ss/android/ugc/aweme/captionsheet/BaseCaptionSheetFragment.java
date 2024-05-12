package com.ss.android.ugc.aweme.captionsheet;

import X.ASQ;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25832ABw;
import X.C25833ABx;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C41032G8m;
import X.C55953Lxd;
import X.C63081OpJ;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.EnumC25835ABz;
import X.InterfaceC25830ABu;
import X.O6R;
import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS96S0200000_4;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseCaptionSheetFragment extends Fragment implements InterfaceC25830ABu {
    public C25832ABw LJLIL;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final boolean LJLILLLLZI = C41032G8m.LIZ();
    public final boolean LJLJI = true;

    public abstract View Hl(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    public abstract String getTitle();

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public C235119Kp createNavActions() {
        Fragment parentFragment;
        FragmentManager childFragmentManager;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZ(getTitle());
        c235119Kp.LIZJ = c9kf;
        try {
            parentFragment = getParentFragment();
        } catch (IllegalStateException unused) {
        }
        if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
            if (childFragmentManager.LJJJJIZL() == 0) {
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZIZ(new AqS154S0100000_4(this, 61));
                c235119Kp.LIZIZ(LIZJ);
                return c235119Kp;
            }
        }
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 60));
        c235119Kp.LIZLLL(LIZJ2);
        return c235119Kp;
    }

    public final C25832ABw xl() {
        C25832ABw c25832ABw = this.LJLIL;
        if (c25832ABw != null) {
            return c25832ABw;
        }
        o.LJIJI("sheetContext");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Dl()) {
            vl();
        }
    }

    public final void vl() {
        int i;
        if (!Al() || (i = requireView().getLayoutParams().height) == -2) {
            return;
        }
        requireView().measure(-1, -2);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, requireView().getMeasuredHeight());
        ofInt.setDuration(400L);
        ofInt.setInterpolator(C55953Lxd.LJI());
        ofInt.addUpdateListener(new AUListenerS96S0200000_4(this, ofInt, 3));
        ofInt.addListener(new ALAdapterS3S0100000_4(this, 2));
        ofInt.start();
    }

    public boolean Al() {
        return this.LJLILLLLZI;
    }

    public boolean Dl() {
        return this.LJLJI;
    }

    public final void Gl(EnumC25835ABz type) {
        o.LJIIIZ(type, "type");
        ASQ.LJIILIIL(this, ((C25833ABx) xl().LIZIZ.getValue()).LIZ(type), true);
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        xl().LIZ.I7(sheet, f);
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        xl().LIZ.Pg(sheet, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        xl().LIZ.I6(view);
    }

    public ViewGroup wl(ViewGroup viewGroup, ActivityC45651qj activityC45651qj) {
        int i;
        LinearLayout linearLayout = new LinearLayout(activityC45651qj);
        linearLayout.setOrientation(1);
        if (!Al()) {
            o.LJIIIIZZ(requireContext(), "requireContext()");
            i = O6R.LJJIIJZLJL((C63081OpJ.LJJJJJL(r3) - C63081OpJ.LJJJJLI(r3)) * 0.55d);
        } else if (viewGroup == null || viewGroup.getMeasuredHeight() == 0) {
            i = -2;
        } else {
            i = viewGroup.getMeasuredHeight();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
        linearLayout.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setMinimumHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(268)));
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        ViewGroup wl = wl(viewGroup, requireActivity);
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        C29S c29s = null;
        C252709vu c252709vu = new C252709vu(requireActivity2, null, 6);
        c252709vu.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c252709vu.setNavActions(createNavActions());
        wl.addView(c252709vu);
        wl.addView(Hl(inflater, wl));
        try {
            ViewTreeLifecycleOwner.set(wl, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(wl, this);
            C10A.LIZIZ(wl, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return wl;
    }
}
